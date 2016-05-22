package com.hackerhome.www.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	/**
	 * 格式化当前时间
	 */
	public static String getFormatDate(String format){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/**
	 * 格式化入参时间
	 */
	public static String getFormatDate(String time, String format, String format1) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(time);
		SimpleDateFormat sdf1 = new SimpleDateFormat(format1);
		return sdf1.format(date);
	}
	
	public static void main(String[] args) throws ParseException {
		String date = DateUtil.getFormatDate("yyyy/MM_dd");
		String date1 = DateUtil.getFormatDate("20160518190742","yyyyMMddHHmmss","yyyy-MM-dd HH:mm:ss");
		System.out.println(date1);
	}
}
