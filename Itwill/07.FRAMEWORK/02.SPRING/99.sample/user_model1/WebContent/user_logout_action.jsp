<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="loginCheck.jspf" %>
<%
	session.invalidate();
	response.sendRedirect("user_login.jsp");
	return;
%>