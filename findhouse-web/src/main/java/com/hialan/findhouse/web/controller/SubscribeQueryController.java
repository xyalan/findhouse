package com.hialan.findhouse.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/30/15 14:38
 */
@Controller
@RequestMapping("/scribe")
public class SubscribeQueryController {
	@RequestMapping("/")
	public String initSubscribe() {
		return "subscribe";
	}
}
