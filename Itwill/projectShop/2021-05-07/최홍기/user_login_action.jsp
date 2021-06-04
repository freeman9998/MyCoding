<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_login_form.jsp");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	User user = null;
	try{
		UserService userService = new UserService();
		user = userService.select(userId);
		if(password.equals(user.getPassword())){
			response.sendRedirect("shop_main.jsp?userId="+userId);
		}else {
			response.sendRedirect("user_login_form.jsp");
		}
		
	}catch (Exception e){
		e.printStackTrace();
		//response.sendRedirect("user_error.jsp");
		response.sendRedirect("user_login_form.jsp");
	}
	
%>