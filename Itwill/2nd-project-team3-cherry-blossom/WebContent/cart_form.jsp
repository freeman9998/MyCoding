<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="login_check.jspf" %>
<%
	List<Cart> cartList = CartService.getInstance().getCartList(sUserId);
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="keywords" content="HTML5 Template" />
<meta name="description" content="Flexor - E-commerce HTML5 Template" />
<meta name="author" content="potenzaglobalsolutions.com" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Cherry Blossom</title>

<!-- Favicon -->
<link rel="shortcut icon" href="images/favicon.ico" />

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css?family=Heebo:100,300,400,500,700,800,900&display=swap"
	rel="stylesheet">

<!-- CSS Global Compulsory (Do not remove)-->
<link rel="stylesheet" href="css/font-awesome/all.min.css" />
<link rel="stylesheet" href="css/flaticon/flaticon.css" />
<link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />

<!-- Page CSS Implementing Plugins (Remove the plugin CSS here if site does not use that feature) -->
<link rel="stylesheet" href="css/select2/select2.css" />
<link rel="stylesheet" href="css/range-slider/ion.rangeSlider.css" />

<!-- Template Style -->
<link rel="stylesheet" href="css/style.css" />

</head>
<script type="text/javascript">
	function update_qty() {
		cart_form.action = "cart_qty_update_action.jsp";
		cart_form.method = 'POST';
		cart_form.submit();
	}

	function cartDeleteItem(delete_form_name) {

		var f = document.getElementById(delete_form_name);
		
		f.action = "cart_delete_item_action.jsp";
		f.method = "POST";
		f.submit();
	}
	function changeCartQty(cart_no,count){
		document.getElementById('cart_qty_'+cart_no).value=count;
		document.getElementById('cart_no_qty_'+cart_no).value=cart_no+'-'+document.getElementById('cart_qty_'+cart_no).value;
		
	}
	function cart_form_submit() {
		cart_f.method='POST';
		cart_f.action="jumun_form.jsp";
		cart_f.submit();
	}
