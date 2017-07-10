<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品更新</title>
<style type="text/css">

#flower_img{
	width:100%;
	height:100%;
}
.flower_img{
	width: 100px;
	height:100px;
}	
</style>
</head>
<body>
	
			<table border="1px">
			<tr>
				<td>商品ID</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td align="center">商品种类</td>
				<td align="center">商品图片</td>
				<td align="center" >商品图片选择</td>
				<td colspan="2" align="center">操作</td>
			</tr>
			<s:iterator value="flowerList">
			<s:form action="flowerUpdateAction" onsubmit="return checkText()" enctype="multipart/form-data" theme="simple" method="post">
			<tr>
				<td><s:textfield  name="flower.id" value="%{id}" readonly="true" theme="simple" maxlength="6" size="6" ></s:textfield></td>
				<td><s:textfield id="nameTextField" name="flower.name" value="%{name}" theme="simple" maxlength="10" size="10"></s:textfield></td>
				<td><s:textfield id="priceTextField" name="flower.price" value="%{price}" onkeydown="value=value.replace(/[^\d]/g,'')" theme="simple" maxlength="9" size="9"></s:textfield></td>
				<s:if test='flowersCate==null'>
					<td><s:select name="cateId" list="cateList" listKey="id" listValue="category" theme="simple" style="width: 100%" headerValue="未知" headerKey=""></s:select></td>
				</s:if>
				<s:else>
					<td><s:select name="cateId" list="cateList" listKey="id" listValue="category" theme="simple" style="width: 100%" headerValue="%{flowersCate.category}" headerKey="%{flowersCate.id}"></s:select></td>
				</s:else>
				<td class="flower_img"><img id="flower_img" alt="${name}" src="/market_system/imageuploads/${pictrueName}">  </td>
				<td><s:file name="flowerimage" theme="simple" style="width: 100px" ></s:file> </td>
				<td><s:submit value="更新" theme="simple" ></s:submit> </td>
				<td><a href="flowerDeleteAction?flower.id=<s:property value="id" />">删除</a></td>
			</tr>
			</s:form>
			</s:iterator>
		</table>
	
</body>

<script type="text/javascript">
		function checkText(){
			var nameTextField=document.getElementById("nameTextField");
			var priceTextField=document.getElementById("priceTextField");
			var name=nameTextField.value;
			var price=priceTextField.value;
			if(name==null||price==null){
				return false;
			}
			return true;
		}
	</script>
</html>