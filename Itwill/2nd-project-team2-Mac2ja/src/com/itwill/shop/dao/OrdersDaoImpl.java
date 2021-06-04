package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.OrdersMapper;
import com.itwill.shop.domain.Orders;
import com.itwill.shop.domain.OrdersDetail;

public class OrdersDaoImpl implements OrdersDao {
	private SqlSessionFactory sqlSessionFactory;
	public static String NAMESPACE = "com.itwill.shop.dao.mapper.OrdersMapper.";
	
	public OrdersDaoImpl() {
		try {
			InputStream Orderconfig = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sessionFactoryBuilder = new SqlSessionFactoryBuilder();
			sqlSessionFactory = sessionFactoryBuilder.build(Orderconfig);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int createOrders(Orders orders) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(false);
		try {
			int rowCount = sqlSession.insert(NAMESPACE+"createOrders",orders);
			return rowCount;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}	
	}
	
	@Override
	public int createOrdersDetail(OrdersDetail ordersDetail) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int rowcount = sqlSession.insert(NAMESPACE+"createOrdersDetail",ordersDetail);	
			return rowcount;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Override
	public int createOrdersAll(Orders orders) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int rowCount = 0;
		try {
			rowCount = sqlSession.insert(NAMESPACE+"createOrders",orders);
			for (OrdersDetail ordersDetail : orders.getOrdersdetailList()) {
				rowCount += sqlSession.insert(NAMESPACE+"createOrdersDetail",ordersDetail);
			}
			
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return rowCount;
	}
	
	@Override
	public int deleteOrders(int members_no) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int row = sqlSession.insert(NAMESPACE+"deleteOrders",members_no);	
			return row;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Override
	public int deleteOrdersDetail(int members_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int row = sqlSession.insert(NAMESPACE+"deleteOrdersDetail",members_no);	
			return row;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Override
	public int deleteOrdersAll(int members_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int rowCount = 0;
		try {
			rowCount = sqlSession.insert(NAMESPACE+"deleteOrdersDetail",members_no);	
			rowCount += sqlSession.insert(NAMESPACE+"deleteOrders",members_no);
			
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return rowCount;
	}
	
	@Override
	public int deleteOrdersByNo(int orders_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int row = sqlSession.insert(NAMESPACE+"deleteOrdersByNo",orders_no);
			return row;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Override
	public int deleteOrdersDetailByNo(int orders_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int row = sqlSession.insert(NAMESPACE+"deleteOrdersDetailByNo",orders_no);
			return row;
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
	}
	
	@Override
	public int deleteOrdersAllByNo(int orders_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int rowCount = 0;
		try {
			rowCount = sqlSession.insert(NAMESPACE+"deleteOrdersDetailByNo",orders_no);	
			rowCount += sqlSession.insert(NAMESPACE+"deleteOrdersByNo",orders_no);
			
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return rowCount;
	}
	
	@Override
	public Orders findOrderByOne(HashMap<String,Object> hashmap) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Orders orders = sqlSession.selectOne(NAMESPACE+"findOrderByOne",hashmap);
		sqlSession.commit();
		sqlSession.close();
		return orders;
	}
	
	@Override
	public List<Orders> findOrderListById(int members_no) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Orders> ordersList = sqlSession.selectList(NAMESPACE+"findOrderListById",members_no);
		sqlSession.commit();
		sqlSession.close();
		return ordersList;
	}
}
