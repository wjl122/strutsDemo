<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addlist</title>
</head>
<body>
  1.传值第一种方法：<br>
  ${username }---${ password }
  <br/>
  2.传值第二个方法：<br>
  <s:property value="username"/>--<s:property value="password"/>
  <br>
  <s:property value="wjl"/>:<s:property value="#age"/><br>
  3.servlet传值
   性别： <s:property value="#request.sex"/>
   <br>
   <s:property value="#root[1].username"/>
   <s:debug/>  
</body>
</html>