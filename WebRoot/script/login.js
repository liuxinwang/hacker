$(function(){
	$("#login_button").click(function(){
		//获取请求参数
		var name = $("#username").val().trim();
		var password = $("#password").val().trim();
		//检查格式
		var ok = true;
		if(name==""){
			ok = false;
			$("#warning_4").html("用户名为空");
			$("#warning_4").show();
		}
		if(password==""){
			ok = false;
			$("#warning_5").html("密码为空");
			$("#warning_5").show();
		}else{
			if(password.length<6){
				ok = false;
				$("#warning_5").html("密码需要6位以上");
				$("#warning_5").show();
			}
		}
		//发送Ajax
		if(ok){
			$.ajax({
				url:base_url+"/registusr/loginInfo.do",
				type:"post",
				data:{"name":name,"password":password},
				dataType:"json",
				success:function(result){
					if(result.status==0){//成功
						if(name=="root" && getCookie("registId")!=null){
							//直接进入管理页面
							window.location.href="iframe.html";
						}else{
							//否则进入主页
							window.location.href="homepage.html";
						}
						//将用户ID存入Cookie
						var registId = result.data.registusr_id;
						var nickame = result.data.registusr_nickname;
						var registName = result.data.registusr_name;
						addCookie("registId",registId,0.5); 
						addCookie("nickame",nickame,0.5); 
						addCookie("registName",registName,0.5); 
						alert(result.msg);//提示			
					}else if(result.status==1){//用户名不存在
						$("#warning_4").html(result.msg);
						$("#warning_4").show();
					}else if(result.status==2){//用户名或密码错误
						$("#warning_5").html(result.msg);
						$("#warning_5").show();
					}
				},
				error:function(){
					alert("登录失败,稍后重试");
				}
			});
		}
	});
});