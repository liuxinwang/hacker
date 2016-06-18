// 主页数据加载

//新闻列表加载
function newsListLoad(page,size){
	var registId = getCookie("registId");
	var nickame = getCookie("nickame");
	if(registId != null){
		$("#user_nickname").html(nickame);
		$("#logout").html("退出");
		$(".log_span").hide();
	} else {
		$("#nickname_div").hide();
		$("#log_span").show();
		
	}
	$.ajax({
		url: base_url+"/news/newsload.do",
		data: {"page":page, "size":size},
		type: "get",
		dataType: "json",
		success: function(result){
			if(result.status==0){
				$("#news_table tbody").empty();
				//热点
				var newsHot = result.data1;
				for(var v=0;v<newsHot.length;v++){
					var newsTitle = newsHot[v].news_title;
					var newsContent = newsHot[v].content;
					var newsId = newsHot[v].news_id;
					var s_div  = '<div id="hot_'+(v+1)+'">';
						s_div += '<h3><a id='+newsId+' href="javascript:;;">'+newsTitle+'</a></h3>';
						s_div += '<p>'+newsContent+'</p>';
						s_div += '</div>';
					$div = $(s_div);								
					$("#right_hot").append($div);
				}
				//非热点
				var newsList = result.data;
				for(var v=0;v<newsList.length;v++){
					var newsTitle = newsList[v].news_title;
					var author = newsList[v].author;
					var issueTime = newsList[v].issue_time;
					var newsId = newsList[v].news_id;
					issueTime = strToDate(issueTime);
					var s_tr  = '<tr>';
					 	s_tr += '<td align="left"><a id='+newsId+' href="javascript:;">'+newsTitle+'</a></td>';
					 	s_tr += '<td>'+author+'</td>';
					 	s_tr += '<td>'+issueTime+'</td>';
					 	s_tr += '</tr>';
					$tr = $(s_tr);
					$tr.data("newsId",newsId);								
					$("#news_table tbody").append($tr);
				}
			}
		},
		error: function(){
			alert(result.msg);
		}
	});	
};