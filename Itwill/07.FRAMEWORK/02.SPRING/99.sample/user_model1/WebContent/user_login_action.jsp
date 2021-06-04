<%@page import="com.itwill.user.PasswordMismatchException"%>
<%@page import="com.itwill.user.UserNotFoundException"%>
<%@page import="com.itwill.user.User"%>
<%@page import="com.itwill.user.UserManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_login.jsp");
		return;
	}
	String forwardPath="";
	String userId=request.getParameter("userId");
	String password=request.getParameter("password");
	try{
		User user=UserManager
					.getInstance()
						.login(userId,password);
		//login성공
		session.setAttribute("sUserId", userId);
		session.setAttribute("sUser", user);
		forwardPath="user_list.jsp";
		response.sendRedirect(forwardPath);
		return;
	}catch(UserNotFoundException e){
		
		request.setAttribute("MSG", e.getMessage());
		User fuser=new User(userId,password,null,null);
		request.setAttribute("fuser", fuser);
		forwardPath="user_login.jsp";
	}catch(PasswordMismatchException e){
		
		request.setAttribute("MSG", e.getMessage());
		User fuser=new User(userId,password,null,null);
		request.setAttribute("fuser", fuser);
		forwardPath="user_login.jsp";
	}catch(Exception e){
		e.printStackTrace();
		forwardPath="../error/error.jsp";
	}
	//forward
	RequestDispatcher rd = request.getRequestDispatcher(forwardPath);
	rd.forward(request, response);
%>
<%-- 
<jsp:forward page="<%=forwardPath%>"/>
--%>