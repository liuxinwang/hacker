function strToDate(str){
	var str_date = str.substr(0,4)+'/'+str.substr(4,2)+'/'+str.substr(6,2)+' '+
					str.substr(8,2)+':'+str.substr(10,2)+':'+str.substr(12);
	//把字符串转为date
	var get_date = new Date(str_date);
	//调用date()的方法获取年 月 日 周几
	var year = get_date.getFullYear();
	var month = get_date.getMonth()+1;
	var date = get_date.getDate();
	var day = get_date.getDay();
	//获取当前时间
	var new_date = new Date();
	var nyear = new_date.getFullYear();
	var nmonth = new_date.getMonth()+1;
	var ndate = new_date.getDate();
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