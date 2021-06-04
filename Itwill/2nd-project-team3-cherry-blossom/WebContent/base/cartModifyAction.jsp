<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("cartTestFrom.jsp");
	}

	String cartNo = request.getParameter("cart_no");
	String cartQty = request.getParameter("cart_qty");
	
	Cart updateCart = new Cart(Integer.parseInt(cartNo),Integer.parseInt(cartQty),"itwill3");
	CartService.getInstance().updateCartQty(updateCart);
	response.sendRedirect("cart_form.jsp");

%>