package com.xxx.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.xxx.pojo.Slideshow;
import com.xxx.service.CategoryService;
import com.xxx.service.NewsService;
import com.xxx.service.SlideshowService;
import com.xxx.service.impl.CategoryServiceImpl;
import com.xxx.service.impl.NewsServiceImpl;
import com.xxx.service.impl.SlideshowServiceImpl;
import com.xxx.util.FileUploadUtil;


@WebServlet("/SlideshowServlet.do")
public class SlideshowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化Service方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		NewsService newsService = new NewsServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		SlideshowService slideshowService = new SlideshowServiceImpl();
		
		
		if(path.equals("/slideshow/list.do")) {
			//列表
			List<Slideshow> slideshowList = slideshowService.findAll();
			request.setAttribute("slideshowList",slideshowList );
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}else if (path.equals("/slideshow/add.do")) {
			
			
			response.sendRedirect("add.jsp");
		}else if (path.equals("/slideshow/addPic.do")) {
			FileUploadUtil fileUploadUtil = new FileUploadUtil();
			
			
			
		}else if (path.equals("/slideshow/addSlideshow.do")) {
			
			
			
			
		}else if (path.equals("/slideshow/update.do")) {
			
		}else if (path.equals("/slideshow/updateSlideshow.do")) {
			
		}
		
		
		
	}
	

}
