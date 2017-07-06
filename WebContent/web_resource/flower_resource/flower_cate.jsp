<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品种类</title>
</head>
<body>
	<div>	
		<div class="cate_div" id="cateadd_div" >
			<form action="flowerCateAddAction" onsubmit="return addConfirm()" method="post" >
				<table border="1px">
					<tr>
						<s:textfield label="商品种类" name="flowerCate.category" id="flowerCateTextField"></s:textfield>
					</tr>
					<tr align="center">
						<td></td><td><input type="submit" value="添加"></input></td>
					</tr>
				</table>	
			</form>
		</div  >
		<div class="cate_div" id="cateshow_div" style="margin-top:20px;" >
			<iframe name="cate_show" src="getFlowerCateAction" width="100%"  height="400px"></iframe>
		</div>
	</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/javascript/flower_cate_manage.js" ></script>
</html>