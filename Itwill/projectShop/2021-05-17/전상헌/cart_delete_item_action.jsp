<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return;
}

CartService cartService=new CartService();
int cart_no=Integer.parseInt(request.getParameter("cart_no"));
System.out.println(cart_no);
cartService.deleteCartByNo(cart_no);

response.sendRedirect("shop_view_cart.jsp");



%>