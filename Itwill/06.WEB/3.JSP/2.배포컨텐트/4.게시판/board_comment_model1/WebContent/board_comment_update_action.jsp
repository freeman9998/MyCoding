<%@page import="com.itwill.board.BoardDao"%>
<%@page import="com.itwill.board.BoardService"%>
<%@page import="com.itwill.board.BoardComment"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	//��û �������� ������ ǥ���� �۹�ȣ�� �а� ������ ����
	//(������ ������� �̵�)
	//1. BoardComment ��ü ���� -> ���۵� �����͸� �о ����
	BoardComment comment = new BoardComment();
	comment.setCommentNo(Integer.parseInt(request.getParameter("commentno")));
	comment.setContent(request.getParameter("content"));

	//2. �����ͺ��̽� ������Ʈ
	BoardService.getInstance().updateComment(comment);
	//3. board_view.jsp ���� �̵�
	response.sendRedirect("board_view.jsp?boardno=" + request.getParameter("boardno") + "&pageno="
			+ request.getParameter("pageno"));
%>
