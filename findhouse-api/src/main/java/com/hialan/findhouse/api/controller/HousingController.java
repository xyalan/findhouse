package com.hialan.findhouse.api.controller;


import com.hialan.findhouse.api.vo.HousingVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 15:20 7/7/16
 */
@RestController
@RequestMapping("housings")
public class HousingController {
	@RequestMapping(method = RequestMethod.GET)
	public List<HousingVO> listHousing() {
		List<HousingVO> housingVOs = new ArrayList<>();
		HousingVO vo = new HousingVO();
		vo.setHref("http://baidu.com");
		housingVOs.add(vo);
		return housingVOs;
	}
}
