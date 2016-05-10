function strToDate(str){
	//把字符串转为date
	var getDate = new Date(str.substr(0,4)+'-'+str.substr(4,2)+'-'+str.substr(6,2)+' '+
					str.substr(8,2)+':'+str.substr(10,2)+':'+str.substr(12));
	//调用date()的方法获取年 月 日 周几
	var year = getDate.getFullYear();
	var month = getDate.getMonth()+1;
	var date = getDate.getDate();
	var day = getDate.getDay();
	//获取当前时间
	var newDate = new Date();
	var nyear = newDate.getFullYear();
	var nmonth = newDate.getMonth()+1;
	var ndate = newDate.getDate();
	//入参时间与当前时间比较 今天 昨天 或 直接入参日期
	if(date == ndate && year == nyear && month == nmonth){
		return '今日';
	}else if((ndate - date) == 1 && year == nyear && month == nmonth){
		return '昨天';
	}else{
		return date + '日';
	}
	
	return date;
}