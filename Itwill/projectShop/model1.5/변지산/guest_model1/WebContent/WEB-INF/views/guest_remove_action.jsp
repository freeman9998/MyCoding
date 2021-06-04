<%@page import="com.itwill.guest.GuestServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("guest_main.do");
		return;
	}
	try{
		String guest_noStr = request.getParameter("guest_no");
		GuestServiceImpl guestService=new GuestServiceImpl();
		guestService.deleteGuest(Integer.parseInt(guest_noStr));
		response.sendRedirect("guest_list.do");
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("guest_error.do");
	}
%>