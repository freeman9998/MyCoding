package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

/**
 * Servlet implementation class UserModifyActionServlet
 */
@WebServlet("/user_modify_action.do")
public class UserModifyActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath = "";
		/*****************************************/
		/*
		 * 메인비지니스업무라인
		 */
		String sUserId = (String) request.getSession().getAttribute("sUserId");
		if(sUserId==null){
			forwardPath = "redirect:shop_main.do";
		}else {
			if(request.getMethod().equalsIgnoreCase("GET")) {
				forwardPath = "redirect:shop_main.do";
			}else {
				request.setCharacterEncoding("UTF-8");
				String userId =	request.getParameter("userId");
				String password = request.getParameter("password");
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				try {
					UserService userService = new UserService();
					User user = new User(userId, password, name, email);
					int updateRowCount = userService.update(user);
					forwardPath = "redirect:user_view.do";
				} catch (Exception e) {
					e.printStackTrace();
					forwardPath = "forward:/WEB-INF/views/user_error.jsp";
				}
			}
		}
		
		/*****************************************/
		
		/************forward or redirect**********/
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path = pathArray[1];
		if (forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		} else if (forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}
		
	}

}
