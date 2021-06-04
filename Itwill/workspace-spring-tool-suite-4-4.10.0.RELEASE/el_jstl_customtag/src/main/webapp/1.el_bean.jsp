<%@page import="java.util.Date"%>
<%@page import="com.itwill.bean.Student"%>
<%@page import="com.itwill.bean.Car"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Car c=new Car(111,"TESLA","RED");
	Student s=new Student(1,"KIM",new Car(333,"K8","BLACK"));
	Date d=new Date();
	
	request.setAttribute("car", c);
	request.setAttribute("student", s);
	request.setAttribute("date", d);
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL Bean객체출력</h1><hr>
<ul>
	<li>${car}</li>
	<li>${car.no}</li>
	<li>${car.model}</li>
	<li>${car.color}</li>
	<li>${student}</li>
	<li>${student.no}</li>
	<li>${student.name}</li>
	<li>${student.car}</li>
	<li>${student.car.no}</li>
	<li>${student.car.model}</li>
	<li>${student.car.color}</li>
	<li>${date}</li>
	<li>${date.year+1900} 년</li>
	<li>${date.month+1} 월</li>
	<li>${date.date} 일</li>
	<li>${date.getTime()}</li>
</ul>
</body>
</html>









