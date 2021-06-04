package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.AddressMapper;
import com.itwill.shop.dao.mapper.JumunMapper;
import com.itwill.shop.domain.Address;
import com.itwill.shop.domain.Jumun;
import com.itwill.shop.domain.Jumun_detail;

public class JumunDaoImpl implements JumunDao {
	private SqlSessionFactory sqlSessionFactory;
	public static String NAMESPACE = "com.itwill.shop.dao.mapper.JumunMapper";

	public JumunDaoImpl() {
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public List<Jumun> selectAllById(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		JumunMapper jumunMapper = sqlSession.getMapper(JumunMapper.class);
		List<Jumun> jumunList = jumunMapper.selectAllById(user_id);
		sqlSession.commit();
		sqlSession.close();
		return jumunList;
	}


	@Override
	public int insertNewAddress(Address address) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		int rowCount = addressMapper.insertNewAddress(address);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}

	@Override
	public Address selectNewAddressByNo(Integer a_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		Address newAddress = addressMapper.selectNewAddressByNo(a_no);
		sqlSession.commit();
		sqlSession.close();
		return newAddress;
	}

	@Override
	public int insertJumun(Jumun jumun) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		JumunMapper jumunMapper = sqlSession.getMapper(JumunMapper.class);
		int rowCount = jumunMapper.insertJumun(jumun);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}

	@Override
	public int insertJumunDetail(Jumun_detail jumun_detail) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		JumunMapper jumunMapper = sqlSession.getMapper(JumunMapper.class);
		int rowCount = jumunMapper.insertJumunDetail(jumun_detail);
		sqlSession.commit();
		sqlSession.close();
		return rowCount;
	}


	@Override
	public List<Jumun> detail(Integer j_no) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		JumunMapper jumunMapper = sqlSession.getMapper(JumunMapper.class);
		List<Jumun> jumunList = jumunMapper.detail(j_no);
		sqlSession.commit();
		sqlSession.close();
		return jumunList;
	}

/*
 * @Override
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
 */
	@Override
	public int createJumunAll(Jumun jumun) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int rowCount = 0;
		try {
			JumunMapper jumunMapper = sqlSession.getMapper(JumunMapper.class);
			rowCount = jumunMapper.insertJumun(jumun);
			for (Jumun_detail jumun_detail : jumun.getJumun_detailList()) {
				rowCount += jumunMapper.insertJumunDetail(jumun_detail);
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

}