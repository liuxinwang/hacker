function getNewsId(){
	//将当前news li设置成选中状态
	$("#news_tbody tr a").removeClass("checked");
	$(this).find("a").addClass("checked");
	//获取请求参数
	var newsId = $(this).attr("id");
//	addCookie("newsId",newsId,0.5);
//	var id = getCookie("newsId");
    window.open("newspreview.html?newsId="+newsId,"_blank");
}