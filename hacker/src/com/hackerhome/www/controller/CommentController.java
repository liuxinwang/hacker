package com.hackerhome.www.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackerhome.www.service.CommentService;
import com.hackerhome.www.util.JsonResult;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Resource
	private CommentService commentService;
	
	@RequestMapping("/save.do")
	@ResponseBody
	public JsonResult save(String newsId, String msgPsnName, String content, String userId){
		JsonResult result = commentService.save(newsId, msgPsnName, content, userId);
		return result;
	}
	
	@RequestMapping("/selectlist.do")
	@ResponseBody
	public JsonResult selectList(){
		JsonResult result = commentService.selectList();
			return result;
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody
	public JsonResult delete(String commentId){
		JsonResult result = commentService.delete();
			return result;
	}
	
	@RequestMapping("/update.do")
	@ResponseBody
	public JsonResult update(String commentId, String sup, String opp){
		JsonResult result = commentService.update(commentId, sup, opp);
			return result;
	}
}
