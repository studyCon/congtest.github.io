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
  <a href="">分类添加</a>
</span>
<!-- 表单部分 -->
<form class="layui-form" action="addCate.do"  style="width: 500px;padding-top: 40px">
	<div>&nbsp;<div/>
   <div class="layui-form-item">
    <label class="layui-form-label">分类名称</label>
    <div class="layui-input-block">
      <input type="categoryName" name="title" required  lay-verify="required" placeholder="请输入分类名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">所属分类</label>
    <div class="layui-input-block">
      <select name="categoryPid" lay-verify="required">
      	 <option value="">请选择分类</option>
         <option value="0">无分类</option>
         <c:forEach items="${categoryList }" var="cate">
       		 <option value="${cate.id }">${cate.name }</option>
         </c:forEach>

      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-block">
      <input type="radio" name="state" value="0" title="正常" checked>
      <input type="radio" name="state" value="1" title="禁用">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">推荐</label>
    <div class="layui-input-block">
      <input type="radio" name="status" value="0" title="正常" checked>
      <input type="radio" name="status" value="1" title="推荐">
    </div>
  </div>
    
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="addCate.do">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>  
</form>
 
<script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  
  //提交
  form.on('submit(formDemo)', function(data){
    layer.msg(JSON.stringify(data.field));
    return false;
  });
});
</script>


</body>
</html>