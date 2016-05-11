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
	 * @return
	 */
	public JsonResult newsLoad(Map map);
	
	/**
	 * 新闻预览
	 * @return
	 */
	public JsonResult newsPreview(String newsId);
	
}
