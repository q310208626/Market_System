<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="${pageContext.request.contextPath}/css/user_detailinfo.css" rel="stylesheet">
<title>更新用户信息</title>
</head>
<body>
	<form action="userUpdateAction" method="post">
		<table border="1px" background="#3aa">
			<tr align="center">
				<td colspan="2">用户信息</td>
			</tr>
			<tr>
				<td>ID:</td><td><input type="text" name="user.id" value="${user.id}" readonly></td>
			</tr>
			<tr>
				<td>账户:</td><td><input type="text" name="user.account" value="${user.account}" readonly></td>
			</tr>
			<tr>
				<s:if test="#request.user.role==1">
					<td>角色:</td><td><input type="text"  value="客户" readonly></td>
						
				</s:if>
				<s:elseif test="#request.user.role==0">
					<td>角色:</td><td><input type="text"  value="管理员" readonly><a href="${pageContext.request.contextPath}/web_resource/manage.jsp">管理</a> </td>
				</s:elseif>
			</tr>
			<tr>
				<td><input type="hidden" name="user.role" value="${user.role}"> </td>
			</tr>
			<tr>
				<td>姓名</td><td><input type="text" name="user.userDetail.name" value="${user.userDetail.name}"></td>
			</tr>
			<tr>
				<s:if test="#request.user.userDetail.sex==0">
					<td><s:radio label="性别" name="user.userDetail.sex" list="#{'1':'男','0':'女'}" value="0" ></s:radio></td>
				</s:if>
				<s:else>
					<td><s:radio label="性别" name="user.userDetail.sex" list="#{'1':'男','0':'女'}" value="1" ></s:radio></td>
				</s:else>			
			</tr>
			<tr>
				<td>电话:</td><td><input type="text" name="user.userDetail.phone" value="${user.userDetail.phone}"></td>
			</tr>
			<tr>
				<td>地址:</td><td><input type="text" name="user.userDetail.address" value="${user.userDetail.address}"></td>
			</tr>
			<tr>			
				<td colspan="2"><s:submit value="修改信息" theme="simple" style="width: 100%"></s:submit></td>
			<tr>
			<tr>
				<td colspan="2"><s:submit value="返回" theme="simple" style="width: 100%" action="toIndexAction"></s:submit></td>
			<tr>
		</table>
		<input type="hidden" name="user.userDetail.id" value="${user.userDetail.id}">	
	</form>
</body>
</html>