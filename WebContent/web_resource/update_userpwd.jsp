<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="${pageContext.request.contextPath}/css/user_detailinfo.css" rel="stylesheet">
<title>密码修改</title>
</head>
<body>
	<form action="userUpdatePwdAction" method="post" onsubmit="return valiAndPost()" >
		 <table border="1px" background="#3aa">
			<tr><td colspan="2" >密码修改</td></tr> 
			<tr>
				<td>id:</td><td><input type="text" name="user.id" value="${user.id}" readonly></td>
			</tr>
			<tr>
				<td>账户:</td><td><input type="text" name="user.account" value="${user.account}" readonly></td> 
			</tr> 
		  	<tr><s:password id="old_pwd" name="user.password" label="旧密码" ></s:password></tr> 
			<tr><s:password id="new_pwd" name="newPwd" label="新密码" ></s:password></tr> 
			<tr><s:password id="comfnew_pwd" name="newPwdConf" label="确认"></s:password> </tr>
			<tr><td colspan="2"><input type="submit"  value="修改" style="width: 100%"></td></tr>
			<tr><td colspan="2"><input type="reset"  value="清除" style="width: 100%"></td></tr>	
		</table>
	</form>
</body>
<script type="text/javascript"  src="${pageContext.request.contextPath}/javascript/user_pwd_confirm.js"></script>
</html>