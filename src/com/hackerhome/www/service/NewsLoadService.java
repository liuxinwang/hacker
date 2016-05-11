package com.hackerhome.www.service;

import java.util.Map;

import com.hackerhome.www.util.JsonResult;

/**
 * 新闻加载
 * @author Administrator
 *
 */
public interface NewsLoadService {
	
	/**
	 * 新闻加载
	 */
	public JsonResult newsLoad(Map map);
	
	/**
	 * 新闻预览
	 */
	public JsonResult newsPreview(String newsId);
	
	/**
	 * 新增新闻
	 * @param author 
	 * @param source 
	 */
	public JsonResult newSave(String newsTItle, String content, String source, String author);
	
}
