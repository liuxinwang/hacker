package com.hackerhome.www.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hackerhome.www.util.DateUtil;

@Controller
@RequestMapping("/upload")
public class ImageUploadController {

	private static final Log logger = LogFactory.getLog(ImageUploadController.class);

	@RequestMapping(value = "/image.do", method = RequestMethod.POST)
	@ResponseBody
	public String test(HttpServletRequest request, HttpSession session,
			@RequestParam("filedata") MultipartFile file) {

		// 将图片按日期分开存放，方便管理
		final String path_segment = "/upload/images/" + DateUtil.getFormatDate("yyyy/MM_dd");

		// 存放到web根目录下,如果日期目录不存在，则创建,
		// 注意 request.getRealPath("/") 已经标记为不推荐使用了.
		final String path = session.getServletContext().getRealPath("/")
				+ path_segment;
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		logger.info(path);

		// 以下是真正的上传部分
		String error = "";
		// 取得原文件名
		String originName = file.getOriginalFilename();
		// 取得文件后缀
		String fileExt = originName.substring(originName.lastIndexOf(".") + 1);
		// 按时间戳生成图片文件名
		String picture = DateUtil.getFormatDate("yyyyMMddHHmmss") + "." + fileExt;
		try {

			IOUtils.copy(file.getInputStream(), new FileOutputStream(new File(
					dir, picture)));

		} catch (Exception e) {
			logger.error("error:", e);
			error = e.getMessage();
		}

		// 将图片路径按xheditor要求的json格式字符串返回

		String url = "http://" + request.getServerName() // 服务器地址
				+ ":" + request.getServerPort() // 端口号
				+ request.getContextPath() // 项目名称
				+ path_segment + "/" + picture; // upload/images/2012/11_09/20121109223012.jpg

		return "{\"err\":\"" + error + "\",\"msg\":\"" + url + "\"}";

	}
}
