package com.bw.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	/**
	 * ÅĞ¶ÏÊÇ·ñÎª¿Õ×Ö·û´® °üÀ¨ ¡°   ¡± Ò²Ëã
	 * */
	public static boolean isNull(String str){
		if(str!=null&&str.length()>0&str.trim().length()>0) {
			return true;
		}
		return false;
	}
	
	/**
	 * ÅĞ¶ÏÊÇ·ñÎªÊÖ»úºÅ
	 * */
	public static boolean isPhone(String phone) {
		boolean null1 = isNull(phone);
		if(!null1) {
			return false;
		}
		Pattern pattern = Pattern.compile("^1[3|4|5|7|9][0-9]\\d{8}$");
		Matcher matcher = pattern.matcher(phone);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	/**
	 * ÅĞ¶ÏÊÇ·ñÎªÓÊÏä
	 * */
	public static boolean isEmail(String email) {
		boolean null1 = isNull(email);
		if(!null1) {
			return false;
		}
		Pattern pattern = Pattern.compile("^\\w+@\\w+\\.(com|cn)$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Ìæ»»±êÇ©
	 * */
	public static String replaceStr(String str) {
		String[] split = str.split("(\r\n)");
		StringBuffer buffer = new StringBuffer();
		for (String string : split) {
			buffer.append("<P>");
			String replace = string.replace("(\r)", "<br/>");
			buffer.append(replace);
			buffer.append("</P>  ");
		}
		return buffer.toString();
	}
	
	
}
