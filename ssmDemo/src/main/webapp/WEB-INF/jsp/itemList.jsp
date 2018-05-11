<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body > 
<form action="${pageContext.request.contextPath }/item/queryitem.action" method="post">
查询条件：
<table width="90%" border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;" align="center">
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
商品列表：
<table width="90%" border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;" align="center">
<tr>
	<td>商品序号</td>
	<td>商品id</td>
	<td>商品时间</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>商品描述</td>
</tr>
<c:forEach items="${itemList }" var="item" varStatus="vs">
<tr>
	<td>${vs.index }</td>
	<td>${item.id }</td>
	<td>
	   <fmt:formatDate value="${item.created }" pattern="yyyy-MM-dd HH:mm:ss" />
	</td>
	<td>${item.title }</td>
	<td>${item.price }</td>
	<td>${item.sellPoint }</td>
	
	<td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>

</table>
</form>
</body>

</html>