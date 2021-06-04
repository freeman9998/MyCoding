<%@page import="com.itwill.shop.jumun.JumunService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sUserId = (String)session.getAttribute("sUserId");
	if(sUserId==null || sUserId.equals("")){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	int j_no = Integer.parseInt(request.getParameter("j_no"));
	JumunService jumunService = new JumunService();
	int deleteRowCount = jumunService.deleteJumun(j_no);
	response.sendRedirect("jumun_list.jsp");
%>