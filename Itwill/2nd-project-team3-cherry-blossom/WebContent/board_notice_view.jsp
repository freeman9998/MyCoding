<%@page import="com.itwill.shop.domain.Board"%>
<%@page import="com.itwill.shop.service.BoardService"%>
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Guard.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="login_check.jspf" %>
<%
	request.setCharacterEncoding("UTF-8");
	String b_no = request.getParameter("b_no");
	if(b_no.equals("") || b_no == null){
		response.sendRedirect("board_notice_list.jsp");
		return;
	}
	Board board = BoardService.getInstance().boardSelectOne(Integer.parseInt(b_no));
	if(board==null){
		response.sendRedirect("board_notice_list.jsp");
		return;
	}
	BoardService.getInstance().updateViewCnt(Integer.parseInt(b_no));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
			<hr>
			<table>
				<tbody>
					<tr>
						<th scope="row">제목&emsp;&emsp;<%=board.getB_title()%></th>
					</tr>
					<tr> 
						<th scope="row">작성자&emsp;&emsp;<%=board.getUserInfo().getUser_id()%></th>
					</tr>
									
					<tr>
						<th scope="row">작성일&emsp;&emsp;<%=board.getB_date()%></th>
					</tr>
					<tr>
						<th scope="row">조회수&emsp;&emsp;<%=board.getB_count()%></th>
					</tr>
				</tbody>
			</table>
			 <hr>
			 <table>
			 	<tbody>
			 		<!-- 					글내용 -->
					<tr class="view"> 
						<td colspan="2">
							<div class="detail">
								<div class="Content">
									<%=board.getB_content()%>
								</div>
							</div>
						</td>
					</tr>
			 	</tbody>
			 </table>
			 <hr>
			 <div class="board_notice_list_go" align="right">
			 	<span class="right" >
			 		<a href="board_notice_list.jsp" style="color: black;">목록</a>
			 	</span>
			 </div>
		</div>
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