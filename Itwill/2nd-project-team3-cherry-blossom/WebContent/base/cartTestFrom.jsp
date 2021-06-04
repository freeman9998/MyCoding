<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	List<Cart> cartList = CartService.getInstance().getCartList("itwill3");
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
	function cart_qty_update() {
		qty_update_form.action="cartModifyAction.jsp";
		qty_update_form.method="POST";
		qty_update_form.submit();
	}

</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	
	<form name="delete_cart_form"></form>
	
	<form name="view_cart_form">
		<input type="hidden" name="buyType" value="cart">
	</form>
	
	<!-- container start-->
	
	<div id="container">
		<!-- header start -->
		<div id="header">
			<!-- include_common_top.jsp start-->

			<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->

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
											장바구니 보기</b></td>
								</tr>
							</table> 
							<!--form-->
							<!-- 
							<form name="f" method="post">
							 -->
							<div id='f'>
							<table  align=center border=1 width=80% cellspacing=0
									bordercolordark=#FFFFFF bordercolorlight=#4682b4>
									<tr>
										
										<td width=250 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>상 품</font></td>
										<td width=112 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>수 량</font></td>
										<td width=166 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>가 격</font></td>
										<td width=50 height=25 bgcolor=#4682b4 align=center class=t1><font
											color=#FFFFFF>합 계</font></td>
									</tr>
									
									<!-- cart item start -->
									<%
									int tot_price = 0;
									for(Cart cart: cartList){
										tot_price += cart.getProduct().getP_price() * cart.getCart_qty();
									%>
									<tr>
										
										<td width=250 height=26 align=center class=t1><a href=''><%=cart.getProduct().getP_name() %></a></td>
										<td width=112 height=26 align=center class=t1>
											<form name="qty_update_form" method="post">
												<input type="text" name="cart_qty" value="<%=cart.getCart_qty() %>">		
												<input type="hidden" name="cart_no" value="<%=cart.getCart_no() %>">								
											</form>
										
										</td>
										<td width=166 height=26 align=center class=t1><%=cart.getProduct().getP_price()%></td>
										<td width=50 height=26 align=center class=t1><%=cart.getCart_qty()*cart.getProduct().getP_price() %>
											<form action="cartDeleteAction.jsp" method="post">
												<input type="hidden" name="cart_no" value="<%=cart.getCart_no()%>">
												<input type="submit" value="삭제">
											</form>
										</td>
									</tr>
									<% }%>
									<!-- cart item end -->
									
									
									
									
									<tr>
										<td width=640 colspan=5 height=26 class=t1>
											<p align=right>
												<form action="qty_modify">
													<input type="hidden" name="cart_no" value="">
												</form>
												<font color=#FF0000>총 금액 : <%=new DecimalFormat("#,##0").format(tot_price) %> 원
												</font>
											</p>
										</td>
									</tr>
								</table>
							
							</div>
							<!-- 
							</form> 
							 -->
							 
							<br />
							
							<table style="padding-left: 10px" border="0" cellpadding="0" cellspacing="1" width="590">
								<tr>
									<td align=center>&nbsp;&nbsp;
										<a href="javascript:cart_qty_update()" class=m1>수량수정</a>
										
										<a href="javascript:cart_delete();" class=m1>장바구니 비우기</a>&nbsp;&nbsp;
										<a href="product_list.jsp" class=m1>계속 구경하기</a> &nbsp;&nbsp;
										<a href="javascript:view_cart_form_submit();" class=m1>주문하기</a>
									
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

			<!-- include_common_bottom.jsp end-->
		</div>
	</div>
	<!--container end-->
</body>
</html>