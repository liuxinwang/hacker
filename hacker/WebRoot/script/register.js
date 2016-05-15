$(function(){
	$("#regist_button").click(function(){
		//获取请求参数
		var name = $("#regist_username").val().trim();
		var password = $("#regist_password").val().trim();
		var final_password = $("#final_password").val().trim();
		//检查格式
		var ok = true;
		if(name==""){
			ok = false;
			$("#warning_1").html("用户名为空");
			$("#warning_1").show();
		}
		if(password==""){
			ok = false;
			$("#warning_2").html("密码为空");
			$("#warning_2").show();
		}else{
			if(password.length<6){
//				ok = false;
//				$("#warning_2").html("密码需要6位以上");
//				$("#warning_2").show();
			}
		}
		if(final_password != password){
			ok = false;
			$("#warning_3").html("与密码不一致");
			$("#warning_3").show();
		}
		//发送Ajax
		if(ok){
			$.ajax({
				url:base_url+"/registusr/registusrInfo.do",
				type:"post",
				data:{"name":name,"password":password},
				dataType:"json",
				success:function(result){
					if(result.status==0){//成功
						$("#regist_username").val("");
						$("#regist_password").val("");
						$("#final_password").val("");
						alert(result.msg);//提示
						$("#regist_div").hide();
						$("#login_div").show();
					}else if(result.status==1){//用户名占用
						$("#warning_1 span").html("用户名已存在");
						$("#warning_1").show();
					}
				},
				error:function(){
					alert("注册失败,稍后重试");
				}
			});
		}
	});
});