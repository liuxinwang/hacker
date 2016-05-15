// 主页 管理员登录 检查
window.onload=function(){
	$("#admin_login").click(function(){		
		var registName = getCookie("registName");
		if(registName==null || registName != "root" && registName != "liu"){
			alert("非管理员不允许登录！");
		} else {
			window.location.href = "http://localhost:8080/hacker/xheditor.html";
		}
	});
}