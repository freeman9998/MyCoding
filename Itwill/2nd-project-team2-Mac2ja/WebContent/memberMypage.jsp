<%@page import="com.itwill.shop.service.OrdersService"%>
<%@page import="com.itwill.shop.domain.Orders"%>
<%@page import="com.itwill.shop.domain.Address"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Card"%>
<%@page import="com.itwill.shop.service.AddressService"%>
<%@page import="com.itwill.shop.service.CardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf"%>
<%@ include file="../include/head.jsp"%>
<%
	CardService cardService = new CardService();
	AddressService addressService = new AddressService();
	OrdersService ordersService = new OrdersService();
	
	List<Card> cardList = cardService.findCardByMembersNo(sMemberNo);
	List<Address> addressList = addressService.findAddressByNo(sMemberNo);
	List<Orders> orderList = ordersService.findOrderListById(sMemberNo);
	SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
%>
<script type="text/javascript">	
	function memberModifyForm() {
		document.modify.action="memberModifyForm.jsp";
		document.modify.method="POST";
		document.modify.submit();
	}
	
	function memberDeleteAction() {
		var delete_confirm=confirm("정말로 탈퇴 하시겠습니까?");
		
		if(delete_confirm==true){
			document.modify.action="memberDeleteAction.jsp";
			document.modify.method="POST";
			document.modify.submit();
		}
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
	<form name="modify"><input type="hidden" name="members_no" value="<%=sMemberNo%>"></form>
	<div id="content">
		<div class="mypagediv">
			<!-- 상단이미지 || 현재위치 -->
			<div class="atit">
				<p>마이페이지</p>
				<span class="path"><img src="./res/ico_home.gif" alt="HOME"
					style="cursor: pointer;"> <b>마이페이지</b>
					</span>
			</div>
		
			<!-- 최근 주문 정보 -->
			<div class="mplist">
				<div class="ordtitle">
					<span class="ordment"><span class="b_cate">최근 주문 정보</span></span> 
						<span class="ordlink"></span>
				</div>
				<div class="ordlistdiv" style="margin-bottom: 30px;">
					<form name="frmOrderList" method="post">
						<input type="hidden" name="mode"> <input type="hidden"
							name="ordno">
						<table class="ordlatelytbl" cellpadding="0" cellspacing="0"
							summary="최근 3건의 주문 정보">
							<caption>최근 3건의 주문 정보</caption>
							<colgroup>
								<col width="10%">
								<col width="15%">
								<col width="10%">
								<col width="12%">
								<col width="12%">
							</colgroup>
							<tbody>
								<tr>
									<th colspan="1">주문번호</th>
									<th colspan="3">주문내역</th>
									<th colspan="1">주문일시</th>
									<th colspan="1">주문금액</th>
								</tr>
								<%if(orderList.isEmpty()){ %>
								<tr>
									<td colspan="6" class="nodata">최근 주문한 내역이 없습니다.</td>
								</tr>
								<%}else{ %>
									<%for(Orders orders : orderList){ %>
									<tr>
										<td colspan="1"><%=orders.getOrders_no() %></td>
										<td colspan="3"><%=orders.getOrders_desc() %></td>
										<td colspan="1"><%=format1.format(orders.getOrders_date()) %></td>
										<td colspan="1"><%=orders.getOrders_price() %></td>
									</tr>
								<%}
									}%>
							</tbody>
						</table>
					</form>
				</div>
			</div>
			<!-- 최근 주문 정보 -->

			<!-- 등록된 카드 -->
			<div class="mplist">
				<div class="ordtitle">
					<span class="ordment"><span class="b_cate">등록된 카드</span></span> <span
						class="ordlink"></span>
				</div>
				<div class="ordlistdiv" style="margin-bottom: 30px;">
					<input type="hidden" name="cntqna" id="cntqna" value="0">
					<table class="ordlatelytbl" cellpadding="0" cellspacing="0"
						summary="최근 3건의 1:1문의">
						<caption>최근 3건의 1:1문의</caption>
						<colgroup>
							<col width="10%">
							<col width="15%">
							<col width="*">
							<col width="12%">
							<col width="12%">
						</colgroup>
						<tbody>
							<tr>
								<th colspan="2">카드이름</th>
								<th colspan="3">카드번호</th>
							</tr>
							<%if(cardList.isEmpty()){ %>
							<tr>
								<td colspan="5" class="nodata">등록된 카드가 없습니다.</td>
							</tr>
							<%}else{ %>
								<%for(Card card : cardList){
									if(card.getCard_number().length()>=15){
										StringBuffer stringBuffer = new StringBuffer();
										stringBuffer.append(card.getCard_number());
										stringBuffer.insert(4,"-");
										stringBuffer.insert(9,"-");
										stringBuffer.insert(14,"-");
								%>
							<tr>
								<td colspan="2"><%=card.getCard_name()%></td>
								<td colspan="3"><%=stringBuffer%></td>
							</tr>
								<%}else{%>
							<tr>
								<td colspan="2"><%=card.getCard_name()%></td>
								<td colspan="3"><%=card.getCard_number()%></td>
							</tr>
							<%}
								}
								  } %>
						</tbody>
					</table>
				</div>
				<!-- 등록된 카드끝 -->
				
				<!-- 등록된 주소 -->
			<div class="mplist">
				<div class="ordtitle">
					<span class="ordment"><span class="b_cate">등록된 주소</span></span> <span
						class="ordlink"></span>
				</div>
				<div class="ordlistdiv" style="margin-bottom: 30px;">
					<input type="hidden" name="cntqna" id="cntqna" value="0">
					<table class="ordlatelytbl" cellpadding="0" cellspacing="0"
						summary="최근 3건의 1:1문의">
						<caption>최근 3건의 1:1문의</caption>
						<colgroup>
							<col width="10%">
							<col width="15%">
							<col width="*">
							<col width="12%">
							<col width="12%">
						</colgroup>
						<tbody>
							<tr>
								<th colspan="2">주소명</th>
								<th colspan="3">상세주소</th>
							</tr>
							<%if(addressList.isEmpty()){ %>
							<tr>
								<td colspan="5" class="nodata">등록된 주소가 없습니다.</td>
							</tr>
							<%}else{%>
							<%for(Address address:addressList){ %>
								<tr>
									<td colspan="2"><%=address.getAddress_name() %></td>
									<td colspan="3"><%=address.getAddress_detail() %></td>
								</tr>
							<%}
								}%>
						</tbody>
					</table>
				</div>
				<!-- 등록된 주소끝 -->
				
					<!-- 회원 정보 수정 및 탈퇴 버튼 -->
				<div>
					<input type="button" onclick="memberDeleteAction()"
						style="width: 180px; background: #344336; color: #fff; display: inline-block; line-height: 20px; text-align: center; font-size: 20px; margin-right: 10px; cursor: pointer; float: right"
						value="회원 탈퇴">
					<input type="button" onclick="memberModifyForm();"
						style="width: 180px; background: #344336; color: #fff; display: inline-block; line-height: 20px; text-align: center; font-size: 20px; margin-right: 10px; cursor: pointer; float: right;"
					 	value="회원 정보 수정">
				</div>
			</div>
		</div>
	</div>
	
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>