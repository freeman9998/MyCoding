<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   int members_no = Integer.parseInt(request.getParameter("members_no"));
   MembersService membersService = new MembersService();
   try{
   		membersService.deleteMembers(members_no);
		session.invalidate();
		response.sendRedirect("mac_main.jsp");
   }catch(Exception e){
		e.printStackTrace();
		request.setAttribute("members_no", members_no);
		RequestDispatcher rd = request.getRequestDispatcher("memberMypage.jsp");
		rd.forward(request, response);
   }
%>