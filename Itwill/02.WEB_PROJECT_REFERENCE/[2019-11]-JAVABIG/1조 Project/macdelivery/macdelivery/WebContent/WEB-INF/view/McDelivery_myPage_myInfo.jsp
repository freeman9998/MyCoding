<%@page import="com.itwill.member.model.Member"%>
<%@page import="com.itwill.product.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.product.model.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member member = (Member)session.getAttribute("member");
%>
<%
	int cartCount=0;
 	if(session.getAttribute("member") != null){
 		cartCount =(int)request.getAttribute("cartCount");
 	}
%>
<!DOCTYPE html>
<script type="text/javascript">
function tal(){
	confirm("삭제하시겠습니까?");
}
</script>
<html>
<head>
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
	<div class="bg-light py-3">
		<div class="container">
			<div class="row">
				<div class="col-md-12 mb-0">
					<a href="index.html">MyPage</a>
					<span class="mx-2 mb-0">/</span>
					<strong	class="text-black">계정설정</strong>
				</div>
			</div>
		</div>
	</div>

	<div class="site-section">
		<div class="container">

			<div class="row mb-5">
<!-- 여기서부터 -->
				<div class="col-md-9 order-2">

						<div class="wrapper">
							<form class="form-signin" method="post" action="McDelivery_mypage_myinfo_action.do">
								<h2 class="form-signin-heading">계정설정</h2>
								<input type="hidden" class="form-control" name="m_no" value="<%=member.getM_no() %>" required="" autofocus="" />
								<div class="form-group">
									<input type="text" class="form-control" name="m_id" readonly="readonly" value="<%=member.getM_id() %>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<input type="password" class="form-control" name="m_pwd" placeholder=" New Password" required="" />
								</div>
								<div class="form-group">
									<input type="password" class="form-control" name="m_pwd_check" placeholder="Password_Check" required="" />
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="m_name" readonly="readonly" value="<%=member.getM_name()%>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="m_jumin" readonly="readonly" value="<%=member.getM_jumin() %>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="m_phone" placeholder="Phone_Number" value="<%=member.getM_phone() %>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="m_email" placeholder="E-mail" value="<%=member.getM_email() %>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="m_address" placeholder="Address" value="<%=member.getM_address() %>" required="" autofocus="" />
								</div>
								<div class="form-group">
									<button class="btn btn-lg btn-primary btn-block" type="submit">수정하기</button>
								</div>
							</form>
						</div>

					<div>
						<a href = "McDelivery_mypage_myinfo_delete_action.do" onClick="tal()"><span>탈퇴하기</span></a>
					</div>

				</div>
<!-- 여기까지 -->
				<div class="col-md-3 order-1 mb-5 mb-md-0">
					<div class="border p-4 rounded mb-4">
						<ul class="list-unstyled mb-0">
							<li class="mb-1"><a href="McDelivery_mypage_jumunhistory.do" class="d-flex"><span>주문내역 확인</span></a></li>
							<li class="mb-1"><a href="McDelivery_mypage_addresslist_form.do" class="d-flex"><span>주소록 관리</span></a></li>
							<li class="mb-1"><a href="McDelivery_mypage_myinfo_form.do" class="d-flex"><span>계정설정</span></a></li>
						</ul>
					</div>


				</div>


			</div>
		</div>
	</div>
</body>
</html>