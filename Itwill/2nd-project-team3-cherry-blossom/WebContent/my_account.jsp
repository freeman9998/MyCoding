<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="keywords" content="HTML5 Template" />
    <meta name="description" content="Flexor - E-commerce HTML5 Template" />
    <meta name="author" content="potenzaglobalsolutions.com" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<<<<<<< HEAD
    <title>Flexor - E-commerce HTML5 Template</title>

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

    <!--=================================
    Header -->
  <jsp:include page="include_common_top.jsp"></jsp:include>
    <!--=================================
    Header -->

    <!--=================================
    Inner Header -->
    <div class="inner-header bg-overlay-black-30 bg-dark" data-jarallax='{"speed": 0.5}' style="background-image: url(images/bg/02.jpg);">
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
                <form class="form-row">
                  <div class="form-group col-sm-12">
                    <label>UserId</label>
                    <input type="email" class="form-control" placeholder="" name="user_id">
                  </div>
                  <div class="form-group col-sm-12">
                    <label>Password</label>
                    <input type="password" class="form-control" id="inputPassword3" name="password">
                  </div>
                </form>
                <div class="d-flex align-items-center mb-3">
                  <a class="btn btn-outline-light" href="my-account_login_action.jsp">login</a>
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
                <form>
                  <div class="row">
                    <div class="col-sm-6 mb-2">
                      <div class="form-group">
                        <label>userId</label>
                        <input type="text" class="form-control" placeholder="" name="userId">
                      </div>
                    </div>
                    <div class="col-sm-6 mb-2">
                      <div class="form-group">
                        <label>password</label>
                        <input type="password" class="form-control" placeholder="" name="password">
                      </div>
                    </div>
                    <div class="col-sm-12 mb-2">
                      <div class="form-group">
                        <label>name</label>
                        <input type="text" class="form-control" placeholder="" name="email">
                      </div>
                    </div>
                    <div class="col-sm-6 mb-2">
                      <div class="form-group">
                        <label>address</label>
                        <input type="text" class="form-control" placeholder="" name="address">
                      </div>
                    </div>
                     <div class="col-sm-6 mb-2">
                      <div class="form-group">
                        <label>phone</label>
                        <input type="text" class="form-control" placeholder="" name="phone">
                      </div>
                    </div>
                    <div class="col-sm-6 mb-2">
                      <div class="form-group">
                        <label>email</label>
                        <input type="email" class="form-control" placeholder="" name="email">
                      </div>
                    </div>
                  </div>
                </form>
                <a class="btn btn-outline-light" href="user_my_info_register_action.jsp">Register</a>

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
    <footer class="footer">
      <div class="space-ptb bg-light">
        <div class="container">
          <div class="row">
            <div class="col-md-8">
              <div class="row">
                <div class="col-sm-4 mb-4 mb-sm-0">
                  <h6 class="title">Support</h6>
                  <div class="footer-link">
                    <ul class="list-unstyled mb-0">
                      <li><a href="#">Order list </a></li>
                      <li><a href="#">wishlist </a></li>
                      <li><a href="#">Compare product </a></li>
                      <li><a href="#">My account </a></li>
                      <li><a href="#">Address </a></li>
                    </ul>
                  </div>
                </div>
                <div class="col-sm-4 mb-4 mb-sm-0">
                  <h6 class="title">Useful Links</h6>
                  <div class="footer-link">
                    <ul class="list-unstyled mb-0">
                      <li><a href="#">Home</a></li>
                      <li><a href="#">About Us</a></li>
                      <li><a href="#">Shop</a></li>
                      <li><a href="#">Privacy Policy</a></li>
                      <li><a href="#">Contact Us</a></li>
                    </ul>
                  </div>
                </div>
                <div class="col-sm-4">
                  <h6 class="title">Information</h6>
                  <div class="footer-link">
                    <ul class="list-unstyled mb-0">
                      <li><a href="#">Look Book</a></li>
                      <li><a href="#">Information</a></li>
                      <li><a href="#">Instagram Wall</a></li>
                      <li><a href="#">Modern Process</a></li>
                      <li><a href="#">Warranty And Services</a></li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4 mt-4 mt-sm-5 mt-md-0">
              <h6 class="title">Newsletter</h6>
              <p class="text-gray small">Subscribe to our newsletter to Get exclusive offers, latest news and product announcements.</p>
              <form class="form-inline input-with-btn">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="Enter your email">
                </div>
                <button type="submit" class="btn btn-sm btn-dark"><i class="fa fa-angle-right"></i></button>
              </form>
              <div>
                <ul class="list-unstyled social-icon mb-0">
                  <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                  <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                  <li><a href="#"><i class="fab fa-youtube"></i></a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="container">
        <div class="row">
          <div class="col-sm-12">
            <div class="copyright">
              <p class="mb-0 small text-center">© Copyright 2020 <a href="">Flexor</a> All Rights Reserved.</p>
            </div>
          </div>
        </div>
      </div>
    </footer>
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