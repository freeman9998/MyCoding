<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.shop.domain.Jumun_detail"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="com.itwill.shop.service.UserInfoService"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.service.ProductService"%>
<%@page import="com.itwill.shop.domain.Product"%>
<%@page import="com.itwill.shop.service.JumunService"%>
<%@page import="com.itwill.shop.domain.Jumun"%>
<%@page import="com.itwill.shop.domain.UserInfo"%>
<%@page import="com.itwill.shop.domain.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %> 
<%

	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("jumun_form.jsp");
		return;
	}
	request.setCharacterEncoding("UTF-8");
	
	
	String j_no = request.getParameter("j_no");
	String ao_name = request.getParameter("ao_name");
	String ad_name = request.getParameter("ad_name");
	String ad_phone = request.getParameter("ad_phone");
	String ad_address = request.getParameter("ad_address");
	String ad_message = request.getParameter("ad_message");
	String j_status = "입금확인중";
	String j_payment = "카드결제";
	
	List<Cart> cartList = CartService.getInstance().getCartList(sUserId);
	ArrayList<Jumun_detail> jdList = new ArrayList<Jumun_detail>(); 
	
	int j_tot_price=0;
	Product product = null;
	
	for(Cart cart : cartList) {
		Jumun_detail jumun_detail = new Jumun_detail(0,cart.getCart_qty(),0,cart.getProduct().getP_no());
		jdList.add(jumun_detail);
		
		product= ProductService.getInstance().findProductByNo(jumun_detail.getP_no());
		j_tot_price+=jumun_detail.getJd_qty()*product.getP_price();
	}
	
	product = ProductService.getInstance().findProductByNo(jdList.get(0).getP_no());
	
	Jumun newJumun = new Jumun(1,null,j_tot_price,j_status,j_payment,sUserId,jdList);
	
	int rowCount = JumunService.getInstance().createJumunAll(newJumun);

	response.sendRedirect("jumun_complete_form.jsp");
	
	
%>