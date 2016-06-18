package com.hackerhome.www.dao;

import java.util.List;
import java.util.Map;

import com.hackerhome.www.bean.NewsLibrary;

public interface NewsLibraryMapper {
	public List<NewsLibrary> findAll(Map map);		//新闻查询 非热点
	public List<NewsLibrary> findHotspot();  		//热点查询
	public NewsLibrary findById(String newsId);		//查看新闻详情
	public void save(NewsLibrary news);				//查看新闻详情
	public void update(Map<String, String> map);					//更新阅读量
}
