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

<table class="layui-table">
  <colgroup>
    <col width="50">
    <col width="50">
    <col width="50">
    <col width="100">
    <col width="100">
  </colgroup>
  <thead>
    <tr>
      <th style="text-align: center;">图片ID</th>
      <th style="text-align: center;">名称</th>
      <th style="text-align: center;">状态</th>
      <th style="text-align: center;">创建时间</th>
      <th style="text-align: center;">操作</th>
    </tr> 
  </thead>
  <tbody>
    <c:forEach items="${slideshowList }" var="slideshow">
	    <tr>
	      <td>${slideshow.id }</td>
	      <td>${slideshow.name }</td>
	      <td>${slideshow.state }</td>
	      <td>${slideshow.createTime }</td>
	      <td>
				<a href="" class="layui-btn">预览图片</a>
				<a href="update.do?id=${slideshow.id }" class="layui-btn">修改</a>
		      	<a href="delete.do?id=${slideshow.id }" class="layui-btn">删除</a>
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

<script type="text/javascript" src="../js/jquery.js"></script>
</body>
</html>