package com.hialan.findhouse.search.util;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.RAMDirectory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/2/15 17:52
 */
public class IndexChunnel {
    private static Directory directory = null;
	public static Directory buildDirectory() {
        directory = new RAMDirectory();
		return directory;
	}

	public static Directory buildDirectory(String folder) {
			try {
				directory = FSDirectory.open(Paths.get(folder));
			} catch (IOException e) {
				e.printStackTrace();
			}
		return directory;
	}
}
