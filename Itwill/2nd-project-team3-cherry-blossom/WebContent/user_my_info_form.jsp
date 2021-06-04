<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");
	if(msg==null) msg="";

	String msg1 = (String)request.getAttribute("msg1");
	if(msg1==null) msg1="";
	
	String msg2 = (String)request.getAttribute("msg2");
	if(msg2==null) msg2="";
		
	UserInfo fuser = (UserInfo)request.getAttribute("fuser");
	if(fuser==null){
		fuser = new UserInfo("","","","","","");
	}
	
	UserInfo fuser1 = (UserInfo)request.getAttribute("fuser");
	if(fuser1==null){
		fuser1 = new UserInfo("","","","","","");
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

    <!-- Page CSS Implementing Plugins (Remove the plugin CSS here if site does not use that feature) -->
    <link rel="stylesheet" href="css/select2/select2.css" />
    <link rel="stylesheet" href="css/range-slider/ion.rangeSlider.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />

  </head>
  <body>
	<script type="text/javascript">
		function login() {
			if (f.userId.value == "") {
				alert("사용자 아이디를 입력하십시요.");
				f.userId.focus();
				return false;
			}
			if (f.password.value == "") {
				alert("비밀번호를 입력하십시요.");
				f.password.focus();
				return false;
			}
			
			f.action = "user_my_info_login_action.jsp";
			f.method = 'POST';
			f.submit();
		}
		
		function userCreate(){			
			if (regif.newUserId.value == "") {
				alert("사용자 아이디를 입력하십시요.");
				regif.newUserId.focus();
				return false;
			}
			if (regif.newPassword.value == "") {
				alert("비밀번호를 입력하십시요.");
				regif.newPassword.focus();
				return false;
			}
			if (regif.name.value == "") {
				alert("이름을 입력하십시요.");
				regif.name.focus();
				return false;
			}
			if (regif.address.value == "") {
				alert(" 주소를 입력하십시요.");
				regif.address.focus();
				return false;
			}
			if (regif.phone.value == "") {
				alert("전화번호를 입력하십시요.");
				regif.phone.focus();
				return false;
			}
			if (regif.email.value == "") {
				alert("이메일 주소를 입력하십시요.");
				regif.email.focus();
				return false;
			}
			
			regif.action = "user_my_info_register_action.jsp";
			regif.method = 'POST';
			regif.submit();
		}
	</script>
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
            <h1 class="text-white text-uppercase mb-0">My Account</h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    My Account -->
    <section class="space-ptb">
      <div class="container">
        <div class="row d-flex align-items-stretch">
          <div class="col-md-6">
            <div class="border h-100">
              <h5 class="bg-light mb-0 p-3">Login</h5>
              <div class="p-4">
              
            <!-- 로그인Form -->
                <form name="f" method="post" class="form-row">
                  <div class="form-group col-sm-12">
                    <label>UserId</label>
                    <input type="email" class="form-control" placeholder="" name="userId" value="<%=fuser1.getUser_id() %>">
                    &nbsp;&nbsp;&nbsp;<font color="red"><%=msg1 %></font>
                  </div>
                  <div class="form-group col-sm-12">
                    <label>Password</label>
                    <input type="password" class="form-control" id="inputPassword3" name="password" value="<%=fuser1.getPassword() %>">
                    &nbsp;&nbsp;&nbsp;<font color="red"><%=msg2 %></font>
                  </div>
                </form>
                
                <div class="d-flex align-items-center mb-3">
                 
                  <a class="btn btn-outline-light" href="javascript:login();">login</a>
			

                  <div class="custom-control custom-checkbox ml-auto">
                    <input type="checkbox" class="custom-control-input" id="dateposted1">
                    <label class="custom-control-label" for="dateposted1">Remember me</label>
                  </div>
                
                </div>
                <a href="">Lost your password?</a>
              </div>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="border h-100">
              <h5 class="bg-light mb-0 p-3">Register</h5>
              <div class="p-4">
              
          <!-- 회원가입Form -->
                <form name="regif" method="post">
                  <div class="row">
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>UserId</label>
                        <input type="text" class="form-control" placeholder="" name="newUserId" value="<%=fuser.getUser_id() %>">
                        &nbsp;&nbsp;&nbsp;<font color="red"><%=msg %></font>
                      </div>
                    </div>
                    
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>password</label>
                        <input type="password" class="form-control" placeholder="" name="newPassword" value="<%=fuser.getPassword() %>">
                      </div>
                    </div>
                    
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>name</label>
                        <input type="text" class="form-control" placeholder="" name="name" value="<%=fuser.getUser_name() %>">
                      </div>
                    </div>
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>address</label>
                        <input type="text" class="form-control" placeholder="" name="address" value="<%=fuser.getUser_address() %>">
                      </div>
                    </div>
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>phone</label>
                        <input type="text" class="form-control" placeholder="" name="phone" value="<%=fuser.getUser_address() %>">
                      </div>
                    </div>
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>email</label>
                        <input type="email" class="form-control" placeholder="" name="email" value="<%=fuser.getEmail() %>">
                      </div>
                    </div>
                  </div>
                </form>
              
                <a class="btn btn-outline-light" href="javascript:userCreate();">Register</a>
               
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!--=================================
    My Account -->

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