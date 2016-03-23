package com.hialan.findhouse.search.index;

import com.hialan.findhouse.search.dto.Docs;
import com.hialan.findhouse.search.util.IndexChunnel;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;

import java.io.IOException;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/2/15 14:30
 */
public class Indexer {
	public void ramIndex(Docs docs) throws IOException {
		Directory directory = null;
		try {
			directory = IndexChunnel.buildDirectory();
			IndexWriter indexWriter = this.buildIndexWriter(directory);
			this.addDoc(indexWriter, docs);
		} catch (Exception e) {

		} finally {

		}
	}

	public void fileIndex(String folder, Docs docs) throws IOException {
		Directory directory = null;
		try {
			directory = IndexChunnel.buildDirectory(folder);
			IndexWriter indexWriter = this.buildIndexWriter(directory);
			this.addDoc(indexWriter, docs);
		} catch (Exception e) {

		} finally {

		}
	}

	private IndexWriter buildIndexWriter(Directory directory) throws IOException {
		Analyzer analyzer = new StandardAnalyzer();
		IndexWriterConfig config = new IndexWriterConfig(analyzer);
		IndexWriter indexWriter = new IndexWriter(directory, config);
		return indexWriter;
	}

	public void addDoc(IndexWriter writer, Docs docs) throws IOException {
		Document doc = new Document();
		//doc.add(new TextField("title", title, Field.Store.YES));
		//doc.add(new StringField("isbn", isbn, Field.Store.YES));
		writer.addDocument(doc);
	}
}
