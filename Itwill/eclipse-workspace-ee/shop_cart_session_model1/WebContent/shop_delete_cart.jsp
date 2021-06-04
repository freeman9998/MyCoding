<%@page import="com.itwill.shop.cart.Cart"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//장바구니에 있는 모든개를지우고  view_cart.jsp 로 redirection...
	Cart cartService = (Cart) session.getAttribute("cart");
	if (cartService == null) {
		cartService = new Cart();
		session.setAttribute("cart", cartService);
	}
	cartService.deleteCart(session.getId());
	response.sendRedirect("shop_view_cart.jsp");
%>