<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("product_list.jsp");
		return;
	}
	String cartNo = request.getParameter("cart_no");
	CartService.getInstance().deleteCartByNo(Integer.parseInt(cartNo));
	response.sendRedirect("cartTestFrom.jsp");
		
%>