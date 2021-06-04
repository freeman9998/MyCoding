<%@page import="com.itwill.user.ExistedUserException"%>
<%@page import="com.itwill.user.User"%>
<%@page import="com.itwill.user.UserManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_write.jsp");
		return;
	}
	//1. 파라메타바끼
	//request.setCharacterEncoding("UTF-8");
	String userId=request.getParameter("userId");
	String password=request.getParameter("password");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	User user=new User(userId,password,name,email);
	//2. UserManager.create()메쏘드호출
	try{
		int row=UserManager.getInstance().create(user);	
		//insert success
		response.sendRedirect("user_login.jsp");
		
	}catch(ExistedUserException e){
		/*******************case1************
		response.sendRedirect("user_write.jsp");
		**************************************/
		/*******************case2************
		out.println("<script>");
		out.println("alert('"+e.getMessage()+"');");
		out.println("location.href='user_write.jsp';");
		out.println("</script>");
		***************************************/
		request.setAttribute("MSG",e.getMessage());
		request.setAttribute("fuser", user);
%>
	<jsp:forward page="user_write.jsp"/>
<%		
	}catch(Exception e){
		response.sendRedirect("../error/error.jsp");
	}
	
%>