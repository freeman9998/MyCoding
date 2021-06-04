<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("productListView.jsp");
	return;
}

//장바구니에서 원하는 항목 삭제시킨 후 cart_view.jsp로 이동

String cart_nostr = request.getParameter("cart_no");
CartService cartService = new CartService();
cartService.deleteCartByNo(Integer.parseInt(cart_nostr));
response.sendRedirect("cartForm.jsp");

%>