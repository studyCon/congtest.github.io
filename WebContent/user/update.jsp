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
  <a href="">用户信息修改</a>
</span>
<!-- 表单部分 -->
<form class="layui-form" action="updateUser.do" style="width: 500px;padding-top: 20px;">
  <div class="layui-form-item">
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-block">
      <input type="text" name="username" required  lay-verify="required" value="${user.username }" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="password" required lay-verify="required" value="${user.password }" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">8位以上含数字、大小写字母</div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-block">
      <input type="radio" name="sex" value="1" title="男" ${user.sex==1?"checked":"" }>
      <input type="radio" name="sex" value="0" title="女" ${user.sex==0?"checked":"" }>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">年龄</label>
    <div class="layui-input-block">
      <input type="text" name="age" required  lay-verify="required" value="${user.age }" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-block">
      <input type="radio" name="state" value="0" title="正常" ${user.state==0?"checked":"" }>
      <input type="radio" name="state" value="1" title="禁用" ${user.state==1?"checked":"" }>
    </div>
  </div>  
  <div class="layui-form-item">
    <label class="layui-form-label">联系方式</label>
    <div class="layui-input-block">
      <input type="text" name="tel" required  lay-verify="required" value="${user.tel }" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <input type="hidden" name="id" value="${user.id }"><!-- 隐藏信息  -->
  
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="updateUser.do">立即提交</button>
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