<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- index的CSS文件 -->
<link rel="stylesheet" type="text/css" href="CSS/index.css">
<!-- layUI的核心CSS文件 -->
<link rel="stylesheet" type="text/css" href="../layui/layui/css/layui.css"/>
<!-- layUI的核心文件 -->
<script type="text/javascript" src="../layui/layui/layui.js" charset="utf-8"></script>
</head>
<body>

<%-- 		<c:forEach items="${slideshowList }" var="slideshow">
		</c:forEach> --%>

		<!-- header部分 -->
		<div class="layui-container" id="header">  
		  <div class="layui-row">
		    <div class="layui-col-md2">
				pic
		    </div>
		    <div class="layui-col-md10">
				<div class="layui-row" id="serach">
				  <div class="layui-col-md9">
				    微博微信语言
				  </div>
				  <div class="layui-col-md13">
					搜索
				  </div>
				</div>
				<div class="layui-row" id="category">
					<c:forEach items="${categorylist }" var="cate">
					  <div class="layui-col-md1 >
						<span class="layui-breadcrumb layui-nav-tree  lay-shrink="all" lay-separator="  ">
							<a href="">${cate.name }</a>
						</span>
					  </div>
					 </c:forEach>
				</div>
		    </div>
		</div>
		</div>
		<!-- 轮播图部分 -->
		<hr />
		<div class="layui-carousel" id="slideshow">
		  <div carousel-item>
		    <div>条目1</div>
		    <div>条目2</div>
		    <div>条目3</div>
		    <div>条目4</div>
		    <div>条目5</div>
		  </div>
		</div>
		
		<hr />
		<!-- content部分 -->
		<div class="layui-container" id="content">  
			<!-- 推荐新闻+轮播图部分 -->
		  <div class="layui-row">
			<!-- 设置间距 -->
		    <div class="layui-col-md7">
		    	<c:forEach items="${cateStatusList }" var="cate">
			      	<div class="layui-col-md1">
				  	    <a href="">${cate.name }</a>
				    </div>
			    </c:forEach>
			    <div class="layui-col-md1">
				      更多
			    </div>
			    <c:forEach items="${newsStatusList }" var="news">
			    <div>
			    	<a href="">${news.name }</a>
			    	<a href="">${news.createTime }</a>
			    </div>
			    </c:forEach>
		    </div>
		    <div class="layui-col-md5">
		      	轮播图
		    </div>
		  </div>
		  
			<!-- 推荐新闻跳转 3格X4个 -->
		  <div class="layui-row">
		  	<!-- 设置间距 -->
		    <div class="layui-col-md3">
		      推荐新闻
		    </div>
		  </div>
		  
		  
		  <!-- 产品与服务标题 -->
		  <div class="layui-row">
		    <div class="layui-col-md12">
		      标题
		    </div>
			<div class="layui-col-md12">
			  标题简介
			</div>
		  </div>
		  <!-- 产品与服务内容  3格X4个X2行 -->
		  <div class="layui-row">
		  	<!-- 设置间距 -->
		    <div class="layui-col-md3">
		      推荐新闻
		    </div>
		  </div>
		  <!-- 产品与服务跳转 -->
		  <div class="layui-row">
		    <div class="layui-col-md12">
		      查看更多
		    </div>
		  </div>
		 </div> 
		  
		  
		<hr />
		<!-- footer部分 -->
		<div class="layui-container" id="footer">  
			<!-- 红色一级分类 -->
		  <div class="layui-row">
		    <div class="layui-col-md1">
				一级分类
		    </div>
		    <div class="layui-col-md2">
				关于我们
		    </div>
		  </div>
			<!-- 灰色二级分类 -->
		  <div class="layui-row">
		    <div class="layui-col-md1">
		  		二级分类
		    </div>
		    <div class="layui-col-md2">
		  		关于我们
		    </div>
		  </div>
		  
		  <div class="layui-row">
			  <div class="layui-col-md12">
					备案信息
			  </div>
		  </div>
		  
		  
		  
		  
		</div>
		
</body>
</html>