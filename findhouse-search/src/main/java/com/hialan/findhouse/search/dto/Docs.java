package com.hialan.findhouse.search.dto;

import java.util.List;
import java.util.Map;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/4/15 17:54
 */
public class Docs {
	private int size;

	private List<Map<String, String>> list;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Map<String, String>> getList() {
		return list;
	}

	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}
}
