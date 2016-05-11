package com.hackerhome.www.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hackerhome.www.bean.NewsLibrary;
import com.hackerhome.www.dao.NewsLibraryMapper;
import com.hackerhome.www.util.JsonResult;
@Service
public class NewsLoadServiceImpl implements NewsLoadService {
	
	@Resource
	private NewsLibraryMapper dao;
	
	/**
	 * 新闻加载
	 */
	public JsonResult newsLoad(Map map) {
		// 新闻加载 非热点
		List<NewsLibrary> newsList = dao.findAll(map);	
		// 热点新闻加载
		List<NewsLibrary> hotspotNewsList = dao.findHotspot();
		JsonResult result = new JsonResult();
		result.setMsg("news list load success.");
		result.setStatus(0);
		result.setData(newsList);
		result.setData1(hotspotNewsList);
		return result;
	}
	
	/**
	 * 新闻预览
	 */
	public JsonResult newsPreview(String newsId) {
		NewsLibrary news = dao.findById(newsId);
		JsonResult result = new JsonResult();
		result.setMsg("news load success.");
		result.setStatus(0);
		result.setData(news);
		return result;
	}

}
