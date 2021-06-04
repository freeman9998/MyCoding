<%@page import="com.itwill.user.UserManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="loginCheck.jspf"%>
<%
	String userId = request.getParameter("userId");
	if (request.getMethod().equalsIgnoreCase("GET") || userId == null) {
		response.sendRedirect("user_list.jsp");
		return;
	}
	try {
		int row = UserManager.getInstance().remove(userId);
		//로그인된사람이 자기자신을 삭제하는 경우(탈퇴)
		if (userId.equals(sUserId)) {
			session.invalidate();
			response.sendRedirect("user_login.jsp");
		} else {
			//로그인된사람이 다른유져를 삭제하는 경우
			response.sendRedirect("user_list.jsp");
		}
	} catch (Exception e) {
		response.sendRedirect("../error/error.jsp");
	}
%>
