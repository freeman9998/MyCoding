
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.shop.product.Product"%>
<%@page import="com.itwill.shop.product.ProductService"%>
<%@page import="java.text.DecimalFormat"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ProductService productService = new ProductService();
	ArrayList<HashMap> productList = productService.findProductsWithGenre(); 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Movies</title>
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
			<jsp:include page="include_common_top.jsp" />
			<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->
			<jsp:include page="include_common_left.jsp" />
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
									<td bgcolor="ED0000" height="22">&nbsp;&nbsp;<b>Movies</b></td>
								</tr>
							</table>

							<form name="f" method="post">
								<table width="100%" align="center" border="1" cellspacing="0"
									cellpadding="3" bordercolordark="white"
									bordercolorlight="#556b2f">
									<tr>
										<%
											for (int i = 0; i < productList.size(); i++) {
											DecimalFormat df = new DecimalFormat("#,##0");
										%>

										<td align="center" width="25%">
										<a href="product_detail.jsp?p_no=<%=productList.get(i).get("p_no") %>">
										<img src="image/<%=productList.get(i).get("p_image")%>" width="100" height="150"
										     border="0"></a><br /> <br />
											<b><%=productList.get(i).get("p_title")%></b><br>
											<b><%=productList.get(i).get("g_name")%> ｜  <%=productList.get(i).get("p_runtime")%>
											    ｜  ★<%=productList.get(i).get("p_rate")%></b><br>
											<font color="#EDD200">￦<%=df.format(productList.get(i).get("p_price"))%>
										</font></td>
										<%
												if ((i+1)%3 == 0) {
										%>
										</tr>
										<tr>
										<%
												}
											}
										%>
									</tr>
								</table>
							</form> <br /></td>
					</tr>
				</table>
			</div>
			<!-- include_content.jsp end-->
			<!-- content end -->
		</div>
		<!--wrapper end-->
		<div id="footer">
			<!-- include_common_bottom.jsp start-->
			<jsp:include page="include_common_bottom.jsp" />
			<!-- include_common_bottom.jsp end-->
		</div>
	</div>
	<!--container end-->
</body>
</html>