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
	String p_noStr = (String)session.getAttribute("p_no");
	cartService.deleteProduct(userId, Integer.parseInt(p_noStr));
	
	response.sendRedirect("product_list.jsp");



%>