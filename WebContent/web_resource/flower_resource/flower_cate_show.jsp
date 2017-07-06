<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品种类显示</title>
</head>
<body>
			<table border="1px"  width="100%">
				<tr align="center">
					<td>id</td>
					<td>商品种类</td>
					<td colspan="2">操作</td>
				</tr>
				<s:iterator value="flowersCateList">
					
					<tr >
						<s:form theme="simple" action="flowerCateUpdateAction">
						<td width="10%" ><s:textfield value="%{id}" readonly="true" name="flowersCate.id" theme="simple"/></td>
						<td width="60%"><s:textfield value="%{category}" theme="simple" name="flowersCate.category"></s:textfield> </td>
						<td width="10%"><s:submit theme="simple" value="更新" style="width: 100%"></s:submit></td>
						<td width="10%" align="center"><a href="flowerCateDeleteAction?flowersCate.id=<s:property value="id" />">删除</a></td>
						</s:form>
					</tr>
				</s:iterator>
			</table>
</body>

</html>