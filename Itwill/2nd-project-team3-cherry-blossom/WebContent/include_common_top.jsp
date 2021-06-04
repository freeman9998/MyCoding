<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 

String sUserId = (String)session.getAttribute("sUserId");
List<Cart> cartList = new ArrayList<Cart>();
UserInfo userInfo = new UserInfo();
if(sUserId!=null) {
	cartList = CartService.getInstance().getCartList(sUserId);
	userInfo = UserInfoService.getInstance().findUserInfoById(sUserId);
}
int tot_qty = 0;
for(Cart cart:cartList) {
		tot_qty+=cart.getCart_qty();
}
%>
    
<!-- *************상단카테고리**************** -->  
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template" />
    <meta name="description" content="Flexor - E-commerce HTML5 Template" />
    <meta name="author" content="potenzaglobalsolutions.com" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cherry Blossom</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="images/tablogo.jpg" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Heebo:100,300,400,500,700,800,900&display=swap" rel="stylesheet">

    <!-- CSS Global Compulsory (Do not remove)-->
    <link rel="stylesheet" href="css/font-awesome/all.min.css" />
    <link rel="stylesheet" href="css/flaticon/flaticon.css" />
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />

    <!-- Page CSS Implementing Plugins (Remove the plugin CSS here if site does not use that feature) -->
    <link rel="stylesheet" href="css/owl-carousel/owl.carousel.min.css" />
    <link rel="stylesheet" href="css/swiper/swiper.min.css" />
    <link rel="stylesheet" href="css/animate/animate.min.css"/>
    <link rel="stylesheet" href="css/magnific-popup/magnific-popup.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
	function searchProduct() {
		document.searchFrm.method='GET';
		document.searchFrm.action='product_list_search_item_form.jsp';
		document.searchFrm.submit();
	}
  	function cartAdd(add_form) {
		var f = document.getElementById(add_form);
		f.action = "cart_add_action.jsp";
		f.method = "POST";
		f.submit();
	}
