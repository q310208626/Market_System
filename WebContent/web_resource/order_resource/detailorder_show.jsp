<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细订单</title>
</head>
<body>
	
	<table border="2px" width="100%">
			<tr>
				<td>ID</td>
				<td>商品名称</td>
				<td>商品单价</td>
				<td>购买数量</td>
				<td>商品总价</td>
			</tr>
			<s:iterator value="detailOrderList">
				<tr>
					<td><s:text name="id"></s:text></td>
					<td><s:text name="flower.name"></s:text></td>
					<td><s:text name="flower.price"></s:text></td>
					<td><s:text name="goodsNum"></s:text></td>
					<td><s:text name="totalPrice"></s:text></td>
				</tr>
			</s:iterator>
	</table>
</body>
</html>