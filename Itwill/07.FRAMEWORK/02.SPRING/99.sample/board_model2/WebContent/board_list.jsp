<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="com.itwill.util.ListResultBean"%>
<%@page import="com.itwill.util.ListPageConfigBean"%>
<%@page import="com.itwill.board.BoardManager"%>
<%@page import="com.itwill.board.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.board.BoardDao"%>
<%@page contentType="text/html;charset=euc-kr"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>게시판</title>
<link rel=stylesheet href="./css/board.css" type="text/css">
<script language="JavaScript">
	function boardCreate() {
		location.href="board_write.jsp";
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
						<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp; <b>게시판-리스트</b>
						</td>
					</tr>
					<tr bgcolor="#FFFFFF" valign="middle">
						<td height="20" class="t1" align="right" valign="bottom">♠ 총
							<font color="#FF0000">${boardListPage.rowCount}</font> 건 | 현재페이지( <font
							color="#FF0000">${boardListPage.selectPageNo}</font> / <font
							color="#0000FF">${boardListPage.pageCount}</font> )
						</td>
					</tr>
				</table> <br> <!-- list -->
				<table border="0" cellpadding="0" cellspacing="1" width="590"
					bgcolor="BBBBBB">

					<tr>
						<td width=280 align=center bgcolor="E6ECDE">제목</td>
						<td width=120 align=center bgcolor="E6ECDE">글쓴이</td>
						<td width=120 align=center bgcolor="E6ECDE">글쓴날</td>
						<td width=70 align=center bgcolor="E6ECDE">본횟수</td>
					</tr>

					<!--Start For -->
					<c:forEach var="board" items="${boardList}">
					<tr>
						<td width=280 bgcolor="ffffff" style="padding-left: 10"><a
							href='view.do?boardno=${board.boardNo}&pageno=${pageno}'>${board.title}</a>
						</td>
						<!--getTitleString(board)-->
						<td width=120 align=center bgcolor="ffffff">${board.writer}
						</td>
						<td width=120 bgcolor="ffffff" style="padding-left: 10">${board.regDate}
						</td>
						<td width=70 align=center bgcolor="ffffff">${board.readCount}
						</td>
					</tr>
					</c:forEach>
                    <!--End For -->

				</table>
			    <!-- /list --> <br>
				<table border="0" cellpadding="0" cellspacing="1" width="590">
					<tr>
						<td align="center">

    <c:if test="${boardListPage.showFirst}">	
		<a href="list.do?pageno=1">◀◀</a>&nbsp;&nbsp;
    </c:if>
    
    <c:if test="${boardListPage.showPreviousGroup}">	
   <a href="list.do?pageno=${boardListPage.previousGroupStartPageNo}">◀</a>&nbsp;&nbsp;		
    </c:if>
    
  <!--Start For-->
  <c:forEach var="count" begin="${boardListPage.startPageNo}" end="${boardListPage.endPageNo}" step="1">
    <c:if test="${boardListPage.selectPageNo==count}">
		<font color='red'><strong>${boardListPage.selectPageNo}</strong></font>&nbsp;&nbsp;
	</c:if>
	
	<c:if test="${boardListPage.selectPageNo!=count}">
		<a href="list.do?pageno=${count}"><strong>${count}</strong></a>&nbsp;&nbsp;
    </c:if>
	
 </c:forEach>
 <!--End For -->
 
 <c:if test="${boardListPage.showNextGroup}">
 <a href="list.do?pageno=${boardListPage.nextGroupStartPageNo}">▶&nbsp;&nbsp;</a>
 </c:if>
 
 <c:if test="${boardListPage.showLast}">
	<a href="list.do?pageno=${boardListPage.pageCount}">▶▶</a>&nbsp;&nbsp;
 </c:if>

						</td>
					</tr>
				</table> <br> <!-- button -->
				<table border="0" cellpadding="0" cellspacing="1" width="590">
					<tr>
						<td align="right"><input type="button" value="게시물 생성" onclick="boardCreate();"/></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html>