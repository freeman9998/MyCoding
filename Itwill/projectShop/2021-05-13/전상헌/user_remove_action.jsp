<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


String userid=(String)session.getAttribute("loginUser");

UserService userService=new UserService();

userService.deleteUser(userid);

session.removeAttribute("loginUser");

response.sendRedirect("shop_main.jsp");



%>