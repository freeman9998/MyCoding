<%@page import="com.itwill.shop.user.UserService"%>
<%@page import="com.itwill.shop.user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_write_form.jsp");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	User user = null;
	try{
		user = new User(userId, password, name, email);
		UserService userService = new UserService();
		int inserRowCount = userService.insert(user);
		response.sendRedirect("user_login_form.jsp");
	}catch (Exception e) {
		e.printStackTrace();
		//response.sendRedirect("user_error.jsp");
		response.sendRedirect("user_write_form.jsp");
	}
%>    