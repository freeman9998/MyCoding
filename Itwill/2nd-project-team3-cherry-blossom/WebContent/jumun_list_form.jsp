<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.dao.JumunDao"%>
<%@page import="com.itwill.shop.dao.UserInfoDao"%>
<%@page import="java.util.ArrayList"%>
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

List<Jumun> jumunList = JumunService.getInstance().selectAllById(sUserId);
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
            <h1 class="text-white text-uppercase mb-0">Order List</h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    Order List -->
    <section class="space-ptb">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="order-list">
              <div class="table-responsive">
              
              <form name="jd" method="post">
              
                <table class="table table-bordered">
                  <thead>
                    <tr>
                      <th class="product-order">Order</th>
                      <th class="product-date">Date</th>
                      <th class="product-status">Status</th>
                      <th class="product-total">Total</th>
                      <th class="product-actions">Actions</th>
                    </tr>
                  </thead>
                  <tbody>
                  <%for(Jumun jumun:jumunList){ %>
                    <tr>
                      <td class="product-order"><%=jumun.getJ_no() %></td>
                      <td class="product-date"><%=jumun.getJ_date() %></td>
                      <td class="product-status"><%=jumun.getJ_status() %></td>
                      <td class="product-total"><span class="amount"><%=jumun.getJ_price() %></span></td>
                      <td class="product-actions"> <a class="btn btn-outline-light" href="jumun_detail.jsp?j_no=<%=jumun.getJ_no()%>">상세정보</a> </td>
                    </tr>
                    <% } %>
                  </tbody>
                </table>
                
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=================================
    Order List -->

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
