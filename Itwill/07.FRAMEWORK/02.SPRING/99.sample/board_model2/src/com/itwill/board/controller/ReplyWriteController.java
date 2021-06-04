package com.itwill.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.board.Board;
import com.itwill.board.BoardManager;

public class ReplyWriteController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath = "";
		try{
		request.setCharacterEncoding("euc-kr");
		//2. Board 객체를 생성하고 입력된 데이터를 읽어서 객체에 저장
		Board board = new Board();
		board.setBoardNo(
		Integer.parseInt(request.getParameter("boardno")));
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));

		//3. 데이터베이스에 변경 사항 적용
		BoardManager boardManager =BoardManager.instance();
		boardManager.createReply(board);

		//4. boardview.jsp 이동
		String pageno = "1";
		if (request.getParameter("pageno") != null)
			pageno = request.getParameter("pageno");

		//response.sendRedirect(
				//String.format("board_list.jsp?pageno=%s",pageno));
		forwardPath = "list.do?pageno="+pageno;
		}catch(Exception e){
			forwardPath = "board_error.jsp";
		}
		return forwardPath;
	}

}
