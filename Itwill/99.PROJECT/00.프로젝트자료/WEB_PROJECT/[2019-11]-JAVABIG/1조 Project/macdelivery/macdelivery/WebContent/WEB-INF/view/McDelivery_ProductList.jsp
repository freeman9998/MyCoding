<%@page import="com.itwill.product.model.ProductService"%>
<%@page import="com.itwill.product.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.product.model.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("member")==null){
		response.sendRedirect("McDelivery_login_form.do");
	}

	ArrayList<Product> burgerList=(ArrayList<Product>)request.getAttribute("burgerList");
	ArrayList<Product> morningList=(ArrayList<Product>)request.getAttribute("morningList");
	ArrayList<Product> sideList=(ArrayList<Product>)request.getAttribute("sideList");
	ArrayList<Product> drinkList=(ArrayList<Product>)request.getAttribute("drinkList");
	ArrayList<Product> dessertList=(ArrayList<Product>)request.getAttribute("dessertList");
	
	
%>
<%
	int cartCount=0;
 	if(session.getAttribute("member") != null){
 		cartCount =(int)request.getAttribute("cartCount");
 	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Mcdonald333</title>
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
<link rel="stylesheet" href="css/menuList.css">
<script type="text/javascript">
	function showBurger(){
		var selection1 = document.getElementsByClassName("up_no_101");
		var selection2 = document.getElementsByClassName("up_no_102");
		var selection3 = document.getElementsByClassName("up_no_103");
		var selection4 = document.getElementsByClassName("up_no_104");
		var selection5 = document.getElementsByClassName("up_no_105");
		
		for(var i=0;i<selection1.length;i++){
			var select1 = selection1.item(i);
			select1.style.display="block";
		}
		for(var i=0;i<selection2.length;i++){
			var select2 = selection2.item(i);
			select2.style.display="none";
		}
		for(var i=0;i<selection3.length;i++){
			var select3 = selection3.item(i);
			select3.style.display="none";
		}
		for(var i=0;i<selection4.length;i++){
			var select4 = selection4.item(i);
			select4.style.display="none";
		}
		for(var i=0;i<selection5.length;i++){
			var select5 = selection5.item(i);
			select5.style.display="none";
		}
	}
	function showSide(){
		var selection1 = document.getElementsByClassName("up_no_101");
		var selection2 = document.getElementsByClassName("up_no_102");
		var selection3 = document.getElementsByClassName("up_no_103");
		var selection4 = document.getElementsByClassName("up_no_104");
		var selection5 = document.getElementsByClassName("up_no_105");
		
		for(var i=0;i<selection1.length;i++){
			var select1 = selection1.item(i);
			select1.style.display="none";
		}
		for(var i=0;i<selection2.length;i++){
			var select2 = selection2.item(i);
			select2.style.display="none";
		}
		for(var i=0;i<selection3.length;i++){
			var select3 = selection3.item(i);
			select3.style.display="block";
		}
		for(var i=0;i<selection4.length;i++){
			var select4 = selection4.item(i);
			select4.style.display="none";
		}
		for(var i=0;i<selection5.length;i++){
			var select5 = selection5.item(i);
			select5.style.display="none";
		}
	}
	function showDrink(){
		var selection1 = document.getElementsByClassName("up_no_101");
		var selection2 = document.getElementsByClassName("up_no_102");
		var selection3 = document.getElementsByClassName("up_no_103");
		var selection4 = document.getElementsByClassName("up_no_104");
		var selection5 = document.getElementsByClassName("up_no_105");
		
		for(var i=0;i<selection1.length;i++){
			var select1 = selection1.item(i);
			select1.style.display="none";
		}
		for(var i=0;i<selection2.length;i++){
			var select2 = selection2.item(i);
			select2.style.display="none";
		}
		for(var i=0;i<selection3.length;i++){
			var select3 = selection3.item(i);
			select3.style.display="none";
		}
		for(var i=0;i<selection4.length;i++){
			var select4 = selection4.item(i);
			select4.style.display="block";
		}
		for(var i=0;i<selection5.length;i++){
			var select5 = selection5.item(i);
			select5.style.display="none";
		}
	}
	function showDessert(){
		var selection1 = document.getElementsByClassName("up_no_101");
		var selection2 = document.getElementsByClassName("up_no_102");
		var selection3 = document.getElementsByClassName("up_no_103");
		var selection4 = document.getElementsByClassName("up_no_104");
		var selection5 = document.getElementsByClassName("up_no_105");
		
		for(var i=0;i<selection1.length;i++){
			var select1 = selection1.item(i);
			select1.style.display="none";
		}
		for(var i=0;i<selection2.length;i++){
			var select2 = selection2.item(i);
			select2.style.display="none";
		}
		for(var i=0;i<selection3.length;i++){
			var select3 = selection3.item(i);
			select3.style.display="none";
		}
		for(var i=0;i<selection4.length;i++){
			var select4 = selection4.item(i);
			select4.style.display="none";
		}
		for(var i=0;i<selection5.length;i++){
			var select5 = selection5.item(i);
			select5.style.display="block";
		}
	}
	function showMorning(){
		var selection1 = document.getElementsByClassName("up_no_101");
		var selection2 = document.getElementsByClassName("up_no_102");
		var selection3 = document.getElementsByClassName("up_no_103");
		var selection4 = document.getElementsByClassName("up_no_104");
		var selection5 = document.getElementsByClassName("up_no_105");
		
		for(var i=0;i<selection1.length;i++){
			var select1 = selection1.item(i);
			select1.style.display="none";
		}
		for(var i=0;i<selection2.length;i++){
			var select2 = selection2.item(i);
			select2.style.display="block";
		}
		for(var i=0;i<selection3.length;i++){
			var select3 = selection3.item(i);
			select3.style.display="none";
		}
		for(var i=0;i<selection4.length;i++){
			var select4 = selection4.item(i);
			select4.style.display="none";
		}
		for(var i=0;i<selection5.length;i++){
			var select5 = selection5.item(i);
			select5.style.display="none";
		}
	}
</script>
</head>
<body>

	<div class="site-wrap">
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

		<div class="bg-light py-3">
			<div class="container">
				<div class="row">
					<div class="col-md-12 mb-0">
						<a href="index.html">Home</a> <span class="mx-2 mb-0">/</span> <strong
							class="text-black">Shop</strong>
					</div>
				</div>
			</div>
		</div>

		<div class="site-section">
			<div class="container">
				<div class="row mb-5">
					<div class="col-md-9 order-2">
					<div class="row mb-5">

							<%	
								for (int i = 0; i < burgerList.size(); i++) {
								Product burger=burgerList.get(i);
								
							%>
							
							<div id='p_no_<%=burger.getP_no()%>' class="col-sm-6 col-lg-4 mb-4 up_no_<%=burger.getP_up_no()%>" data-aos="fade-up">
								<div class="block-4 text-center border">
									<figure class="block-4-image">
										<a href="McDelivery_product_detail_action.do?p_no=<%=burger.getP_no()%>"><img
											src="images/<%=burgerList.get(i).getP_no()%>.png"
											alt="Image placeholder" class="img-fluid"></a>
									</figure>
									<div class="block-4-text p-4">
										<h3>
											<a href="McDelivery_product_detail_action.do?p_no=<%=burger.getP_no()%>"><%=burgerList.get(i).getP_name()%></a>
										</h3>
										<p class="mb-0"><%=burgerList.get(i).getP_kcal()%>
											kal
										</p>
										<p class="text-primary font-weight-bold">
											₩
											<%=burgerList.get(i).getP_price()%></p>
									</div>
								</div>
							</div>



							<%
								}
							
							%>
						<!-- ---------------------------------------------------------------------- -->
						
						<%	
								for (int i = 0; i < morningList.size(); i++) {
									Product morning = morningList.get(i);
							%>
							<div id='p_no_<%=morning.getP_no()%>' class="col-sm-6 col-lg-4 mb-4 up_no_<%=morning.getP_up_no()%>" data-aos="fade-up">
								<div class="block-4 text-center border">
									<figure class="block-4-image">
										<a href="McDelivery_product_detail_action.do?p_no=<%=morning.getP_no()%>"><img
											src="images/<%=morningList.get(i).getP_no()%>.png"
											alt="Image placeholder" class="img-fluid"></a>
									</figure>
									<div class="block-4-text p-4">
										<h3>
											<a href="McDelivery_product_detail_action.do?p_no=<%=morning.getP_no()%>"><%=morningList.get(i).getP_name()%></a>
										</h3>
										<p class="mb-0"><%=morningList.get(i).getP_kcal()%>
											kal
										</p>
										<p class="text-primary font-weight-bold">
											₩
											<%=morningList.get(i).getP_price()%></p>
									</div>
								</div>
							</div>



							<%
								}
							
							%>
						<!-- ---------------------------------------------------------------------- -->
						
						<%	
								for (int i = 0; i < sideList.size(); i++) {
									Product side = sideList.get(i);
							%>
							<div id='p_no_<%=side.getP_no()%>' class="col-sm-6 col-lg-4 mb-4 up_no_<%=side.getP_up_no()%>" data-aos="fade-up">
								<div class="block-4 text-center border">
									<figure class="block-4-image">
										<a href="McDelivery_product_detail_action.do?p_no=<%=side.getP_no()%>"><img
											src="images/<%=sideList.get(i).getP_no()%>.png"
											alt="Image placeholder" class="img-fluid"></a>
									</figure>
									<div class="block-4-text p-4">
										<h3>
											<a href="McDelivery_product_detail_action.do?p_no=<%=side.getP_no()%>"><%=sideList.get(i).getP_name()%></a>
										</h3>
										<p class="mb-0"><%=sideList.get(i).getP_kcal()%>
											kal
										</p>
										<p class="text-primary font-weight-bold">
											₩
											<%=sideList.get(i).getP_price()%></p>
									</div>
								</div>
							</div>



							<%
								}
							
							%>
						<!-- ---------------------------------------------------------------------- -->
						
						<%	
								for (int i = 0; i < drinkList.size(); i++) {
									Product drink = drinkList.get(i);
								
							%>
							<div id='p_no_<%=drink.getP_no()%>' class="col-sm-6 col-lg-4 mb-4 up_no_<%=drink.getP_up_no()%>" data-aos="fade-up">
								<div class="block-4 text-center border">
									<figure class="block-4-image">
										<a href="McDelivery_product_detail_action.do?p_no=<%=drink.getP_no()%>"><img
											src="images/<%=drinkList.get(i).getP_no()%>.png"
											alt="Image placeholder" class="img-fluid"></a>
									</figure>
									<div class="block-4-text p-4">
										<h3>
											<a href="McDelivery_product_detail_action.do?p_no=<%=drink.getP_no()%>"><%=drinkList.get(i).getP_name()%></a>
										</h3>
										<p class="mb-0"><%=drinkList.get(i).getP_kcal()%>
											kal
										</p>
										<p class="text-primary font-weight-bold">
											₩
											<%=drinkList.get(i).getP_price()%></p>
									</div>
								</div>
							</div>



							<%
								}
							
							%>
						<!-- ---------------------------------------------------------------------- -->
						
						<%	
								for (int i = 0; i < dessertList.size(); i++) {
									Product dessert = dessertList.get(i);
							%>
							<div id='p_no_<%=dessert.getP_no()%>' class="col-sm-6 col-lg-4 mb-4 up_no_<%=dessert.getP_up_no()%>" data-aos="fade-up">
								<div class="block-4 text-center border">
									<figure class="block-4-image">
										<a href="McDelivery_product_detail_action.do?p_no=<%=dessert.getP_no()%>"><img
											src="images/<%=dessertList.get(i).getP_no()%>.png"
											alt="Image placeholder" class="img-fluid"></a>
									</figure>
									<div class="block-4-text p-4">
										<h3>
											<a href="McDelivery_product_detail_action.do?p_no=<%=dessert.getP_no()%>"><%=dessertList.get(i).getP_name()%></a>
										</h3>
										<p class="mb-0"><%=dessertList.get(i).getP_kcal()%>
											kal
										</p>
										<p class="text-primary font-weight-bold">
											₩
											<%=dessertList.get(i).getP_price()%></p>
									</div>
								</div>
							</div>



							<%
								}
							
							%>
						<!-- ---------------------------------------------------------------------- -->


						</div>

					</div>
 

					<div class="col-md-3 order-1 mb-5 mb-md-0">
						<div class="border p-4 rounded mb-4">
							<h3 class="mb-3 h6 text-uppercase text-black d-block">일반메뉴</h3>
							<ul class="list-unstyled mb-0" id="menu">
								<li class="mb-1"><a href="javascript:showBurger();" class="d-flex"><span>버거&세트</span>
								
										<li class="mb-1"><a href="javascript:showSide();" class="d-flex"><span>스낵&사이드</span>
								
												<li class="mb-1"><a href="javascript:showDrink();" class="d-flex"><span>음료</span>
								
														<li class="mb-1"><a href="javascript:showDessert();" class="d-flex"><span>디저트</span>
							</ul>
						</div>

						<div class="border p-4 rounded mb-4">
							<h3 class="mb-3 h6 text-uppercase text-black d-block">아침메뉴</h3>
							<ul class="list-unstyled mb-0">
								<li class="mb-1"><a href="javascript:showMorning();" class="d-flex"><span>맥모닝&세트</span>
										<li class="mb-1"><a href="javascript:showSide();" class="d-flex"><span>스낵&사이드</span>
												<li class="mb-1"><a href="javascript:showDrink();" class="d-flex"><span>음료</span>
														<li class="mb-1"><a href="javascript:showDessert();" class="d-flex"><span>디저트</span>
							</ul>
						</div>
					</div>


				</div>
			</div>


			<footer class="site-footer border-top">
				<div class="container">
					<div class="row">
						<div class="col-lg-4 mb-5 mb-lg-0">
							<div class="row">
								<div class="col-md-6 col-lg-4">
									<h3 class="footer-heading mb-4">메뉴</h3>
									<ul class="list-unstyled">
										<li><a href="#">버거&세트</a></li>
										<li><a href="#">스낵&사이드</a></li>
										<li><a href="#">음료</a></li>
										<li><a href="#">디저트</a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-md-6 col-lg-4 mb-4 mb-lg-0">
							<h3 class="footer-heading mb-4">기타정보</h3>
							<ul class="list-unstyled">
								<li><a href="#">이용약관</a></li>
								<li><a href="#">개인정보취급방침</a></li>
								<li><a href="#">고객문의</a></li>
							</ul>
						</div>
						<div class="col-md-6 col-lg-4">
							<div class="block-5 mb-5">
								<h3 class="footer-heading mb-4">팔로우</h3>
								<ul class="list-unstyled">
									<li class="address">페이스북</li>
									<li class="phone">인스타그램</li>
									<li class="email">유튜브</li>
								</ul>
							</div>

							<div class="block-7">
								<form action="#" method="post">
									<label for="email_subscribe" class="footer-heading">Subscribe</label>
									<div class="form-group">
										<input type="text" class="form-control py-4"
											id="email_subscribe" placeholder="Email"> <input
											type="submit" class="btn btn-sm btn-primary" value="Send">
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="row pt-5 mt-5 text-center">
						<div class="col-md-12">
							<p>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
								Copyright &copy;
								<script data-cfasync="false"
									src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script>
								<script>
									document.write(new Date().getFullYear());
								</script>
								All rights reserved | This template is made with <i
									class="icon-heart" aria-hidden="true"></i> by <a
									href="https://colorlib.com" target="_blank"
									class="text-primary">Colorlib</a>
								<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
							</p>
						</div>

					</div>
				</div>
			</footer>
		</div>

		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/jquery-ui.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/jquery.magnific-popup.min.js"></script>
		<script src="js/aos.js"></script>

		<script src="js/main.js"></script>
</body>
</html>