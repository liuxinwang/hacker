package com.hackerhome.www.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String getFormatDate(String format){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	public static void main(String[] args) {
		String date = DateUtil.getFormatDate("yyyy/MM_dd");
		System.out.println(date);
	}
}
