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
	  <a href="">分类管理</a>
	  <a href="">分类列表</a>
	</span>
	<!-- 表单部分 -->
	<table class="layui-table" >
	  <colgroup>
	    <col width="20">
	    <col width="50">
	    <col width="50">
	    <col width="50">
	    <col width="50">
	    <col width="100">
	    <col width="100">
	  </colgroup>
	  <thead>
	    <tr>
	      <th style="text-align: center;">分类ID</th>
	      <th style="text-align: center;">分类名</th>
	      <th style="text-align: center;">所属分类</th>
	      <th style="text-align: center;">状态</th>
	      <th style="text-align: center;">推荐</th>
	      <th style="text-align: center;">创建时间</th>
	      <th style="text-align: center;">操作</th>
	    </tr> 
	  </thead>
	  <tbody>
	  
	    <c:forEach items="${categoryList }" var="cate">
		    <tr>
		      <td>${cate.id }</td>
		      <td>${cate.name }</td>
		      <td>${cate.pid==0?'-':category.name }</td>
		      <td>${cate.state==0?'正常':user.state==1?'禁用':'-'  }</td>
		      <td>${cate.status==0?'正常':user.state==1?'推荐':'-'  }</td>
		      <td>${cate.createTime }</td>
		      <td>
		     	<a href="${cate.pid==0?'list.do?pid=':'/WebWork/news/list.do?seCateId=' }${cate.id}" class="layui-btn">${cate.pid==0?'子类管理':'新闻管理' }</a>
<%-- <a href="${cate.pid==0?'list.do?pid=':'/WebWork/news/list.do?seCateid=' }${cate.id}">${i.pid==0?'子类管理':'新闻管理' }</a> --%>
		      	<a href="update.do?id=${cate.id }" class="layui-btn">修改</a>
		      	<a href="delete.do?id=${cate.id }" class="layui-btn">删除</a>
				<%-- <a href="update.do?id=${user.id }&page=${page }">修改</a> --%>
	        	<%-- <a href="delete.do?id=${user.id }">删除</a> --%>
			  </td>
		    </tr>
	    </c:forEach>
	    
	  </tbody>
	</table>
	
	<style>
		td{
			text-align: center;
		}
	</style>
	
<script type="text/javascript" src="../js/jquery-3.6.1.js"></script>


</body>
</html>