<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="${pageContext.request.contextPath}/css/marketstyle.css" rel="stylesheet">

<title>登录页面</title>
</head>
<body>
	<s:form action="userLoginAction" method="post">
		<s:textfield label="账户" name="user.account" ></s:textfield>
		<s:password  label="密码" name="user.password" ></s:password>
		<s:submit value="登录" style="width: 80%;"  ></s:submit>
		<s:submit value="注册" style="width: 80%;" action="toRegistAction" ></s:submit>
	</s:form>
</body>
</html>