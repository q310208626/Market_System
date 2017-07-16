<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品显示</title>
<style type="text/css">
.flower_img{
	width: 140px;
	height:140px;
}

.flower_div{
	float: left;
	margin: 20px 20px;
}	
</style>
</head>
<body>
		<table align="center">
		<s:iterator value="flowerList" var="flower" status="st">
			<s:if test="#st.index%4==0">
				<tr>
			</s:if>
			<td>
			
			 <div class="flower_div">
			 <form action="marketCarAddAction" onsubmit="return testNum(${id})" >
				<s:hidden name="user.id" value="%{#session.userId}"></s:hidden> 
			 	<s:hidden name="flower.id" value="%{id}"></s:hidden>
				<img class="flower_img" alt="${name}" src="/market_system/imageuploads/${pictrueName}">
				<p>
					<span><s:property value="name"/></span>
					<span>价格:<s:text name="%{price}"></s:text></span>
				</p>
				<p>
					数量:<s:textfield id="goodsNum%{id}" name="marketCar.goodNum" maxlength="3" size="3" onkeydown="value=value.replace(/[^\d]/g,'')" theme="simple"></s:textfield>
					<s:submit value="添加购物" theme="simple" ></s:submit>
				</p>
			  </form>
			 </div>
			</td>
			<s:if test="#st.index%4==3">
				</tr>
			</s:if>
		</s:iterator>
		</table>
</body>
<script type="text/javascript">
	function testNum(id){
		var goodsNumTextfieldId='goodsNum'+id;
		var goodsNumTextfield=document.getElementById(goodsNumTextfieldId);	
		var goodsNum=goodsNumTextfield.value;
		if(goodsNum==null||goodsNum<=0){
			return false;	
		}
		return true;
	}
</script>
</html>