<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	
	UserInfo loginUser = UserInfoService.getInstance().findUserInfoById(userId);
	response.sendRedirect("NewFile.jsp");
%>