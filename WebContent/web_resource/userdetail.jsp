<%@page import="com.lsj.market.bean.UserDetail"%>
<%@page import="com.lsj.market.dao.impl.UserDaoImpl"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" href="${pageContext.request.contextPath}/css/marketstyle.css" rel="stylesheet">
<title>个人详细信息</title>
</head>
<body>
	<div id="content">
		<div id="content_head">
			<div class="head_pictrue">
				<img alt="" src="${pageContext.request.contextPath}/pic_resource/head_pic.jpg">
			</div>
			<div class="head_menu">
				<ul>
					<li><a href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
					<li><a href="getMarketCarAction" target="update_ifr">购物车</a></li>
					<li><a href="${pageContext.request.contextPath}/web_resource/regist.jsp" target="update_ifr">注册</a></li>
					<s:if test="#session.userAccount==null">
						<li><a href="${pageContext.request.contextPath}/web_resource/login.jsp" target="update_ifr">登录</a></li>
					</s:if>
					<s:else>
						<li><a href='<s:url action="toUserDetailAction"></s:url>'><s:property value="#session.userAccount"/></a></li>
						<li><a href="<s:url action="userLogoutAction"/>">注销</a></li>
					</s:else>
				</ul>
			</div>
		</div>
		<div id="content_main">
			<div id="catagory_div">
				<ul>
					<li><a href="getUserDetailAction" target="update_ifr">修改个人信息</a></li>
					<li><a href="getUserPwdAction" target="update_ifr">修改密码</a></li>
					<li><a href="getOrderAction" target="update_ifr">订单信息</a></li>
				</ul>
			</div>
			<div id="content_show">
				<iframe id="ifr" name="update_ifr" src="getUserDetailAction" height="500px" width="100%"></iframe>
			</div>
		</div>
		<div id="content_foot"></div>
	</div>
	
</body>
<script type="text/javascript"  src="${pageContext.request.contextPath}/javascript/user_detail.js"></script>
</html>