
<%@page import="com.itwill.member.ExistedMemberException"%>
<%@page import="com.itwill.common.Util"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="com.itwill.member.MemberService"%>

<%@page import="com.itwill.member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("member_write_form.jsp");
		return;
	}	

	//request.setCharacterEncoding("UTF-8");
	//password = Util.getHashedString(password, "SHA-1");
	String id=request.getParameter("m_id");	
	String password=request.getParameter("m_password");
	String name=request.getParameter("m_name");	
	String phone = request.getParameter("m_phone");
	String email=request.getParameter("m_email");	
	Member newMember=null;
	try {
		MemberService memberService=new MemberService();
		newMember = new Member(id,password,name,phone,email);
		memberService.create(newMember);
		response.sendRedirect("member_login_form.jsp");
	} catch(ExistedMemberException e) {
		//e.printStackTrace();
		/*********   case2********************
		response.sendRedirect("user_write_form.jsp?msg="+
		       URLEncoder.encode(e.getMessage(), "UTF-8"));
		*/
		/*************** case 1****************
		out.println("<script>");
		out.println("alert('"+e.getMessage()+"');");
		out.println("location.href='user_write_form.jsp?msg="
					+URLEncoder.encode(e.getMessage(), "UTF-8")+"';");
		out.println("</script>");
		*/
		request.setAttribute("msg", e.getMessage());
		request.setAttribute("fmember",newMember);
		RequestDispatcher rd=
				request.getRequestDispatcher("member_write_form.jsp");
		rd.forward(request, response);
		
	} catch(Exception e) {
		e.printStackTrace();
		RequestDispatcher rd =
				request.getRequestDispatcher("member_error.jsp");
		rd.forward(request, response);
	}
%>

