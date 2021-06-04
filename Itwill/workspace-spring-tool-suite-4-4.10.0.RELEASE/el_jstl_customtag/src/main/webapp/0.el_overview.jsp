<%@page import="com.itwill.bean.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("a",new String("속성객체"));
	request.setAttribute("b",new Integer(2));
	request.setAttribute("c", new Boolean(true));
	
	request.setAttribute("d",
			new Guest(1,"KIM","2021-03","guard@gmail.com","www.naver.com","타이틀","콘텐트"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL(Expression Language)</h1><hr/>
<ol>
	<li>${a}</li>
	<li>${b}</li>
	<li>${c}</li>
	<li>${d}</li>
	<li>${d.getGuest_no()}</li>
	<li>${d.guest_no}</li>
	<li>${d.guest_name}</li>
	<li>${d.guest_email}</li>
	<li>${d.guest_homepage}</li>
	<li>${d.guest_date}</li>
	<li>${msg}</li>
</ol>
</body>
</html>





















