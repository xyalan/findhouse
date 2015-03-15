package com.hialan.house.spider;

import com.hialan.house.constant.HouseSource;
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
				.pipeline(new ConsolePipeline())
				.run();

		Spider.create(new TongChengHouseProcessor())
				.addUrl(HouseSource.COM_58)
				.pipeline(new ConsolePipeline())
				.run();
	}
}
