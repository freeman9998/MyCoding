<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("sUserId", "guard");	

	pageContext.setAttribute("name", "제임스딘");
	request.setAttribute("name", "김경호");
	
	request.setAttribute("age", 34);
	request.setAttribute("married", true);
	request.setAttribute("weight", 69.23);
	double height=175.2;
	String address="서울시민";

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL String,Wrapper</h1><hr>
<ol>
	<li>${sUserId}</li>
	<li>${name.substring(1)}</li>
	<li>${age+3}</li>
	<li>${married}</li>
	<li>${weight}</li>
	<li>EL사용불가능[속성객체가아니므로]</li>
	<li>${height}</li>
	<li>${address}</li>
	<li><%=height%></li>
	<li><%=address%></li>
</ol>
</body>
</html>
