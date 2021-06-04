<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_my_info_form.jsp");
		return;
	}
	
	String user_id = request.getParameter("user_id");
	String password = request.getParameter("password");

	response.sendRedirect("shop_main.jsp");

%>