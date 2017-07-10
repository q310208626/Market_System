<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品添加</title>
</head>
<body>
	<div>
		<div>
			<s:form action="flowerAddAction" onsubmit="return checkText()" enctype="multipart/form-data"  method="post">
				<table border="1px" >
					<tr align="center" >
						<td colspan="5">商品添加</td>
					</tr>
					<tr>
						<td>商品名称</td>
						<td>价格</td>
						<td>商品种类</td>
						<td>商品图片</td>
						<td>添加</td>
					</tr>
					<tr>
						<td><s:textfield id="nameTextField" name="flower.name" theme="simple" ></s:textfield> </td>
						<td><s:textfield id="priceTextField" name="flower.price" onkeydown="value=value.replace(/[^\d]/g,'')" theme="simple"></s:textfield> </td>
						<td><s:select name="cateId" list="cateList" listKey="id" listValue="category" theme="simple" style="width: 100%" headerValue="未知" headerKey=""></s:select> </td>
						<td><s:file name="flowerimage" theme="simple" ></s:file> </td>
						<td><s:submit theme="simple" value="添加" style="width: 100%" ></s:submit> </td>
					</tr>
				</table>
				
			</s:form>
		</div>
	</div>
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