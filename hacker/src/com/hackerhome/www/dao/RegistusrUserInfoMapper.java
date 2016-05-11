package com.hackerhome.www.dao;

import java.util.Map;

import com.hackerhome.www.bean.RegistusrUserInfo;

public interface RegistusrUserInfoMapper {
	public void save(RegistusrUserInfo register);		// 新增注册用户
	public RegistusrUserInfo findById(String registusrName);		// 登录查询
	
}
