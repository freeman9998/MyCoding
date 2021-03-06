package com.itwill.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.Controller;
import com.itwill.user.User;
import com.itwill.user.UserService;
import com.itwill.user.UserServiceImpl;

public class UserListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath="";
		try {
			UserService userService = new UserServiceImpl();
			List<User> userList = userService.findUserList();
			request.setAttribute("userList", userList);
			forwardPath="forward:/WEB-INF/views/user_list.jsp";
		} catch (Exception e) {
			forwardPath="forward:/WEB-INF/views/user_error.jsp";
			e.printStackTrace();
		}

		return forwardPath;
	}

}
