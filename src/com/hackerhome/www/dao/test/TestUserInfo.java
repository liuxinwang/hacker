package com.hackerhome.www.dao.test;

import org.junit.Test;

import com.hackerhome.www.bean.RegistusrUserInfo;
import com.hackerhome.www.dao.RegistusrUserInfoMapper;
import com.hackerhome.www.util.SpringTest;

public class TestUserInfo extends SpringTest {
	@Test
	public void test1() {
		RegistusrUserInfoMapper dao = super.getContext().getBean(
				"registusrUserInfoMapper", RegistusrUserInfoMapper.class);
		String registusrName = "admin";
		RegistusrUserInfo rui = dao.findById(registusrName);
		System.out.println(rui.getRegistusr_nickname());
	}
}
