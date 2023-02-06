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
  <a href="">新闻管理</a>
  <a href="">新闻添加</a>
</span>
<!-- 表单部分 -->
<form class="layui-form" action="addNews.do" style="width: 500px;padding-top: 20px">
  <div class="layui-form-item">
    <label class="layui-form-label">标题</label>
    <div class="layui-input-inline">
      <input type="text" name="title"  required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">作者</label>
    <div class="layui-input-inline">
      <input type="text" name="author" required  lay-verify="required" placeholder="请输入作者" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">简介</label>
    <div class="layui-input-inline">
      <input type="text" name="shortContent" required  lay-verify="required" placeholder="请输入简介" autocomplete="off" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">所属分类</label>
    <div class="layui-input-inline">
      <select id="selectByCateId" name="selectByCateId">
        <option value="">请选择一级分类</option>
<%--         <c:forEach items="${categoryList }" var="cate">
       		 <option value="${cate.id }">${cate.name }</option>
         </c:forEach> --%>
      </select>
      <select id="selectBySeCateId" name="selectBySeCateId">
        <option value="">请选择二级分类</option>
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

  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">内容</label>
    <div class="layui-input-block">
      <textarea name="content" id="con" ></textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="addNews.do">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
  

  
</form>
 
<!-- layUI script -->
<!-- <script>
//Demo
layui.use('form', function(){
  var form = layui.form;
  
  //提交
  form.on('submit(formDemo)', function(data){
    layer.msg(JSON.stringify(data.field));
    return false;
  });
});
</script> -->

<!-- 异步分类script -->
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
$(function(){
	//一级分类
	$.get("findByCateName.do",function(result){
		var arr = result.date;
		var html="";
		$(arr).each(function(){
			html+="<option value="+this.id+">"+this.cateName+"</option>"
		})
		$("#selectByCateId").append(html);
	},"json")
	
	$("#selectByCateId").change(function(){
		$("#selectBySeCateId").html("<option>请选择分类-</option>");
		//二级分类
		var pid = $(this).val();
		$.get("findBySeCateName.do",{"pid":pid},function(result){
			var arr = result.date;
			var html="";
			$(arr).each(function(){
				html+="<option value="+this.id+">"+this.cateName+"</option>"
			})
			$("#selectBySeCateId").append(html);
		},"json")
	})

})

</script>

<!-- 百度富文本script -->
<!-- <script type="text/javascript" charset="gbk" src="../gbk-jsp/ueditor.config.js"></script>
<script type="text/javascript" charset="gbk" src="../gbk-jsp/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="gbk" src="../gbk-jsp/lang/zh-cn/zh-cn.js"></script> 
<script type="text/javascript">
var ue = UE.getEditor('con');
</script> -->


</body>
</html>