package com.itwill.shop.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;

public interface OrdersDao {
	public int createOrders(Orders orders) throws Exception;
	public int createOrdersDetail(OrdersDetail ordersDetail);
	public int createOrdersAll(Orders orders);
	
	public List<Orders> findOrderListById(int members_no) throws Exception;
	public Orders findOrderByOne(HashMap<String,Object> hashmap) throws Exception;
	
	public int deleteOrders(int members_no) throws Exception;
	public int deleteOrdersDetail(int members_no);
	public int deleteOrdersAll(int members_no);
	
	public int deleteOrdersByNo(int orders_no);
	public int deleteOrdersDetailByNo(int orders_no);
	public int deleteOrdersAllByNo(int orders_no);
}