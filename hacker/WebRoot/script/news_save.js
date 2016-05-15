$(function(){
	$("#news_save").click(function(){
  		var content = $("#elm1").xheditor().getSource(); //获取内容
  		var newsTitle = $("#title").val().trim(); //获取标题
  		var source = $("#source").val().trim(); //获取来源
  		var author = $("#author").val().trim(); //获取作者
  		var ok = true;
  		if(content == ""){
  			alert("内容不能为空哦");
  			ok = false;
  		}else if(newsTitle == ""){
  			alert("标题不能为空哦");
  			ok = false;
  		}else if(source == ""){
  			alert("来源不能为空哦");
  			ok = false;
  		}else if(author == ""){
  			alert("作者不能为空哦");
  			ok = false;
  		}
  		//发送ajax
  		if(ok){
	  		$.ajax({
					url:base_url+"/news/newsave.do",
					type:"post",
					data:{"newsTitle":newsTitle, "content":content, "source":source, "author":author},
					dataType:"json",
					success:function(result){
						if(result.status==0){//成功
							alert("新闻新增成功");//提示	
						}
					},
					error:function(){
						alert("保存失败,稍后重试");
					}
				});
  		}
  	});
})