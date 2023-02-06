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

<form class="layui-form" action="" style="width: 500px;padding-top: 20px;">
  <div class="layui-form-item">
    <label class="layui-form-label">地址</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" value="${comInfo.address }" autocomplete="off" class="layui-input">
    </div>
  </div>

    <div class="layui-form-item">
    <label class="layui-form-label">联系人</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" value="${comInfo.manager }" autocomplete="off" class="layui-input">
    </div>
  </div>
  
      <div class="layui-form-item">
    <label class="layui-form-label">联系方式</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" value="${comInfo.tel }" autocomplete="off" class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" value="${comInfo.email }" autocomplete="off" class="layui-input">
    </div>
  </div>
  
    <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">生效</button>
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