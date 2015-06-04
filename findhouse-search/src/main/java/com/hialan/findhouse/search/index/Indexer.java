package com.hialan.findhouse.search.index;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.RAMDirectory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/2/15 14:30
 */
public class Indexer {
	private IndexWriter indexWriter = null;

	public IndexWriter ramIndex() throws IOException {
		Analyzer analyzer = new StandardAnalyzer();
		Directory directory = new RAMDirectory();
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		indexWriter = new IndexWriter(directory, config);
		this.addDoc(indexWriter, "Hello", "h");
		return indexWriter;
	}

	public IndexWriter fileIndex() throws IOException {
		Analyzer analyzer = new StandardAnalyzer();
		Directory directory = FSDirectory.open(Paths.get
				("/Users/Alan/Opensource/findhouse/findhouse-search/src/test/resources/index"));
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		indexWriter = new IndexWriter(directory, config);
		this.addDoc(indexWriter, "Hello", "Hello");
		return indexWriter;
	}

	public void addDoc(IndexWriter writer, String title, String isbn) throws IOException {
		Document doc = new Document();
		doc.add(new TextField("title", title, Field.Store.YES));
		doc.add(new StringField("isbn", isbn, Field.Store.YES));
		writer.addDocument(doc);
	}

	public void close() throws IOException {
		if (indexWriter != null && indexWriter.isOpen()) {
			indexWriter.close();
		}
	}
}
