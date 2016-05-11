package com.hackerhome.www.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackerhome.www.service.NewsLoadService;
import com.hackerhome.www.util.JsonResult;

/**
 * 新闻加载
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/news")
public class NewsLoadController {
	
	@Resource
	private NewsLoadService service;
	
	/**
	 * 新闻加载
	 * @return
	 */
	@RequestMapping("/newsload.do")
	@ResponseBody
	public JsonResult execute(Integer page, Integer size){
		@SuppressWarnings("unused")
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page",page);
		map.put("size", size);
		JsonResult result = service.newsLoad(map);
		return result;
	}
	
	/**
	 * 新闻预览
	 * @param newsId
	 * @return
	 */
	@RequestMapping("/newspreview.do")
	@ResponseBody
	public JsonResult newsPreview(String newsId){
		JsonResult result = service.newsPreview(newsId);
		return result;
	}
	
	/**
	 * 新增新闻
	 * @param newsId
	 * @return
	 */
	@RequestMapping("/newsave.do")
	@ResponseBody
	public JsonResult newSave(String newsTitle, String content, String source, String author){
		JsonResult result = service.newSave(newsTitle, content, source, author);
		return result;
	}
}
