$(function (){
	$("#comment_save").click(function(){
		
		var url = location.search;
		var newsId = url.substr(url.length-32);
		var msgPsnName = getCookie("nickame");
		var content = $("#elm2").xheditor().getSource(); //获取内容
		var userId = getCookie("registId");
  		var ok = true;
  		if(newsId == null){
  			alert("文章id不能为空哦");
  			ok = false;
  		}else if(msgPsnName == null){
  			alert("登录人不能为空哦");
  			ok = false;
  		}else if(content == "" || content == null){
  			alert("内容不能为空哦");
  			ok = false;
  		}else if(userId == null){
  			alert("用户id不能为空哦");
  			ok = false;
  		}
  		//发送ajax
  		if(ok){
	  		$.ajax({
					url:base_url+"/comment/save.do",
					type:"post",
					data:{"newsId":newsId, "content":content, "msgPsnName":msgPsnName, "userId":userId},
					dataType:"json",
					success:function(result){
						if(result.status==0){//成功
							alert("评论成功");//提示	
							commentSelectList();
						}
					},
					error:function(){
						alert("评论失败,稍后重试");
					}
				});
  		}
  	});
});

function commentSelectList(){
	var newsId = location.search.substr(location.search.length-32);
	var ok = true;
	if(newsId == ""){
		ok = false;
		alert("文章id未找到。");
	}
	//发送ajax请求
	if(ok){
		$.ajax({
			url:base_url+"/comment/selectlist.do",
			type:"post",
			data:{"newsId":newsId},
			dataType:"json",
			success:function(result){
				if(result.status==0){//成功
					$("#show_comment ul").empty();
					var commentList = result.data;
					for(var i=0;i<commentList.length;i++){
						var content = commentList[i].comment_content;
						var msgPsnName = commentList[i].msg_psn_name;
						var commentime = strToTime(commentList[i].comment_time); //2016-4-29 22:02:30
						var floor = i+1;
						var sup = commentList[i].support;
						var opp = commentList[i].opposition;
//						li = "<li style='border:1px solid green;padding:8px;'>"+content+"</li><br/>";
						li = "<li style='border:1px solid green;padding:8px;'>";
						li += "<div>";
						li += "<a href=''><img src='userimg/20160518192424.jpg' style='width:50px;height: 50px;'/></a>";
						li += "<span>"+msgPsnName+" "+commentime+"</span>  <span>"+floor+"楼</span>";
						li += "</div>";
						li += "<div>";
						li += "<span>"+content+"</span>";
						li += "</div>";
						li += "<div>";
						li += "<a id='sup_a' href='javascript:;;'>赞同</a>";
						li += "<span id='sup'>("+sup+")</span>";
						li += "<a id='opp_a' href='javascript:;;'>反对</a>";
						li += "<span id='opp'>("+opp+")</span>";
						li += "</div>";
						li += "</li>";
						li += "<br/>";
						$li = $(li);
						$("#show_comment ul").append($li);
					}
				}
			},
			error:function(){
				alert("查询失败,稍后重试");
			}
		});
	}
}