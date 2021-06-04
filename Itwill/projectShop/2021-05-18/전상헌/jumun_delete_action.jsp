<%@page import="com.itwill.shop.jumun.JumunService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return;
}

request.setCharacterEncoding("UTF-8");
JumunService jumunService=new JumunService();

int j_no=Integer.parseInt(request.getParameter("j_no"));

jumunService.delete(j_no);

response.sendRedirect("jumun_list.jsp");


%>