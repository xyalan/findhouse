package com.hialan.findhouse.api.vo;

import java.io.Serializable;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 16:14 7/7/16
 */
public class HousingVO implements Serializable {
	private String title;
	private String shortContent;
	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getShortContent() {
		return shortContent;
	}

	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
