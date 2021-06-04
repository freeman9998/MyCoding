<%@page import="com.itwill.user.UserServiceHelper"%>
<%@page import="com.itwill.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>UserService 객체 사용</h1>
<%
	UserService userService=
		UserServiceHelper.getUserService(application);
    //userService.create(null);
    
%>
<hr/>
<ol>
<li><%=userService%></li>
<li>userService.create(null)</li>
<li>userService.login()</li>
<li>userService.findUserList()</li>
<li>userService.findUser()</li>
</ol>
</body>
</html>