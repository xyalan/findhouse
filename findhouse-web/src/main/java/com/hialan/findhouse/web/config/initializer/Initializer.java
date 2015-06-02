package com.hialan.findhouse.web.config.initializer;

import com.hialan.findhouse.web.config.mvc.WebMvcConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 4/5/15 03:13
 */
public class Initializer implements WebApplicationInitializer {
	private Logger logger = LoggerFactory.getLogger(Initializer.class);
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = getContext();

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcherServlet",
				new DispatcherServlet(applicationContext));
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);

	}

	public AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext applicationContext = new
				AnnotationConfigWebApplicationContext();
		applicationContext.register(WebMvcConfig.class);

		return applicationContext;
	}
}
