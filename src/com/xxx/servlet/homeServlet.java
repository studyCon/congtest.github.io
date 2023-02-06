package com.xxx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.pojo.Category;
import com.xxx.service.CategoryService;
import com.xxx.service.NewsService;
import com.xxx.service.SlideshowService;
import com.xxx.service.impl.CategoryServiceImpl;
import com.xxx.service.impl.NewsServiceImpl;
import com.xxx.service.impl.SlideshowServiceImpl;


@WebServlet("/homeServlet.do")
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化userService方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		NewsService newsService = new NewsServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		SlideshowService slideshowService = new SlideshowServiceImpl();
		
		if (path.equals("/home/index.do")) {
			List<Category> categorylist = categoryService.findAll(0);
			request.setAttribute("categorylist", categorylist);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if (path.equals("/user/addUser.do")) {
			
		}
		
		
	}

}