</script>
<body>

	<%
	for (Cart cart : cartList) {
	%>
	<form id="cart_delete_item_f_<%=cart.getCart_no()%>"  name="cart_delete_item_f_<%=cart.getCart_no()%>" method="post">
		<input type="hidden" name="cart_no" value="<%=cart.getCart_no()%>">
	</form>
	<%
	}
	%>
	
	<form name="cart_f">
		<input type="hidden" name="buytype" value="cart">
	</form>

	<!--=================================
    Header -->
	<jsp:include page="include_common_top.jsp"></jsp:include>
	<!--=================================
    Header -->

	<!--=================================
    Inner Header -->
	<div class="inner-header"
		data-jarallax='{"speed": 0.5}'
		style="background-image: url(images/bg/02.jpg);">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<h1 class="text-white text-uppercase mb-0">Cart</h1>
				</div>
			</div>
		</div>
	</div>
	<!--=================================
    Inner Header -->

	<!--=================================
    Cart -->
	<section class="space-ptb">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mb-4 mb-lg-0">
					<div class="cart">
						<div class="table-responsive">
							<form name="cart_form">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th class="product-remove">&nbsp;</th>
										<th class="product-thumbnail">&nbsp;</th>
										<th class="product-name">Product</th>
										<th class="product-price">Price</th>
										<th class="product-quantity">Quantity</th>
										<th class="product-subtotal">Subtotal</th>
									</tr>
								</thead>
								
								<tbody>

									<!-- *********Cart***************** -->
									
									<%
									int tot_price = 0;

									for (Cart cart : cartList) {
										tot_price += cart.getCart_qty() * cart.getProduct().getP_price();
									%>
									<tr>
										<td class="product-remove"><a
											href="javascript:cartDeleteItem('cart_delete_item_f_<%=cart.getCart_no()%>')"><i
												class="far fa-trash-alt"></i></a></td>


										<td class="product-thumbnail"><a href="#"><img
												src="images/shop/product/<%=cart.getProduct().getP_name()%>1.jpg" alt=""></a></td>
										<td class="product-name"><a href="#"><%=cart.getProduct().getP_name()%></a></td>
										<td class="product-price"><span class="amount"><%=new DecimalFormat("#,###").format(cart.getProduct().getP_price())%></span></td>
										<td class="product-quantity">

											<div class="form-group">

													<input type="number" onchange="changeCartQty('<%=cart.getCart_no()%>',this.value);" class="form-control text-light"
														value="<%=cart.getCart_qty()%>"> 
													<input id="cart_qty_<%=cart.getCart_no()%>"
														type="hidden" name="cart_qty" >
													<input
														type="hidden" name="cart_no"
														value="<%=cart.getCart_no()%>">
													<input id="cart_no_qty_<%=cart.getCart_no()%>" type="hidden" name="cart_no_qty">

											</div>

										</td>
										<td class="product-subtotal"><span class="subtotal"><%=new DecimalFormat("#,###").format(cart.getCart_qty() * cart.getProduct().getP_price())%></span></td>
									</tr>
									<%
									}
									%>
									


								</tbody>
								
							</table>
							</form>
						</div>
						<div class="cart-table actions">
							<div class="coupon">
								<form class="form-inline">
									<div class="form-group">
										<input type="text" id="coupon_code" name="coupon_code"
											class="form-control w-100" value="" placeholder="Coupon code">
									</div>
									<a href="" class="btn btn-dark">Apply coupon</a>
								</form>
							</div>
							<div class="update-cart">

								<a class="btn btn-md btn-outline-light"
									href="javascript:update_qty();">Update cart</a>

							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="cart-totals">
						<h5 class="cart-totals-title mb-0">Cart totals</h5>
						<div class="table-responsive">
							<table class="table table-bordered">
								<tbody>
									<tr class="cart-subtotal">
										<th>Subtotal</th>
										<td><span class="subtotal">₩<%=new DecimalFormat("#,###").format(tot_price)%></span></td>
									</tr>
									<tr class="shipping">
										<th>Shipping</th>
										<td>
											<form>
												<div class="form-group">
													<div class="custom-control custom-radio">
														<input type="radio" id="customRadio1" name="customRadio"
															class="custom-control-input"> <label
															class="custom-control-label text-light"
															for="customRadio1">Flat rate</label>
													</div>
													<div class="custom-control custom-radio">
														<input type="radio" id="customRadio2" name="customRadio"
															class="custom-control-input"> <label
															class="custom-control-label text-light"
															for="customRadio2">Local pickup</label>
													</div>
													<p class="mb-3 mt-2 text-light">
														Shipping to <strong> CA.</strong>
													</p>
													<a href="">Change address <i class="fas fa-truck ml-1"></i></a>
												</div>
											</form>
										</td>
									</tr>
									<tr class="order-total">
										<th>Total</th>
										<td><span class="amount text-primary">₩<%=new DecimalFormat("#,###").format(tot_price)%></span>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="text-center">
							<a href="javascript:cart_form_submit()" class="btn btn-dark btn-block">Proceed
								to checkout</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--=================================
    Cart -->

	<!--=================================
    footer-->
	<jsp:include page="include_common_bottom.jsp"></jsp:include>
	<!--=================================
    footer-->

	<!--=================================
    Back To Top -->
	<div id="back-to-top" class="back-to-top">
		<a href="#"><i class="fas fa-chevron-up"></i></a>
	</div>
	<!--=================================
    Back To Top -->

	<!--=================================
    Javascript -->

	<!-- JS Global Compulsory (Do not remove)-->
	<script src="js/jquery-3.5.1.min.js"></script>
	<script src="js/popper/popper.min.js"></script>
	<script src="js/bootstrap/bootstrap.min.js"></script>

	<!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
	<script src="js/select2/select2.full.js"></script>
	<script src="js/range-slider/ion.rangeSlider.min.js"></script>
	<script src="js/jarallax/jarallax.min.js"></script>

	<!-- Template Scripts (Do not remove)-->
	<script src="js/custom.js"></script>

</body>
</html>