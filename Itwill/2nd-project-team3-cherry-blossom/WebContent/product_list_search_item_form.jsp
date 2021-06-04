<%@page import="java.text.DecimalFormat"%>
<%@page import="com.itwill.shop.service.ProductService"%>
<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String searchProduct = request.getParameter("searchWord");
	if(searchProduct==null || searchProduct.equals("")) {
		response.sendRedirect("shop_main.jsp");
		return;
	}
	List<Product> productList = ProductService.getInstance().findProductByNameLike(searchProduct);
%>
<!DOCTYPE html>


    <!--=================================
    Header -->
	<jsp:include page="include_common_top.jsp"></jsp:include>
    <!--=================================
    Header -->

    <!--=================================
    Products -->
    <section class="space-pt">
      <div class="container">
        <div class="row justify-content-center text-center">
          <div class="col-md-6">
            <div class="section-title">
              <h2>Search Products</h2>
              <h5>Search Word : <%=searchProduct %></h5>
              <p>Forget about struggling to do everything at once: taking care of the family, running your business etc.</p>
            </div>
          </div>
        </div>
        <div class="row justify-content-center">
        <!-- product start -->
        <%for(Product product:productList){%>
          <div class="col-lg-3 col-md-4 col-sm-6">
            <div class="product">
              <div class="product-image">
				<img class="img-fluid mx-auto" src="images/shop/product/<%=product.getP_name()%>1.jpg" height="360px" alt="">
                <div class="product-actions">
                  <div class="product-search">
                    <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><i class="fas fa-search"></i></a>
                  </div>
                </div>
                <div class="swatch-colored">
                  <ul class="list-unstyled mb-0">
                    <%=product.getP_color() %>
                  </ul>
                </div>
              </div>
              <div class="product-info">
                <div class="product-title">
                  <a href="product_detail_form.jsp?p_no=<%=product.getP_no() %>"><%=product.getP_name() %></a>
                </div>
                <div class="product-category">
                  <span><%=product.getP_category() %></span>
                </div>
                <div class="product-price-cart">
                  <div class="product-price">
                    <ins><%=new DecimalFormat("#,##0").format(product.getP_price()) %></ins>
                  </div>
                  <div class="product-cart">
                  	<form id="cart_add_f_<%=product.getP_no()%>" name="cart_add_f_<%=product.getP_no()%>" method="post">
						<input type="hidden" name="p_no" value="<%=product.getP_no()%>">
						<input type="hidden" name="cart_qty" value="1">
					</form>
                    <a class="btn btn-link" href="#"><i class="fas fa-shopping-cart mr-1"></i>add to cart</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <%} %>
          <!-- product end -->
        </div>
        <div class="row">
          <div class="col-md-12 text-center">
            <a class="btn btn-outline-light mt-3 mt-sm-4" href="#">Shop all</a>
          </div>
        </div>
      </div>
    </section>
    <!--=================================
    Products -->

    <!--=================================
    Blog -->
 
    <!--=================================
    Blog -->

    <!--=================================
    Instagram -->

    <!--=================================
    Instagram -->

    <!--=================================
    bottom-->
	<jsp:include page="include_common_bottom.jsp"></jsp:include>
    <!--=================================
    bottom -->

    <!--=================================
    Promo Popup -->

    <!--=================================
    Promo Popup -->

    <!--=================================
    Quick view popup -->

    <!--=================================
    Quick view popup -->

    <!--=================================
    Javascript -->

    <!-- JS Global Compulsory (Do not remove)-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/popper/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>

    <!-- Page JS Implementing Plugins (Remove the plugin script here if site does not use that feature)-->
    <script src="js/jquery.appear.js"></script>
    <script src="js/owl-carousel/owl.carousel.min.js"></script>
    <script src="js/swiper/swiper.min.js"></script>
    <script src="js/swiperanimation/SwiperAnimation.min.js"></script>
    <script src="js/magnific-popup/jquery.magnific-popup.min.js"></script>
    <script src="js/shuffle/shuffle.min.js"></script>

    <!-- Template Scripts (Do not remove)-->
    <script src="js/custom.js"></script>

  </body>
</html>
