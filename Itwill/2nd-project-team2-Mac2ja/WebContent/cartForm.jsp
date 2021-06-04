<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/head.jsp"%>
<%@ include file="login_check.jspf" %>

<%

	
	CartService cartService = new CartService();
	FoodService foodService = new FoodService();
	List<Cart> cartList = cartService.findCartByMembersNo(sMemberNo); 

	
%>
<script type="text/javascript">
	function cart_delete(){
		document.delete_cart_form.method='POST';
		document.delete_cart_form.action='cart_delete_action.jsp';
		document.delete_cart_form.submit();
	}
	function jumunForm_submit(){
		document.jumun_form.method='POST';
		document.jumun_form.action='jumunForm.jsp';
		document.jumun_form.submit();
	}
	function deleteCartItem(cartNo) {
		document.deleteItemform.cart_no.value=cartNo;
		document.deleteItemform.submit();
	}
</script>
<body style="">
	
	<form name="deleteItemform" action="cart_delete_item_action.jsp" method="post">
	<input type="hidden" name="cart_no" value="">
	</form>
	<form name="delete_cart_form"></form>
	<form name="jumun_form"></form>

	<%@ include file="../include/top.jsp"%>

	<div id="main">
		<div id="content">
			<style>
#pos_scroll {
	position: absolute;
	top: 315px;
}
</style>
			<script type="text/javascript">
					</script>

			<!-- 상단이미지 || 현재위치 -->
			<div class="atit">
				<p>장바구니</p>
				<span class="path"><img src="./res/ico_home.gif" alt="HOME"
					style="cursor: pointer;"> 장바구니</span>
			</div>


			<div class="indiv" style="margin: 0;">
				<!-- Start indiv -->
				<p style="margin-bottom: 35px;">
					<img src="">
				</p>
				<p style="font-size: 17px; margin-bottom: 10px;">장바구니 담긴 상품</p>

				<form name="frmCartCase" method="post">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value=""> <input
						type="hidden" name="goodsCoupon" value="0"> <input
						type="hidden" name="ea" value="">
				</form>

				<form name="frmCart" method="post">
					<input type="hidden" name="mode" value="modItem">
					<style media="screen">
table.orderitem-list {
	width: 100%;
}

table.orderitem-list thead tr th {
	border-top: 2px solid #303030;
	border-bottom: 1px solid #d6d6d6;
	background: #f0f0f0;
	height: 25px;
}

table.orderitem-list tbody tr td {
	border-bottom: 1px solid #d6d6d6;
	padding: 3px;
}

table.orderitem-list tbody tr td table td {
	border: none;
}

table.orderitem-list tfoot tr td {
	border-bottom: 1px solid #efefef;
	background: #f7f7f7;
	height: 25px;
	text-align: right;
}

table.orderitem-list tfoot tr td table td {
	border: none;
}

.ttotal td {
	border: none;
	text-align: right;
	font-size: 15px;
	padding-right: 30px;
}

.ttotal th {
	font-size: 15px;
	text-align: right;
	padding-right: 25px;
	width: 200px;
	background: none;
	border: none;
}

.cover_info td {
	border: none;
	text-align: left;
	padding: 3px 10px 5px 10px;
}

.goods-list-item .goods-list-chk {
	width: 20px;
	height: 80px;
	margin-top: 15px;
	line-height: 80px;
	vertical-align: middle;
}

.goods-list-item .goods-list-chk input[type=checkbox] {
	width: 15px;
}

.goods-list-item .goods-list-img {
	width: 90px;
	text-align: left;
}

.goods-list-item .goods-list-img img {
	width: 80px;
	height: 80px;
	border: solid 1px #dbdbdb;
}

.goods-list-item .goods-list-info {
	margin-left: 10px;
	width: auto;
}

.goods-list-item .goods-list-info .goods-nm {
	color: #222222;
	font-weight: bold;
	font-size: 13px;
	margin-bottom: 5px;
	padding-right: 55px;
	box-sizing: border-box;
}

