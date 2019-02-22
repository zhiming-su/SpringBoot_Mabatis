package com.xiyu.mybatis.control;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiyu.mybatis.test.Interface1;

@RestController
public class etlJobControl {

	@Resource
	Interface1 ifd;
	
	 @RequestMapping(value = "/select", method = RequestMethod.GET)
	public  String select() {
		return ifd.select_mytest();
	}
}
