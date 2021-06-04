<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("shop_main.do");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	User user = null;
	try{
		UserService userService = new UserService();
		if(userService.login(userId, password)){
			session.setAttribute("sUserId", userId);
			response.sendRedirect("shop_main.do");
			
		}else {
			response.sendRedirect("user_login_form.do");
		}
		
	}catch (Exception e){
		e.printStackTrace();
		//response.sendRedirect("user_error.jsp");
		response.sendRedirect("user_login_form.do");
	}
	
%>