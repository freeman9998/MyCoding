<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	
	CartService cartService = new CartService();
	String userId = (String)session.getAttribute("userId");
	cartService.deleteUser(userId);
	
	response.sendRedirect("product_list.jsp");
%>