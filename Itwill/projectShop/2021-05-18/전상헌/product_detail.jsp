<%@page import="com.itwill.shop.product.Product"%>
<%@page import="com.itwill.shop.product.ProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String p_noStr=request.getParameter("p_no");
	if(p_noStr==null){
		response.sendRedirect("product_list.jsp");
		return;
	}
	int p_no=Integer.parseInt(request.getParameter("p_no"));

	ProductService productService=new ProductService();
	Product product=productService.productDetail(p_no);
%>



	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>쇼핑몰</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/shop.css" type="text/css">
<style type="text/css" media="screen">
</style>

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
											상품상세보기</b></td>
								</tr>
							</table> <!-- 
							<form name="f" method="post">
							-->
							<table style="margin-left: 10px" border=0 width=80% height=376
								align=center>
								<tr valign=bottom>
									<td width=30% align=center class=t1><font size=2
										color=#0000FF><b>주문량</b></font></td>
									<td width=40% align=center class=t1><font size=2
										color=#0000FF><b>멍멍이 이름</b></font></td>
									<td width=30% align=center class=t1><font size=2
										color=#0000FF><b>멍멍이 소개</b></font></td>
								</tr>
								<tr width=100%>
									<td colspan=3 height=5><hr color=#556b2f></td>
								</tr>
								<tr width=100%>
									<td width=30% height=200 align=center class=t1>
										<form method="post" action="cart_add_action.jsp">
											수량 : <input type="number" name="cart_qty" id="cart_qty" value=1 min='1' max='10'
												class=TXTFLD > 마리 <br /> <br /> <input type=submit
												value=장바구니에담기 class=TXTFLD /> <input type="hidden"
												name=p_no value="<%=p_no %>">
										</form>
									</td>
									<td width=40% height=200 align=center><img border=0
										src='image/<%=product.getP_image() %>' width=120 height=200></td>
									<td width=30% height=200 class=t1>
										<ol type="disc">
											<li><b><%=product.getP_name() %>&nbsp;&nbsp;&nbsp;</b></li>
											<li><font color=#FF0000>가격 :
													<%=product.getP_price() %>&nbsp;&nbsp;&nbsp;</font></li>
											<li><font color=#0000FF><%=product.getP_desc() %></font></li>
										</ol>
									</td>
								</tr>
								<tr>
									<td colSpan=3 height=21><hr color=#556b2f></td>
								</tr>
							</table> <!-- 
							</form>
							-->
							<form name="buyFrm">
								<input type="hidden" name="p_no" value="<%=p_no%>"> <input
									type="hidden" name="p_qty" id="p_qty" value="1"> <input
									type="hidden" name="buyType" value="direct">
							</form>

							<table border="0" cellpadding="0" cellspacing="1">
								<tr>
									<td align=center><input type="button" value="주문하기[주문폼]"
										onClick="jumun_create_form();"> &nbsp; <input
										type="button" value="상품리스트" onClick="productList();"></td>
								</tr>
							</table></td>
					</tr>
				</table>
			</div>
			<script type="text/javascript">
	function jumun_create_form() {
			var qty=document.getElementById("cart_qty").value;
			document.getElementById("p_qty").value=qty;
			console.log(document.getElementById("p_qty").value);
			console.log(qty);
		
			document.buyFrm.method = 'POST';
			document.buyFrm.action = 'jumun_create_form.jsp';
			document.buyFrm.submit();
		
	}
	function productList() {
		location.href = 'product_list.jsp';
	}
</script>
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