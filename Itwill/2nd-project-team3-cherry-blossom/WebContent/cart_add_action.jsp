<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="login_check.jspf" %>
<%
	if(request.getMethod().equalsIgnoreCase("GET")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}

	String p_noStr = request.getParameter("p_no");
	String cart_qtyStr = request.getParameter("cart_qty");
	int p_no = Integer.parseInt(p_noStr);
	int cart_qty = Integer.parseInt(cart_qtyStr);
	Product product = new Product(p_no);
	Cart cart = new Cart(0,cart_qty,sUserId,product);
	CartService.getInstance().add(cart);
	response.sendRedirect("cart_form.jsp");
%>