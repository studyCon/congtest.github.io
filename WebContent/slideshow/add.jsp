<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<form class="layui-form" action="" style="width: 500px;padding-top: 40px">
  <div class="layui-form-item">
    <label class="layui-form-label">图片名称</label>
    <div class="layui-input-block">
      <input type="text" name="title" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">图片用途</label>
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
		<button type="button" class="layui-btn" id="test1">
		  <i class="layui-icon">&#xe67c;</i>上传图片
		</button>
    </div>
    
    
    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-block">
      <input type="radio" name="sex" value="0" title="启用" checked>
      <input type="radio" name="sex" value="1" title="禁用">
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
<!-- 图片上传 -->
<script src="../layui/layui/layui.js"></script>
<script>
layui.use('upload', function(){
  var upload = layui.upload;
   
  //执行实例
  var uploadInst = upload.render({
    elem: '#test1' //绑定元素
    ,url: '/slideshow/addPic.do' //上传接口
    ,done: function(res){
      //上传完毕回调
    }
    ,error: function(){
      //请求异常回调
    }
  });
});
</script>

</body>
</html>