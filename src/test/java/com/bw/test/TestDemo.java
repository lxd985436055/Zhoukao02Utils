package com.bw.test;

import org.junit.Test;

import com.bw.utils.StringUtils;

public class TestDemo {

	/**
	 * �����Ƿ�Ϊ���ַ��� ���� ��   �� Ҳ��
	 * */
	@Test
	public void NullTest() {
		boolean null1 = StringUtils.isNull("");
		System.out.println(null1);
	}
	
	/**
	 * �����Ƿ�Ϊ�ֻ���
	 * */
	@Test
	public void PhontTest() {
		boolean phone = StringUtils.isPhone("13966666666");
		System.out.println(phone);
	}
	
	/**
	 * �����Ƿ�Ϊ����
	 * */
	@Test
	public void EmailTest() {
		boolean email = StringUtils.isEmail("666@qq.com");
		System.out.println(email);
	}
	
}
