<%@page import="com.itwill.board.BoardDao"%>
<%@page import="com.itwill.board.BoardService"%>
<%@page import="com.itwill.board.BoardComment"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%	
	    //1. ��۹�ȣ �о ������ ����
		String commentNoStr = request.getParameter("commentno");
		int commentNo = Integer.parseInt(commentNoStr);
		
		//2. ��۹�ȣ�� �ش��ϴ� ��� ����
		BoardService.getInstance().deleteComment(commentNo);
		
		//3. view.action�� �̵�
		response.sendRedirect(
			"board_view.jsp?" + 
			"boardno=" + request.getParameter("boardno") + 
			"&pageno=" + request.getParameter("pageno"));
%>			
			