<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	/*
		1.request(scope객체) 로부터 데이타 뽑기
		2.출력
	*/
	ArrayList<String> userList=(ArrayList)request.getAttribute("userList");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>simple_user_list.jsp</h1>
<hr/>
<p>
	1.ControllerServlet에서 forwarding 당함<br/>
	2.클라이언트에응답
</p>
<ol>
<%for(String user:userList){ %>
	<li><%= user %></li>
<%}%>
</ol>
</body>
</html>