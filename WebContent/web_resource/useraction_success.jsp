<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>消息页面</title>
<script type="text/javascript">
	function Top_refresh(){
		 parent.lacation.href="toIndexAction";
	}
</script>
</head>
	<% 
		String actionString=new String("");
		try{
			String action=(String)session.getAttribute("action");
			if(action.equals("update_pwd")){
				actionString="密码修改";
			}else if(action.equals("user_regist")){
				actionString="注册";
			}else if(action.equals("user_login")){
				out.write("<script>window.parent.location.href='/Market_System/index.jsp';</script>");
			}
			else{
				actionString="";
			}
		}catch(Exception e){
			actionString="";
		}
	%>
	<%=actionString+"成功！"%>
<body>
	
</body>
</html>