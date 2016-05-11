package com.hackerhome.www.util;

import java.io.Serializable;

/**
 * 统一JSON响应格式
 * @author Administrator
 *
 */
public class JsonResult implements Serializable{
	private int status;
	private String msg;
	private Object data;
	private Object data1;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData1() {
		return data1;
	}
	public void setData1(Object data1) {
		this.data1 = data1;
	}
	
}
