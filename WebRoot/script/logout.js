$(function(){
	$("#logout").click(function(){
		$("#nickname_div").hide();
		$("#log_span").show();
		delCookie("registId");
		delCookie("nickame");
		delCookie("registName");
	});
})