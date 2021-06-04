package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("05-03.form.html");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		/*
		 * 1.파라메타받기
		 */
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String[] hobbies=request.getParameterValues("hobby");
		
		/*
		 * 2.Service객체메쏘드호출
		 */
		
		out.println("<h1>가입정보</h1><hr>");
		out.println("<ul>");
		out.println("<li>아이디:"+id+"</li>");
		out.println("<li>이름:"+name+"</li>");
		for (String hobby : hobbies) {
			out.println("<li>취미:"+hobby+"</li>");
		}
		out.println("</ul>");
	}

}
