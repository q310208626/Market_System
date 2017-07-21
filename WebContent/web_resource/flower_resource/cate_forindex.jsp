<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页商品种类</title>
</head>
<body>
	<ul style=" margin-top: 10px; list-style: none;">
		<li style=" margin-top: 10px;"><a href="getFlowerInfoAction" target="log_reg_ifr" style="text-decoration: none">全部商品</a></li>
	<s:iterator value="flowersCateList" >
		<li style=" margin-top: 10px;"><a href="getFlowerByCateAction?cateId=${id}" target="log_reg_ifr" style="text-decoration: none"><s:property value="%{category}"/></a> </li>
	</s:iterator>
	</ul>
</body>
</html>