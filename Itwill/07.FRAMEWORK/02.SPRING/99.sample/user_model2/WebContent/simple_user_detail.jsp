<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String user=(String)request.getAttribute("user");

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>simple_user_detail.jsp</h1>
<hr/>
<p>
	1.ControllerServlet���� forwarding ����<br/>
	2.Ŭ���̾�Ʈ������
</p>
<p>
	<%=user %>
</p>
</body>
</html>