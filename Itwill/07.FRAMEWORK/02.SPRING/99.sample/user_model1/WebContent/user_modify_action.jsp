<%@page import="com.itwill.user.User"%>
<%@page import="com.itwill.user.UserManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
1.파라메타받기
2.UserManager.update(user);
3.응답(redirect,forward) user_view.jsp로이동
*/
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("user_list.jsp");
	return;
}

String userId=request.getParameter("userId");	
String password=request.getParameter("password");
String name=request.getParameter("name");
String email=request.getParameter("email");

UserManager.getInstance().update(new User(userId,password,name,email));
response.sendRedirect("user_view.jsp?userId="+userId);

%>









