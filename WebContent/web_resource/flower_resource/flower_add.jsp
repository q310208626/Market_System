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
	商品添加
	<form action="">
		<table>
			<tr>
				<td colspan="2" align="center">添加商品</td>
			</tr>
			<tr>
				<td><s:textfield label="花名" name="flower.name"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield label="价格" name="flower.name"></s:textfield></td>
			</tr>
		</table>
	</form>
</body>
</html>