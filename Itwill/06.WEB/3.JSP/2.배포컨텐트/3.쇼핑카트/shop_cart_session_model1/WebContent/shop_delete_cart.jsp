<%@page import="com.itwill.shop.cart.CartService"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	//��ٱ��Ͽ� �ִ� ��簳�������  view_cart.jsp �� redirection...
	CartService cartService = (CartService) session.getAttribute("cartService");
	if (cartService == null) {
		cartService = new CartService();
		session.setAttribute("cartService", cartService);
	}
	cartService.deleteCart(session.getId());
	response.sendRedirect("shop_view_cart.jsp");
%>