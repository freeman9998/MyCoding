<%@page import="com.itwill.shop.util.review.ReviewListPageMakerDto"%>
<%@page import="com.itwill.shop.util.review.PageMaker"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.service.ProductService"%>
<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="com.itwill.shop.service.ReviewService"%>
<%@page import="com.itwill.shop.domain.Review"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String p_noStr = request.getParameter("p_no");
	if(p_noStr==null || p_noStr.equals("")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}
	int p_no = Integer.parseInt(p_noStr);
	List<Review> reviewNo = ReviewService.getInstance().selectReviewN(p_no);
	Product product = ProductService.getInstance().findProductByNo(p_no);
	int reviewCheck = ReviewService.getInstance().selectReviewCheck(p_no);
	double starScore = 0.0;
	if(reviewCheck != 0){
		starScore = ReviewService.getInstance().selectReviewStar(p_no);
	}
	
	boolean isLogin=false;
	if(session.getAttribute("sUserId")!=null) {
		isLogin=true;
	}

	String reviewpageno="1";
	

	ReviewListPageMakerDto reviewListPage
		= ReviewService.getInstance().findReviewList(p_no, Integer.parseInt(reviewpageno));
	
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
    <link rel="shortcut icon" href="images/tablogo.jpg" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Heebo:100,300,400,500,700,800,900&display=swap" rel="stylesheet">

    <!-- CSS Global Compulsory (Do not remove)-->
    <link rel="stylesheet" href="css/font-awesome/all.min.css" />
    <link rel="stylesheet" href="css/flaticon/flaticon.css" />
    <link rel="stylesheet" href="css/bootstrap/bootstrap.min.css" />

    <!-- Page CSS Implementing Plugins (Remove the plugin CSS here if site does not use that feature) -->
    <link rel="stylesheet" href="css/owl-carousel/owl.carousel.min.css" />
    <link rel="stylesheet" href="css/slick/slick-theme.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
	function cart_form() {
		if(<%=!isLogin%>) {
			alert('로그인 하세요');
			location.href = 'user_my_info_form.jsp';
		}else {
			document.buyFrm.method='POST';
			document.buyFrm.action='cart_add_action.jsp';
			document.buyFrm.submit();
		}
	}
</script>
<script type="text/javascript">
	function reviewInsert() {
		if(<%=!isLogin%>) {
			alert('로그인 하세요');
			location.href = 'user_my_info_form.jsp';
		}
		if (document.frmReviewInsert.value == "") {
			alert("내용을 입력하십시요.");
			document.frmReviewInsert.content.focus();
			return false;
		}
		if (document.frmReviewInsert.star.value == "") {
			alert("별점을 골라주세요.");
			return false;
		}

		document.frmReviewInsert.action = "review_write_action.jsp";
		document.frmReviewInsert.method="POST";
		document.frmReviewInsert.submit();
	}

	function productList() {
		action = "product_list.jsp";
		submit();
	}
