package com.hackerhome.www.dao.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hackerhome.www.bean.NewsLibrary;
import com.hackerhome.www.dao.NewsLibraryMapper;
import com.hackerhome.www.util.SpringTest;

public class TestNewsMapper extends SpringTest {
	@Test
	public void test1() {
		NewsLibraryMapper dao = super.getContext().getBean("newsLibraryMapper",
				NewsLibraryMapper.class);
		List<NewsLibrary> newsList = dao.findAll(null);
		for (NewsLibrary news : newsList) {
			System.out.println(news.getNews_id() + " " + news.getNews_title()
					+ " " + news.getIssue_time());
		}

	}
	@Test
	public void test2() {
		NewsLibraryMapper dao = super.getContext().getBean("newsLibraryMapper",
				NewsLibraryMapper.class);
		List<NewsLibrary> newsList = dao.findHotspot();
		for (NewsLibrary news : newsList) {
			System.out.println(news.getNews_id() + " " + news.getNews_title()
					+ " " + news.getIssue_time());
		}
		
	}
	@Test
	public void test3() {
		NewsLibraryMapper dao = super.getContext().getBean("newsLibraryMapper",
				NewsLibraryMapper.class);
		NewsLibrary news = dao.findById("e3aaea1c0edd11e6ae32000c29bcb84c");
//		for (NewsLibrary news : newsList) {
			System.out.println(news.getNews_id() + " " + news.getNews_title()
					+ " " + news.getIssue_time());
//		}
		
	}
}
