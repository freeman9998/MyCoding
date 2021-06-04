<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userId=(String)session.getAttribute("userId");
if(userId==null){
	response.sendRedirect("shop_main.jsp");
	return;
	
}

if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return;
}

	CartService cartService=new CartService();
	int cart_qty=Integer.parseInt(request.getParameter("cart_qty"));
	int p_no=Integer.parseInt(request.getParameter("p_no"));
	System.out.println(cart_qty);
	System.out.println(p_no);
	cartService.add(userId, p_no, cart_qty);
	response.sendRedirect("shop_view_cart.jsp");
%>
