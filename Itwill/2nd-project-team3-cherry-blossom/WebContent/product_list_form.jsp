<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Map"%>
<%@page import="com.itwill.shop.service.ProductService"%>
<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String p_category = request.getParameter("P_CATEGORY");
	String p_subcategory = request.getParameter("P_SUBCATEGORY");
	String name = request.getParameter("name");
	String lowPrice = request.getParameter("low_price");
	String highPrice = request.getParameter("high_price");
	
	if(p_category==null || p_category.equals("")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}
	if(p_category.equals("OPS_SKIRT"))p_category="OPS/SKIRT";
	
	List<Map> categoryMapList = new ArrayList<Map>();
	List<Map> subcategoryMapList = new ArrayList<Map>();
	List<Product> categoryProductList = new ArrayList<Product>();
	List<Product> subcategoryProductList = new ArrayList<Product>();
	
	try {
		categoryMapList = ProductService.getInstance().listCategoryByCategoryMap();
		subcategoryMapList = ProductService.getInstance().listSubCategoryByCategoryMap(p_category);
				
	}catch(Exception e) {
		System.out.println(">>>>in3");
		response.sendRedirect("shop_main.jsp");
		return;
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
    <link rel="stylesheet" href="css/owl-carousel/owl.carousel.min.css" />
    <link rel="stylesheet" href="css/select2/select2.css" />
    <link rel="stylesheet" href="css/range-slider/ion.rangeSlider.css" />

    <!-- Template Style -->
    <link rel="stylesheet" href="css/style.css" />

  </head>
  
  <body class="quick-view">
	<%
	for(Product product:subcategoryProductList){ 
	%>
	<form id="cart_add_f_<%=product.getP_no()%>" name="cart_add_f_<%=product.getP_no()%>" method="post">
		<input type="hidden" name="p_no" value="<%=product.getP_no()%>">
		<input type="hidden" name="cart_qty" value="1">
	</form>
	<% }%>
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
            <h1 class="text-white text-uppercase mb-0"><%=p_category %></h1>
          </div>
        </div>
      </div>
    </div>
    <!--=================================
    Inner Header -->

    <!--=================================
    categories -->
      <section class="space-pt">
        <div class="container">
          <div class="row space-sm-pb justify-content-center">
            <div class="col-md-9">
              <div class="owl-carousel our-clients" data-nav-arrow="false" data-items="5" data-md-items="4" data-sm-items="3" data-xs-items="3" data-xx-items="2" data-space="30" data-autoheight="true" data-autospeed="4000">
             
<!--***************All***************-->
              
              <%for(Map categoryMap:categoryMapList) { 
              		if(categoryMap.get("P_CATEGORY").equals(p_category)) {
              %>
              <div class="item">
               <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>">
                <div class="feature-categories text-center">
                  <div class="feature-icon">
                    <i class="flaticon-null fa-3x line-height-1"></i>
                  </div>
                  <div class="feature-content">
                    <h6 class="category-name"><%="ALL" %></h6>
                  </div>
                  <div class="category-count">
                    <span class="count"> <%=categoryMap.get("CNT") %> </span>
                  </div>
                </div>
               </a>
              </div>
              <%
              		}
              }
              %>
              
              <!-- end -->
              
<!-- **********************서브카테고리-->

			
              <%for(Map subcategoryMap:subcategoryMapList) {%>
              <div class="item">
               <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>&P_SUBCATEGORY=<%=subcategoryMap.get("P_SUBCATEGORY")%>">
                <div class="feature-categories text-center">
                  <div class="feature-icon">
                    <i class="flaticon-null fa-3x line-height-1"></i>
                  </div>
                  <div class="feature-content">
                    <h6 class="category-name"><%=subcategoryMap.get("P_SUBCATEGORY") %></h6>
                  </div>
                  <div class="category-count">
                    <span class="count"> <%=subcategoryMap.get("CNT") %> </span>
                  </div>
                </div>
               </a>
              </div>
              <%} %>
              <!-- end -->
			
            </div>
            </div>
          </div>
        </div>
      </section>
    <!--=================================
    categories -->

    <!--=================================
    Product -->
    <section class="space-pt">
      <div class="container">
        <div class="row justify-content-center text-center">
          <div class="col-md-10">
        
<!--********************정렬! -->

              <div class="widget">
                <div class="widget-title">
                  <h6 class="mb-3">Filter</h6>
                </div>
                <div class="widget-categories">
                  <ul class="list-unstyled list-style mb-0">
                    <li>
                    <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>&P_SUBCATEGORY=<%=p_subcategory%>">신상품</a>&nbsp;
                    <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>&P_SUBCATEGORY=<%=p_subcategory%>&name">상품명</a>&nbsp;
                    <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>&P_SUBCATEGORY=<%=p_subcategory%>&low_price">낮은가격</a>&nbsp;
                    <a href="product_list_form.jsp?P_CATEGORY=<%=p_category%>&P_SUBCATEGORY=<%=p_subcategory%>&high_price">높은가격</a>
           			<br><br>
                    </li>
                  </ul>
                </div>
              </div>
          </div>
          <div class="col-lg-9 order-1 order-lg-1">
          
            <div class="row justify-content-center">

<!-- ************************상품[ALL] --> 
		<%if(p_subcategory==null||p_subcategory.equals("null")){ 
           System.out.println(">>>>sub null");
           if(name!=null){
        	   categoryProductList = ProductService.getInstance().listCategoryByName(p_category);
           }else if(lowPrice!=null){
        	   categoryProductList = ProductService.getInstance().listCategoryLowPrice(p_category);
           }else if(highPrice!=null){
        	   categoryProductList = ProductService.getInstance().listCategoryHighPrice(p_category);
           }else{
           		categoryProductList = ProductService.getInstance().listCategoryByDate(p_category);
           }
           for(Product product:categoryProductList) {%>
              <div class="col-lg-3 col-md-4 col-sm-6">
                <div class="product">
                  <div class="product-image">
                    <img class="img-fluid mx-auto" src="images/shop/product/<%=product.getP_name()%>1.jpg" alt="">
                    <div class="product-actions">
                      <div class="product-search">
                        <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><i class="fas fa-search"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="product-info">
                    <div class="product-title">
                      <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><%=product.getP_name() %></a>
                    </div>
                    <div class="product-price-cart">
                      <div class="product-price">
                        <ins><%=new DecimalFormat("#,##0").format(product.getP_price()) %></ins>
                      </div>
                      <div class="product-cart">                     	
                        <a class="btn btn-link" href="javascript:cartAdd('cart_add_f_<%=product.getP_no()%>')"><i class="fas fa-shopping-cart mr-1"></i>add to cart</a>                     
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <%} %>
          <%}else{ %>
<!-- ************************상품[서브] -->
            <%
            if(name!=null){
            	subcategoryProductList = ProductService.getInstance().listSubCategoryByName(p_subcategory);	
            }else if(lowPrice!=null){
            	subcategoryProductList = ProductService.getInstance().listSubCategoryByLowPrice(p_subcategory);
            }else if(highPrice!=null){
            	subcategoryProductList = ProductService.getInstance().listSubCategoryByHighPrice(p_subcategory);
            }else{
	            subcategoryProductList = ProductService.getInstance().listSubCategoryByDate(p_subcategory);           	
            }
    		System.out.println(">>>>in2");
            for(Product product:subcategoryProductList) {%>
              <div class="col-sm-6 col-md-4">
                <div class="product">
                  <div class="product-image">
                    <img class="img-fluid mx-auto" src="images/shop/product/<%=product.getP_name()%>1.jpg" alt="">
                    <div class="product-actions">
                      <div class="product-search">
                        <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><i class="fas fa-search"></i></a>
                      </div>
                    </div>
                  </div>
                  <div class="product-info">
                    <div class="product-title">
                      <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><%=product.getP_name() %></a>
                    </div>
                    <div class="product-price-cart">
                      <div class="product-price">
                        <ins><%=new DecimalFormat("#,##0").format(product.getP_price()) %></ins>
                      </div>
                      <div class="product-cart">                     	
                        <a class="btn btn-link" href="javascript:cartAdd('cart_add_f_<%=product.getP_no()%>')"><i class="fas fa-shopping-cart mr-1"></i>add to cart</a>                     
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              	<%}%>
            <%}%>
              <!-- end -->


			 
				
              
            </div>
            
            <!-- 
            <div class="row">
              <div class="col-12 text-center mt-4">
                <nav>
                  <ul class="pagination justify-content-center mb-0">
                    <li class="page-item active">
                      <span class="page-link">
                        1
                        <span class="sr-only">(current)</span>
                      </span>
                    </li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#">...</a></li>
                    <li class="page-item"><a class="page-link" href="#">8</a></li>
                    <li class="page-item"><a class="page-link" href="#">9</a></li>
                    <li class="page-item">
                      <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&rsaquo;</span>
                        <span class="sr-only">Next</span>
                      </a>
                    </li>
                  </ul>
                </nav>
              </div>
            </div>
            -->
            
          </div>
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
    <script src="js/select2/select2.full.js"></script>
    <script src="js/owl-carousel/owl.carousel.min.js"></script>
    <script src="js/range-slider/ion.rangeSlider.min.js"></script>
    <script src="js/jarallax/jarallax.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>
