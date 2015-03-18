package com.hialan.house.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.HtmlNode;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/12/15 00:23
 */
public class DoubanHouseProcessor implements PageProcessor {
	private Site site;

	@Override
	public void process(Page page) {
		this.parseAllTopics(page);
	}

	@Override
	public Site getSite() {
		if (site == null) {
			site = Site.me().setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) " +
					"AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.89 Safari/537.36");
		}
		return site;
	}

	public void parseAllTopics(Page page) {
		Selectable selectable = page.getHtml().xpath("//div[@id='group-topics']//a");
		List<Selectable> selectables = selectable.nodes();
		page.putField("allTopics", selectables);
	}

}
