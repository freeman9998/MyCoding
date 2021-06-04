<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@page import="com.itwill.shop.domain.OrdersDetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<%@ include file="../include/head.jsp"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.itwill.shop.domain.Orders"%>
<%@page import="com.itwill.shop.service.OrdersService"%>
<%@page import="java.util.Date"%>
<%@ include file="login_check.jspf" %>
<script type="text/javascript">
<%

OrdersService ordersService = new OrdersService();

HashMap<String,Object> order_map= new HashMap<>();
order_map.put("members_no", sMemberNo);
order_map.put("orders_no", request.getParameter("orders_no"));
Orders orders = ordersService.findOrderByOne(order_map);
SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
%>
	function location() {
		location.href="memberMypage.do";
	}
</script>
	<style rel="stylesheet" type="text/css">
.mypagediv .bold {
	font-weight: bold;
}

.mypagediv .mydtit {
	height: 25px;
	line-height: 25px;
}

.mplist {
	padding-bottom: 50px;
}

.mplist .mpsubtit {
	color: #636363;
	font-size: 14px;
}

.mplist .pink {
	color: #c45c5a;
}

.mplist .size14 {
	font-size: 14px;
}

.mplist .right {
	text-align: right;
}

.mplist .blue {
	color: #5385e0;
}

.mplist .w93 {
	width: 93px;
}

.mplist .w108 {
	width: 108px;
}

.mplist .ordlink button {
	background: #fff;
	border: 1px solid #C1C1C3;
	color: #707070;
	font-size: 11px;
	height: 20px;
}

.mplist .ordtitle {
	height: 20px;
	margin-bottom: 15px;
}

.mplist .ordtitle:after {
	content: "";
	display: block;
	clear: both;
	margin-bottom: 15px;
}

.mplist .ordment {
	float: left;
}

.mplist .ordlink {
	float: right;
}

.mplist table.ordlisttbl {
	width: 100%;
	border-top: 1px solid #333;
	font-size: 13px;
}

.mplist table.ordlisttbl caption {
	display: none;
}

.mplist table.ordlisttbl th {
	background: #f8f8f8;
	height: 39px;
	border-bottom: 1px solid #ccc;
	font-weight: 400;
}

.mplist table.ordlisttbl th:first-child {
	
}

.mplist table.ordlisttbl td {
	color: #777;
	height: 39px;
	border-bottom: 1px solid #ccc;
	text-align: center;
}

.mplist table.ordlisttbl td:first-child {
	
}

.mplist table.ordlatelytbl {
	margin-top: 15px;
	width: 100%;
	border-top: 1px solid #333;
	font-size: 13px;
}

.mplist table.ordlatelytbl caption {
	display: none;
}

.mplist table.ordlatelytbl th {
	background: #f8f8f8;
	height: 39px;
	border-bottom: 1px solid #ccc;
	font-weight: 400;
}

.mplist table.ordlatelytbl th:first-child {
	
}

.mplist table.ordlatelytbl td {
	color: #777;
	height: 39px;
	border-bottom: 1px solid #ccc;
	text-align: center;
}

.mplist table.ordlatelytbl td.right {
	text-align: right;
	padding-right: 14px;
}

.mplist table.slidetbl {
	width: 100%;
	margin-top: 15px;
	border-top: 1px solid #333;
	font-size: 13px;
	height: 200px;
}

.mplist table.slidetbl td.prev {
	vertical-align: top;
}

.mplist table.slidetbl td.prev .slidebtn {
	margin: 89px 0 0 10px;
}

.mplist table.slidetbl td.next {
	vertical-align: top;
}

.mplist table.slidetbl td.next .slidebtn {
	margin: 89px 10px 0 0;
}

.slidediv {
	margin-top: 30px;
}

.slidediv .rsize {
	width: 100px;
	height: 100px;
}

.sleft {
	text-align: left;
}

.stitle {
	text-align: left;
	padding: 5px 0px 2px 10px;
	max-width: 100px;
	word-break: break-all;
}

.sprice {
	text-align: left;
	padding-left: 10px;
	color: #C94C00;
	font-weight: bold;
}

.sdefault {
	text-align: left;
	padding-left: 10px;
}

#scrolling_latelySlide {
	margin-left: -10px;
}

.gray {
	color: #b5a5b5;
}

.gsnm {
	max-width: 100px;
	max-height: 20px;
	text-overflow: ellipsis;
	overflow: hidden;
	white-space: nowrap;
}

.nodata {
	text-align: center;
}

.nodata_div {
	height: 220px;
	border-top: 2px solid #303030;
	border-bottom: 1px solid #e5e5e5;
	text-align: center;
	line-height: 220px;
	color: #555;
	font-size: 12px;
}
</style>
<body style="">
	<%@ include file="../include/MyPagetop.jsp"%>
		<div id="content">
		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>주문 상세정보</p>
			<span class="path"><img src="./res/ico_home.gif" alt="HOME"
				style="cursor: pointer;"> <b>주문 상세정보</b></span>
		</div>
		<div style="border-bottom: 1px solid #ccc; padding-bottom: 65px; margin-bottom: 40px;">
					<p class="h4">
						주문정보확인 
					</p>
					
					<div style="height: 30px"></div>
					<table width="50%" cellpadding="0" cellspacing="0" border="0"
						class="intable">
						<tbody>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">주문번호
								</th>
								<!--(주소명을 불러온다)-->
								<td width=145 height=26 align=center class=t1><%=orders.getOrders_no() %></td>

							</tr>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">주문날자				
								</th>
								<!--(주소명을 불러온다)-->
								<td width=145 height=26 align=center class=t1><%=format1.format(orders.getOrders_date()) %></td>

							</tr>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">주문내역
								</th>
								<!--(주소명을 불러온다)-->
								<td width=145 height=26 align=center class=t1><%=orders.getOrders_desc() %></td>

							</tr>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">금액
								</th>
								<!--(주소명을 불러온다)-->
								<td width=145 height=26 align=center class=t1><%=orders.getOrders_price()%>원 </td>

							</tr>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">주문상품
								</th>
							</tr>
							<%for(OrdersDetail ordersDetail : orders.getOrdersdetailList()){ %>
							<% FoodService foodService = new FoodService();
							   Food food = foodService.findFoodByNo(ordersDetail.getFood_no());
							%>
							<tr>
								<th style="padding-left: 20px; color: #717071; font-weight: bold;">상품명 : <%=food.getFoodName() %></th>
								<th style="padding-left: 20px; color: #717071; font-weight: bold;">수량 : <%=ordersDetail.getOrders_detail_qty() %></th>
								<th style="padding-left: 20px; color: #717071; font-weight: bold;">금액 : <%=food.getFoodPrice()*ordersDetail.getOrders_detail_qty() %></th>
							</tr>
							<%} %>
						</tbody>
			</table>
			</div>
		</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>