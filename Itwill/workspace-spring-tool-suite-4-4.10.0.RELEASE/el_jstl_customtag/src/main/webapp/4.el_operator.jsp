<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.bean.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("int1", 10);
	pageContext.setAttribute("int2", 20);
	pageContext.setAttribute("double1", 0.5);
	pageContext.setAttribute("double2", 3.1415926);
	pageContext.setAttribute("string1", "KIM");
	pageContext.setAttribute("string2", "KYUNG HO");
	pageContext.setAttribute("married",true);
	pageContext.setAttribute("age", 43);
	pageContext.setAttribute("weight", 78.236);
	
	Guest guest=null;
	ArrayList<Guest> guestList=new ArrayList<Guest>();
	String emptyStr="";
	HashMap guestMap=new HashMap();
	pageContext.setAttribute("guest", guest);
	pageContext.setAttribute("guestList", guestList);
	pageContext.setAttribute("emptyStr", emptyStr);
	pageContext.setAttribute("guestMap", guestMap);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL Operator , literal </h1><hr>
<ol>
	<li>----EL변수-----</li>
	<li>${int1}</li>	
	<li>${int2}</li>	
	<li>${number}</li>	
	<li>----EL 리터럴(상수)-----</li>
	<li>${23452155}</li>
	<li>${5.56254}</li>
	<li>${'문자1'}</li>
	<li>${"문자2"}</li>
	<li>----EL 연산자-----</li>
	<li>${int1 + int2 + 10}</li>
	<li>${int1 - int2}</li>
	<li>${int1 / int2}</li>
	<li>${(int1*int2)/3-90}</li>
	<li>${1/2}</li>
	<li>${double1+double2}</li>
	<li>${age>=30}</li>
	<li>${age<30}</li>
	<li>${age gt 30}</li>
	<li>${age lt 30}</li>
	<li>${age != 30}</li>
	<li>${age>=30 && age< 40}</li>
	<li>${(age>=30 && age< 40)||(weight>=70 && weight < 80)}</li>
	<li>------empty-----</li>
	<li>${guest == null}</li>
	<li>${empty guest}</li>
	<li>${empty guestList}</li>
	<li>${empty emptyStr}</li>
	<li>${empty guestMap}</li>
	
	<li>${empty null}</li>
	<li>${empty ''}</li>
	<li>${empty ""}</li>
	
	<li>${not empty null}</li>
	<li>${!empty ''}</li>
	<li>${!empty ""}</li>
	
</ol>
</body>
</html>









