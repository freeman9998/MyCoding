package com.itwill.shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserServiceImpl;

/**
 * Servlet implementation class UserModifyActionServlet
 */
@WebServlet("/user_modify_action.do")
public class UserModifyActionServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forwardPath="";
		
		
		if(request.getMethod().equalsIgnoreCase("get")){
			forwardPath="redirect:shop_main.do";
		}else {
		HttpSession session=request.getSession();
		
		request.setCharacterEncoding("UTF-8");
		String userid=(String)session.getAttribute("loginUser");
		UserServiceImpl userService=new UserServiceImpl();
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String email =request.getParameter("email");


		try {
			userService.updateUser(new User(userid,password,name,email), userid);
		} catch (Exception e) {
			forwardPath="redirect:error.do";
			e.printStackTrace();
		}

		forwardPath="forward:/WEB-INF/views/user_view.jsp";
		String[] pathArray=forwardPath.split(":");
		String forwardOrRedirect=pathArray[0];
		String path=pathArray[1];
		if(forwardOrRedirect.equals("forward")) {
			RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request, response);
		}else if(forwardOrRedirect.equals("redirect")){
			response.sendRedirect(path);
		}
		
	}
	}

}
