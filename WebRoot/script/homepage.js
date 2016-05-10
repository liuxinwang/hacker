// 主页数据加载

//新闻列表加载
function newsListLoad(page,size){
	var registId = getCookie("registId");
	var nickame = getCookie("nickame");
	if(registId != null){
		$("#user_nickname").html(nickame);
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
				$("#newsleft_div ul").empty();
				$("#newsright_div ul").empty();
				var newsList = result.data;
				for(var v=0;v<newsList.length;v++){
					var newsTitle = newsList[v].news_title;
					var issueTime = newsList[v].issue_time;
					issueTime = strToDate(issueTime);
					var s_li  = '<li>';
						s_li += '<span class="title">';
					 	s_li += '<a href="newspreview.html" target="_Blank">';
					 	s_li += newsTitle+"  ";
					 	s_li += '</a>';
					 	s_li += '</span>';
						s_li += '<span class="date">'+issueTime+'</span>';
					 	s_li += '</li>';
					$li = $(s_li);
					if(v<20){									
						$("#newsleft_div ul").append($li);
					}else{
						$("#newsright_div ul").append($li);
					}
				}
			}
		},
		error: function(){
			alert(result.msg);
		}
	});	
};