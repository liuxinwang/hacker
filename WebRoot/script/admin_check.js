// 主页 管理员登录检查
window.onload=function(){
	var registName = getCookie("registName");
	if(registName==null || registName != "root"){
		alert("非管理员不允许登录！");
		window.location.href="log_in.html";
	}
}