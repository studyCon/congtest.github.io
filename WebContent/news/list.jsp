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
  <a href="">新闻管理</a>
  <a href="">新闻列表</a>
</span>
<!-- 表单部分 -->
<table class="layui-table" >
	  <colgroup>
	    <col width="50">
	    <col width="50">
	    <col width="50">
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
	      <th style="text-align: center;">新闻ID</th>
	      <th style="text-align: center;">所属分类</th>
	      <th style="text-align: center;">标题</th>
	      <th style="text-align: center;">作者</th>
	      <th style="text-align: center;">简介</th>
	      <th style="text-align: center;">内容</th>
	      <th style="text-align: center;">状态</th>
	      <th style="text-align: center;">推荐</th>
	      <th style="text-align: center;">创建时间</th>
	      <th style="text-align: center;">图片编号</th>
	      <th style="text-align: center;">操作</th>
	    </tr> 
	  </thead>
	  <tbody>
	  
	    <c:forEach items="${newsList }" var="news">
		    <tr>
		      <td>${news.id }</td>
		      <td>${news.cateId }--${news.seCateId }</td>
		      <td>${news.title }</td>
		      <td>${news.author }</td>
		      <td>${news.shortContent }</td>
		      <td>${news.content }</td>
		      <td>${news.state==0?'正常':news.state==1?'禁用':'-'  }</td>
		      <td>${news.status==0?'正常':news.state==1?'推荐':'-'  }</td>
		      <td>${news.createTime }</td>
		      <td>
		      	<a href="update.do?id=${news.id }" class="layui-btn">修改</a>
		      	<a href="delete.do?id=${news.id }" class="layui-btn">删除</a>
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