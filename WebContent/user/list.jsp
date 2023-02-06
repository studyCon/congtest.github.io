<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- layUI的核心CSS文件 -->
<link rel="stylesheet" type="text/css" href="../layui/layui/css/layui.css"/>
<!-- layUI的核心文件 -->
<script type="text/javascript" src="../layui/layui/layui.js" charset="utf-8"></script>
</head>
<body>
<!-- 面包屑部分 -->
<span class="layui-breadcrumb">
  <a href="">首页</a>
  <a href="">用户管理</a>
  <a href="">用户列表</a>
</span>
<!-- 表单部分 -->
<table class="layui-table" style="padding-top: 20px;">
	  <colgroup>
	    <col width="50">
	    <col width="50">
	    <col width="50">
	    <col width="50">
	    <col width="50">
	    <col width="100">
	    <col width="50">
	    <col width="100">
	  </colgroup>
	  <thead>
	    <tr>
	      <th style="text-align: center;">用户ID</th>
	      <th style="text-align: center;">用户名</th>
	      <th style="text-align: center;">性别</th>
	      <th style="text-align: center;">年龄</th>
	      <th style="text-align: center;">手机号码</th>
	      <th style="text-align: center;">创建时间</th>
	      <th style="text-align: center;">状态</th>
	      <th style="text-align: center;">操作</th>
	    </tr> 
	  </thead>
	  <tbody>
	  
	    <c:forEach items="${userList }" var="user">
		    <tr>
		      <td>${user.id }</td>
		      <td>${user.username }</td>
		      <td>${user.sex==0?'女':user.sex==1?'男':'-' }</td>
		      <td>${user.age }</td>
		      <td>${user.tel }</td>
		      <td>${user.createTime }</td>
		      <td>${user.state==0?'正常':user.state==1?'禁用':'-' }</td>
		      <td>
		      	<a href="update.do?id=${user.id }" class="layui-btn">修改</a>
		      	<a href="delete.do?id=${user.id }" class="layui-btn">删除</a>
				<%-- <a href="update.do?id=${user.id }&page=${page }">修改</a> --%>
	        	<%-- <a href="delete.do?id=${user.id }">删除</a> --%>
			  </td>
		    </tr>
	    </c:forEach>
	    
	  </tbody>
	</table>

<!-- 样式 -->
<style>
	td{
		text-align: center;
	}
</style>

<script type="text/javascript" src="../js/jquery-3.6.1.js"></script>
</body>
</html>