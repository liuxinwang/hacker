// 新闻预览
$(function(){
	var url = location.search; //获取url中"?"符后的字串   
	//发送Ajax请求
	$.ajax({
		url:base_url+"/news/preview.do" + url,
		type:"get",
		data:{},
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var news = result.data;
				var content  = "<h2>"+news.news_title+"</h2>";
					content += "作者：<span>"+news.author+" </span>";
					content += "来源：<span>"+news.source+" </span><br/>";
					content += "<HR style='FILTER: progid:DXImageTransform.Microsoft.Glow(color=#987cb9,strength=10)' width='80%' color=#987cb9 SIZE=1>";
					content += "<br/><br/><br/>";
					content += news.content;
					content += "<br/><br/><br/>";
				var $contents = $(content);
				$("#news_priview").append($contents);
			}
		},
		error:function(){
			alert("加载新闻失败");
		}
	});
});

