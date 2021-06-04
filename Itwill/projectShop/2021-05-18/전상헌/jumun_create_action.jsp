<%@page import="com.itwill.shop.product.Product"%>
<%@page import="com.itwill.shop.product.ProductService"%>
<%@page import="com.itwill.shop.jumun.Jumun"%>
<%@page import="com.itwill.shop.jumunDetail.jumunDetailService"%>
<%@page import="com.itwill.shop.jumun.JumunService"%>
<%@page import="com.itwill.shop.cart.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.cart.CartService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("shop_main.jsp");
	return ;
	
}
String userid=(String)session.getAttribute("loginUser");
int tot=Integer.parseInt(request.getParameter("tot"));




ProductService productService=new ProductService();
CartService cartService=new CartService();
JumunService jumunService=new JumunService();
jumunDetailService jumunDetailService=new jumunDetailService();
String buyType=request.getParameter("buyType");
if(buyType.equalsIgnoreCase("direct")){
int	 p_no=Integer.parseInt(request.getParameter("p_no"));
int	 p_qty=Integer.parseInt(request.getParameter("p_qty"));
	
Product product=productService.productSelectOne(p_no);
	
jumunService.insert(product.getP_name(), tot, userid);
List<Jumun> jumunList=jumunService.selectById(userid);
int j_no=0;
for(Jumun jumun:jumunList){
	
	if(!jumunDetailService.isDetailExist(jumun.getJ_no())){
		j_no=jumun.getJ_no();
	}
}
jumunDetailService.insertDetail(p_qty, p_no, j_no);

response.sendRedirect("jumun_list.jsp");
}else{




List<Cart> cartlist=cartService.cartList(userid);
String j_desc=null;
int cartlistsize=cartlist.size()-1;
int j_no=0;
for(Cart cart:cartlist){
	if(j_desc==null){
		j_desc=cart.getProduct().getP_name()+"외"+cartlistsize+"종";
		jumunService.insert(j_desc, tot, userid);
		List<Jumun> jumunList=jumunService.selectById(userid);
		for(Jumun jumun:jumunList){
			
			if(!jumunDetailService.isDetailExist(jumun.getJ_no())){
				j_no=jumun.getJ_no();
			}
		}
		
		
	}
	
	jumunDetailService.insertDetail(cart.getCart_qty(),cart.getProduct().getP_no(),j_no);
	
	
}

cartService.deleteAll(userid);
response.sendRedirect("jumun_list.jsp");
}



%>