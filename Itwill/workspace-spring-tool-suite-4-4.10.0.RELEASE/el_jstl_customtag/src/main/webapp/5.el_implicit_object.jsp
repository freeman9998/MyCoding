<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("path", "page.jsp");
	request.setAttribute("path", "request.jsp");
	session.setAttribute("path", "session.jsp");
	application.setAttribute("path", "application.jsp");

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL내장객체</h1>
<ol>
	<li>----param-----</li>
	<li>${param}</li>
	<li>${param.id}</li>
	<li>${param['name']}</li>
	<li>${param.hobby}</li>
	<li>----paramValues-----</li>
	<li>${paramValues}</li>
	<li>${paramValues.id[0]}</li>
	<li>${paramValues['name'][0]}</li>
	<li>${paramValues.hobby[0]}</li>
	<li>${paramValues.hobby[1]}</li>
	<li>${paramValues.hobby[2]}</li>
	<li>--pageScope,requestScope,sessionScope,applicationScope---</li>
	<li>${path}</li>
	<li>${pageScope.path}</li>
	<li>${requestScope.path}</li>
	<li>${sessionScope.path}</li>
	<li>${applicationScope.path}</li>
	<li>-----cookie-------</li>
	<li>${cookie}</li>
	<li>${cookie.JSESSIONID}</li>
	<li>${cookie['JSESSIONID']}</li>
	<li>${cookie.JSESSIONID.getName()}</li>
	<li>${cookie.JSESSIONID.getValue()}</li>
	<li>${cookie.JSESSIONID.name}</li>
	<li>${cookie.JSESSIONID.value}</li>
	<li>------pageContext-----</li>
	<li>${pageContext}</li>
	<li>${pageContext.request}</li>
	<li>${pageContext.request.method}</li>
	<li>${pageContext.session}</li>
	<li>${pageContext.session.id}</li>
	<li>${pageContext.session.maxInactiveInterval}</li>
	<li>${pageContext.response}</li>
	<li>${pageContext.response.contentType}</li>
	
</ol>
</body>
</html>



