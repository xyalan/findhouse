package com.hialan.findhouse.search.query;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/2/15 15:29
 */
public class SearchEngine {
	private IndexSearcher searcher = null;

	private QueryParser queryParser = null;

	public SearchEngine() throws IOException {
		String projectPath = System.getProperty("user.dir");
		searcher = new IndexSearcher(DirectoryReader.open(FSDirectory.open(Paths.get
				(projectPath + "/src/test/resources/index"))));
		queryParser = new QueryParser("title", new StandardAnalyzer());
	}

	public TopDocs performSearch(String queryString, int n) throws ParseException, IOException {
		Query query = queryParser.parse(queryString);
		return searcher.search(query, n);
	}

	public Document getDocument(int docId) throws IOException {
		return searcher.doc(docId);
	}
}
