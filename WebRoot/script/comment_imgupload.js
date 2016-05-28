$(function pageInit() {
			$('#elm2').xheditor( {
				tools : 'mini',  
	            skin : 'vista',  
	            showBlocktag : false,  
	            internalScript : false,  
	            internalStyle : false,  
	            width : 730,  
	            height : 200,  
	            fullscreen : false,  
	            sourceMode : false,  
	            forcePtag : false,  
	            html5Upload : false, 
				//upLinkUrl:超链接上传接口地址
				upLinkUrl : "upload.php",
				//upLinkExt:超链接本地上传扩展限制
				upLinkExt : "zip,rar,txt",
				//upImgUrl:图片上传接口地址
				upImgUrl : "upload/image.do",
				//upImgExt:图片本地上传扩展限制
				upImgExt : "jpg,jpeg,gif,png",
				//upFlashUrl:动画上传接口地址
				upFlashUrl : "upload.php",
				//upFlashExt:动画本地上传扩展限制
				upFlashExt : "swf",
				//upMediaUrl:视频上传接口地址
				upMediaUrl : "upload.php",
				//upMediaExt:视频本地上传扩展限制
				upMediaExt : "wmv,avi,wma,mp3,mid",
				onUpload : insertUpload
			});
			
			//图片上传回调函数  
		function insertUpload(msg) {
			var _msg = msg.toString();
			//插入图片到编辑器
	//		$("#content").append(_msg);
		}
			
		});