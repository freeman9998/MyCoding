package com.itwill.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.board.BoardManager;

public class RemoveController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		//1. 삭제할 글 번호 읽기 (없거나 잘못된 경우 뒤로 가기 - 이전 페이지로 가기)
		String forwardPath = "";
		Integer boardno = null;
		try {
			boardno = Integer.valueOf(request.getParameter("boardno"));
		boolean result = true;
		//글번호가 없다면
		if (boardno == null) {
			result = false;
		} else {
			//2. 삭제 처리 (데이터베이스의 데이터 변경)
			BoardManager.instance().remove(boardno);
		}
		request.setAttribute("result", result);
		forwardPath = "board_remove_action.jsp";
		
		} catch (Exception ex) {
			forwardPath = "redirect:board_error.jsp";
		}
		
		return forwardPath;
	}

}
