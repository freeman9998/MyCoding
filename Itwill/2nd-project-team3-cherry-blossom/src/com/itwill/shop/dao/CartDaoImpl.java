package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CartMapper;
import com.itwill.shop.domain.Cart;

public class CartDaoImpl implements CartDao{
	private SqlSessionFactory sqlSessionFactory;
	public CartDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Cart> getCartList(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		List<Cart> cartList = cartMapper.getCartList(user_id);
		return cartList;
	}
		
	
	@Override
	public int add(Cart cart) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int rowCount = cartMapper.add(cart);
		return rowCount;
	}
	@Override
	public int updateCartQty(Cart cart) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int rowCount = cartMapper.updateCartQty(cart);
		return rowCount;
	}

	@Override
	public int deleteCartByNo(Integer cart_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int rowCount = cartMapper.deleteCartByNo(cart_no);
		return rowCount;
	}

	@Override
	public int deleteCart(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int rowCount = cartMapper.deleteCart(user_id);
		return rowCount;
	}
	
}
