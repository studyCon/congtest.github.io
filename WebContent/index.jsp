<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理系统</title>
<!-- layUI的核心CSS文件 -->
<link rel="stylesheet" type="text/css" href="layui/layui/css/layui.css"/>
<!-- layUI的核心文件 -->
<script type="text/javascript" src="layui/layui/layui.js" charset="utf-8"></script>
</head>
<body>
	<div class="layui-layout layui-layout-admin">
	  <div class="layui-header">
	    <div class="layui-logo layui-hide-xs layui-bg-black">网站管理系统</div>
	    <!-- 头部区域（可配合layui 已有的水平导航） -->
	    <!-- <ul class="layui-nav layui-layout-left">
	      移动端显示
	      <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-header-event="menuLeft">
	        <i class="layui-icon layui-icon-spread-left"></i>
	      </li>
	      
	      <li class="layui-nav-item layui-hide-xs"><a href="">nav 1</a></li>
	      <li class="layui-nav-item layui-hide-xs"><a href="">nav 2</a></li>
	      <li class="layui-nav-item layui-hide-xs"><a href="">nav 3</a></li>
	      
	      
	      <li class="layui-nav-item">
	        <a href="javascript:;">nav groups</a>
	        <dl class="layui-nav-child">
	          <dd><a href="">menu 11</a></dd>
	          <dd><a href="">menu 22</a></dd>
	          <dd><a href="">menu 33</a></dd>
	        </dl>
	      </li>
	    </ul>
	    
	    <ul class="layui-nav layui-layout-right">
	      <li class="layui-nav-item layui-hide layui-show-md-inline-block">
	        <a href="javascript:;">
	          <img src="//tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg" class="layui-nav-img">
	          tester
	        </a>
	        <dl class="layui-nav-child">
	          <dd><a href="">Your Profile</a></dd>
	          <dd><a href="">Settings</a></dd>
	          <dd><a href="">Sign out</a></dd>
	        </dl>
	      </li>
	      <li class="layui-nav-item" lay-header-event="menuRight" lay-unselect>
	        <a href="javascript:;">
	          <i class="layui-icon layui-icon-more-vertical"></i>
	        </a>
	      </li>
	    </ul>
	  </div>
	   -->
	  
	  <div class="layui-side layui-bg-black">
	    <div class="layui-side-scroll">
	      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
	      <ul class="layui-nav layui-nav-tree" lay-filter="test">
	        <li class="layui-nav-item">
	          <a class="" href="javascript:;">用户管理</a>
	          <dl class="layui-nav-child">
	            <dd><a href="javascript:;" id="userlist">用户列表</a></dd>
	            <dd><a href="javascript:;"  >用户添加</a></dd>
	            
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
	         	<dd><a href="category/list.do">分类列表</a></dd>
	            <dd><a href="category/add.do">分类添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">轮播图管理</a>
	          <dl class="layui-nav-child">
	         	<dd><a href="slideshow/list.do">轮播图列表</a></dd>
	            <dd><a href="slideshow/add.do">轮播图添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;">URL管理</a>
	          <dl class="layui-nav-child">
	         	<dd><a href="url/list.do">URL列表</a></dd>
	            <dd><a href="url/add.do">URL添加</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item"><a href="cominfo/update.do">公司基本信息管理</a></li>
	        <li class="layui-nav-item"><a href="">the links</a></li>
	      </ul>
	    </div>
	  </div>
	  
	  <div class="layui-body">
	    <!-- 内容主体区域 -->
	    <div style="padding: 15px;">
	    	

	    	 
	    </div>
	  </div>
	  
	  <div class="layui-footer">
	    <!-- 底部固定区域 -->
	    底部固定区域
	  </div>
	</div>
	
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	
/* 	$("#userlist").click(function(){
		
	}) */
	
	$("#userlist").click(function(){
		
	})
	
	
	
</script>


</body>
</html>