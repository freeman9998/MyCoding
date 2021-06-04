<%@page import="com.itwill.shop.dao.exception.PasswordMismatchException"%>
<%@page import="com.itwill.shop.dao.exception.UserNotFoundException"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_my_info_form.jsp");
		return;
	}

	String userId = null;
	String password = null;
	try{
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		UserInfo loginUser = UserInfoService.getInstance().login(userId, password);
		session.setAttribute("sUserId", userId);
		session.setAttribute("sUser", loginUser);
		response.sendRedirect("shop_main.jsp");
		
	}catch(UserNotFoundException e){
		request.setAttribute("msg1", e.getMessage());
		request.setAttribute("fuser1", new UserInfo(userId,password,"","","",""));
		RequestDispatcher rd = request.getRequestDispatcher("user_my_info_form.jsp");
		rd.forward(request, response);
				
	}catch(PasswordMismatchException e){
		request.setAttribute("msg2", e.getMessage());
		request.setAttribute("fuser1", new UserInfo(userId,password,"","","",""));
		RequestDispatcher rd = request.getRequestDispatcher("user_my_info_form.jsp");
		rd.forward(request, response);
		
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("error_404.jsp");
		return;
	}
%>