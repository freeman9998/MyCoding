<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<%@page import="com.itwill.util.StaticFunction" %>    
<%
	String title="오늘은 월요일 JSTL을 공부합니다.";
	
	request.setAttribute("title", title);
	request.setAttribute("name", "JaMeS");
	request.setAttribute("price", 1234567);
	request.setAttribute("weight", 74.5681);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL function(EL안에서 사용가능한)</h1><hr>
<ol>
	<li>표준EL안에서 메쏘드(String)호출가능</li>
	<li>${name.toLowerCase()}</li>
	<li>${name.toUpperCase()}</li>
	<li>${title.substring(8,12)}</li>
	<li>표준EL안에서 static 메쏘드호출가능</li>
	<li>${Integer.parseInt('45')+50}</li>
	<li>${StaticFunction.numberPrint(price,'##,###.0') }</li>
	<li>표준EL은 객체생성작업이불가능</li>
	<li>&dollar;{new DecimalFormat('##,###.0').format(price)}-->안되요!(SPEL에서는 가능)</li>
	<li>JSTL에서 제공하는 EL function</li>
	<li>${fn:substring(title,8,12)}</li>
	<li>${fn:toLowerCase(name)}</li>
	<li>${fn:toUpperCase(name)}</li>
</ol>

</body>
</html>











