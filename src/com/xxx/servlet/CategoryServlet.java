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
import com.xxx.service.impl.CategoryServiceImpl;



@WebServlet("/CategoryServlet.do")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		CategoryService categoryService = new CategoryServiceImpl();
		
		
		if(path.equals("/category/list.do")) {
			//分类列表
			
			//分类等级判断
			Integer pid;
			if (request.getParameter("pid")==null) {
				//默认一级分类
				pid = 0;
			}else {
				//非默认情况下,获取当前PID
				String pidString = request.getParameter("pid");
				pid = Integer.parseInt(pidString);
			}
			//查询一级分类
			List<Category> categoryList = categoryService.findAll(pid);
			//查询单条信息
			Category category = categoryService.find(pid);
			//存放作用域
			request.setAttribute("categoryList", categoryList);
			request.setAttribute("pid", pid);
			request.setAttribute("category", category);
			//转发
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}else if (path.equals("/category/add.do")) {
			//分类添加
			//查询一级分类
			Integer pid =0;
			List<Category> categoryList = categoryService.findAll(pid);
			//查询单条信息
			Category category = categoryService.find(pid);
			//存放作用域
			request.setAttribute("pid",pid);
			request.setAttribute("category", category);
			request.setAttribute("categoryList", categoryList);
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}else if (path.equals("/category/addCate.do")) {
//			//分类添加
//			//接收参数
//			Integer pid = Integer.parseInt(request.getParameter("pid"));//转型
//			String cateName = request.getParameter("cateName");
//			//Integer status = 1;//默认状态为正常(无效，sql新增语句中没有status)
//			//封装
//			Category category = new Category(cateName, pid);
//			//入库
//			if (categoryService.insert(category)) {
//				//成功
//				response.sendRedirect("list.do?pid="+pid);
//				request.getSession().setAttribute("error_addCate", "");
//			}else {
//				//失败
//				//错误信息
//				request.getSession().setAttribute("error_addCate", "添加失败，请重试");
//				response.sendRedirect("add.do");
//			}
//			
		}else if (path.equals("/category/update.do")) {
			//修改
			String id = request.getParameter("id");
			Integer idInteger = Integer.parseInt(id);
			Category category = categoryService.find(idInteger);
			
			//校验信息
			//存放作用域
			request.setAttribute("category", category);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}else if (path.equals("/category/updateCate.do")) {
			//修改提交
			//接收参数
			Integer id = Integer.parseInt(request.getParameter("id"));
			String cateName = request.getParameter("cateName");
			Integer pid = Integer.parseInt(request.getParameter("pid"));
			Integer state = Integer.parseInt(request.getParameter("state"));
			Integer status = Integer.parseInt(request.getParameter("status"));
			//封装信息
			Category category = new Category(id, cateName, pid, state, status);
			if (categoryService.update(category)) {
				//入库成功
				response.sendRedirect("list.do");
				request.getSession().setAttribute("error_listCate", "");
			}else {
				//入库失败
				//错误信息
				request.getSession().setAttribute("error_listCate", "提交失败，请重试");
				response.sendRedirect("update.do?id="+id);
			}
		}else if (path.equals("/category/delete.do")) {
			//删除
			String id = request.getParameter("id");
			if(categoryService.delete(Integer.parseInt(id))){
				//删除成功
				response.sendRedirect("list.do");
				request.getSession().setAttribute("error-delete", "");
			}else {
				//删除失败
				request.getSession().setAttribute("error-delete", "删除失败");
				response.sendRedirect("update.do?id="+id);
			}
		}
				
	}

}
