<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- layUI的核心CSS文件 -->
<link rel="stylesheet" type="text/css" href="layui/layui/css/layui.css"/>
<!-- layUI的核心文件 -->
<script type="text/javascript" src="layui/layui/layui.js" charset="utf-8"></script>
</head>


<frameset rows="60,*" frameborder="0" >
    <frame src="header.jsp" />
    <frameset cols="200,*">
	    <frame src="menu.jsp" />
	    <frame src="main.jsp" style="padding: 15px;background-color: azure;" name="main" />
	</frameset>
</frameset>



</html>