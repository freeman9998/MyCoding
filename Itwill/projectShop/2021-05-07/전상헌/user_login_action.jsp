<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
UserService userService=new UserService();

String userId=request.getParameter("userId");
String password=request.getParameter("password");

User user=userService.selectOneUser(userId);
	System.out.println(user);
	session.setAttribute("idCheck", "");
	session.setAttribute("passwordCheck", "");
if(user==null){
	System.out.println("id X");
	session.setAttribute("idCheck", "존재하지 않는 아이디입니다 .");
	response.sendRedirect("user_login_form.jsp");
	return ;
}
if(!user.getPassword().equals(password)){
	System.out.println("password X");
	session.setAttribute("passwordCheck", "비밀번호가 일치하지 않습니다.");
	response.sendRedirect("user_login_form.jsp");
	return ;
}

session.setAttribute("loginUser", userId);
response.sendRedirect("shop_main.jsp");






%>