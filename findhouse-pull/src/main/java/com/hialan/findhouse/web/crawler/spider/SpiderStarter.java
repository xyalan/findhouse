package com.hialan.findhouse.web.crawler.spider;

import com.hialan.findhouse.web.crawler.constant.HouseSource;
import com.hialan.findhouse.web.crawler.douban.DoubanHouseProcessor;
import com.hialan.findhouse.web.crawler.tongcheng.TongChengHouseProcessor;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/12/15 09:41
 */
public class SpiderStarter {
	public void action() {
		Spider.create(new DoubanHouseProcessor())
				.addUrl(HouseSource.DOUBAN)
				.addPipeline(new ConsolePipeline())
				.run();

		Spider.create(new TongChengHouseProcessor())
				.addUrl(HouseSource.COM_58)
				.addPipeline(new ConsolePipeline())
				.run();
	}
}
