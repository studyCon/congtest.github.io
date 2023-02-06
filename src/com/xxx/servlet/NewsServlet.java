package com.xxx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.xxx.pojo.Category;
import com.xxx.pojo.News;
import com.xxx.service.CategoryService;
import com.xxx.service.NewsService;
import com.xxx.service.impl.CategoryServiceImpl;
import com.xxx.service.impl.NewsServiceImpl;


@WebServlet("/NewsServlet.do")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化Service方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		NewsService newsService = new NewsServiceImpl();
		CategoryService categoryService = new CategoryServiceImpl();
		
		if(path.equals("/news/list.do")) {
			//列表
			//查询全部
			List<News> newsList = newsService.findAll();
			//查询单条
			Integer id;
			if (request.getParameter("seCateId")==null) {
				id = 0;
			}else {
				Integer seCateId = Integer.parseInt(request.getParameter("seCateId"));
				newsList = newsService.findByCate(seCateId);
			}
			//存放作用域
			request.setAttribute("newsList", newsList);
			//转发
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}else if (path.equals("/news/add.do")) {
			//
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}else if (path.equals("/news/addNews.do")) {
			//新闻添加
			
		}else if (path.equals("/news/update.do")) {
			//当路径为会员修改时
			
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}else if (path.equals("/news/updateNews.do")) {
			//当路径为新闻添加提交时
			
		}else if (path.equals("/news/delete.do")) {
			//当路径为会员删除时
			String id = request.getParameter("id");
			if(newsService.delete(Integer.parseInt(id))){
				//删除成功
				response.sendRedirect("list.do");
				System.out.println("delete ok");
				request.getSession().setAttribute("error_deleteNews", "");
			}else {
				//删除失败
				//错误信息
				request.getSession().setAttribute("error_deleteNews", "删除失败");
				response.sendRedirect("update.do?id="+id);
			}
		}else if (path.equals("/news/findByCateName.do")) {
			//添加新闻---一级分类
			//设置相应中文乱码
			response.setContentType("text/html;charset=utf-8");
			//获取一级分类信息
			Integer pid =0;
			List<Category> list = categoryService.findAll(pid);
			//封装数据
			JSONObject json = new JSONObject();
			json.put("date", list);
			//响应到客户端
			response.getWriter().write(json.toString());
		}else if (path.equals("/news/findBySeCateName.do")) {
			//添加新闻---二级分类
			//设置相应中文乱码
			response.setContentType("text/html;charset=utf-8");
			//获取pid
			Integer pid = Integer.parseInt(request.getParameter("selectByCateId"));
			//获取二级分类信息
			List<Category> list = categoryService.findAll(pid);
			//封装数据
			JSONObject json = new JSONObject();
			json.put("date", list);
			//响应到客户端
			response.getWriter().write(json.toString());
		}
			
	}

}
////查询一级分类
//Integer pid =0;
//List<Category> categoryList = categoryService.findAll(pid);
////查询单条信息
//Category category = categoryService.find(pid);
////存放作用域
//request.setAttribute("pid",pid);
//request.setAttribute("category", category);
//request.setAttribute("categoryList", categoryList);