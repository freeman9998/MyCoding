package com.itwill.guest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.guest.GuestServiceImpl;

/**
 * Servlet implementation class GuestWriteActionServlet
 */
@WebServlet("/guest_write_action.do")
public class GuestWriteActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			forwardPath="redirect:guest_write_form.do";
			
		}else {
			try {
				request.setCharacterEncoding("UTF-8");
				String guest_name = request.getParameter("guest_name");
				String guest_email = request.getParameter("guest_email");
				String guest_homepage = request.getParameter("guest_homepage");
				String guest_title = request.getParameter("guest_title");
				String guest_content = request.getParameter("guest_content");
				Guest guest = new Guest(0, guest_name, null, guest_email, guest_homepage, guest_title, guest_content);
				GuestService guestService = new GuestServiceImpl();
				int insertRowCount = guestService.insertGuest(guest);
				forwardPath = "redirect:guest_list.do";
			} catch (Exception e) {
				e.printStackTrace();
				forwardPath="redirect:guest_error.do";
				
			}
		}
		
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path = pathArray[1];
		if(forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		}else if(forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}
	}

}
