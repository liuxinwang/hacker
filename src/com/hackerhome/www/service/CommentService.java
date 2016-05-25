package com.hackerhome.www.service;

import com.hackerhome.www.util.JsonResult;
/**
 * 评论留言
 * @author Administrator
 */
public interface CommentService {
	
	/**
	 * 评论新增
	 */
	public JsonResult save(String newsId, String msgPsnName, String content, String userId);
	
	/**
	 * 评论查询
	 */
	public JsonResult selectList(String newsId);
	
	/**
	 * 评论更新
	 */
	public JsonResult update(String commentId, String sup, String opp);
	
	/**
	 * 评论删除
	 */
	public JsonResult delete();

}
