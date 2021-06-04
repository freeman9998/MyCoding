<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
    request.setCharacterEncoding("UTF-8");
   
    MembersService membersService = new MembersService();
    Members members=null;
    
    if(request.getParameter("findHandle").equals("findId")){
    	members = membersService.findMembersByPhone(request.getParameter("memberId"));
    }	
    
   	if(request.getParameter("findHandle").equals("findpass")){
    	members = membersService.findMembersById(request.getParameter("memberPassWord"));
   	}
    
    if(members==null){
    	request.setAttribute("msg", "존재하지 않는 유저입니다.");
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response);
    }
    
    if(request.getParameter("findHandle").equals("findId")&&members!=null){
    	request.setAttribute("findId", members.getMembers_email());
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response); 
    }else if(request.getParameter("findHandle").equals("findpass")&&members!=null){
    	System.out.println("1");
    	request.setAttribute("findPassword", members.getMembers_password());
    	RequestDispatcher rd = request.getRequestDispatcher("memberIdPwFind.jsp");
    	rd.forward(request, response);
    }
 %>


 