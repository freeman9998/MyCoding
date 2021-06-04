<%@page import="com.itwill.shop.dao.exception.ExistedUserException"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("user_my_info_form.jsp");
	}
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("newUserId");
	String password = request.getParameter("newPassword");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	
	UserInfo newUser = null;
	try{
		newUser = new UserInfo(userId,password,name,address,phone,email);
		UserInfoService.getInstance().create(newUser);		
		response.sendRedirect("shop_main.jsp");
		
	} catch(ExistedUserException e){
			
		request.setAttribute("msg", e.getMessage());	
		request.setAttribute("fuser", newUser);
		RequestDispatcher rd = request.getRequestDispatcher("user_my_info_form.jsp");
		rd.forward(request, response);
	
		
	} catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("error_404.jsp");
		return;
	}
	
%>