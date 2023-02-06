package com.xxx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.pojo.Slideshow;
import com.xxx.service.CategoryService;
import com.xxx.service.NewsService;
import com.xxx.service.SlideshowService;
import com.xxx.service.impl.CategoryServiceImpl;
import com.xxx.service.impl.NewsServiceImpl;
import com.xxx.service.impl.SlideshowServiceImpl;


@WebServlet("/ComServlet")
public class tongyongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化Service方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		
		NewsService newsService = new NewsServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		SlideshowService slideshowService = new SlideshowServiceImpl();
		
		if(path.equals("/slideshow/list.do")) {
			
		}else if (path.equals("/slideshow/add.do")) {
			
		}else if (path.equals("/slideshow/addSlideshow.do")) {
			
		}else if (path.equals("/slideshow/update.do")) {
			
		}else if (path.equals("/slideshow/updateSlideshow.do")) {
			
		}
		
		
		
	}

}
