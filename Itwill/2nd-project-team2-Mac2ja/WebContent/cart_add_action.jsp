<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %>
<% 

/*
1. 파라메터 받기(cart_qty, p_no)
2. 장바구니에 제품을 담고 cart_view.jsp로 reditection
*/

String cart_qtystr = request.getParameter("ea");//음식 수량
String food_nostr = request.getParameter("food_no");//음식 번호

int cart_qty = Integer.parseInt(cart_qtystr);
int food_no = Integer.parseInt(food_nostr);

CartService cartService = new CartService();
//Cart cart = new Cart(null, Integer.parseInt(cart_qtystr), sMember.getMembers_no(), Integer.parseInt(p_nostr));
Cart cart = new Cart(null, cart_qty, sMemberNo, food_no);
cartService.insertCart(cart);
//cartService.addCart(sUserId, Integer.parseInt(p_nostr), Integer.parseInt(cart_qtystr));
response.sendRedirect("cartForm.jsp");



%>