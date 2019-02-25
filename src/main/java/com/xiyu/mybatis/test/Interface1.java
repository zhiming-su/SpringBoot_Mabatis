package com.xiyu.mybatis.test;

import java.util.HashMap;
import java.util.List;

import com.xiyu.mybatis.bean.etlJob;

public interface Interface1 {

	 String select_mytest();
	 List<HashMap<String,String>> select_mytest1();
	 List<etlJob> select_mytest2();
}
