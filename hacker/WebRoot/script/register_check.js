$(function(){
	$("#regist_username").focus(function(){
		$("#warning_1").hide(); 
	});
	$("#regist_password").focus(function(){
		$("#warning_2").hide(); 
	});
	$("#final_password").focus(function(){
		$("#warning_3").hide(); 
	});
	
	$("#username").focus(function(){
		$("#warning_4").hide(); 
	});
	$("#password").focus(function(){
		$("#warning_5").hide(); 
	});
});