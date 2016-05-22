package com.hackerhome.www.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hackerhome.www.bean.CommentInfo;
import com.hackerhome.www.dao.CommentInfoMapper;
import com.hackerhome.www.util.HomeUtil;
import com.hackerhome.www.util.JsonResult;
/**
 * 评论留言实现类
 * @author Administrator
 */
@Service
public class CommentServiceImpl implements CommentService {
	
	@Resource
	private CommentInfoMapper commentInfoDao;
	
	/**
	 * 评论删除
	 */
	@Override
	public JsonResult delete() {
		JsonResult result = new JsonResult();
		commentInfoDao.delete();
		result.setMsg("Comment delete success.");
		result.setStatus(0);
		return result;
	}

	/**
	 * 评论新增
	 */
	@Override
	public JsonResult save(String newsId, String msgPsnName, String content, String userId) {
		CommentInfo comment = new CommentInfo();
		comment.setComment_id(HomeUtil.createId());
		comment.setNews_id(newsId);
		comment.setMsg_psn_name(msgPsnName);
		comment.setComment_content(content);
		comment.setComment_time(HomeUtil.getNewDateToStr());
		comment.setRegistusr_id(userId);
		commentInfoDao.save(comment);
		JsonResult result = new JsonResult();
		result.setMsg("Comment save success.");
		result.setStatus(0);
		return result;
	}

	/**
	 * 评论查询
	 */
	@Override
	public JsonResult selectList() {
		List<CommentInfo> list = commentInfoDao.selectList();
		JsonResult result = new JsonResult();
		result.setMsg("Comment selectList success.");
		result.setStatus(0);
		result.setData(list);
		return result;
	}

	/**
	 * 评论更新
	 */
	@Override
	public JsonResult update(String commentId, String sup, String opp) {
		CommentInfo comment = new CommentInfo();
		comment.setComment_id(commentId);
		// 更新 支持 
		if (sup != null && sup != "") {
			int sup1 = Integer.valueOf(sup)+1;
			comment.setSupport(sup1 + "");
		}
		// 更新 反对
		if (opp != null && opp != "") {
			int opp1 = Integer.valueOf(opp)+1;
			comment.setOpposition(opp1 + "");
		}
		JsonResult result = new JsonResult();
		commentInfoDao.update(comment);
		result.setMsg("Comment update success.");
		result.setStatus(0);
		return result;
	}

}
