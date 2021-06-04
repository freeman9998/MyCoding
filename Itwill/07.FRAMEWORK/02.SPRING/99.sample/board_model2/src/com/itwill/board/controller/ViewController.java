package com.itwill.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.board.Board;
import com.itwill.board.BoardManager;

public class ViewController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath = "";
		//목록 페이지에서 선택한 글의 번호를 읽어서 변수에 저장
		Integer boardno = null;
	    int pageno = 1;
		try {
			boardno = Integer.valueOf(request.getParameter("boardno"));
			pageno = Integer.valueOf(request.getParameter("pageno"));
		
		//글번호가 없다면
		if (boardno == null) {
			//목록으로 이동
			//response.sendRedirect("board_list.jsp?pageno="+pageno);
			forwardPath = "redirect:list.do?pageno="+pageno;
			return forwardPath;
		}
		Board board  = BoardManager.instance().findBoard(boardno);
		request.setAttribute("board", board);
		request.setAttribute("boardno", boardno);
		request.setAttribute("pageno", pageno);
		forwardPath = "board_view.jsp";
		
		if (board == null) {//조회된 글이 없다면
			//목록으로 이동
			//response.sendRedirect("board_list.jsp?pageno="+pageno);
			forwardPath = "list.do?pageno="+pageno;
			return forwardPath;
		}
		BoardManager.instance().updateHitCount(boardno);
		
		} catch (Exception ex) {
			forwardPath = "board_error.jsp";
		}
		
		return forwardPath;
	}

}
