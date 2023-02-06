package com.xxx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.pojo.ComInfo;
import com.xxx.service.CategoryService;
import com.xxx.service.ComInfoService;
import com.xxx.service.NewsService;
import com.xxx.service.SlideshowService;
import com.xxx.service.impl.CategoryServiceImpl;
import com.xxx.service.impl.ComInfoServiceImpl;
import com.xxx.service.impl.NewsServiceImpl;
import com.xxx.service.impl.SlideshowServiceImpl;

@WebServlet("/ComInfoSerlet.do")
public class ComInfoSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化Service方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		
		NewsService newsService = new NewsServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		SlideshowService slideshowService = new SlideshowServiceImpl();
		ComInfoService comInfoService = new ComInfoServiceImpl();
		
		if (path.equals("/cominfo/update.do")) {
			
			ComInfo comInfo = comInfoService.findComInfo();
			request.setAttribute("comInfo", comInfo);
			
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}else if (path.equals("/cominfo/updateCominfo.do")) {
			
		}
	}

}
