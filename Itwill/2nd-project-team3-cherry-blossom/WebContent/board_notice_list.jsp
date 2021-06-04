<%@page import="com.itwill.shop.util.notice.BoardListPageDto"%>
<%@page import="com.itwill.shop.util.notice.PageInputDto"%>
<%@page import="java.awt.print.Book"%>
<%@page import="com.itwill.shop.domain.Board"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="login_check.jspf" %>
<%
	//1.요청페이지번호
	String pageno = request.getParameter("pageno");
	if(pageno==null||pageno.equals("")){
		pageno="1";
	}
	//2.한페이지에표시할 게시물수
	int rowCountPerPage = 10;
	//3.한화면에보여줄 페이지번호갯수( 1 2 3 4 5 6 7 8 9 10 ▶ ▶▶)
	int pageCountPerPage = 10;
	//페이징(계산)을위한 dto ,vo
	PageInputDto pageInputDto=
		new PageInputDto(rowCountPerPage,pageCountPerPage,pageno,"","");
	
	BoardListPageDto boardListPage
	 	= BoardService.getInstance().findBoardList(pageInputDto);
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template" />
    <meta name="description" content="Flexor - E-commerce HTML5 Template" />
    <meta name="author" content="potenzaglobalsolutions.com" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cherry Blossom</title>
	
    <!-- Favicon -->
    <link rel="shortcut icon" href="images/favicon.ico" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Heebo:100,300,400,500,700,800,900&display=swap" rel="stylesheet">

    <!-- CSS Global Compulsory (Do not remove)-->
    <link rel="stylesheet" href="css/font-awesome/all.min.css" />
    <link rel="stylesheet" href="css/flaticon/flaticon.css" />
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />

  </head>
  <body>

    <!--=================================
    Header -->
  	<jsp:include page="include_common_top.jsp"/>
    <!--=================================
    Header -->
	<main>
		<br/>
		<br/>
		<br/>
		<br/>
		<div class="container" >
			<h1 align="center">NOTICE</h1>
			<br/>
			<br/>
			<ul class = "list-group">
			<li class="list-group-item d-flex justify-content-between align-items-center">
		      <span class="no" >번호</span>
		      <span class="title">제목</span>
		      <span class="customer">작성자</span>
		      <span class="date">작성일</span>  
		      <span class="count">조 회</span>    
		    </li>
		    <!-- 고객 리스트  -->
		    <%for(Board board : boardListPage.getList()) {%>
		    	 <li class="list-group-item d-flex justify-content-between align-items-center">
		    		<span calss="no"><%=board.getB_no()%></span>
		    		<span calss="title"><a style="color:#555555;" href='board_notice_view.jsp?b_no=<%=board.getB_no()%>&pageno=<%=boardListPage.getSelectPageNo()%>'><%=board.getB_title()%></a></span>
		    		<span calss=customer><%=board.getUserInfo().getUser_id()%></span>
		    		<span calss="date"><%=board.getB_date()%></span>
		    		<span calss="date"><%=board.getB_count()%></span>
		    	</li>
		    <%} %>
			</ul>
		</div>
		<table border="0" cellpadding="0" cellspacing="1" width="590">
								<tr>
									<td align=right>
										<%if (boardListPage.isShowFirst()) {%> 
											<a href="./board_notice_list.jsp?pageno=1">◀◀</a>&nbsp; 
										<%}%> 
										<%if (boardListPage.isShowPreviousGroup()) {%>
											<a href="./board_notice_list.jsp?pageno=<%=boardListPage.getPreviousGroupStartPageNo()%>">◀</a>&nbsp;&nbsp;
										<%}%>
										<%
										 	for (int i = boardListPage.getStartPageNo(); i <= boardListPage
										 			.getEndPageNo(); i++) {
										 	if (boardListPage.getSelectPageNo() == i) {
										%>
										 <font color='red'><strong><%=i%></strong></font>&nbsp;
										<%} else {%>
										<a href="./board_notice_list.jsp?pageno=<%=i%>"><strong><%=i%></strong></a>&nbsp;
										<%
										   }
										  }%>
										   <%
											 	if (boardListPage.isShowNextGroup()) {
											%> <a href="./board_notice_list.jsp?pageno=<%=boardListPage.getNextGroupStartPageNo()%>">▶&nbsp;</a>
										<%
											}
										%> 
										<%
											if (boardListPage.isShowLast()) {
										%> <a href="./board_notice_list.jsp?pageno=<%=boardListPage.getTotalPageCount()%>">▶▶</a>&nbsp;
										<%
											}
										%>
									</td>
								</tr>
						</table>
		<br/>
		<br/>
		<br/>
	</main>
	
   
<footer>
	<jsp:include page="include_common_bottom.jsp"/>
</footer>
    <!-- Javascript -->

    <!-- JS Global Compulsory (Do not remove)-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
    <script src="js/jarallax/jarallax.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>