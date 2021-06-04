<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	request.setCharacterEncoding("UTF-8");
	int members_no=Integer.parseInt(request.getParameter("members_no"));
	String members_name=request.getParameter("members_name");
	String members_phone=request.getParameter("memberPhone")+request.getParameter("memberPhone2")+request.getParameter("memberPhone3");
	
	Members members= new Members(members_no,members_name,null,null,members_phone);
	MembersService membersService = new MembersService();
	try{
		membersService.updateMembers(members);
		request.setAttribute("members_no", members_no);
		RequestDispatcher rd = request.getRequestDispatcher("memberModifyForm.jsp");
		rd.forward(request, response);
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("mac_main.jsp");
	}
%>
