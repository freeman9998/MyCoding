<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String sUserId = (String)session.getAttribute("sUserId");
	if(sUserId==null){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	if(request.getMethod().equalsIgnoreCase("GET")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}
	UserService userService = new UserService();
	int deleteRowCount = userService.delete(sUserId);
	response.sendRedirect("user_logout_action.jsp");
%>