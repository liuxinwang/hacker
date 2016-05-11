package com.hackerhome.www.service;

import com.hackerhome.www.util.JsonResult;
/**
 * 注册信息
 * @author Administrator
 */
public interface RegistusrService {
	/**
	 * 登录校验
	 * @param name
	 * @param password
	 * @return
	 */
	public JsonResult checkLogin(String name, String password);
	
	/**
	 * 新用户注册
	 * @param name
	 * @param password
	 * @param nick
	 * @return
	 */
	public JsonResult regist(String name, String password);

}
