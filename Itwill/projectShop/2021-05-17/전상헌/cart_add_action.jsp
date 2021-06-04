<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("get")){
	response.sendRedirect("shop_main.jsp");
	return;
}



String loginUser=(String)session.getAttribute("loginUser");
CartService cartService=new CartService();
int cart_qty=Integer.parseInt(request.getParameter("cart_qty"));
int p_no=Integer.parseInt(request.getParameter("p_no"));
System.out.println(cart_qty);
System.out.println(p_no);
cartService.add(loginUser, p_no, cart_qty);

response.sendRedirect("shop_view_cart.jsp");



%>