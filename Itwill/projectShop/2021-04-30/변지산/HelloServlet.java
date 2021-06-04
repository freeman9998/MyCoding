package com.itwill.shop.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset = \"UTF-8\">");
		out.print("<title> HelloServlet </title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>HelloServlet</h3>");
		out.print("<hr>");
		//out.print("<table border=/'1'/>");
		out.print("<tr>");
		out.print("<td>안녕</td>");
		out.print("<br>");
		out.print("<td>Hello</td>");
		out.print("<br>");
		out.print("<td>Hi</td>");
		out.print("<br>");
		out.print("<hr>");
		out.print("<td>잘가</td>");
		out.print("<br>");
		out.print("<td>Byebye</td>");
		out.print("<br>");
		out.print("</tr>");
		//out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
		
		
	}

	
}
