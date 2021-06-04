<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginId=(String)session.getAttribute("loginId");
	if(loginId==null){
		response.sendRedirect("7-2.default_session_login_form.jsp");
		return;
	}
%>
<%
/*
세션객체무효화
Invalidates this session then unbinds any objects bound to it. 
*/
session.invalidate();
%>
<h1>로그아웃</h1>
<div>
	<%=loginId %> 님안녕히가세요!!!
</div>
<div>
	<a href='7-2.default_session_login_form.jsp'>로그인</a>
	<a href='7-2.default_session_use1.jsp'>회원전용페이지1</a>
	<a href='7-2.default_session_use2.jsp'>회원전용페이지2</a>
</div>













