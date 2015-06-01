package com.hialan.findhouse.web.config.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/1/15 14:59
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.hialan.*")
public class WebMvcConfig {
	private Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);
	@Bean
	public InternalResourceViewResolver configureInternalResourceViewResolver() {
		logger.info("initial mvc config");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/page/");
		resolver.setSuffix(".html");
		return resolver;
	}
}
