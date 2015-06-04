package com.hialan.findhouse.search.query;

import junit.framework.TestCase;
import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

import java.io.IOException;
import java.util.Arrays;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/4/15 16:47
 */
public class SearchEngineTest extends TestCase {
	private SearchEngine searchEngine;

	@Override
	protected void setUp() throws Exception {
		searchEngine = new SearchEngine();
	}

	public void testSearch() throws IOException, ParseException {
		TopDocs topDocs = searchEngine.performSearch("HELLO", 100);
		ScoreDoc[] hits = topDocs.scoreDocs;
		Arrays.asList(hits).forEach(h -> {
			try {
				Document doc = searchEngine.getDocument(h.doc);
				System.out.printf(doc.get("title"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
