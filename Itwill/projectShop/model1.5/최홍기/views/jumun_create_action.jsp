<%@page import="com.itwill.shop.jumun.JumunService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sUserId = (String)session.getAttribute("sUserId");
	if(sUserId==null){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.jsp");
		return; 
	}
	String buyType = request.getParameter("buyType");
	String p_noStr = request.getParameter("p_no");
	String p_qtyStr = request.getParameter("p_qty");
	
	JumunService jumunService = new JumunService();
	if(buyType.equals("cart")){
		jumunService.createJumun(sUserId);
	}else if(buyType.equals("direct")) {
		jumunService.createJumun(sUserId, Integer.parseInt(p_noStr), Integer.parseInt(p_qtyStr));
	}
	response.sendRedirect("jumun_list.jsp");
	
%>