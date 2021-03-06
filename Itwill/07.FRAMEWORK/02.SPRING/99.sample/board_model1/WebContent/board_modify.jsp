<%@page import="com.itwill.board.Board"%>

<%@page import="com.itwill.board.BoardManager"%>
<%@page contentType="text/html;charset=euc-kr"%>
<%
	Integer boardno = null;
	try {
		boardno = Integer.valueOf(request.getParameter("boardno"));
	} catch (Exception ex) {
	}
	//글번호가 없다면
	if (boardno == null) {
		//목록으로 이동
		response.sendRedirect("board_list.jsp");
		return;
	}
	Board board = BoardManager.instance().findBoard(boardno);
	if (board == null) {
		response.sendRedirect("board_list.jsp");
		return;
	}
	String pageno = "1";
	if (request.getParameter("pageno") != null) {
		pageno = request.getParameter("pageno");
	}
%>
<html>
<head>
<title>게시판</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="./css/board.css" type="text/css">
<script language="JavaScript">
	function boardUpdate() {
		if (f.title.value == "") {
			alert("제목을 입력하십시요.");
			f.title.focus();
			return false;
		}
		if (f.writer.value == "") {
			alert("작성자를 입력하십시요.");
			f.writer.focus();
			return false;
		}
		if (f.content.value == "") {
			alert("내용을 입력하십시요.");
			f.content.focus();
			return false;
		}

		
		f.action = "board_modify_action.jsp";
		f.submit();
	}

	function boardList() {
		f.action = "board_list.jsp";
		f.submit();
	}

	
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<br>
	<table width=780 border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td width="20"></td>
			<td>
				<!--contents-->
				<table width=590 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp; <b>게시판 -
								게시판 수정</b>
						</td>
					</tr>
				</table> <br> <!-- modify Form  -->
				<form name="f" method="post">
					<input type="hidden" name="pageno" value="<%=pageno%>" /> 
					<input type="hidden" name="boardno" value="<%=board.getBoardNo()%>" />
					<table border="0" cellpadding="0" cellspacing="1" width="590"
						bgcolor="BBBBBB">
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">제목</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10"><input
								type="text" style="width: 150" name="title"
								value="<%=board.getTitle()%>"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">작성자</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10"><input
								type="text" style="width: 150" name="writer"
								value="<%=board.getWriter()%>"></td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">내용</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10"><textarea
									name="content" style="width: 480" rows="15"><%=board.getContent()%></textarea>
							</td>
						</tr>
					

					</table>
				</form> <br>

				<table width=590 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td align=center><input type="button" value="수정"
							onClick="boardUpdate()"> &nbsp; <input type="button"
							value="리스트" onClick="boardList()"></td>
					</tr>
				</table>

			</td>
		</tr>
	</table>

</body>
</html>