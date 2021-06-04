<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.domain.Address"%>
<%@page import="com.itwill.shop.service.AddressService"%>
<%@page import="com.itwill.shop.domain.Members"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.MembersService"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %>
	
<%

	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("mac_main.jsp");
		return;
	}

CartService cartService = new CartService();
MembersService membersService = new MembersService();
FoodService foodService = new FoodService();
AddressService addressService = new AddressService();

List<Cart> cartList = cartService.findCartByMembersNo(sMemberNo);
Members members = membersService.findMembersByNo(sMemberNo);
List<Address> addressList = addressService.findAddressByNo(sMemberNo);
System.out.println(addressList);
if(addressList.isEmpty()){
	request.setAttribute("msg", "주소를 먼저 등록 후 주문해주세요!");
	RequestDispatcher rd = request.getRequestDispatcher("memberAddressForm.jsp");
	rd.forward(request, response);
}

%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">


<%@ include file="../include/head.jsp"%>
<body style="">
	 <%@ include file="../include/top.jsp"%>  

	<div id="content">

		<script type="text/javascript">
		function jumunComplete() {
			//window.location.href = 'jumunComplete.jsp';
			if(frmOrder.receiver_address.value==""){
				alert("배송지를 선택해주세요.");
				return;
			}
			frmOrder.action = 'jumun_create_action.jsp';
			frmOrder.method = 'POST';
			frmOrder.submit();
		}
		function historyback(){
			window.location.href = 'mac_main.jsp';
			
		}
		
		</script>
		
		<script id="delivery"></script>
		<script src="./res/jquery-ui.js.다운로드"></script>

		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>주문서작성</p>
			<span class="path"><img src="./res/ico_home.gif" alt="HOME"
				style="cursor: pointer;"> 주문서작성</span>
		</div>


		<div class="indiv" style="margin: 0">
			<!-- Start indiv -->
			<p style="font-size: 17px; margin-bottom: 10px; font-weight: 500;">주문할
				상품</p>


			<span style="display: none;" name="wp_detection" tag="i">578</span>
			<table cellpadding="0" cellspacing="0" border="0" width="100%"
				class="listtablen">
				<colgroup>
					<col width="100">
					<col>
					<col width="60">
					<col width="80">
					<col width="50">
					<col width="80">

				</colgroup>
				<thead>
					<tr>
						<th colspan="2">상품정보</th>
						<th>적립금</th>
						<th>판매가</th>
						<th>수량</th>
						<th>배송비</th>
						<th>합계</th>

					</tr>
				</thead>
				<tbody class="new_cart_list">

					<!-- Groobee Cart & Order Selector Script -->

					<!-- End of Groobee Cart & Order Selector Script -->


					<!-- WIDERPLANET CART SCRIPT START 2017.2.28 -->
					

					<script type="text/javascript">
						var wp_page_type = 'Cart';
					</script>
					<!-- // WIDERPLANET CART SCRIPT END 2017.2.28 -->

					<script type="text/javascript" charset="UTF-8"
						src="./res/kp.js.다운로드"></script>
					<script type="text/javascript">
						kakaoPixel('3696278984956819256').pageView();
						kakaoPixel('3696278984956819256').viewCart();
					</script>
					
					<% 
						int tot_price = 0;
						for (Cart cart: cartList) {
							Food food = foodService.findFoodByNo(cart.getFoodNo()); 
							tot_price = tot_price + (food.getFoodPrice()*cart.getCartQty());%>
					
					<tr>
						<input type="hidden" name="adultpro[]" value="0">
						<td align="center" style="padding: 10px 0;"><img
								src="./image/<%=food.getFoodImage() %>" width="70" >
						</td>
						<td>
							<div style="word-break: break-all; text-align: left;"><%=food.getFoodName() %></div>
						</td>
						<td align="center"></td>
						<td align="right" style="padding-right: 10px"><%=new DecimalFormat("#,###").format(food.getFoodPrice())%>원</td>
						<td align="center"><%=cart.getCartQty() %></td>
						<td align="center">
							<div id="el-default-delivery">기본배송</div>
						</td>


						<td align="right" style="padding-right: 10px"><%= new DecimalFormat("#,###").format(food.getFoodPrice()*cart.getCartQty())%>원</td>
						

					</tr>
					
					<%} %>
					<!-- Groobee Cart & Order Selector Script -->

					<!-- End of Groobee Cart & Order Selector Script -->


					<!-- WIDERPLANET CART SCRIPT START 2017.2.28 -->
					
					
					
					<!--  




					<script type="text/javascript">
						var wp_page_type = 'Cart';
					</script>
					<!-- // WIDERPLANET CART SCRIPT END 2017.2.28 -->
					<!--  
					<script type="text/javascript" charset="UTF-8"
						src="./res/kp.js.다운로드"></script>
					<script type="text/javascript">
						kakaoPixel('3696278984956819256').pageView();
						kakaoPixel('3696278984956819256').viewCart();
					</script>
					<tr>
						<input type="hidden" name="adultpro[]" value="0">
						<td align="center" style="padding: 10px 0;"><a
							href="http://www.zipbanchan.co.kr/shop/goods/goods_view.php?&amp;goodsno=578"><img
								src="./res/august_matboki_banchan_3.jpg" width="70"
								onerror="this.src='/shop/data/skin/mera_ws/img/common/noimg_100.gif'"></a>
						</td>
						<td>
							<div style="word-break: break-all; text-align: left;">8월 제철
								맛보기반찬 3종 - 500g</div>
						</td>
						<td align="center">149원</td>
						<td align="right" style="padding-right: 10px">14,900원</td>
						<td align="center">1개</td>
						<td align="center">
							<div id="el-default-delivery">기본배송</div>
						</td>
						


						<td align="right" style="padding-right: 10px">14,900원</td>.
						

					</tr>
					-->
			
			
			

				</tbody>


				<tfoot>
					<tr>
						<td colspan="10" style="border-bottom: none;">

							<table style="display: block; float: right;"
								class="ttotal total_order_list">
								<tbody>
									<tr>
										<th nowrap="">총 상품금액</th>
										<td><span id="el-orderitem-total-price">
										<%=new DecimalFormat("#,###").format(tot_price) %>원</span></td>
									</tr>

								</tbody>
							</table>

						</td>
					</tr>
				</tfoot>
			</table>

			<form id="frmOrder" name="frmOrder" action="" method="post"
				onsubmit="return chkForm2(this)">
				<!-- 01 주문자정보 -->
				<p
					style="font-size: 17px; margin-bottom: 10px; margin-top: 40px; font-weight: 500;">주문자
					정보</p>
				<div class="order_info">
					<dl>
						<dt>주문하시는 분</dt>
						<dd>
							<input type="text" name="nameOrder" value="<%= members.getMembers_name() %>"
								class="input_w296" readonly="readonly">
						</dd>
					</dl>
					
					<dl>
						<dt>핸드폰번호</dt>
						<dd>
							<input type="text" name="mobileOrder[]" class="input_w296"
								value="<%=members.getMembers_phone()%>"  readonly="readonly">
						<!--  
							<input type="" name="mobileOrder[]" class="input_w76"
								value="" size="4" maxlength="4" option="regNum" required=""
								label="주문자 핸드폰번호">&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;
							<input type="text" name="mobileOrder[]" class="input_w76"
								value="" size="4" maxlength="4" option="regNum" required=""
								label="주문자 핸드폰번호">
						-->
						</dd>
					</dl>
					
					<dl>
						<dt>이메일</dt>
						<dd>
							<input type="text" name="email" value="<%=members.getMembers_email() %>"
								class="input_w296" readonly="readonly" option="regEmail">
						</dd>
					</dl>
				</div>
				<!-- .order_info -->

				<!-- 02 배송정보 -->
				<p style="font-size: 17px; margin-bottom: 10px; font-weight: 500;">
					배송정보 <span style="color: #555; font-size: 13px;"><b
						style="color: #777; font-weight: normal;">*</b> 필수입력사항</span>
				</p>
				<div class="order_info delivery">

					<dl>
						<dt>
							배송 받으실분<span class="dot">*</span>
						</dt>
						<dd>
							<input type="text" name="receiver_name" class="input_w336 dark_gray" 
							value="<%= members.getMembers_name()%>" readonly="readonly">
						</dd>
					</dl>
					<dl>
						<dt>
							배송지 주소<span class="dot">*</span>
						</dt>
						<dd>
							<div >
								<select name="receiver_address" style="width:300px;">
									<option value="" selected disabled>주소선택</option>
									<% for(Address address:addressList){%>
										<option value="<%=address.getAddress_detail()%>">
										<%=address.getAddress_name()%></option>
									<%} %>
								</select>
							</div>


						</dd>
					</dl>

				</div>
				<!-- .order_info -->

				<!-- 04 결제금액 -->
				<p style="font-size: 17px; margin-bottom: 10px; font-weight: 500;">결제
					금액</p>
				<div class="order_info p_0 mb_0">
					<div class="order_total">
						<div class="order_total_left">
							<ul>
								<li>상품합계금액
									<p id="paper_goodsprice"><%=new DecimalFormat("#,###").format(tot_price) %>원</p>
									<input type="hidden" name="tot_price" value="<%=tot_price %>">
								</li>
								<li>배송비
									<div id="paper_delivery_msg1">
										<div id="paper_delivery" style="display: inline;"></div>
										0원
									</div>
									<div id="paper_delivery_msg2" style="display: none;"></div>
									<div id="paper_delivery_msg_extra" class="small red"
										style="display: none;"></div>
								</li>
								<li>회원 할인
									<div id="memberdc">0원</div>
								</li>
								<li>적립금
									<div class="emoney_txt">0</div>
								</li>
								<li>예치금
									<div class="point_txt">0</div>
								</li>
								<li>쿠폰 할인
									<div class="coupon_txt">0</div>
								</li>
							</ul>
						</div>
						<!-- .order_total_left -->

						<div class="order_total_right">
							<h2>총 결제 금액</h2>
							<span>=</span>
							<div id="paper_settlement" class="paper_settlement"><%=new DecimalFormat("#,###").format(tot_price) %></div>
							<span>원</span>
						</div>
						<!-- .order_total_right -->
					</div>
					<!-- .order_total -->
				</div>
				<!-- .order_info -->

				<div align="center" style="padding-bottom: 210px;">
					
						<img src="./res/btn_order_pay.gif"  onclick="jumunComplete()"
						style="vertical-align: top; border: none;">&nbsp; 
						<img src="./res/btn_order_back.gif" onclick="historyback()"
						style="cursor: pointer; vertical-align: top;">
					
				</div>
			</form>

		</div>
		<!-- End indiv -->
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>