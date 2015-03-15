package com.hialan.house.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/12/15 00:23
 */
public class DoubanHouseProcessor implements PageProcessor {
	private Site site = new Site();

	@Override
	public void process(Page page) {
		List<String> links = page.getHtml().links().regex(".*article.*").all();
		System.out.println(links);
	}

	@Override
	public Site getSite() {
		return site;
	}

}