</script>
  </head>
  <body class="quick-view">

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
            <h1 class="text-white text-uppercase mb-0">Shop single</h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    Product -->
    <section class="space-ptb shop-single">
      <div class="container">
        <div class="row">
          <div class="col-lg-12">
            <div class="row">
              <div class="col-md-5 mb-4 mb-md-0">
                <div class="slider-slick">
                  <div class="slider slider-for detail-big-car-gallery">
                    <img src="images/shop/product/<%=product.getP_name()%>1.jpg" alt="">
                    <img src="images/shop/product/<%=product.getP_name()%>2.jpg" alt="">
                    <img src="images/shop/product/<%=product.getP_name()%>3.jpg" alt="">
                  </div>
                  <div class="slider slider-nav mt-2">
                    <img src="images/shop/product/<%=product.getP_name()%>1.jpg" alt="">
                    <img src="images/shop/product/<%=product.getP_name()%>2.jpg" alt="">
                    <img src="images/shop/product/<%=product.getP_name()%>3.jpg" alt="">
                  </div>
                </div>
              </div>
              <div class="col-md-7">
                <div class="product-detail">
                  <h4><%=product.getP_name() %></h4>
                  <div class="product-price-rating">
                    <div class="product-price">
                      <h4><%=new DecimalFormat("#,##0").format(product.getP_price()) %></h4>
                    </div>
                   <%if(starScore == 0.0){%>
                	   <h6 class="mb-4">리뷰가 없습니다.</h6>
                 <%  } else{%>
                     <h6 class="mb-4">리뷰 평점 : <%=String.format("%.1f",starScore) %>
                  	<% }%>
                  </h6>
                   
                  </div>
                  <p><%=product.getP_desc() %></p>
                  <div class="swatch-colored mt-4 d-flex align-items-center">
                    <p class="mb-0 mr-3 text-dark"><strong>Color : </strong></p>
                    <ul class="list-unstyled mb-0 d-flex">
                      <%=product.getP_color() %>
                    </ul>
                  </div>
                  <div class="product-detail-size my-4 d-flex align-items-center">
                    <p class="mb-0 mr-3 text-dark"><strong>Size : </strong></p>
                    <ul class="list-unstyled mb-0 d-flex">
                      <li><%=product.getP_size() %></li>
                    </ul>
                  </div>
                  <div class="input-group">
                    <form name="buyFrm">
	                  	<input type="hidden" name="p_no" value="<%=product.getP_no()%>">
                    	<input type="number" name="cart_qty" class="form-control input-number" value="1" min="1" max="10">
                  	</form>
                  </div>
                  
                  <!-- 내가 넣은 것 start -->
                  	
                  <!-- 내가 넣은 것 end -->
                  <a class="btn btn-dark btn-md" onclick="cart_form();">Add To Cart</a>
                  <div class="product-detail-meta mt-4">
                    <span class="text-dark">Category : <a href="product_list_form.jsp?P_CATEGORY=<%=product.getP_category()%>&P_SUBCATEGORY=<%=product.getP_subcategory() %>"><%=product.getP_category()+" - "+product.getP_subcategory() %></a></span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-5">
          <div class="col-lg-12">
            <ul class="nav nav-tabs" id="myTab" role="tablist">
              <li class="nav-item">
                <a class="nav-link text-uppercase active" id="description-tab" data-toggle="tab" href="#description" role="tab" aria-controls="description" aria-selected="true">Description</a>
              </li>
              <%
              int count = 0;
              for(int i = 0; i < reviewNo.size() ; i++){
            	  count = count+1;
              }  
            	  %>
              
              <li class="nav-item">
                <a class="nav-link text-uppercase" id="tab-reviews" data-toggle="tab" href="#reviews" role="tab" aria-controls="reviews" aria-selected="false">Reviews (<%=count %>)</a>
              </li>
            </ul>
            <div class="tab-content mt-4" id="myTabContent">
              <div class="tab-pane fade show active" id="description" role="tabpanel" aria-labelledby="description-tab">
                <div class="row">
                  <div class="col-sm-12">
                    <p class="mb-4"></p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-12 text-center">
                    <div class="bg-holder" style="background-image: url('images/bg/01.jpg');">
      
                      <div class="py-5">
                        <h5 class="text-uppercase text-white">Just for you, just because</h5>
                        <h2 class="mb-4 text-white">Free delivery from $120</h2>
                        <a class="btn btn-link text-white border-bottom border-white border-top-0 border-right-0 border-left-0  mt-2" href="#">Shipping & Returns</a>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="row space-sm-ptb">
                  <div class="col-md-4 mb-md-0 mb-4">
                    <div class="feature-info text-center">
                      <div class="feature-info-icon">
                        <i class="flaticon-delivery-truck"></i>
                      </div>
                      <div class="feature-info-content">
                        <h6 class="feature-info-title font-weight-bold">Free Shipping</h6>
                        <p class="mb-0 small">On all order over $200.00</p>
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-md-0 mb-4">
                    <div class="feature-info text-center">
                      <div class="feature-info-icon">
                        <i class="flaticon-headphone"></i>
                      </div>
                      <div class="feature-info-content">
                        <h6 class="feature-info-title font-weight-bold">Friendly Support</h6>
                        <p class="mb-0 small">24 hours per day, excluding holiday</p>
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-md-0 mb-4">
                    <div class="feature-info text-center">
                      <div class="feature-info-icon">
                        <i class="flaticon-buy"></i>
                      </div>
                      <div class="feature-info-content">
                        <h6 class="feature-info-title font-weight-bold">Money Back</h6>
                        <p class="mb-0 small">10 days for free return and exchange</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="tab-pane fade mb-4" id="reviews" role="tabpanel" aria-labelledby="tab-reviews">
                <div class="row">
                  <div class="col-12">
                  <div class="mt-4 ">
                      <h5>Add a review</h5>
                    </div>
                  <form name="frmReviewInsert" id="frmReviewInsert" class="form-row mt-4 align-items-center">
                  	 <input type="hidden" name="p_no" value="<%=p_no%>">
                      <div class="form-group col-sm-12">
                        <label>리뷰를 적어주세요 *</label>
                        <div class="form-group">
                          <textarea class="form-control" rows="5" id="content" name="content" ></textarea>
                        </div>
                      </div>
                      <div class="form-group col-sm-12">
                        <label>Your rating </label>
                        <div class="review_rating">
				            <div class="warning_msg">별점을 선택해 주세요 *</div>
				            <div class="rating">
				            <br>
				                <!-- 해당 별점을 클릭하면 해당 별과 그 왼쪽의 모든 별의 체크박스에 checked 적용 -->
				                <input type="radio" name="star" value="1">
				                 <i class="fas fa-star"></i>
				                <input type="radio" name="star" value="2">
				                 <i class="fas fa-star"></i> <i class="fas fa-star"></i>
				                <input type="radio" name="star" value="3" >
				                <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i>
				                <input type="radio" name="star" value="4">
				                 <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i>
				                <input type="radio" name="star" value="5">
				                 <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i> <i class="fas fa-star"></i>
				            	
				            </div>
				        </div>
                      </div>
                    </form>
                    <a class="btn btn-dark btn-md mt-4" href="#" onclick="reviewInsert();">Submit</a>
                   <br/>
                   <br/>
                    <h6 class="mb-4"><%=count %> Reviews for <%=product.getP_name() %></h6>
                    <%for(Review review : reviewNo) {%>
                    <div class="commentlist">
                      <div class="comment-author">
                        <img class="rounded-circle" src="images/avatar/icon.jpg" alt="">
                      </div>
                      <div class="comment-content">
                        <div class="reviews">
                          <p class="meta">
                            <strong><%=review.getUserInfo().getUser_id() %></strong>
                          </p>
                          <div class="rating">
                          <%for(int i = 0; i< review.getR_score(); i++ ){ %>
                            <i class="fas fa-star"></i>
                          <%} %>
                          </div>
                        </div>
                        <p><%=review.getR_content() %></p>
                      </div>
                    </div>
                    <%} %>
                  </div><br>
                <pre>									</pre>
                <a class="page-link" href=".product_detail_form.jsp?reviewpageno=1" style="display:block; width:25px; height:40px;"
                  aria-label="Previous" n><span aria-hidden="true">&laquo;</span>
                  </a>
                  <%if(reviewListPage.pageMaker.getPrevPage()!=0){ %>
                  <a class="page-link" href="./product_detail_form.jsp?reviewpageno=<%=reviewListPage.pageMaker.getPrevPage()%>" style="display:block; width:25px; height:40px;"
                  aria-label="Previous"><span aria-hidden ="true">&laquo;</span>
                  </a>
                  <%}else{ %>
                  <a class="page-link" href=".product_detail_form.jsp?reviewpageno=1"  style="display:block; width:25px; height:40px;"
                  aria-label="Previous"><span aria-hidden="true">&lsaquo;</span>
                  </a>
                  <%} %>
                  
                  <%
                  for (int i = reviewListPage.pageMaker.getBlockBegin(); i <= reviewListPage.pageMaker.getBlockEnd(); i++) {
                   if(reviewListPage.pageMaker.getCurPage() == i){
                   %>
                   <span class="page-link">
								<%=i%> <span class="sr-only">(current)</span>
					</span>
					<%
					} else {
					%>
					<a class="page-link" style="display:block; width:35px; height:40px;"
						href="./product_detail_form.jsp?reviewpageno=<%=i %>"><%=i %></a></li>
						<%
						}
						}%>
						
						<%if(reviewListPage.pageMaker.getNextPage()<reviewListPage.pageMaker.getTotPage()) {%>
						<a class="page-link" href="product_detail_form.jsp?reviewno=<%=reviewListPage.pageMaker.getNextPage()%>" style="display:block; width:25px; height:40px;"
							aria-label="Next"> <span aria-hidden="true">&rsaquo;</span> <span
								class="sr-only">Next</span>
						</a>
						<%} else {%>
						<a class="page-link" href="product_detail_form.jsp?reviewno=<%=reviewListPage.pageMaker.getTotPage()%>" style="display:block; width:25px; height:40px;"
							aria-label="Next"> <span aria-hidden="true">&rsaquo;</span> <span
								class="sr-only">Next</span>
						</a>
						<%} %>
						<a class="page-link" href="product_detail_form.jsp?reviewno=<%=reviewListPage.pageMaker.getTotPage()%>" style="display:block; width:25px; height:40px;"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
								class="sr-only">Next</span>
						</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-3">
        </div>
      </div>
    </section>
    <!--=================================
    Product -->

    <!--=================================
    footer-->
    <jsp:include page="include_common_bottom.jsp"></jsp:include>
    <!--=================================
    Back To Top -->

    <!--=================================
    Javascript -->

    <!-- JS Global Compulsory (Do not remove)-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>

    <!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
    <script src="js/owl-carousel/owl.carousel.min.js"></script>
    <script src="js/slick/slick.min.js"></script>
    <script src="js/jarallax/jarallax.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>
