<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="login_check.jspf" %> 
<%

int del = CartService.getInstance().deleteCart(sUserId);
response.sendRedirect("shop_main.jsp");
%>