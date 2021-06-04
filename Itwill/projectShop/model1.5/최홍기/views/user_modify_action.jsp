<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sUserId = (String)session.getAttribute("sUserId");
	if(sUserId==null){
		response.sendRedirect("shop_main.jsp");
		return;
	}
	if(request.getMethod().equalsIgnoreCase("GET")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	String userId =	request.getParameter("userId");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	UserService userService = new UserService();
	User user = new User(userId, password, name, email);
	int updateRowCount = userService.update(user);
	response.sendRedirect("user_view.jsp");

%>
