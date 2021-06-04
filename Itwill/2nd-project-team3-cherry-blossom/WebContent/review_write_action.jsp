<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="com.itwill.shop.service.ReviewService"%>
<%@page import="com.itwill.shop.domain.Review"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="login_check.jspf" %>    
 
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("product_list_form.jsp");
		return;
	}

	
	request.setCharacterEncoding("UTF-8");
	
	UserInfo userId = new UserInfo(sUserId);
	String content = request.getParameter("content");
	int score = Integer.parseInt(request.getParameter("star"));
	String p_noStr = request.getParameter("p_no");
	Product product = new Product(Integer.parseInt(p_noStr));
	int p_no = Integer.parseInt(p_noStr);
	
	Review newReview = null;
	
	try{
		newReview = new Review(0,content,score,userId,product);
		ReviewService.getInstance().insertReview(newReview);
		response.sendRedirect("product_detail_form.jsp?p_no="+p_no);
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("product_list.jsp");
		return;
	}
%>