package com.bw.test;

import org.junit.Test;

import com.bw.utils.StringUtils;

public class TestDemo {

	/**
	 * 测试是否为空字符串 包括 “   ” 也算
	 * */
	@Test
	public void NullTest() {
		boolean null1 = StringUtils.isNull("");
		System.out.println(null1);
	}
	
	/**
	 * 测试是否为手机号
	 * */
	@Test
	public void PhontTest() {
		boolean phone = StringUtils.isPhone("13966666666");
		System.out.println(phone);
	}
	
	/**
	 * 测试是否为邮箱
	 * */
	@Test
	public void EmailTest() {
		boolean email = StringUtils.isEmail("666@qq.com");
		System.out.println(email);
	}
	
}
