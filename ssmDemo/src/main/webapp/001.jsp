<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="js/themes/default/easyui.css">
<link rel="stylesheet" href="js/themes/icon.css">

<script type="text/javascript" charset="utf-8" src="js/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="js/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">pagination分页框</h1>
	<div id="cc" class="easyui-layout" style="width: 900; height: 550px;">
		<div
			data-options="region:'west',title:'West',split:true,collapsible:false"
			style="width: 200px; padding: 1px;"></div>
		<div data-options="region:'center',fit:true"
			style="padding: 0px; background: #eee;">

			<div id="tt"></div>

		</div>
	</div>
</body>

<script type="text/javascript">
	$("#tt").tabs({
		border : false
	});

	// add a new tab panel    
	$('#tt').tabs('add', {
		title : '商品列表',
		id : "list",
		closable : true,
	});
	$('#list').datagrid({    
	    url:'http://localhost:9092/first2.action',
	    striped : "true",
	    singleSelect : "true",
	    pagination : "true",
	    pageList : [10,15,30,40,50],
	    columns:[[    
	        {field:'id',title:'id',width:100},    
	        {field:'title',title:'Name',width:200},    
	        {field:'sellPoint',title:'Price',width:500,}    
	    ]]    
	});  



</script>
</html>