package com.itwill.shop.dao.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.itwill.shop.domain.Cart;
import com.itwill.shop.domain.Food;
import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;
import com.itwill.shop.service.CartService;
import com.itwill.shop.service.FoodService;
import com.itwill.shop.service.OrdersService;

public class OrderTestMain {

	public static void main(String[] args) throws Exception {
		OrdersService ordersService = new OrdersService();
		CartService cartService = new CartService();
		FoodService foodService = new FoodService();
		//select
//		HashMap<String, Object> hashmap = new HashMap<>();
//		hashmap.put("members_no", 1);
//		hashmap.put("orders_no", 2);
		/*
		System.out.println(ordersService.findOrderByOne(hashmap));
		System.out.println(ordersService.findOrderListById(1));
		*/
		
		//insert
//		OrdersDetail od1 = new OrdersDetail(0, 1, 0, 301);
//		OrdersDetail od2 = new OrdersDetail(0, 4, 0, 302);
//		ArrayList<OrdersDetail> odl = new ArrayList<>();
//		odl.add(od1);
//		odl.add(od2);
//		Orders o = new Orders(0, "2개", null, 39800,"참살기좋아요" ,2, odl);
//		System.out.println(ordersService.createOrdersAll(o));
		/*
		System.out.println(ordersService.createOrders(o));
		for (OrdersDetail ordersDetail : odl) {
			System.out.println(ordersService.createOrdersDetail(ordersDetail));
		}
		*/
		
		//delete
		/*
			System.out.println(ordersService.deleteOrdersDetail(1));
			System.out.println(ordersService.deleteOrders(1));
			System.out.println(ordersService.deleteOrdersDetailByNo(3));
			System.out.println(ordersService.deleteOrdersByNo(3));	
			System.out.println(ordersService.deleteOrdersAllByNo(7));
			System.out.println(ordersService.deleteOrdersAll(2));
		*/

			List<Cart> cartList=cartService.findCartByMembersNo(9);
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
			System.out.println(j_desc+" "+j_tot_price+" "+null+" "+9+" "+ordersDetailList);
			Orders newOrders=new Orders(0,j_desc, null, 0, null ,9,ordersDetailList);
			ordersService.createOrdersAll(newOrders);
			//cartService.deleteCartByMember(9);
			
	
	}

}
