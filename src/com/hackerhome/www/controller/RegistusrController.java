package com.hackerhome.www.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackerhome.www.service.RegistusrService;
import com.hackerhome.www.util.JsonResult;

/**
 * 注册登录
 * @author Administrator
 */
@Controller
@RequestMapping("/registusr")
public class RegistusrController {

	@Resource
	private RegistusrService service;
	
	/**
	 * 用户注册
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("/registusrInfo.do")
	@ResponseBody
	public JsonResult execute(String name, String password) {
		JsonResult result = service.regist(name, password);
		return result;

	}
	
	/**
	 * 登录检查
	 * @param name
	 * @param password
	 * @return
	 */
	@RequestMapping("/loginInfo.do")
	@ResponseBody
	public JsonResult execute1(String name, String password) {
		JsonResult result = service.checkLogin(name, password);
		return result;
		
	}
}
