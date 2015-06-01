package com.hialan.findhouse.web.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 6/1/15 14:37
 */
@Controller
public class IndexController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String initIndex() {
		return "index";
	}
}
