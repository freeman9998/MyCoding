package com.itwill.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetAllPropertiesRule;

import com.itwill.board.Board;
import com.itwill.board.BoardManager;

public class ModifyController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath = "";
		try{			
			//post 요청인 경우 요청 데이터에 한글 문자셋으로 설정
		if (request.getMethod().toLowerCase().equals("post")) {
			request.setCharacterEncoding("euc-kr");
		}

		//1. Board 객체를 만들고 사용자가 입력한 데이터를 저장
		Board board = new Board();
		board.setBoardNo(
			Integer.parseInt(request.getParameter("boardno")));
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));

		//2. 데이터베이스에 변경된 내용 적용
		BoardManager.instance().update(board);

		String pageNo = "1";
		if (request.getParameter("pageno") != null) {
			pageNo = request.getParameter("pageno");
		}
		//3. boardview.jsp로 이동
		//response.sendRedirect(
			//String.format("board_view.jsp?boardno=%d&pageno=%s",
			//board.getBoardNo(), pageNo));
		forwardPath = "view.do";
		//request.setAttribute("boardno", board.getBoardNo());
		}catch(Exception e){
			
		}
		return forwardPath;
	}

}
