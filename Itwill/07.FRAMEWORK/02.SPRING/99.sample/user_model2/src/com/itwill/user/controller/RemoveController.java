package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.user.UserManager;

public class RemoveController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath="";
		String userId = request.getParameter("userId");
		if (request.getMethod().equalsIgnoreCase("GET") || userId == null) {
			//response.sendRedirect("user_list.jsp");
			forwardPath="redirect:list.do";
			return forwardPath;
		}
		try {
			int row = UserManager.getInstance().remove(userId);
			String sUserId=(String)request.getSession().getAttribute("sUserId");
			//로그인된사람이 자기자신을 삭제하는 경우(탈퇴)
			if (userId.equals(sUserId)) {
				request.getSession().invalidate();
				
				//response.sendRedirect("user_login.jsp");
				forwardPath="redirect:user_login.jsp";
			} else {
				//로그인된사람이 다른유져를 삭제하는 경우
				//response.sendRedirect("user_list.jsp");
				forwardPath="redirect:list.do";
			}
		} catch (Exception e) {
			forwardPath="user_error.jsp";
			//response.sendRedirect("../error/error.jsp");
		}
		return forwardPath;
	}

}
