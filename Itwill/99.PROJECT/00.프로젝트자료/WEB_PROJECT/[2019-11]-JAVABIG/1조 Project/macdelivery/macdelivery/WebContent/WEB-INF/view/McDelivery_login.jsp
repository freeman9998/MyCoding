<%@page import="com.itwill.jumun.model.Jumun"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.jumun.model.JumunService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<% String status = (String)request.getAttribute("status");
	status = (status == null) ? "" : status;	
%>
<%
	int cartCount=0;
 	if(session.getAttribute("member") != null){
 		cartCount =(int)request.getAttribute("cartCount");
 	}
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
	function userCreateForm() {
		window.location.href="McDelivery_register_form.do"
	}
	var status = "<%=status%>";
	
	if(status != ""){
		if(status == "NotFound"){
			alert("존재하지않는 아이디입니다.");
		}else if(status == "MisMatch"){
			alert("비밀번호를 확인해주세요 .");
		}
	}

</script>
<title>Mcdonald</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Mukta:300,400,700">
<link rel="stylesheet" href="fonts/icomoon/style.css">

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">


<link rel="stylesheet" href="css/aos.css">

<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/custom.css">
</head>
<body>
	<header class="site-navbar" role="banner">
         <div class="site-navbar-top">
            <div class="container">
               <div class="row align-items-center">

                  <div
                     class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-center">
                  </div>
                  <div
                     class="col-6 col-md-4 order-2 order-md-1 site-search-icon text-center"
                     style="padding-left: 10px;">
                     <a href="McDelivery_main.do" class="js-logo-clone"> <image
                           src="images/maclogo.jpg" sizealt="" width="150" class="center"></a>
                  </div>

                  <div class="col-6 col-md-4 order-3 order-md-3 text-right">
                     <div class="site-top-icons">

                        <ul>
                        <%if(session.getAttribute("member") != null){ %>
                           <li><a href="McDelivery_mypage_myinfo_form.do"> <span
                                 class="icon icon-person"></span>
                           </a></li>
                           <li><a href="McDelivery_cart_form.do" class="site-cart">
                                 <span class="icon icon-shopping_cart"></span> <span
                                 class="count"><%=cartCount %></span>
                           </a></li>
                           <%}else{ %>
                           <li><a href="McDelivery_login_form.do"> <span
                                 class="icon icon-person"></span>
                           </a></li>
                           <li><a href="McDelivery_login_form.do" class="site-cart">
                                 <span class="icon icon-shopping_cart"></span> 
                           </a></li>
                           <%} %>
                           
                           <li class="d-inline-block d-md-none ml-md-0"><a href="#"
                              class="site-menu-toggle js-menu-toggle"> <span
                                 class="icon-menu"></span>
                           </a></li>
                        </ul>
                     </div>
                  </div>

               </div>
            </div>
         </div>
         <nav class="site-navigation text-right text-md-center"
            role="navigation">
            <div class="container">
               <ul class="site-menu js-clone-nav d-none d-md-block">
                  <li ><a href="McDelivery_main.do">Home</a></li>
                  <li><a href="McDelivery_product_list.do">메뉴</a></li>
                  <%
                     if (session.getAttribute("member") == null) {
                  %>
                  <li><a href="McDelivery_login_form.do">로그인</a></li>
                  <%
                     } else {
                  %>
                  <li><a href="McDelivery_mypage_jumunhistory.do">마이페이지</a></li>
                  <li><a href="McDelivery_logout_action.do">로그아웃</a></li>
                  <%
                     }
                  %>
               </ul>
            </div>
         </nav>
      </header>

	<div class="wrapper">
    	<form class="form-signin" method="post" action="McDelivery_login_action.do">       
      		<h2 class="form-signin-heading">Please login</h2>
      		<div class="form-group">
      		<input type="text" class="form-control" name="m_id" placeholder="ID" required="" autofocus="" />
      		</div>
      		<div class="form-group">
      		<input type="password" class="form-control" name="m_pwd" placeholder="Password" required=""/>
      		</div>
      		<div class="form-group">
      		<button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>   
			</div>
      		<div class="form-group">
      		<button onClick="userCreateForm()" class="btn btn-lg btn-primary btn-block" type="button">회원가입</button>   
    		</div>
    	</form>
    	
  	</div>

</body>
</html>