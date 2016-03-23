package com.hialan.findhouse.search.index;

import com.hialan.findhouse.search.dto.Docs;
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
		indexer.ramIndex(new Docs());
	}

	public void testFileIndex() throws IOException {
		indexer.fileIndex("/Users/Alan/Opensource/findhouse/findhouse-search/src/test/resources" +
				"/index", new Docs());
	}
}