</script>
  </head>
  <body class="quick-view">
    <header class="header header-sticky default">
      <nav class="navbar navbar-static-top navbar-expand-lg px-3 px-md-5 py-2 py-sm-3">
        <div class="container-fluid position-relative px-0">
          <button type="button" class="navbar-toggler" data-toggle="collapse" data-target=".navbar-collapse"><i class="fas fa-align-left"></i></button>
          <a class="navbar-brand" href="shop_main.jsp">
            <img class="img-fluid" src="images/logo.jpg" alt="logo">
          </a>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
            
              <li class="dropdown nav-item">
                <a class="nav-link" href="product_list_form.jsp?P_CATEGORY=TOP" data-toggle="dropdown">TOP<i class="fas fa-chevron-down fa-xs"></i></a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=TOP&P_SUBCATEGORY=TEE"><span>TEE</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=TOP&P_SUBCATEGORY=BLOUSE"><span>BLOUSE</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=TOP&P_SUBCATEGORY=SHIRT"><span>SHIRT</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=TOP&P_SUBCATEGORY=KNIT"><span>KNIT</span></a></li>
                </ul>
              </li>
              
              <li class="dropdown nav-item">
                <a class="nav-link" href="product_list_form.jsp?P_CATEGORY=OUTER" data-toggle="dropdown">OUTER<i class="fas fa-chevron-down fa-xs"></i></a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OUTER&P_SUBCATEGORY=JACKET"><span>JACKET</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OUTER&P_SUBCATEGORY=CARDIGAN"><span>CARDIGAN</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OUTER&P_SUBCATEGORY=COAT"><span>COAT</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OUTER&P_SUBCATEGORY=JUMPER"><span>JUMPER</span></a></li>
                </ul>
              </li>
              
              <li class="dropdown nav-item">
                <a class="nav-link" href="product_list_form.jsp?P_CATEGORY=PANTS" data-toggle="dropdown">PANTS<i class="fas fa-chevron-down fa-xs"></i></a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=PANTS&P_SUBCATEGORY=DENIM"><span>DENIM</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=PANTS&P_SUBCATEGORY=SLACKS"><span>SLACKS</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=PANTS&P_SUBCATEGORY=PANTS"><span>PANTS</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=PANTS&P_SUBCATEGORY=SHORT_PANTS"><span>SHORT PANTS</span></a></li>
                </ul>
              </li>
              
              <li class="dropdown nav-item">
                <a class="nav-link" href="product_list_form.jsp?P_CATEGORY=OPS_SKIRT" data-toggle="dropdown">OPS/SKIRT<i class="fas fa-chevron-down fa-xs"></i></a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OPS_SKIRT&P_SUBCATEGORY=OPS"><span>OPS</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OPS_SKIRT&P_SUBCATEGORY=MINI"><span>MINI</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OPS_SKIRT&P_SUBCATEGORY=MIDI"><span>MIDI</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=OPS_SKIRT&P_SUBCATEGORY=LONG"><span>LONG</span></a></li>
                </ul>
              </li>
              
              <li class="dropdown nav-item">
                <a class="nav-link" href="product_list_form.jsp?P_CATEGORY=ACC" data-toggle="dropdown">ACC<i class="fas fa-chevron-down fa-xs"></i></a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=HAIR"><span>HAIR</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=RING"><span>RING</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=EARRING"><span>EARRING</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=BRACELET"><span>BRACELET</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=WATCH"><span>WATCH</span></a></li>
                  <li><a class="dropdown-item" href="product_list_form.jsp?P_CATEGORY=ACC&P_SUBCATEGORY=ETC"><span>ETC</span></a></li>
                </ul>
              </li>
              
			  <li><a class="nav-link" href="product_list_form.jsp?P_CATEGORY=SHOES&P_SUBCATEGORY=SHOES">SHOES</a></li>

            </ul>
          </div>
          <!-- search start -->
          <div class="search-product ml-auto">
          	<form name="searchFrm">
	            <input type="text" class="form-control" placeholder="Search.." name="searchWord">
	            <button class="search-button" type="button" onclick="searchProduct();"> <i class="fa fa-search"></i></button>
            </form>
          </div>
          <!-- search end -->
          <div class="woo-action">
            <ul class="list-unstyled">

           
 <!-- ***********카트리스트****************** -->  
              <%if(sUserId==null) { %>
              <li class="user"><a href="user_my_info_form.jsp"><%="로그인&회원가입" %></a></li>
              <%}else { %>
              <li class="user"><a href="user_my_info_logout_action.jsp"><%=userInfo.getUser_name()+"님 로그아웃" %></a></li>
              <%} %>
              <li class="cart dropdown">
                <button class="dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span class="cart-icon"><i class="fas fa-shopping-cart"></i></span><span class="cart-count"><%=tot_qty %></span></button>
                <div class="dropdown-menu-right" aria-labelledby="dropdownMenuButton">
                				              
                  <ul class="cart-list pl-0">
                  <%int tot_price = 0;
                  	
                  	for(Cart cart:cartList){
                  		tot_price+=(cart.getCart_qty()*cart.getProduct().getP_price());
                  %>
                    <li class="d-flex">
                      <a class="remove-item" href="#"><i class="fas fa-times"></i></a>
                      <img class="img-fluid mr-3" src="images/shop/18.jpg" alt="">
                      <div class="cart-info">
                        <a href="#"><%=cart.getProduct().getP_name()%></a>
                        <span class="d-block"><%=cart.getCart_qty() %> x <%=new DecimalFormat("#,###").format(cart.getProduct().getP_price()) %></span>
                      </div>
                    </li>
					<%} %>
                    
                  </ul>
                  
                  <div class="cart-footer">
                    <div class="d-flex mb-3">
                      <b class="mr-auto text-dark">Subtotal:</b>
                      <span><%=new DecimalFormat("#,###").format(tot_price)%></span>
                    </div>    
                    <div class="d-inline-block d-sm-flex">
                      <a class="col btn btn-sm btn-primary text-white mr-2 px-4" href="cart_form.jsp">장바구니</a>
                      <a class="col btn btn-sm btn-dark text-white ml-0 mt-1 mt-sm-0 ml-sm-2 px-4" href="jumun_form.jsp">주문하기</a>
                    </div>
               
 <!-- ***************************** -->    
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </header>