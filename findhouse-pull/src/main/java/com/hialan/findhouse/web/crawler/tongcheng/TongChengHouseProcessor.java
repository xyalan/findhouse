package com.hialan.findhouse.web.crawler.tongcheng;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/15/15 22:54
 */
public class TongChengHouseProcessor implements PageProcessor {
	private Site site = new Site();

	@Override
	public void process(Page page) {
		List<String> links = page.getHtml().links().regex(".*zufang.*").all();
		System.out.println(links);
	}

	@Override
	public Site getSite() {
		return site;
	}
}
