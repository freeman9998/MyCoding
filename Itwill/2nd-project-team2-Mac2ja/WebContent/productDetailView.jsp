<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/head.jsp"%>
<% 


FoodService foodService = new FoodService();
String food_noStr = request.getParameter("Food_no");
if(food_noStr==null){
	response.sendRedirect("productListView.jsp");
	return;
}
int food_no = Integer.parseInt(food_noStr);
Food food = foodService.findFoodByNo(food_no);
%>
<script type="text/javascript">
	function cart_form(){
		document.frmView.method='POST';
		document.frmView.action='cart_add_action.jsp';
		document.frmView.submit();
	}
</script>
<body style="">

<%@ include file="../include/top.jsp"%>
<div id="content">
<script src="./res/countdown.js.다운로드"></script>
<style type="text/css">
.btn_nowbuy {
	letter-spacing: 0.1em;
	display: inline-block;
	height: 60px;
	line-height: 60px;
	text-align: center;
	color: #fff;
	width: 100%;
	box-sizing: border-box;
	font-size: 17px;
	font-weight: 500;
	background: #354436;
	padding: 0;
	margin: 0 auto;
}
/* goods_spec list */
#goods_spec table {
	width: 100%;
}
#goods_spec .sub {
	border-bottom: 1px solid #ccc;
	margin: 35px 0 10px 0;
}
#goods_spec th, #goods_spec td {
	padding: 7px 0;
}
#goods_spec th {
	width: 105px;
	text-align: left;
	font-weight: normal;
	font-size: 13px;
	color: #777;
}
#goods_spec td {
	text-align: left;
}
#pos_scroll {
	position: absolute;
	top: 315px;
}
.godo-tooltip-related {
	background: #000000;
	color: #ffffff;
}
body #side {
	width: 220px !important;
}
body #content {
	width: 880px !important;
}
</style>
<script type="text/javascript">
</script>
		
		<div class="atit" style="border: none; margin-top: 10px;">
			<p>&nbsp;</p>
			<span>
				<a href="main.do">
					<img src="./res/ico_home.gif" alt="HOME">
				</a>
			</span>
		</div>

		<div class="indiv" style="margin: 0;">
			<!-- Start indiv -->

			<!-- Groobee Selector Script -->
			<div class="groobeeProductDetail" style="display: none;">
				<span class="groobeeProductName"><%= food.getFoodName() %></span>
				<span class="groobeeProductPrice"><%= food.getFoodPrice() %></span>
				<span class="groobeeProductCode"><%= food.getFoodName() %></span>
				<span class="groobeeProductImage"> <img
					src="./image/<%=food.getFoodImage()%>" id="objImg"
					onerror="this.src='/shop/data/skin/mera_ws/img/common/noimg_100.gif'">
				</span> <span class="groobeeProductCategory"> <%= food.getCategory().getCategoryNo() %></span>
			</div>
			<!-- End of Groobee Selector Script -->


			<!-- 상품 이미지 -->
			<div style="margin: 0px auto 0px auto; overflow: hidden;">
				<div style="width: 50%; float: left;">
					<div style="padding-bottom: 10px;" class="detailimg">
						<span>
							<img src="./image/<%=food.getFoodImage()%>" width="300" id="objImg">
							<!--디테일뷰수정-->
						</span>
					</div>

				</div>

				<!-- 상품 스펙 리스트 -->
				<div id="goods_spec" style="width: 50%; float: left;">
					<!--디테일뷰수정-->
					<!--디테일뷰수정-->
					<form name="frmView" method="post">
						<input type="hidden" name="goodsname" value="<%= food.getFoodName() %>">
						<input type="hidden" name="goodsno" value="<%= food.getFoodNo() %>">
						<input type="hidden" name="goodsCoupon" value="0">
						<input type="hidden" id="sale_price" value="<%= food.getFoodPrice() %>">
						<input type="hidden" id="special_discount_amount" value="0">
						<div style="padding-bottom: 25px; border-bottom: 1px solid #333;" align="left">
							<b style="font-size: 32px; font-weight: 500;"><%= food.getFoodName() %></b>
						</div>

						<table border="0" cellpadding="0" cellspacing="0" class="top">
							<tbody>
								<tr>
									<td height="2"></td>
								</tr>
								<tr>
									<th>판매가격</th>
									<td><b><span id="price"
											style="font-size: 30px; font-weight: bold;"><%= food.getFoodPrice() %>원</span></b></td>
								</tr>
								<tr>
									<th style="vertical-align: top;">배송정보</th>
									<td style="font-size: 14px; color: #555; font-weight: 400;">하루특송
										: 서울 전지역<br>우체국택배 : 전국(도서지역 일부제외)<br>(자세한 사항은 배송안내를 참조하세요)<br> 
										<!--<span style="color:#c45c5a;">[화·수·목·금·토]</span>수령 가능한 상품입니다.-->
									</td>
								</tr>

								<tr>
									<th style="vertical-align: top;">배송비</th>
									<td style="font-size: 14px; color: #777;"><b
										style="color: #333; font-weight: 400; margin-top: 5px; display: block;">44,000원
											이상 구매시<br>우체국택배 무료, 새벽배송 무료<br>하루특송 2,900원
									</b> <b style="color: #555; font-weight: 400;"> <!--우체국택배 : 2,900원<br/>새벽배송 : 3,200원<br/>-->(여러
											카테고리 상품을 주문해도 배송비는 한 번만 부과됩니다.)<br>

									</b></td>
								</tr>


								<tr>
									<th>구매</th>
									<td>
										<input type="hidden" name="food_no"	value="<%= food.getFoodNo()%>">
										<div style="float: left;">
										
											<input type="text" name="ea" value="1" class="line"
												style="text-align: right; height: 29px; line-height: 29px; width: 46px; padding-right: 10px; border: 1px solid #ccc;"
												step="1" min="1" max="0"
												onblur="chg_cart_ea(frmView.ea,'set');chg_item_add_carc();">
										</div>
										<div style="float: left; margin-left: -1px;">
											<div>
												<img src="./res/btn_plus2.gif"
													onclick="chg_cart_ea(frmView.ea,'up');chg_item_add_carc();"
													style="cursor: pointer">
											</div>
											<div style="margin-top: -1px;">
												<img src="./res/btn_minus2.gif"
													onclick="chg_cart_ea(frmView.ea,'dn');chg_item_add_carc();"
													style="cursor: pointer">
											</div>
										</div>

										<div style="padding-left: 10px; float: left;" class="stxt">
										</div>
									</td>
								</tr>
							</tbody>
						</table>

						<div id="item_add_list">
							<ul>

							</ul>
						</div>



						<!-- 추가 옵션 입력형 -->
						<!-- 필수 옵션 일체형 -->
						<!-- 필수 옵션 분리형 -->

						<!-- 추가 옵션 -->
						<table border="0" cellpadding="0" cellspacing="0" class="sub">
						</table>

						<style type="text/css">
							.goods-multi-option {}
							.goods-multi-option table {}
							.goods-multi-option table td {}
						</style>
						<div id="el-multi-option-display" class="goods-multi-option">
							<table border="0" cellpadding="0" cellspacing="0">
								<colgroup>
									<col width="">
									<col width="50">
									<col width="80">
								</colgroup>
							</table>

							<div
								style="font-size: 15px; text-align: right; margin-bottom: 20px; font-weight: 500;">
								총 상품금액 &nbsp; <span
									style="color: #c45c5a; font-size: 30px; font-weight: bold;"
									id="el-multi-option-total-price"><%= food.getFoodPrice()%>원</span>
							</div>
						</div>
						<!-- / -->


						<!-- 각종 버튼 -->
						<div>

							<a href="javascript:cart_form();" id="cartBtn" onclick="cartbtn()">
								<img src="./res/btn_cart.gif">
							</a>

							<a href="" id="wishBtn" onclick="wishbtn()">
								<!--<img src="./res/Likeit.jpg">-->
							</a>
							
						</div>
						<div></div>
						<div></div>
						<div></div>
						<div></div>

					</form>
				</div>
			</div>

			<div style="clear: both; margin-top: 5px; display: block;">

				<div style="clear: both; margin-top: 5px; display: block;">
					<a id="dtab1"></a>
					<div class="detail_tab" stlye="margin: 0 auto">
						<ul>
							<li>상세설명</a></li>
						</ul>
					</div>
					<div id="contents" style="width: 100%; overflow: hidden;">
						<article id="product_detail">
							<h1 class="mt30">
								국내산<br>식재료를 사용합니다.<br>
							</h1>
							<div class="description">
								<br> 알레르기 정보 
								<br> <%= food.getFoodDesc() %>
							</div>
						</article>
					</div>

				</div>
			</div>
		</div>
		<%@include file="../include/boardListView.jsp" %>

	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>