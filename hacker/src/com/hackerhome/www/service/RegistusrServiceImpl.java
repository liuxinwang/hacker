package com.hackerhome.www.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hackerhome.www.bean.RegistusrUserInfo;
import com.hackerhome.www.dao.RegistusrUserInfoMapper;
import com.hackerhome.www.util.HomeUtil;
import com.hackerhome.www.util.JsonResult;
/**
 * 注册信息业务处理
 * @author Administrator
 */
@Service
public class RegistusrServiceImpl implements RegistusrService {
	
	@Resource
	private RegistusrUserInfoMapper dao;
	
	/**
	 * 登录校验
	 */
	public JsonResult checkLogin(String name, String password) {
		
		JsonResult result = new JsonResult();
		
		//若用户名不存在
		RegistusrUserInfo userInfo = dao.findById(name);
		if(userInfo == null){
			result.setMsg("用户名不存在！");
			result.setStatus(1);  // 0 为登录成功，1 为用户不存在，2 为用户名或密码错误
			return result;
		}
		//检查密码
		if(!(HomeUtil.md5(password).equals(userInfo.getRegistusr_pwd()))){
			result.setMsg("用户名或密码错误！");
			result.setStatus(2);  // 0 为登录成功，1 为用户不存在，2 为用户名或密码错误
			return result;
		}
		//校验成功
		result.setMsg("登录成功！");
		result.setStatus(0);  // 0 为登录成功，1 为用户不存在，2 为用户名或密码错误
		result.setData(userInfo);
		return result;
	}
	
	/**
	 *新用户注册
	 */
	public JsonResult regist(String name, String password) {
		
		JsonResult result = new JsonResult();
		
		// 若用户名已存在 
		RegistusrUserInfo userInfo = dao.findById(name);
		if(userInfo != null){
			result.setMsg("用户名已存在！");
			result.setStatus(1);  // 0 为注册成功，1 为注册失败
			return result;
		}
		
		// 把数据封装成用户表实体对象
		RegistusrUserInfo register = new RegistusrUserInfo();
		register.setRegistusr_id(HomeUtil.createId());
		register.setRegistusr_name(name);
		register.setRegistusr_pwd(HomeUtil.md5(password));
		register.setRegistusr_nickname(name);
		dao.save(register);
		result.setMsg("注册成功！");
		result.setStatus(0);  // 0 为注册成功，1 为注册失败
		return result;
	}

}
