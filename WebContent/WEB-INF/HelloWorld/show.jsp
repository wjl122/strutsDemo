<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show</title>
</head>
<body>
  <s:if  test="#age<10">
      年龄小于10
  </s:if>
  <s:elseif test="#age > 10 and #age <= 20"> 
     未成年
  </s:elseif>  
  <s:else>
           成年
  </s:else>
    
  <br>  
  <s:iterator value="#users" var="u" status="st">
     <s:property value="#u.id"/>---<s:property value="username"/>---<s:property value="password"/>
     ----<s:property value="#st.odd"/>
     <br>
     <s:property value="#root[1].username"/>
   </s:iterator>
   
   
</body>
</html>