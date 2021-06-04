package com.itwill.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.User;
import com.itwill.user.UserManager;

public class ListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		try {
			List<User> userList=UserManager.getInstance().findUserList();
			request.setAttribute("userList", userList);
			forwardPath="user_list.jsp";
		} catch (Exception e) {
			forwardPath="user_error.jsp";
			e.printStackTrace();
		}
		
		
		return forwardPath;
	}

}
