package com.xxx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.pojo.User;
import com.xxx.service.UserService;
import com.xxx.service.impl.UserServiceImpl;

@WebServlet("/UserServlet.do")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码字符集并获取路径，实例化userService方便后面调用
		request.setCharacterEncoding("utf-8");
		String path = request.getServletPath();
		UserService userService = new UserServiceImpl();
		//根据路径实现不同渲染
		if (path.equals("/user/add.do")) {
			//用户添加
			response.sendRedirect("add.jsp");
		}else if (path.equals("/user/addUser.do")) {
			//用户添加提交
			//接收参数并封装
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String sex = request.getParameter("sex");
			String age = request.getParameter("age");
			String tel = request.getParameter("tel");
			User user = new User(username, password, Integer.parseInt(sex), Integer.parseInt(age), tel);
			//校验
			//上传
			if (userService.insert(user)) {
				//成功
				response.sendRedirect("list.do");
			}else {
				//失败
				request.getRequestDispatcher("add.do").forward(request, response);
			}
		}else if (path.equals("/user/list.do")) {
			//用户列表
			//获取全部用户信息并发送至页面
			List<User> userList = userService.findAll();
			request.setAttribute("userList", userList);
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}else if (path.equals("/user/update.do")) {
			//用户信息修改
			//获取原信息并发送至页面
			String id = request.getParameter("id");
			User user = userService.findById(Integer.parseInt(id));
			request.setAttribute("user", user);
			request.getRequestDispatcher("update.jsp?id="+id).forward(request, response);
		}else if (path.equals("/user/updateUser.do")) {
			//用户信息修改提交
			//接收参数并封装
			String id = request.getParameter("id");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String sex = request.getParameter("sex");
			String state = request.getParameter("state");
			String age = request.getParameter("age");
			String tel = request.getParameter("tel");
			User user = new User(Integer.parseInt(id), username, password, Integer.parseInt(sex), Integer.parseInt(age), tel, Integer.parseInt(state));
			//上传
			if (userService.insert(user)) {
				//成功
				response.sendRedirect("list.do");
			}else {
				//失败
				request.getRequestDispatcher("add.do").forward(request, response);
			}
		}else if (path.equals("/user/delete.do")) {
			//删除用户
			String id = request.getParameter("id");
			if(userService.delete(Integer.parseInt(id))){
				//删除成功
				response.sendRedirect("list.do");
			}else {
				//删除失败
				//request.getSession().setAttribute("error-delete", "删除失败");
				response.sendRedirect("update.do?id="+id);
			}
			
		}
		
		
	}

}
