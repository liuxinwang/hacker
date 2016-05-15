function getNewsId(){
	//将当前news li设置成选中状态
	$("#news_ul li a").removeClass("checked");
	$(this).find("a").addClass("checked");
	//获取请求参数
	var newsId = $(this).data("newsId");
	addCookie("newsId",newsId,0.5);
	var id = getCookie("newsId");
    window.open("newspreview.html?newsId="+id,"_blank");
}