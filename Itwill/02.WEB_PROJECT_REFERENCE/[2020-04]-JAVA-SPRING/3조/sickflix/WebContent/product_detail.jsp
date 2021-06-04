<%@page import="java.util.HashMap"%>
<%@page import="com.itwill.shop.product.Product"%>
<%@page import="com.itwill.shop.product.ProductService"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String p_no = request.getParameter("p_no");
	if (p_no == null || p_no.equals("")) {
		response.sendRedirect("product_list.jsp");
		return;
	}
	
	String msg=(String)request.getAttribute("msg");
	if (msg==null) msg="";
	   
	ProductService productService = new ProductService();
	HashMap productMap = productService.findOneProductWithGenre(Integer.parseInt(p_no));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/shop.css" type="text/css">
<style type="text/css" media="screen">
</style>
<script type="text/javascript">
	function buyDirect() {
		if (<%=session.getAttribute("sM_id") == null%>) {
			alert('로그인 하세요');
			location.href = 'member_login_form.jsp';
		}
		
		f.action = "jumun_direct_view.jsp";
		f.method='POST';
		f.submit();
	}
	
	function addCart() {
		if (<%=session.getAttribute("sM_id") == null%>) {
			alert('로그인 하세요');
			location.href = 'member_login_form.jsp';
		}
		
		f.action = "cart_add_action.jsp";
		f.method='POST';
		f.submit();
	}
	
</script>
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
									<td bgcolor="ED0000" height="22">&nbsp;&nbsp;<b><%=productMap.get("p_title")%></b></td>
								</tr>
							</table>
							<form name="f" method="post">
							<table style="margin-left: 10px" border=0 width=80% height=376
								align=center>
								<tr width=100%>
									<td rowspan="2"><img src="image/<%=productMap.get("p_image")%>"
										width="230" height="360" border="0">
									</td>
									<td width=50% height=200 align=center class=t1>
										<b><%=productMap.get("g_name")%> ｜  <%=productMap.get("p_runtime")%>
											    ｜  ★<%=productMap.get("p_rate")%></b><br> <br>
										<font color=#8C8C8C><%=productMap.get("p_desc") %></font>
									</td>
								</tr>
								<tr>
									<td align="center">
										<input type="button" value="바로구매" onClick="buyDirect()">
										<input type="button" value="카트에담기" onClick="addCart()" ><br>
											<font color="red"><%=msg%></font>
										<input type="hidden" name=p_no value="<%=productMap.get("p_no")%>">
									</td>
								</tr>
							</table>
							</form>
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