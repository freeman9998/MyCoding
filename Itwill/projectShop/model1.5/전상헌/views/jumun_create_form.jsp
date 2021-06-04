<%@page import="com.itwill.shop.product.ProductServiceImpl"%>
<%@page import="com.itwill.shop.product.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.cart.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.cart.CartServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
 <%
 String buyType=(String)request.getAttribute("buyType");
 
 int p_no=0;
 int p_qty=0;
 int tot=0;
 
 
 
 
if(buyType.equalsIgnoreCase("direct")){ 
 p_no=(int)(request.getAttribute("p_no"));
 p_qty=(int)(request.getAttribute("p_qty"));
}
 tot=(int)(request.getAttribute("tot"));
 List<Cart> cartList=(List<Cart>)request.getAttribute("cartList");

  %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>쇼핑몰 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/shop.css" type="text/css">
<style type="text/css" media="screen">
form > table tr td{
	border: 0.1px solid black;
}
</style>
<script src="js/projectShop.js">
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<!-- container start-->
	<div id="container">
		<!-- header start -->
		<div id="header">
			<!-- include_common_top.jsp start-->
			
<%@include file="include_common_top.jsp" %>

			<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->
			
	
<%@include file="include_common_left.jsp" %>

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
											주문/결제폼</b></td>
								</tr>
							</table> <!--form-->
							<form name="jumun_create_form" method="post">
								<input type="hidden" name="buyType" value="<%=buyType %>">
								<input type="hidden" name="p_no" value="<%=p_no %>">
								<input type="hidden" name="p_qty" value="<%=p_qty %>">
								<input type="hidden" name="tot" value=<%=tot %>>
							    <table align=center width=80% cellspacing=0
									bordercolordark=#FFFFFF bordercolorlight=#4682b4>
									<caption style="text-align: left;">구매자정보</caption>
									<tr>
										<td width=290 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>아이디</font></td>
										<td width=112 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>이름</font></td>
										<td width=166 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>이메일</font></td>
										<td width=50 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>비 고</font></td>
									</tr>
									<tr>
										<td width=290 height=26 align=center class=t1><%=user.getName() %></td>
										<td width=112 height=26 align=center class=t1><%=user.getUserid() %></td>
										<td width=166 height=26 align=center class=t1><%=user.getEmail() %></td>
										<td width=50 height=26 align=center class=t1></td>
									</tr>
								</table>
									
								<br/>	
								
								<table align=center  width=80% cellspacing=0
									bordercolordark=#FFFFFF bordercolorlight=#4682b4 >
									<caption style="text-align: left;">주문제품목록</caption>
									<tr style="border: 0.1px solid">
										<td width=290 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>이름</font></td>
										<td width=112 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>수 량</font></td>
										<td width=166 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>가 격</font></td>
										<td width=50 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>비 고</font></td>
									</tr>
									
									<!-- cart item start -->
									<%for(Cart cart:cartList){ %>
									<tr>
										<td width=290 height=26 align=center class=t1>
											<a href='product_detail.jsp?p_no=1'><%=cart.getProduct().getP_name() %></a>
										</td>
										<td width=112 height=26 align=center class=t1><%=cart.getCart_qty() %></td>
										<td width=166 height=26 align=center class=t1>
											<%=cart.getProduct().getP_price() %>
										</td>
										<td width=50 height=26 align=center class=t1></td>
									</tr>
									<!-- cart item end -->
									<%} %>
									
									
									<tr>
										<td width=640 colspan=4 height=26 class=t1>
											<p align=right>
												<font color=#FF0000>총 주문 금액 : 
												<%=new DecimalFormat("##.###").format(tot) %> 원
												</font>
											</p>
										</td>
									</tr>
								</table>
							</form> <br />
							<table border="0" cellpadding="0" cellspacing="1" width="590">
								<tr>
									<td align=center> &nbsp;&nbsp;
									<a href="javascript:jumun_create_form_submit();"
										class=m1>구매/결재하기</a>
										&nbsp;&nbsp;<a href=product_list.jsp
										class=m1>계속 쇼핑하기</a>

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
			
<%@include file="include_common_bottom.jsp" %>


			<!-- include_common_bottom.jsp end-->
		</div>
	</div>
	<!--container end-->
</body>
</html>