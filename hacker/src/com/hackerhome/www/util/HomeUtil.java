package com.hackerhome.www.util;

import java.security.MessageDigest;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

/**
 * 用户密码加密处理
 * 
 * @author Administrator
 */
public class HomeUtil {
	
	/**
	 * 获取唯一id标识
	 * @return 唯一32位字符串
	 */
	public static String createId() {
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		id = id.replace("-", "");
		return id;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String md5(String str) {
		try {
			// 将str利用md5处理,处理结果是byte[]
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] input = str.getBytes();
			byte[] output = md.digest(input);
			// 利用Base64算法将byte[]处理成字符串返回
			return Base64.encodeBase64String(output);
		} catch (Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<40;i++){			
			System.out.println(HomeUtil.createId());
		}
	}

}
