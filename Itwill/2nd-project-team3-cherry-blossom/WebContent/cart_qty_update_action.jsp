<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.jsp");
	}
	
	String[] cartNoQty = request.getParameterValues("cart_no_qty");	
	
	for(int i=0;i<cartNoQty.length;i++){
		int idx = cartNoQty[i].indexOf("-");
		String cartNo =  cartNoQty[i].substring(0,idx);
		String cartQty = cartNoQty[i].substring(idx+1);	
		Cart updateCart = new Cart(Integer.parseInt(cartNo),Integer.parseInt(cartQty),sUserId);
		CartService.getInstance().updateCartQty(updateCart);
	}
	
	
	response.sendRedirect("cart_form.jsp");

%>