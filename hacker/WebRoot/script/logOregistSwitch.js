function logSwitch(){
	$("#a_regist").click(function(){
		$("#regist_div").hide(800);
		$("#login_div").show(800);
		$("#warning_4").hide(); 
		$("#warning_5").hide(); 
	});
};

function registSwitch(){
	$("#a_login").click(function(){
		$("#login_div").hide(800);
		$("#regist_div").show(800);
		$("#warning_1").hide(); 
		$("#warning_2").hide(); 
		$("#warning_3").hide(); 
	});
};