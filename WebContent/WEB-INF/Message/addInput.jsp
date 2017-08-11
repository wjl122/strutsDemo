<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addInput</title>
</head>
<body>
	<h1>message addinput</h1>
	<s:debug/>
	<form action="Message_add" method="post">
       <s:textfield name="id" key="id" ></s:textfield>	<br>
	   <s:textfield name="title" key="title" /><br>
	   <s:textfield name="content" key="content" />
		<br/><br>
		<input  type="submit" value="提交"/>
	</form>
</body>
</html>