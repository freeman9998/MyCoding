<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Jumun"%>
<%@page import="com.itwill.shop.service.JumunService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %> 
<%

String product_name=request.getParameter("product-name");
String product_quantity=request.getParameter("product-quantity");
UserInfo user = UserInfoService.getInstance().findUserInfoById(sUserId);
List<Cart> cartList = CartService.getInstance().getCartList(sUserId);

List<Jumun> jumunList = JumunService.getInstance().detail(1);



%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template" />
    <meta name="description" content="Flexor - E-commerce HTML5 Template" />
    <meta name="author" content="potenzaglobalsolutions.com" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cherry Blossom</title>
	
    <!-- Favicon -->
    <link rel="shortcut icon" href="images/favicon.ico" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Heebo:100,300,400,500,700,800,900&display=swap" rel="stylesheet">

    <!-- CSS Global Compulsory (Do not remove)-->
    <link rel="stylesheet" href="css/font-awesome/all.min.css" />
    <link rel="stylesheet" href="css/flaticon/flaticon.css" />
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />

    <!-- Page CSS Implementing Plugins (Remove the plugin CSS here if site does not use that feature) -->
    <link rel="stylesheet" href="css/select2/select2.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
	function address() {
		if (j.ao_name.value == "") {
			alert("주문하시는 분 성함을 입력하세요.");
			j.ao_name.focus();
			return false;
		}
		if (j.ad_name.value == "") {
			alert("받으시는 분 성함을 입력하세요.");
			j.ad_name.focus();
			return false;
		}
		if (j.ad_address.value == "") {
			alert("주소를 입력하세요.");
			j.ad_address.focus();
			return false;
		}
		if (j.ad_phone.value == "") {
			alert("전화번호를 입력하세요.");
			j.ad_phone.focus();
			return false;
		}
		if (j.email.value == "") {
			alert("이메일을 입력하세요.");
			j.email.focus();
			return false;
		}
		if (j.ad_message.value == "") {
			alert("배송메세지를 입력하세요.");
			j.ad_message.focus();
			return false;
		}

		j.action = "jumun_action.jsp";
		j.method="POST";
		j.submit();
	}
