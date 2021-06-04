package com.itwill.shop.dao.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;

public interface OrdersMapper {
	/*
	 * 인터페이스의 풀네임은 StudentMapper.xml의 namespace와일치
	 * 메쏘드이름은 	StudentMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 StudentMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 StudentMapper.xml 파일의 resultType 와일치(ResultSet이 한 개 이상일 경우 반환타입이 List이다)
	 */
	public int createOrders(Orders orders);
	public int createOrdersDetail(OrdersDetail ordersDetail);
	public int createOrdersAll(Orders orders);
	
	public List<Orders> findOrderListById(int members_no);
	public Orders findOrderByOne(HashMap<String,Object> hashmap);
	
	public int deleteOrders(int members_no);
	public int deleteOrdersDetail(int members_no);
	public int deleteOrdersAll(int members_no);
	
	public int deleteOrdersByNo(int orders_no);
	public int deleteOrdersDetailByNo(int orders_no);
	public int deleteOrdersAllByNo(int orders_no);
}
