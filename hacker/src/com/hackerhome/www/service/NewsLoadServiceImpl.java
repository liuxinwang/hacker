package com.hackerhome.www.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hackerhome.www.bean.NewsLibrary;
import com.hackerhome.www.dao.NewsLibraryMapper;
import com.hackerhome.www.util.HomeUtil;
import com.hackerhome.www.util.JsonResult;
@Service
public class NewsLoadServiceImpl implements NewsLoadService {
	
	@Resource
	private NewsLibraryMapper dao;
	
	/**
	 * 新闻加载
	 */
	@Override
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
	@Override
	public JsonResult newsPreview(String newsId) {
		NewsLibrary news = dao.findById(newsId);
		if (news != null) {
			//同步更新阅读量 
			String pviews = (Integer.parseInt(news.getPviews())+1) + "";
			Map<String, String> map = new HashMap<String, String>();
			map.put("newsId", newsId);
			map.put("pviews", pviews);
			dao.update(map);
		}
		JsonResult result = new JsonResult();
		result.setMsg("news load success.");
		result.setStatus(0);
		result.setData(news);
		return result;
	}
	
	/**
	 * 新增新闻
	 */
	@Override
	public JsonResult newSave(String newsTitle, String content, String source, String author) {
		NewsLibrary news = new NewsLibrary();
		news.setAuthor(author);
		news.setSource(source);
		news.setContent(content);
		news.setNews_id(HomeUtil.createId());
		news.setIssue_time(HomeUtil.getNewDateToStr());
		news.setNews_title(newsTitle);
		news.setCreator(null);
		news.setCreate_time(HomeUtil.getNewDateToStr());
		news.setUpdator(null);
		news.setUpdate_time(HomeUtil.getNewDateToStr());
		dao.save(news);
		JsonResult result = new JsonResult();
		result.setMsg("news save success.");
		result.setStatus(0);
		return result;
	}

}