.goods-list-item .goods-list-info .goods-option {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-price {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-price .red {
	color: #f03c3c;
	font-size: 12px;
	font-weight: bold;
}

.goods-list-item .goods-list-info .goods-dc {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-dc .blue {
	color: #436693;
	font-size: 12px;
	font-weight: bold;
}

.goods-list-item .goods-list-info .goods-reserve {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-delivery {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-ea {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.goods-list-item .goods-list-info .goods-nvmileage {
	color: #666666;
	font-size: 12px;
	margin-bottom: 2px;
}

.riha_slide {
	position: relative;
}

.riha_slide h2 {
	font-size: 17px;
	font-weight: normal;
}

.riha_slide .btn_slide {
	position: absolute;
	top: 50%;
	cursor: pointer;
}

.riha_slide .btn_slide_left {
	left: 20px;
}

.riha_slide .btn_slide_right {
	right: 20px;
}

.riha_slide .slide_area {
	width: 1057px;
	overflow: hidden;
	position: relative;
}

.riha_slide .slide_area ul {
	overflow: hidden;
	border-left: 1px solid #ddd;
}

.riha_slide .slide_area ul li {
	float: left;
	width: 351px;
	border: 1px solid #ddd;
	margin: 0;
	margin-left: -1px;
}

.riha_slide .slide_area ul li h4 {
	margin: 0px;
	padding-bottom: 0;
	height: 20px;
	font-size: 16px;
	font-weight: normal;
}

.riha_slide .slide_area ul li h3 {
	font-size: 16px;
	margin-top: 5px;
	font-weight: normal;
}

.riha_slide .slide_area ul li .info {
	margin-top: 20px;
}

.riha_slide .slide_area ul li .info span {
	font-size: 16px;
	color: #000;
	font-weight: bold;
}

.riha_slide .slide_area ul li .info .btn_area {
	float: right;
}

.riha_slide .slide_area ul li .info .btn_area input[type=text] {
	width: 30px;
	height: 23px;
	line-height: 23px;
	text-align: center;
	margin: 0;
	padding: 0;
	border: 1px solid #ddd;
	border-right: none;
	border-left: none;
	vertical-align: top;
	float: left;
}

.riha_slide .slide_area ul li .info .btn_area a {
	display: inline-block;
	width: 23px;
	height: 23px;
	line-height: 23px;
	text-align: center;
	border: 1px solid #ddd;
	float: left;
	background: #f5f5f5;
	font-size: 16px;
}

.riha_slide .slide_area ul li .info .btn_area input[type=button] {
	height: 25px;
	line-height: 22px;
	background: #364437;
	border: 1px solid #364437;
	color: #fff;
	padding: 0 15px;
}

.calc_order {
	overflow: hidden;
	border-top: 1px solid #333;
	margin-top: 50px;
}

.calc_order div {
	width:550px;
	float: left;
	border-left: 1px dashed #ddd;
	margin-left: -1px;
	background: #f5f5f5;
	text-align: center;
	padding: 50px 0;
	font-size: 20px;
	color: #333;
	font-weight: bold;
	position: relative;
}

.calc_order div span.desc {
	font-size: 14px;
	font-weight: normal;
}

.calc_order div span.icon {
	display: block;
	width: 40px;
	height: 40px;
	background: #364437;
	color: #fff;
	border-radius: 50%;
	position: absolute;
	right: -20px;
	top: 57px;
	z-index: 9999;
	text-align: center;
	line-height: 35px;
	font-size: 35px;
	font-weight: normal;
}

.calc_order div:last-child {
	width: 1061px;
	text-align: right;
	padding: 10px 20px;
	margin: 0;
	border: none;
	border-top: 1px solid #ddd;
	border-bottom: 1px solid #ddd;
	background: #eaeaea;
	font-size: 16px;
	color: #364437;
}

.calc_order div:last-child span {
	font-weight: normal;
	padding: 50px 0;
	font-size: 20px;
	color: #333;
	font-weight: bold;
	position: relative;
}
</style>




					<div class="groobeeProductList" style="display: none;">
						<a
							href="http://www.zipbanchan.co.kr/shop/goods/goods_view.php?&amp;goodsno=560"
							class="groobeeProductA"></a> <span class="groobeeProductName">특별반찬
							4종 - 310g</span> <span class="groobeeProductCount">1</span> <span
							class="groobeeProductPrice">13,900</span> <span
							class="groobeeProductImage"><img
							src="./res/special_banchan_4.jpg" width="100"
							onerror="this.src=&#39;/shop/data/skin/mera_ws/img/common/noimg_100.gif&#39;"></span>
					</div>
					<span style="display: none;" name="wp_detection" tag="i">560</span>
					<table cellpadding="0" cellspacing="0" border="0" width="100%"
						class="listtablen">
						<colgroup>
							<col width="50">
							<col width="100">
							<col>
							<col width="60">
							<col width="80">
							<col width="50">
							<col width="80">
							<col width="60">

						</colgroup>
						<thead>
							<tr>
								<th></th>
								<th colspan="2">상품정보</th>
								<th>판매가</th>
								<th>수량</th>
								<th>배송비</th>
								<th>합계</th>
								<th></th>

							</tr>
						</thead>
						<tbody class="new_cart_list">

							<!-- Groobee Cart & Order Selector Script -->

							<!-- End of Groobee Cart & Order Selector Script -->


							<!-- WIDERPLANET CART SCRIPT START 2017.2.28 -->

							<script type="text/javascript">var wp_page_type = 'Cart';</script>
							<!-- // WIDERPLANET CART SCRIPT END 2017.2.28 -->

							<script type="text/javascript" charset="UTF-8"
								src="./res/kp.js.다운로드"></script>
							<script type="text/javascript">
									</script>
							
					
							
							<% 
							int tot_price = 0;
							for (Cart cart: cartList) {
								Food food = foodService.findFoodByNo(cart.getFoodNo()); 
								tot_price = tot_price + (food.getFoodPrice()*cart.getCartQty());%>
								
							
							<tr>
								<input type="hidden" name="adultpro[]" value="0">
								<td align="center"><input type="checkbox" name="idxs[]"
									value="<%=cart.getFoodNo() %>" data-goodsno="<%=cart.getFoodNo() %>" 
									onclick="nsGodo_CartAction.recalc();"></td>
								<td align="center" style="padding: 10px 0;"><a
									href="">
									<img src="./image/<%=food.getFoodImage() %>" width="70"
										onerror=""></a>
								</td>
								<td>
									<div style="word-break: break-all; text-align: left;"><%=food.getFoodName() %></div> 

								</td>
								<td align="right" style="padding-right: 10px"><%=new DecimalFormat("#,###").format(food.getFoodPrice()) %>원</td>
								<td align="center">
									<table cellpadding="0" cellspacing="0" border="0">
										<tbody>
											<tr>
											
												<td style="border: none;">
												<input type="text"
													name="food_qty[0]" step="1" min="1" max="0" 
													value="<%=cart.getCartQty() %>" 
													readonly
													style="text-align: right; height: 25px; line-height: 25px; border: 1px solid #ccc; width: 28px; padding-right: 10px;"
													onkeydown="onlynumber()"
													onblur="chg_cart_ea(this,&#39;set&#39;)"></td>
									<!--  
												<td style="border: none;">
													<div style="margin-left: -1px;">
														<img src="./res/btn_plus.gif"
															onclick="chg_cart_ea(frmCart[&#39;ea[0]&#39;],&#39;up&#39;,0)"
															style="cursor: pointer">
													</div> <img src="./res/btn_minus.gif"
													onclick="chg_cart_ea(frmCart[&#39;ea[0]&#39;],&#39;dn&#39;,0)"
													style="cursor: pointer; margin: -1px 0 0 -1px;">
												</td>
												
												<td style="border: none;"><input type="submit"
													value="수정"
													style="margin: 0px 0 0 2px; cursor: pointer; width: 38px; height: 30px; background: #868686; border: none; color: #fff;">
												</td>
									-->
											</tr>
										</tbody>
									</table>
								</td>
								
								
								<td align="center">
									<div id="el-default-delivery">기본배송</div>
								</td>
<!--    주석               -->

								<td align="right" style="padding-right: 10px"><%=new DecimalFormat("#,###").format(food.getFoodPrice()*cart.getCartQty()) %>원
									<!--  <a href="javascript:cart_delete();"
									style="font-size: 14px; float: right;">X</a>
									-->
								
								</td>
								
								<td align="center">
								 <input type="button" onclick="deleteCartItem('<%=cart.getCartNo() %>');" value="삭제">
								</form>
								</td>

							</tr>
							 <% } %>
							<script></script>

						</tbody>



						<tbody>


							<tr>
								<td colspan="10" style="text-align: left; border: none;">
									<div style="padding: 5px; padding-left: 20px;">
										<input type="checkbox" id="cart_select_all" 
											onclick="chkBox(&#39;idxs[]&#39;,&#39;rev&#39;);nsGodo_CartAction.recalc();">
										<label for="cart_select_all">전체선택</label> (<span
											id="el-orderitem-selected">1</span>/1) 
											<a
											href="javascript:cart_delete();"
											onclick="nsGodo_CartAction.del();return false;"
											onfocus="blur()"
											style="border: 1px solid #aaa; padding: 5px 10px; display: inline-block;">전체상품삭제</a>
									</div>
								</td>
							</tr>




							<tr>
								<td colspan="10" style="text-align: left; border: none;">


									<div class="calc_order">
										<div>
											<span class="desc">상품합계</span><br> <span
												id="el-orderitem-total-price">
												
												<%=new DecimalFormat("#,###").format(tot_price) %>원</span>
										</div>
										 <!--
										<div>
											<span class="desc">우체국택배 / 새벽배송</span><br> <span
												id="el-orderitem-delivery-price">무료</span>
										</div>
										
										<div>
											<span class="desc">무료배송을 위한 추가금액</span><br> <span
												id="el-orderitem-price">0</span>원
										</div>
										
										<div>
											<span>*단 하루특송은 배송비가 발생합니다.</span>
										</div>
										 -->
									</div>
								</td>
							</tr>

						</tbody>




					</table>



				</form>




				<table width="100%" cellpadding="0" cellspacing="0" border="0"
					style="margin-top: 30px;">
					<tbody>
						<tr>
							<td align="center"><a href="javascript:jumunForm_submit();" onfocus="blur()">
									<!--<img src="/shop/data/skin/mera_ws/img/common/btn_check_order.gif" border=0>-->
									<span
									style="display: inline-block; background: #364437; color: #fff; font-weight: bold; width: 200px; line-height: 45px;">주문하기</span>
							</a></td>
						</tr>
					</tbody>
				</table>
				<div align="center"></div>
				<div align="center"></div>
				<div align="center"></div>

			</div>
			<!-- End indiv -->
			<div style="height: 100px;"></div>


		</div>
		<!-- #content -->
	</div>
	<!-- #container -->

	<%@ include file="../include/bottom.jsp"%>
</body>
</html>