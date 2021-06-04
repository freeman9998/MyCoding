<%@page import="com.itwill.shop.service.FoodService"%>
<%@page import="com.itwill.shop.domain.Food"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.shop.domain.OrdersDetail"%>
<%@page import="com.itwill.shop.domain.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Orders"%>
<%@page import="com.itwill.shop.service.CartService"%>
<%@page import="com.itwill.shop.service.OrdersService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="login_check.jspf" %>
<%

//사람 정보는 세션에서 구해오면 됨
//제품 수량 정보는 카트에서 구해오면 됨

	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("mac_main.jsp");
		return;
	}

	request. setCharacterEncoding("UTF-8");
	String address = request.getParameter("receiver_address");

	OrdersService ordersService = new OrdersService();
	CartService cartService=new CartService();
	FoodService foodService = new FoodService();
	

	//Orders orders = new Orders(null, );
	
	//ordersService.createOrdersAll(orders);
	try{
	List<Cart> cartList=cartService.findCartByMembersNo(sMemberNo);
	ArrayList<OrdersDetail> ordersDetailList= new ArrayList<OrdersDetail>();
	int j_tot_price=0;
	Food food = null;
		for (Cart cart : cartList) {
			OrdersDetail ordersDetail=new OrdersDetail(0,cart.getCartQty(),0, cart.getFoodNo());
			ordersDetailList.add(ordersDetail);
			
			food = foodService.findFoodByNo(ordersDetail.getFood_no());
			j_tot_price+=ordersDetail.getOrders_detail_qty()*food.getFoodPrice();
		}
	food = foodService.findFoodByNo(ordersDetailList.get(0).getFood_no());
	
	String j_desc = null;
	if(ordersDetailList.size() <= 1){
		j_desc = food.getFoodName();
	}else{
		j_desc = food.getFoodName()+" 외 "+ordersDetailList.size()+"개";
	}
	Orders newOrders=new Orders(0,j_desc, null, j_tot_price, address ,sMemberNo,ordersDetailList);
		
	ordersService.createOrdersAll(newOrders);
	cartService.deleteCartByMember(sMemberNo);
	

		response.sendRedirect("jumunComplete.jsp");	
	}catch(Exception e){
		e.printStackTrace();
		response.sendRedirect("jumunForm.jsp");	
	}
%>
