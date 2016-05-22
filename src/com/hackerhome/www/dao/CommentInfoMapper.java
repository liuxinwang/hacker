package com.hackerhome.www.dao;

import java.util.List;

import com.hackerhome.www.bean.CommentInfo;

public interface CommentInfoMapper {
	
	public List<CommentInfo> selectList();
	
	public void save(CommentInfo comment);
	
	public void update(CommentInfo comment);
	
	public void delete();

}
