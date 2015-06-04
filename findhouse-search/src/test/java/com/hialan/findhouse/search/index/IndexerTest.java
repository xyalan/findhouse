package com.hialan.findhouse.search.index;

import junit.framework.TestCase;

import java.io.IOException;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/4/15 16:25
 */
public class IndexerTest extends TestCase {
	private Indexer indexer = null;

	@Override
	protected void setUp() throws Exception {
		indexer = new Indexer();
	}

	public void testRamIndex() throws IOException {
		indexer.ramIndex();
		indexer.close();
	}

	public void testFileIndex() throws IOException {
		indexer.fileIndex();
		indexer.close();
	}
}
