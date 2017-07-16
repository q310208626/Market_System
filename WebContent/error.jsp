<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误页面</title>
</head>
<body>
	操作失败!<s:property value="errorMSG"/>
	<s:if test="errorMSG!=null">
		<s:if test="errorMSG=='userNotFound'">
			<s:text name="用户不存在,请先登录"/>
		</s:if>
		<s:elseif test="errorMSG=='goodsNotFound'">
			<s:property value="商品不存在"/>
		</s:elseif>
		<s:elseif test="errorMSG=='MCAddFailed'">
			<s:property value="购物车添加失败"/>
		</s:elseif>
	</s:if>
</body>
</html>