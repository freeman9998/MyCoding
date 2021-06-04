<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="itwill" uri="http://www.itwill.co.kr/jsp/simpleTag" %>    
<%
	//session.setAttribute("sUserId", "guard");
	session.setAttribute("irum", "고소미");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> custom tag[사용자정의 태그]</h1><hr>
<%--
<jsp:forward/>
 --%>
 ----------------------hello tag--------------------<br/>
<itwill:hello/>
 ----------------------helloAttr tag--------------------<br/>
<itwill:helloAttr/>
<itwill:helloAttr name="김경호"/>
<itwill:helloAttr name="비"/>
<itwill:helloAttr name="${irum}"/>
 ----------------------if tag[body]--------------------<br/>
<itwill:if test="true">
	반드시실행<br>
</itwill:if>
<itwill:if test="false">
	반드시안실행<br>
</itwill:if>
<itwill:if test="${sUserId!=null}">
	${sUserId}님 안녕하세요!!!<br>
</itwill:if>
<itwill:if test="${sUserId==null}">
	GUEST 님 안녕하세요!!!<br>
</itwill:if>
<itwill:if test="${!empty irum}">
	${irum} 님 안녕하세요!!!<br>
</itwill:if>
<itwill:if test="${sUserId!=null}">
	<a href='logout.jsp'>${sUserId}님 로그아웃</a>
</itwill:if>
<itwill:if test="${sUserId==null}">
	<a href='login_form.jsp'>로그인</a>
</itwill:if>

</body>
</html>















