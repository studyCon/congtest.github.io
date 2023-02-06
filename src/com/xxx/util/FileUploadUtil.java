package com.xxx.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class FileUploadUtil {
	
	//重命名方法
	public static String getUUIDFileName(String fileName) {
		int idx = fileName.lastIndexOf(".");//以“.”分割
		String ext = fileName.substring(idx);//保留后缀
		String name = UUID.randomUUID().toString().replace("-", "")+ext;
		return name;
	}
	
	//文件上传
	public static String FileUpload(HttpServletRequest request) {
		//创建磁盘文件项工厂对象
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		//创建一个解析类
		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
		//解析 request 请求，返回list集合(list集合中存放的是fileitem对象)
		
		try {
			List<FileItem> list = servletFileUpload.parseRequest(request);
			for (FileItem i : list) {
				if (i.isFormField()) {
					//普通文本
					try {
						String name = new String(i.getString().getBytes("ISO-8859-1"),"UTF-8");
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				}else {
					//文件上传
					//保存路径
					//String PicPath = request.getServletContext().getRealPath("/file");//放在根目录下
					String PicPath = request.getServletContext().getRealPath("")+"../file";
					String PicName = FileUploadUtil.getUUIDFileName(i.getName());
					//String src = request.getServletContext().getRealPath("/file")+"\\"+PicName;
					//判断路径是否存在
					File file= new File(PicPath);
					if (!file.exists()) {
						file.mkdirs();
					}

					try {
						i.write(new File(PicPath,PicName));
					} catch (Exception e) {
						e.printStackTrace();
					}
					return "http://localhost:8080/file/"+PicName ;
				}
				
			}
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
