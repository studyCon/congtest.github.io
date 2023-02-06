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


<form class="layui-form" action="add.do" enctype="multipart/form-data"  style="width: 500px;padding-top: 40px">
  <div class="layui-form-item">
    <label class="layui-form-label">图片名称</label>
    <div class="layui-input-block">
      <input type="picName" name="title" required  lay-verify="required" placeholder="请输入图片名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  
    <div class="layui-form-item">
    <label class="layui-form-label">类别</label>
    <div class="layui-input-block">
      <select name="cate" lay-verify="required">
        <option value=""></option>
        <option value="0">TOP</option>
        <option value="1">其他</option>
        <option value="2">轮播图</option>
      </select>
    </div>
  </div>
  
  
   <div class="layui-form-item layui-form-text">
   	<label class="layui-form-label">图片</label>
   	
   <div class="layui-input-block">
      	<input type="file" class="layui-btn">
		
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-block">
      <input type="radio" name="state" value="0" title="启用" checked>
      <input type="radio"" name="state" value="1" title="禁用">
    </div>
  </div>
  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">文本域</label>
    <div class="layui-input-block">
      <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
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