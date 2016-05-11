$(function(){
	$("#news_save").click(function(){
  		var content = $('div #edit').froalaEditor('html.get'); //获取内容
  		var newsTitle = $("#title").val().trim(); //获取来源
  		var source = $("#source").val().trim(); //获取来源
  		var author = $("#author").val().trim(); //获取作者
  		//发送ajax
  		$.ajax({
				url:base_url+"/news/newsave.do",
				type:"post",
				data:{"newsTitle":newsTitle, "content":content, "source":source, "author":author},
				dataType:"json",
				success:function(result){
					if(result.status==0){//成功
						alert(result.msg);//提示	
					}
				},
				error:function(){
					alert("保存失败,稍后重试");
				}
			});
  	});
})