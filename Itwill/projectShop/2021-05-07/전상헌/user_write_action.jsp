<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
UserService userService = new UserService();

request.setCharacterEncoding("UTF-8");
String userid = request.getParameter("userId");
String password = request.getParameter("password");
String name = request.getParameter("name");
String email = request.getParameter("email");

userService.insertUser(new User(userid,password,name,email));

response.sendRedirect("shop_main.jsp");

%>