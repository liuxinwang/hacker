package com.hackerhome.www.bean;

public class RegistusrUserInfo {
	private String registusr_id;			// 注册用户标识
	private String registusr_name;			// 注册用户名
	private String registusr_nickname;		// 注册用户昵称
	private String registusr_pwd;			// 注册用户密码
	private String email;					// 邮箱
	private String tel_no;					// 电话
	private String login_times;				// 登录次数
	private String last_login_time;			// 最近登录时间
	private String last_pw_time;			// 密码最后修改时间
	private String login_error_times;		// 密码连续错误次数
	private String is_active;				// 是否有效
	private String creator;					// 创建人
	private String create_time;				// 创建日期
	private String updator;					// 修改人
	private String update_time;				// 修改日期
	
	public String getRegistusr_id() {
		return registusr_id;
	}
	public void setRegistusr_id(String registusrId) {
		registusr_id = registusrId;
	}
	public String getRegistusr_name() {
		return registusr_name;
	}
	public void setRegistusr_name(String registusrName) {
		registusr_name = registusrName;
	}
	public String getRegistusr_nickname() {
		return registusr_nickname;
	}
	public void setRegistusr_nickname(String registusrNickname) {
		registusr_nickname = registusrNickname;
	}
	public String getRegistusr_pwd() {
		return registusr_pwd;
	}
	public void setRegistusr_pwd(String registusrPwd) {
		registusr_pwd = registusrPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel_no() {
		return tel_no;
	}
	public void setTel_no(String telNo) {
		tel_no = telNo;
	}
	public String getLogin_times() {
		return login_times;
	}
	public void setLogin_times(String loginTimes) {
		login_times = loginTimes;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String lastLoginTime) {
		last_login_time = lastLoginTime;
	}
	public String getLast_pw_time() {
		return last_pw_time;
	}
	public void setLast_pw_time(String lastPwTime) {
		last_pw_time = lastPwTime;
	}
	public String getLogin_error_times() {
		return login_error_times;
	}
	public void setLogin_error_times(String loginErrorTimes) {
		login_error_times = loginErrorTimes;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String isActive) {
		is_active = isActive;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String createTime) {
		create_time = createTime;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String updateTime) {
		update_time = updateTime;
	}
	
	


}
