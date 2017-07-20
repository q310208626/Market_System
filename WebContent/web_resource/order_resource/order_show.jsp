<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单显示</title>
</head>
<body>
	<div>
		<table border="2px" background="#3aa" width="100%">
			<tr align="center">
				<td>订单号</td>
				<td>订单日期</td>
				<td>订单总价</td>
				<td>订单详情</td>
			</tr>
			<s:iterator value="orderList">
				<s:form theme="simple" action="getDetailOrderAction?order.id=%{id}">
				<tr>
					<td><s:text name="id"></s:text></td>
					<s:hidden name="orderId" value="%{id}"></s:hidden>
					<td><s:date name="buyDate" format="yyyy年MM月dd日 HH:mm:ss"></s:date></td>
					<td><s:text name="allPrice"></s:text></td>
					<td><s:submit value="详情" style="width:100%" theme="simple"></s:submit></td>
				</tr>
				</s:form>
				<tr style="height:2px;"></tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>