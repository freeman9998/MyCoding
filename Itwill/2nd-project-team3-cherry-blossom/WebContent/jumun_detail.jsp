<%@page import="com.itwill.shop.domain.Jumun_detail"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="com.itwill.shop.service.JumunService"%>
<%@page import="com.itwill.shop.domain.Jumun"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %> 
<%
String j_noStr = request.getParameter("j_no");
if(j_noStr==null||j_noStr.equals("")) {
	response.sendRedirect("jumun_list_form.jsp");
	return;
}
	
	List<Jumun> jumun = JumunService.getInstance().detail(Integer.parseInt(j_noStr));
	UserInfo user= UserInfoService.getInstance().findUserInfoById(sUserId);
	
	
%>
<%
int tot=0;
for(int i=0; i<jumun.size(); i++ ) {
 	 for(Jumun_detail jumun_detail : jumun.get(i).getJumun_detailList()){ 
	tot+=jumun_detail.getJd_qty()*jumun_detail.getProduct().getP_price();
 	 }
}
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

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />

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
            <h1 class="text-white text-uppercase mb-0">Order detail</h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    Order Details -->
    <section class="space-ptb order-details">
      <div class="container">
        <div class="row mb-4 mb-sm-5">
          <div class="col-md-12">
          
          </div>
        </div>
        <div class="row mb-4 mb-sm-5">
          <div class="col-md-12">
            <div class="border p-4">
              <div class="row row-cols-1 row-cols-sm-3 row-cols-md-3 row-cols-lg-4 row-cols-xl-5">
                <div class="col border-right">
                  <div class="d-flex align-items-center">
                    <div class="icon mt-3">
                      <i class="flaticon-null-10 fa-2x"></i>
                    </div>
                    <div class="ml-3">
                      <p class="font-sm text-uppercase mb-0">주문자:</p>
                      <span class="text-dark font-weight-bold"><%=user.getUser_name()%></span>
                    </div>
                  </div>
                </div>
                <div class="col border-right mt-4 mt-sm-0">
                  <div class="d-flex align-items-center">
                    <div class="icon">
                      <i class="flaticon-null-11 fa-2x"></i>
                    </div>
                    <div class="ml-3">
                      <p class="font-sm text-uppercase mb-0">주문날짜:</p>
                      <span class="text-dark font-weight-bold"><%=jumun.get(0).getJ_date() %></span>
                    </div>
                  </div>
                </div>
                <div class="col border-right mt-4 mt-sm-0">
                  <div class="d-flex align-items-center">
                    <div class="icon">
                      <i class="flaticon-mail fa-2x"></i>
                    </div>
                    <div class="ml-3">
                      <p class="font-sm text-uppercase mb-0">이메일:</p>
                      <span class="text-dark font-weight-bold"><%=user.getEmail() %></span>
                    </div>
                  </div>
                </div>
                <div class="col border-right mt-4 mt-lg-0">
                  <div class="d-flex align-items-center">
                    <div class="icon">
                      <i class="flaticon-money-5 fa-2x"></i>
                    </div>
                    <div class="ml-3">
                      <p class="font-sm text-uppercase mb-0">총주문금액:</p>
                      <span class="text-dark font-weight-bold"><%=tot%></span>
                    </div>
                  </div>
                </div>
                <div class="col mt-4 mt-xl-0">
                  <div class="d-flex align-items-center">
                    <div class="icon">
                      <i class="flaticon-credit-card fa-2x"></i>
                    </div>
                    <div class="ml-3">
                      <p class="font-sm text-uppercase mb-0">결제방식:</p>
                      <span class="text-dark font-weight-bold"><%=jumun.get(0).getJ_payment() %></span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12">
            <div class="">
              <div class="table-responsive">
                <table class="table table-bordered">
                  <thead>
                    <tr>
                      <th class="product-order h6">Order details</th>
                      <th class="product-total">&nbsp;</th>
                    </tr>
                  </thead>
                  <tbody>
                  <form name="j" method="post">
                    <tr>
                      <th class="product-order">상품정보</th>
                      <th class="product-total">금액</th>
                    </tr>
                     <%
                    
                     for(int i=0; i<jumun.size(); i++ ) {
					  	 for(Jumun_detail jumun_detail : jumun.get(i).getJumun_detailList()){ 
						
					%>
		                    <tr>
		                      <td class="product-name"><%=jumun_detail.getProduct().getP_name() %>  x  <%=jumun_detail.getJd_qty() %></td>
		                      <td class="product-total"><%=jumun_detail.getProduct().getP_price() %> x <%=jumun_detail.getJd_qty() %></td>
		                    </tr>
                    <%
                        }
                     }
                    %>
                  
                    <tr>
                      <td class="product-total text-dark font-weight-bold"> 배송비 :</td>
                      <td class="product-total font-weight-bold">free<span class="font-weight-light font-sm"></span></td>
                    </tr>
                    <tr>	
                      <td class="product-total text-dark font-weight-bold">결제방식 :</td>
                      <td class="product-total font-weight-bold"><%=jumun.get(0).getJ_payment() %></td>
                    </tr>
                    
                    <tr>
                      <td class="product-total text-dark font-weight-bold">총금액 :</td>
                      <td class="product-total font-weight-bold"><%=tot %></td>
                    </tr>
                    </form> 
                  </tbody>
                </table>
                 <div class="text-center">
							<a href="jumun_list_form.jsp" class="btn btn-dark btn-block">돌아가기</a>
						</div>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-4 mt-sm-5 d-flex align-items-stretch">
          <div class="col-md-6">
            <div class="border h-100">
              <h6 class="bg-light mb-0 p-3">Billing address</h6>
              <div class="billing-address m-4">
                <p>Flexor</p>
                <p>Jaymee S</p>
                <p>214 West Arnold St. New York, NY 10002</p>
                <p>Shanghai</p>
                <p><a href="tel:126-632-2345" class="text-light"><i class="fa fa-phone fa-flip-horizontal mr-1"></i>126-632-2345</a></p>
                <p class="mb-0"><a href="mailto:info@example.com" class="text-light"><i class="fas fa-envelope fa-flip-horizontal mr-1"></i> info@example.com</a></p>
              </div>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="border h-100">
              <h6 class="bg-light mb-0 p-3">Shipping address</h6>
              <div class="billing-address m-4">
                <p>Flexor</p>
                <p>Josepha N.</p>
                <p>Fairground St. North Bergen, NJ</p>
                <p class="mb-0">North Bergen</p>
              </div>
            </div>
          </div>
        </div>
      </div>
      
     
    </section>
    <!--=================================
    Order Details -->

    <!--=================================
    footer-->
    <jsp:include page="include_common_bottom.jsp"></jsp:include>

    <!--=================================
    Javascript -->

    <!-- JS Global Compulsory (Do not remove)-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>

    <!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
    <script src="js/jarallax/jarallax.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>
