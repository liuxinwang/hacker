package com.hackerhome.www.bean;

public class CommentInfo {
	private String leavemsg_id;			// 评论标识
	private String msg_psn_name;		// 评论者姓名
	private String comment_content;		//评论内容
	private String comment_time;		// 评论时间
	private String registusr_id;		// 评论用户标识
	private String is_pub;				// 是否公开
	private String is_active;			// 是否有效
	private String creator;				// 创建人
	private String create_time;			// 创建日期
	private String updator;				// 修改人
	private String update_time;			// 修改日期
	
	public String getLeavemsg_id() {
		return leavemsg_id;
	}
	public void setLeavemsg_id(String leavemsgId) {
		leavemsg_id = leavemsgId;
	}
	public String getMsg_psn_name() {
		return msg_psn_name;
	}
	public void setMsg_psn_name(String msgPsnName) {
		msg_psn_name = msgPsnName;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String commentContent) {
		comment_content = commentContent;
	}
	public String getComment_time() {
		return comment_time;
	}
	public void setComment_time(String commentTime) {
		comment_time = commentTime;
	}
	public String getRegistusr_id() {
		return registusr_id;
	}
	public void setRegistusr_id(String registusrId) {
		registusr_id = registusrId;
	}
	public String getIs_pub() {
		return is_pub;
	}
	public void setIs_pub(String isPub) {
		is_pub = isPub;
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
