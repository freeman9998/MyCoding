<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("A.file_upload.jsp");
		return;
	}

	String saveDirectory=application.getRealPath("/upload");
	System.out.println("saveDirectory:"+saveDirectory);
	MultipartRequest multipartRequest=
		new MultipartRequest(request,saveDirectory,1024*1024*100,"UTF-8");
	/*
	 MultipartRequest객체생성이후에는 request를사용해서 파라메타를 읽을수없다.
	*/
	String name1 = request.getParameter("name");
	/*
	MultipartRequest객체를 사용해서 파라메타를 읽어야한다.
	*/
	/*
	<input type="text" name="name">
	<input type="file" name="fileone">
	<input type="file" name="filetwo">
	*/
	String name2 = multipartRequest.getParameter("name");
	String fileName1=multipartRequest.getFilesystemName("fileone");
	String fileName2=multipartRequest.getFilesystemName("filetwo");
%>
<h1>Upload Data</h1>
<hr/>
<br/>
<br/>
<br/>
<li>name1:<%=name1 %></li>
<li>name2:<%=name2 %></li>
<li>fileone:<%=fileName1 %></li>
<li>filetwo:<%=fileName2 %></li>
