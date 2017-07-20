<%@page import="com.lsj.market.bean.MarketCar"%>
<%@page import="java.util.List"%>
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
	<!-- 操作页面部分 -->
	<div id="operation_div"  style="display:none">
	<div><a href="javascript:changeDiv()">修改完成</a></div>
	<table border="5px" width="100%">
			<tr>
				<td>ID</td>
				<td>商品名称</td>
				<td>商品单价</td>
				<td>购买数量</td>
				<td>商品总价</td>
				<td colspan="2" align="center" >操作</td>
			</tr>
		<s:iterator value="marketCarList" var="marketCar">
			<form action="marketCarUpdateAction">
			<tr>
				<s:hidden value="#session.userId" ></s:hidden>
				<%-- <td><s:textfield value="%{id}" name="marketCar.id" readonly="true" theme="simple" maxlength="6" size="6"></s:textfield></td> --%>
				<s:hidden value="%{id}" name="marketCar.id" ></s:hidden>
				<td><s:text name="%{id}"></s:text></td> 
				<td><s:text  name="flower.name"></s:text> </td>
				<td><s:text name="flower.price" ></s:text> </td>
				<td><s:textfield value="%{goodNum}" name="marketCar.goodNum" theme="simple" maxlength="4" size="10" onkeydown="value=value.replace(/[^\d]/g,'')"></s:textfield ></td>
				<td><s:text name="totalPrice"></s:text></td>
				<td><s:submit value="更新" theme="simple" style="width:100%;" ></s:submit> </td>
				<td align="center"><a href="marketCarDeleteAction?marketCar.id=<s:property value="id"/>">删除</a> </td>
			</tr>
			</form>
		</s:iterator>
	</table>
	</div>
	<!-- 显示页面部分 -->
	<div id="show_div">
		<div><a href="javascript:changeDiv()">修改</a></div>
		<div style="float: left"><span> 商品总价:</span><span><s:property value="allPrice"/></span></div>
		<form action="orderAddAction">
		<div style="float: right"><s:submit value="支付购买"></s:submit> </div>
		<div id="table_div" style="clear: both">
		<table border="5px" width="100%">
			<tr>
				<td>ID</td>
				<td>商品名称</td>
				<td>商品单价</td>
				<td>购买数量</td>
				<td>商品总价</td>
			</tr>
			<s:hidden value="%{#session.userId}" name="order.user.id"></s:hidden>
			<s:hidden value="%{allPrice}" name="order.allPrice"></s:hidden>
			<s:iterator value="marketCarList" var="marketCar" status="st">
			<tr>
				<td><s:text name="marketCarList[%{#st.index}].id"></s:text></td>
				<!-- marketCarId -->
				<s:hidden name="marketCarList[%{#st.index}].id" value="%{marketCarList.get(#st.index).id}"></s:hidden>
				<!-- flowerId -->
				<s:hidden name="marketCarList[%{#st.index}].flower.id" value="%{marketCarList.get(#st.index).flower.id}"></s:hidden>
				<td><s:text name="marketCarList[%{#st.index}].flower.name"></s:text> </td>
				<td><s:text name="marketCarList[%{#st.index}].flower.price"></s:text> </td>
				<td><s:text name="marketCarList[%{#st.index}].goodNum"></s:text ></td>
				<s:hidden name="marketCarList[%{#st.index}].goodNum" value="%{marketCarList.get(#st.index).id}"></s:hidden>
				<td><s:text name="marketCarList[%{#st.index}].totalPrice"></s:text></td>
			</tr>
			</s:iterator>
		</table>
		</div>
		</form>
	</div>
</body>
<script type="text/javascript">
	var operation_div=document.getElementById("operation_div");
	var show_div=document.getElementById("show_div");
	function changeDiv(){
		if(operation_div.style.display=="none"){
			operation_div.style.display="block";
			show_div.style.display="none";
		}else{
			operation_div.style.display="none";
			show_div.style.display="block";
		}
	}
</script>
</html>