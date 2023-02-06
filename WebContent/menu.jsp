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
<body>

	  <div class="layui-side layui-bg-black">
	    <div class="layui-side-scroll">
	      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
	      <ul class="layui-nav layui-nav-tree" lay-filter="test">
	        <li class="layui-nav-item">
	          <a class="" href="javascript:;">用户管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="user/list.do" target="main">用户列表</a></dd>
	            <dd><a href="user/add.do"  target="main">用户添加</a></dd>
	            
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">新闻管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="news/list.do"  target="main">新闻列表</a></dd>
	            <dd><a href="news/add.do"  target="main">新闻添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">分类管理</a>
	          <dl class="layui-nav-child">
	         	<dd><a href="category/list.do" target="main">分类列表</a></dd>
	            <dd><a href="category/add.do" target="main">分类添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">轮播图管理</a>
	          <dl class="layui-nav-child">
	         	<dd><a href="slideshow/list.do" target="main">轮播图列表</a></dd>
	            <dd><a href="slideshow/add.do" target="main">轮播图添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">URL管理</a>
	          <dl class="layui-nav-child">
	         	<dd><a href="url/list.do" target="main">URL列表</a></dd>
	            <dd><a href="url/add.do" target="main">URL添加</a></dd>
	          </dl>
	        </li>
	        
	        <li class="layui-nav-item"><a href="cominfo/update.do" target="main">公司基本信息管理</a></li>
	        
	      </ul>
	    </div>
	  </div>


</body>
</html>