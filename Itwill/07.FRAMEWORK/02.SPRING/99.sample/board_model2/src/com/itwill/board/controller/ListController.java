package com.itwill.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.board.Board;
import com.itwill.board.BoardManager;
import com.itwill.util.ListPageConfigBean;
import com.itwill.util.ListResultBean;

public class ListController implements Controller{
	String getTitleString(Board board){	
		StringBuilder title = new StringBuilder(128);
		
		String t = board.getTitle();
		//제목이 너무 길면 말줄임표 표시
		if (t.length() > 15) {
			t = String.format("%s###", t.substring(0, 10));
		}	
		//System.out.printf("%s 님 반가워요","KIM");
		//System.out.print(String.format("%s 님 반가워요","KIM"));
		//들여쓰기 깊이 만큼 공백 삽입
		for (int i = 0; i < board.getDepth(); i++) {
			title.append("&nbsp;&nbsp;");
		}
		//들여쓰기 이미지 삽입
		if (board.getDepth() > 0) {
			title.append("<img border='0' src='image/re.gif'/>");
		}
		title.append(t.replaceAll(" ", "&nbsp;"));
		return title.toString();
	}
	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) {
		String forwardPath = "";
		try{
			String pageno = request.getParameter("pageno");//요청페이지번호
			if (pageno == null || pageno.equals(""))
				pageno = "1";

			int rows = 10; //한 페이지에 표시할 데이터 건수
			int pageCount = 5; //한 번에 보여줄 페이지 번호 갯수

			// 페이지 설정
			ListPageConfigBean pageConfig = new ListPageConfigBean(rows,
					pageCount, pageno, "", "");
			//데이터베이스에서 게시물 목록 조회
			ListResultBean boardListPage = BoardManager.instance().findBoardList(pageConfig);
			List<Board> boardList = boardListPage.getList();
			
			for (Board board : boardList) {
				board.setTitle(getTitleString(board));
			}
			
			request.setAttribute("boardListPage", boardListPage);
			request.setAttribute("boardList", boardList);
			request.setAttribute("pageno", pageno);
			forwardPath = "board_list.jsp";
		}catch(Exception e){
			e.printStackTrace();
			forwardPath = "board_error.jsp";
		}
		
		return forwardPath;
	}

}
