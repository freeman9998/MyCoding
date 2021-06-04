<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="com.itwill.shop.service.FoodService"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String priceOrder = request.getParameter("price_order");
String categoryNoStr = request.getParameter("category_no");
int categoryNo = Integer.parseInt(categoryNoStr);
List<Food> foodList = null;

FoodService foodService = new FoodService();

if(priceOrder==null || priceOrder.equals("name")){
	foodList = foodService.foodListByNameOrder(categoryNo);
}else if(priceOrder.equals("desc")){
	foodList = foodService.foodListByPriceOrderDesc(categoryNo);
}else if(priceOrder.equals("asc")){
	foodList = foodService.foodListByPriceOrderAsc(categoryNo);
}
if(foodList.isEmpty()){
	response.sendRedirect("mac_main.jsp");
}

%>

<!DOCTYPE html>
<html lang="ko">
<%@ include file="../include/head.jsp"%>
<body style="">

	<script type="text/javascript">
		function priceOrderDesc() {
			
			price_order_desc.action = 'productListView.jsp';
			price_order_desc.method = 'POST';
			price_order_desc.submit();
		}
		function priceOrderAsc() {
			
			price_order_asc.action = 'productListView.jsp';
			price_order_asc.method = 'POST';
			price_order_asc.submit();
		}
		function priceOrderName() {
			
			price_order_name.action = 'productListView.jsp';
			price_order_name.method = 'POST';
			price_order_name.submit();
		}
		
	</script>
	
	
	<form name="price_order_desc">
		<input type="hidden" name="price_order" value="desc">
		<input type="hidden" name="category_no" value="<%= categoryNo%>">
	</form>
	<form name="price_order_asc">
		<input type="hidden" name="price_order" value="asc">
		<input type="hidden" name="category_no" value="<%= categoryNo%>">
	</form>
	<form name="price_order_name">
		<input type="hidden" name="price_order" value="name">
		<input type="hidden" name="category_no" value="<%= categoryNo%>">
	</form>
	


	<%@ include file="../include/top.jsp"%>
	<div id="main">
		<div id="content">
			<style>
#main, #content {
	width: 100% !important;
}
#pos_scroll {
	position: absolute;
	top: 840px;
}
.listTopImg {
	position: relative;
	width: 100%;
	height: 220px;
	overflow: hidden;
}
.listTopImg img {
	position: absolute;
	top: 0;
	left: 50%;
	margin-left: -1000px;
}
</style>

			<script type="text/javascript">
				
			</script>

			<div class="listTopImg">
				<img src="./res/mac_bg.jpg">
			</div>


			<div class="indiv" style="width: 1100px; margin: 0 auto;">
				<!-- Start indiv -->

				<form name="frmOption_578">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="578"> <input
						type="hidden" name="ea" value="1">
				</form>

				<form name="frmOption_559">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="559"> <input
						type="hidden" name="ea" value="1">
				</form>

				<form name="frmOption_17">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="17"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_260">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="260"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_20">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="20"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_159">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="159"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_265">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="265"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_19">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="19"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_21">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="21"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_160">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="160"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_23">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="23"> <input
						type="hidden" name="ea" value="1">

				</form>

				<form name="frmOption_313">
					<input type="hidden" name="mode" value="addItem"> <input
						type="hidden" name="goodsno" value="313"> <input
						type="hidden" name="ea" value="1">

				</form>
				<form name="frmList">
					<input type="hidden" name="category" value="001001"> <input
						type="hidden" name="sort" value="goods_link.sort2"> <input
						type="hidden" name="page_num" value="18">

					<!-- 상단 카테고리 메뉴 -->
					<!-- 추천상품 -->




					<style>
body .pprice, body .pprice:hover {
	color: #c45c5a;
	font-size: 20px;
	font-family: "Noto Sans KR", 'Nanum Gothic', sans-serif;
}
.dcmark p {
	padding-right: 0;
	text-align: center;
}
</style>

					<!-- 품절상품 마스크 -->
					<div id="el-goods-soldout-image-mask"
						style="display: none; position: absolute; top: 0; left: 0; background: url(../data/goods/icon/custom/soldout_overlay) no-repeat center center;">
					</div>

					<UL class="prdList">


						<div class="totals">
							<p>
								총 <b><%=foodList.size() %>개의 상품이 있습니다. 
							</p>
							<div>
								<a href="javascript:priceOrderAsc();">낮은 가격순</a> 
								<a href="javascript:priceOrderDesc();">높은 가격순</a> 
								<a href="javascript:priceOrderName();">상품명순</a>
								
							</div>
						</div>
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tbody>
								<tr>
									<td style="padding: 15px 0">
										<style>
body .pprice, body .pprice:hover {
	color: #c45c5a;
	font-size: 20px;
	font-family: "Noto Sans KR", 'Nanum Gothic', sans-serif;
}
.dcmark p {
	padding-right: 0;
	text-align: center;
}
</style> <!-- 상품 리스트 -->


										<div class="listwrap">
											<table border="0" cellpadding="0" cellspacing="0"
												style=margin-left: auto; margin-right: auto; display:block;">
												<tbody>
													<tr>
														<%
														int i = 0;														
														for (Food food : foodList)
														{
															
															i++;
															if (i == 1 || i % 3 == 1) {
														%>
													
													<tr>
														<%
														}
														%>
														<td align="center" valign="top" class="number1">
															<div class="innerwrap">
																<!-- 할인율 -->
																<div class="gview1">
																	<div class="gooodimg"
																		style="margin-left: auto; margin-right: auto; display: block;">
																		<a href="productDetailView.jsp?Food_no=<%= food.getFoodNo() %>"> <img
																			src="./image/<%=food.getFoodImage()%>" width="60"
																			class="">
																		</a>
																	</div>
																	<div class="goodtxt"
																		style="text-align: left; word-break: break-all;">
																		<div style="margin-bottom: 10px;">
																			<a href="" style="font-size: 14px; color: #888;"><%=food.getFoodName() %></a>
																		</div>

																		<div style="padding-bottom: 20px;">
																			<a href="" class="pprice"><b
																				style="font-weight: 600;"><%=food.getFoodPrice() %></b><span
																				style="font-size: 16px; font-weight: 700;">원</span></a>
																		</div>
																	</div>
																</div>
															</div>
														</td>
														<%
														if (i % 3 == 0) {
														%>
													</tr>
													<%
													}
													%>
													<%
													}
													%>
													</tr>
												</tbody>
											</table>
										</div> <!-- 품절상품 마스크 -->
										<div id="el-goods-soldout-image-mask"
											style="display: none; position: absolute; top: 0; left: 0; background: url(../data/goods/icon/custom/soldout_overlay) no-repeat center center;">
										</div>
									</td>
								</tr>
							</tbody>
						</table>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>

</html>