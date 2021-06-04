<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("get")){
	response.sendRedirect("shop_main.jsp");
	return;
}


request.setCharacterEncoding("UTF-8");
String userid=(String)session.getAttribute("loginUser");
UserService userService=new UserService();
String password=request.getParameter("password");
String name=request.getParameter("name");
String email =request.getParameter("email");


userService.updateUser(new User(userid,password,name,email), userid);

response.sendRedirect("user_view.jsp");
%>