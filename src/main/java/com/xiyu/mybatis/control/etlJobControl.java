package com.xiyu.mybatis.control;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiyu.mybatis.bean.etlJob;
import com.xiyu.mybatis.test.Interface1;

@RestController
public class etlJobControl {

	@Resource
	Interface1 ifd;
	
	 @RequestMapping(value = "/select", method = RequestMethod.GET)
	public  String select() {
		return ifd.select_mytest();
	}
	 @RequestMapping(value = "/select1", method = RequestMethod.GET)
		public  Object select1() {
			return ifd.select_mytest1();
		}
	 @RequestMapping(value = "/select2", method = RequestMethod.GET)
		public  List<etlJob> select2() {
			return ifd.select_mytest2();
		}
}
