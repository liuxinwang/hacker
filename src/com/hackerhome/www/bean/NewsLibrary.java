package com.hackerhome.www.bean;

import java.io.Serializable;

public class NewsLibrary implements Serializable{
	private String news_id;			// 新闻标识
	private String news_title;  	// 新闻标题
	private String issue_time;  	// 发布时间
	private String source;  		// 来源
	private String author;  		// 作者
	private String content;  		// 内容
	private String hotspot;			// 是否热点
	private String pviews;  		// 阅读量
	private String is_active;   	// 是否有效
	private String creator;  		// 创建人
	private String create_time; 	// 创建日期
	private String updator;  		// 修改人
	private String update_time; 	// 修改日期
	
	public String getNews_id() {
		return news_id;
	}
	public void setNews_id(String newsId) {
		news_id = newsId;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String newsTitle) {
		news_title = newsTitle;
	}
	public String getIssue_time() {
		return issue_time;
	}
	public void setIssue_time(String issueTime) {
		issue_time = issueTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHotspot() {
		return hotspot;
	}
	public void setHotspot(String hotspot) {
		this.hotspot = hotspot;
	}
	public String getPviews() {
		return pviews;
	}
	public void setPviews(String pviews) {
		this.pviews = pviews;
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
