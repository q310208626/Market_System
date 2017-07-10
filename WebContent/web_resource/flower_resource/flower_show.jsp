<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品显示</title>
<style type="text/css">
#flower_img{
	width:100%;
	height:100%;
}
.flower_img{
	width: 100px;
	height:100px;
}	
</style>
</head>
<body>
	
		<table border="1px">
			<tr>
				<td>商品ID</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>商品种类</td>
				<td>商品图片</td>
			</tr>
			<s:iterator value="flowerList">
			<tr>
				<td><s:text name="%{id}" ></s:text></td>
				<td><s:text name="%{name}" ></s:text></td>
				<td><s:text name="%{price}"></s:text></td>
				<s:if test="flowersCate.category==null||flowersCate.category==''">
					<td><s:text name="未知"></s:text></td>
				</s:if>
				<s:else>
					<td><s:text name="%{flowersCate.category}"></s:text></td>
				</s:else>
				<td class="flower_img"><img id="flower_img" alt="${name}" src="/market_system/imageuploads/${pictrueName}">  </td>
			</tr>
			</s:iterator>
		</table>
	
</body>
</html>