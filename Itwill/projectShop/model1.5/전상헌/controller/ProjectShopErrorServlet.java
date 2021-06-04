package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectShopErrorServlet
 */
@WebServlet("/error.do")
public class ProjectShopErrorServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String	forwardPath="/WEB-INF/views/user_error.jsp";
	
			RequestDispatcher rd=request.getRequestDispatcher(forwardPath);
			rd.forward(request, response);
		
		
		
		
		
	}

}