</script>
  </head>
  <body>

    <!--=================================
    Header -->
    <jsp:include page="include_common_top.jsp"></jsp:include>
    <!--=================================
    Header -->

    <!--=================================
    Inner Header -->
    <div class="inner-header" data-jarallax='{"speed": 0.5}' style="background-image: url(images/bg/02.jpg);">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h1 class="text-white text-uppercase mb-0">Checkout</h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    Checkout -->
    <section class="space-ptb">
      <div class="container">
        <div class="row">
        </div>
        <div class="row">
          <div class="col-md-6">
            <div class="checkout">
              <div class="billing-fields">
                <div class="section-title mb-0">
                  <h5 class="title mb-0">주문서 작성</h5>
                </div>
              </div>
              <form class="form-row billing-form" name="j" method="post">
                	<input type="hidden" name="j_no" value="<%=jumunList.get(0).getJ_no()%>">
                <div class="form-group col-sm-12">
                  <label>주문하시는 분 </label>
                  <input type="text" class="form-control" placeholder="" name="ao_name"
                  value="<%=user.getUser_name()%>">
                </div>
                <div class="form-group col-sm-12">
                  <label>받으시는 분</label>
                  <input type="text" class="form-control" placeholder="" name="ad_name"
                  value="<%=user.getUser_name()%>">
                </div>
                <div class="form-group col-sm-12">
                  <label>전화번호</label>
                  <input type="text" class="form-control" placeholder="" name = "ad_phone"
                  value="<%=user.getUser_phone()%>">
                </div>
                <div class="form-group col-sm-12">
                  <label>주소</label>
                  <input type="text" class="form-control" placeholder="" name="ad_address"
                  value="<%=user.getUser_address()%>">
                </div>
                <div class="form-group col-sm-12">
                  <label>이메일</label>
                  <input type="text" class="form-control" placeholder="" name="email"
                  value="<%=user.getEmail()%>">
                </div>
                <div class="form-group col-sm-12 mb-0">
                  <label>배송메시지</label>
                  <input type="text" class="form-control" placeholder="" name="ad_message"
                  value="배송시 문앞에 놔주세요.">
                </div>
              </form>
            </div>
            <div class="checkout my-4">
              <div class="billing-fields p-0">
                <div class="custom-control address-checkbox custom-checkbox">
                  
                 
                </div>
              </div>
             
            </div>
            <div class="checkout">
              <div class="form-group mb-0 billing-form">
               
              </div>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="checkout-review-order">
              <div class="review-order">
                <div class="section-title mb-0">
                  <h5 class="title mb-0">나의주문</h5>
                </div>
              </div>
              <div class="checkout-review">
                <div class="table-responsive">
                  <table class="table cart">
                    <tbody>
                      <tr>
                        <th class="border-top-0 product-name" scope="row">상품정보</th>
                        <th class="border-top-0 product-total" scope="row">상품금액</th>
                      </tr>
                    <%
					int tot_price=0;	
					for(Cart cart:cartList){ 
						tot_price+=cart.getCart_qty()*cart.getProduct().getP_price();
					%>
					
                      <tr>
                        <td><%=cart.getProduct().getP_name() %></td>
                        <td><%=cart.getProduct().getP_price() %> </td>
                      </tr>
                      <%}%>
                      <tr>
                        <th class="product-name" scope="row">상품금액</th>
                        <td class="product-total amount text-gray"><strong><%=new DecimalFormat("#,###").format(tot_price) %> </strong></td>
                      </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                      <th class="shipping">배송비</th>
                      <td>
                        <div class="custom-control custom-radio">
                          <input type="radio" id="customRadioInline11" name="customRadioInline" class="custom-control-input" checked="checked">
                          <label class="custom-control-label" for="customRadioInline11">free</label>
                        </div>
                        
                      </td>
                    </tr>
                    <tr>
                      <th class="product-total" scope="row">총금액</th>
                      <td class="product-total amount text-primary"><strong><%=new DecimalFormat("#,###").format(tot_price) %> </strong></td>
                    </tr>
                    </tfoot>
                  </table>
                </div>
                <div class="accordion accordion-style-1 mb-3" id="accordion-faq">
                 
                  <div class="card mb-3">
                    <div class="accordion-icon card-header" id="headingfor">
                      <button class="btn btn-link custom-control custom-radio collapsed lead payment-methods d-inline-block" data-toggle="collapse" data-target="#collapsefor" aria-expanded="false" aria-controls="collapsefor">
                      <input type="radio" id="customRadio3" name="customRadio" class="custom-control-input">
                      <label class="custom-control-label text-dark " for="customRadio3">PayPal <img class="img-fluid" src="images/01.jpg" alt=""><span class="pl-1 font-sm text-primary">What is PayPal?</span></label>
                      </button>
                    </div>
                    <div id="collapsefor" class="collapse" aria-labelledby="headingfor" data-parent="#accordion-faq">
                      <div class="card-body">
                        Pay with cash upon delivery.
                      </div>
                    </div>
                  </div>

                </div>
                <p>Your personal data will be used to process your order, support your experience throughout this website, and for other purposes described in our<a href="#"> privacy policy.</a></p>
                <div class="custom-control custom-checkbox mt-4">
                  <input type="checkbox" class="custom-control-input" id="dateposted10">
                  <label class="custom-control-label" for="dateposted10"> I have read and agree to the website <a href="#">terms and conditions</a></label>
                </div>
              </div>
              <button type="button" class="btn btn-dark btn-lg btn-block" onclick="address()">주문하기</button>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=================================
    Checkout -->

    <jsp:include page="include_common_bottom.jsp"></jsp:include>

    <!--=================================
    Javascript -->

    <!-- JS Global Compulsory (Do not remove)-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>

    <!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
    <script src="js/select2/select2.full.js"></script>
    <script src="js/jarallax/jarallax.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>
