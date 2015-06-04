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
	public static Directory buildDirectory(ChunnelType chunnelType) {
		Directory directory = null;
		if (chunnelType == ChunnelType.FILESYSTEM) {
			directory = new RAMDirectory();
		} else if (chunnelType == ChunnelType.RAM) {
			try {
				directory = FSDirectory.open(Paths.get(""));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return directory;
	}

	enum ChunnelType {
		RAM("RAM"),
		FILESYSTEM("FILE");

		public String type;

		ChunnelType(String type) {
			this.type = type;
		}
	}
}
