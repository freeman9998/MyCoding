package com.itwill.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.board.Board;
import com.itwill.board.BoardManager;

public class ModifyFormController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		Integer boardno = null;
		String forwardPath = "";
		int result = Integer.parseInt(request.getParameter("result"));//1->수정 2->답글
		try {
			boardno = Integer.valueOf(request.getParameter("boardno"));
			System.out.println("boardno확인-->"+boardno);
		//글번호가 없다면
		if (boardno == null) {
			//목록으로 이동
			//response.sendRedirect("board_list.jsp");
			forwardPath = "redirect:list.do";
			return forwardPath;
		}
	
		Board board = BoardManager.instance().findBoard(boardno);
		if (board == null) {
			//response.sendRedirect("board_list.jsp");
			forwardPath = "redirect:list.do";
			return forwardPath;
		}
		
		String pageno = "1";
		if (request.getParameter("pageno") != null) {
			pageno = request.getParameter("pageno");
		}
		request.setAttribute("board", board);
		request.setAttribute("pageno", pageno);
		request.setAttribute("boardno", boardno);
		if(result == 1){			
		forwardPath = "board_modify.jsp";
		}else if(result == 2){
			forwardPath = "board_reply_write.jsp";
		}
		} catch (Exception ex) {
			forwardPath = "redirect:board_error.jsp";
		}
		return forwardPath;
	}

}
