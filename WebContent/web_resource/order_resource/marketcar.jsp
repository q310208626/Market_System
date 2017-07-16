<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人购物车</title>
</head>
<body>


	<table border="5px">
			<tr>
				<td>ID</td>
				<td>商品名称</td>
				<td>商品单价</td>
				<td>购买数量</td>
				<td>商品总价</td>
				<td colspan="2" align="center" >操作</td>
			</tr>
		<s:iterator value="marketCarList" var="marketCar">
			<form action="#">
			<tr>
				<s:hidden value="#session.userId"></s:hidden>
				<td><s:text name="id"></s:text></td>
				<td><s:text name="flower.name"></s:text> </td>
				<td><s:text name="flower.price"></s:text> </td>
				<td><s:textfield name="goodNum" theme="simple" maxlength="4" size="4" onkeydown="value=value.replace(/[^\d]/g,'')"></s:textfield ></td>
				<td><s:text name="totalPrice"></s:text></td>
				<td><s:submit value="更新" theme="simple"></s:submit> </td>
				<td><a href="marketCarDeleteAction?marketCar.id=<s:property value="id"/>">删除</a> </td>
			</tr>
			</form>
		</s:iterator>
	</table>
</body>
</html>