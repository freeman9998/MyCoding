<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return;
}

CartService cartService=new CartService();
String userid=(String)session.getAttribute("loginUser");
cartService.deleteAll(userid);

response.sendRedirect("shop_view_cart.jsp");



%>