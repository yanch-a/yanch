package com.framework.common.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件工具类
 * @author huang
 *
 */
public class FileUtils extends org.apache.commons.io.FileUtils{
	private static String syswinpath = System.getProperty("user.dir") + "\\zip\\";
	private static String syslinuxpath = System.getProperty("user.dir") + "/zip";
	/**
	 * 文件上传
	 * @param file	文件
	 * @return	文件路径
	 */
	public static String updateFile(MultipartFile file) {
		Map<String, Object> filePath = getFilePath(file);
		//判断文件父目录是否存在
		File dest = new File(filePath.get("sysfilepath").toString());
		if(dest.getParentFile().exists()==false){
			dest.getParentFile().mkdirs();
		}
		//开始上传
		if(StringUtils.isNotBlank(file.getOriginalFilename())) {
			try {
				file.transferTo(new File(filePath.get("sysfilepath").toString()));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		return filePath.get("dbfilepath").toString();
	}
	
	/**
	 * 删除文件
	 * @param filePath 文件地址
	 * @return	true = 成功 <br> false = 失败
	 */
	public static boolean deleteFile(String filePath) {
		
		
		return false;
	}
	
	/**
	 * 获取系统文件路径
	 * @param file
	 * @return
	 */
	public static Map<String, Object> getFilePath(MultipartFile file) {
		SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy-MM-dd");
		Map<String, Object> result = new HashMap<String, Object>();
		boolean property = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
		if(property) {
			//linux
			System.out.println("linux系统文件上传");
			// 文件保存路径
			String fileName = file.getOriginalFilename();
			//日期目录
			String datepath = sdfdate.format(new Date());
			//自定义目录，文件名称，文件类型
			String pathname = datepath + "/" + fileName;
			//返回文件地址
			String dbfilepath = datepath + "/" + fileName;
			//总地址
			String sysfilepath = syslinuxpath + "/" + pathname;
			result.put("dbfilepath", dbfilepath);
			result.put("sysfilepath", sysfilepath);
		}else {
			//windows
			System.out.println("windows系统文件上传");
			// 文件保存路径
			String fileName = file.getOriginalFilename();
			//日期目录
			String datepath = sdfdate.format(new Date());
			//自定义目录，文件名称，文件类型
			String pathname = datepath + "\\" + fileName;
			//返回文件地址
			String dbfilepath = datepath + "/" + fileName;
			//总地址
			String sysfilepath = syswinpath + pathname;
			result.put("dbfilepath", dbfilepath);
			result.put("sysfilepath", sysfilepath);
		}
		
		return result;
	}
	
	/**
	 * 获取系统文件路径
	 * @return
	 */
	public static String getFilePath() {
		boolean property = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
		if(property) {
			//linux
			return syslinuxpath;
		}else {
			//windows
			return syswinpath;
		}
	}
}
