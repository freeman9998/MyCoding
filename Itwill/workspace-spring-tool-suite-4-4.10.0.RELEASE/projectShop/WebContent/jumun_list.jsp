<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sUserId=(String)session.getAttribute("sUserId");
	if(sUserId==null){
		response.sendRedirect("shop_main.jsp");
		return;
		
	}
%>
<%
	

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>쇼핑몰 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/shop.css" type="text/css">
<style type="text/css" media="screen">
</style>
<script type="text/javascript">

</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<!-- container start-->
	<div id="container">
		<!-- header start -->
		<div id="header">
			<!-- include_common_top.jsp start-->
			
<h1>
	<a href="">WEB SAMPLE SITE</a>
</h1>

			<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->
			
	
	
	
<script type="text/javascript">
	function login_message() {
		alert('로그인하세요');
		location.href = 'user_login_form.jsp';
	}
</script>
<p>
	<strong>메 뉴</strong>
</p>
<ul>
		
		<li><a href="user_view.jsp">guard1님</a>&nbsp;<a href="user_logout_action.jsp">로그아웃</a></li>
		<li><a href=""></a></li>
		<li><a href="cart_view.jsp">장바구니</a></li>
		<li><a href="jumun_list.jsp">주문목록</a></li>
	
		<li><a href="product_list.jsp">상품리스트</a></li>
		<li><a href=""></a></li>
		<li><a href="board_list.jsp">게시판리스트</a></li>
		<li><a href="board_write_form.jsp">게시판쓰기</a></li>
		
</ul>

			<!-- include_common_left.jsp end-->
		</div>
		<!-- navigation end-->
		<!-- wrapper start -->
		<div id="wrapper">
			<!-- content start -->

			<!-- include_content.jsp start-->
			<div id="content">
				<table border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td><br />
							<table style="padding-left: 10px" border=0 cellpadding=0
								cellspacing=0>
								<tr>
									<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>쇼핑몰 -
											주문 목록</b></td>
								</tr>
							</table> <!--form-->
							<form name="f" method="post">
								<table align=center border=1 width=80% cellspacing=0
									bordercolordark=#FFFFFF bordercolorlight=#4682b4>
									<tr>
										<td width=145 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>주문번호</font></td>
										<td width=145 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>주문이름</font></td>
										<td width=112 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>주문날짜</font></td>
										<td width=136 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>주문가격</font></td>
										<td width=80 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF></font></td>
									</tr>
									
									<!-- jumun item start -->
									
									<tr>
										<td width=145 height=26 align=center class=t1>11</td>
										<td width=145 height=26 align=center class=t1>퍼그외 2 종</td>
										<td width=112 height=26 align=center class=t1>2021/03/08</td>
										<td width=136 height=26 align=center class=t1>
											2,550,000</td>
										<td width=80 height=26 align=center class=t1><a
											href="jumun_detail.jsp?j_no=11" class=m1>주문상세</a></td>
									</tr>
									
									<tr>
										<td width=145 height=26 align=center class=t1>12</td>
										<td width=145 height=26 align=center class=t1>퍼그외 1 종</td>
										<td width=112 height=26 align=center class=t1>2021/03/08</td>
										<td width=136 height=26 align=center class=t1>
											400,000</td>
										<td width=80 height=26 align=center class=t1><a
											href="jumun_detail.jsp?j_no=12" class=m1>주문상세</a></td>
									</tr>
									
									<!-- jumun item end -->
									
									
									
									
								</table>
							</form> <br />
							<table border="0" cellpadding="0" cellspacing="1" width="590">
								<tr>
									<td align=center>&nbsp;&nbsp;<a href=product_list.jsp
										class=m1>계속 구경하기</a> 

									</td>
								</tr>
							</table></td>
					</tr>
				</table>
			</div>
			<!-- include_content.jsp end-->
			<!-- content end -->
		</div>
		<!--wrapper end-->
		<div id="footer">
			<!-- include_common_bottom.jsp start-->
			
	<p align="center">Copyright (&copy;) By Java Class 5. All
		rights reserved.</p>

			<!-- include_common_bottom.jsp end-->
		</div>
	</div>
	<!--container end-->
</body>
</html>