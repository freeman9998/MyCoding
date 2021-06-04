
<%@page import="java.util.HashMap"%>
<%@page import="com.itwill.shop.domain.exception.PaswordMismatchException"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.itwill.shop.domain.exception.MembersNotFoundException"%>
<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("memberLoginForm.jsp");
		return;
	}

	String email=null;
	String password=null;
	try{	
		email = request.getParameter("members_email");
		password = request.getParameter("members_password");
		HashMap<String,Object> map = new HashMap<>();
		map.put("members_email", email);
		map.put("members_password", password);
		
		Members member = new Members();
		
		MembersService memberService = new MembersService();
		member=memberService.findMembersLogin(map);
		if(member!=null){
	 			session.setAttribute("members_email", member.getMembers_email());
	 			session.setAttribute("members_no", member.getMembers_no());
	 			response.sendRedirect("mac_main.jsp");	
		}else{
				response.sendRedirect("memberLoginForm.jsp");
		}
		/*
		위에서 로그인 체크 기능이 이미 있음
		Members loginMember = memberService.findMembersById(email);
		session.setAttribute("sEmail", email);
		session.setAttribute("sMember", loginMember);
		*/
	}catch(MembersNotFoundException e){
		response.sendRedirect("memberLoginForm.jsp?message="+URLEncoder.encode(e.getMessage(),"UTF-8"));
	}catch(PaswordMismatchException e){
		response.sendRedirect("memberLoginForm.jsp?message="+URLEncoder.encode(e.getMessage(),"UTF-8"));
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("memberError.jsp");
	}
%>