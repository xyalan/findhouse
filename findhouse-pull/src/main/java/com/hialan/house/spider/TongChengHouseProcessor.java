package com.hialan.house.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/15/15 22:54
 */
public class TongChengHouseProcessor implements PageProcessor {
	private Site site = new Site();

	@Override
	public void process(Page page) {

	}

	@Override
	public Site getSite() {
		return site;
	}
}
