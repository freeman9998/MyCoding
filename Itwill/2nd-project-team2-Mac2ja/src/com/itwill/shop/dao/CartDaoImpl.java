package com.itwill.shop.dao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.CartMapper;
import com.itwill.shop.dao.mapper.FoodMapper;
import com.itwill.shop.domain.Cart;

public class CartDaoImpl implements CartDao {
	/*
	 * 이름         널?       유형         
	---------- -------- ---------- 
	CART_NO    NOT NULL NUMBER(10) 
	CART_QTY            NUMBER(10) 
	MEMBERS_NO          NUMBER(10) 
	MENU_NO             NUMBER(10) 
	 */
	private SqlSessionFactory sqlSessionFactory;
	public CartDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = 
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = 
					sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Cart> findCartAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		List<Cart> cartList = cartMapper.findCartAll();
		return cartList;
	}
	@Override
	public List<Cart> findCartByFoodNo(Integer foodNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		List<Cart> cart = cartMapper.findCartByFoodNo(foodNo);
		return cart;
	}
	@Override
	public int updateCartByNo(Cart cart) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int updateRow = cartMapper.updateCartByNo(cart);
		return updateRow;
	}
	@Override
	public int insertCart(Cart cart) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int insertRow = cartMapper.insertCart(cart);
		return insertRow;
	}
	@Override
	public int deleteCartByNo(Integer cartNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int deleteRow = cartMapper.deleteCartByNo(cartNo);
		return deleteRow;
	}
	@Override
	public List<Cart> findCartByMembersNo(Integer membersNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		List<Cart> cart = cartMapper.findCartByMembersNo(membersNo);
		return cart;
	}
	@Override
	public int deleteCartByMember(Integer membersNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		CartMapper cartMapper = sqlSession.getMapper(CartMapper.class);
		int deleteRow = cartMapper.deleteCartByMember(membersNo);
		return deleteRow;
	}
	


}