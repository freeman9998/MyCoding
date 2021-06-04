package com.itwill.shop.service;

import java.util.HashMap;
import java.util.List;

import com.itwill.shop.dao.OrdersDao;
import com.itwill.shop.dao.OrdersDaoImpl;
import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;

public class OrdersService {
	private OrdersDao ordersDao;
	
	public OrdersService() {
		ordersDao=new OrdersDaoImpl();
	}
	
	public List<Orders> findOrderListById(int members_no) throws Exception{
		return ordersDao.findOrderListById(members_no);
	}
	
	public Orders findOrderByOne(HashMap<String, Object> hashmap) throws Exception{
		return ordersDao.findOrderByOne(hashmap);
	}
	
	public int createOrders(Orders orders) throws Exception{
		return ordersDao.createOrders(orders);
	}
	
	public int createOrdersDetail(OrdersDetail ordersDetail) throws Exception{
		return ordersDao.createOrdersDetail(ordersDetail);
	}
	
	public int createOrdersAll(Orders orders) throws Exception{
		return ordersDao.createOrdersAll(orders);
	}
	
	public int deleteOrders(int members_no) throws Exception {
		return ordersDao.deleteOrders(members_no);
	}
	
	public int deleteOrdersDetail(int members_no) throws Exception{
		return ordersDao.deleteOrdersDetail(members_no);
	}
	
	public int deleteOrdersAll(int members_no) throws Exception{
		return ordersDao.deleteOrdersAll(members_no);
	}
	
	public int deleteOrdersByNo(int orders_no) throws Exception{
		return ordersDao.deleteOrdersByNo(orders_no);
	}
	
	public int deleteOrdersDetailByNo(int orders_no) throws Exception{
		return ordersDao.deleteOrdersDetailByNo(orders_no);
	}
	
	public int deleteOrdersAllByNo(int orders_no) throws Exception{
		return ordersDao.deleteOrdersAllByNo(orders_no);
	}
}
