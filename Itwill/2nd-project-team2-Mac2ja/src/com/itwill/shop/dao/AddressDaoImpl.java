package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.AddressMapper;
import com.itwill.shop.dao.mapper.CategoryMapper;
import com.itwill.shop.domain.Address;

public class AddressDaoImpl implements AddressDao {
	
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE="com.itwill.shop.dao.mapper.AddressMapper.";
	public AddressDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream=
					Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
		this.sqlSessionFactory=
				sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<Address> findAddressByNo(int addressNo) {
		SqlSession sqlsession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlsession.getMapper(AddressMapper.class);
		List<Address> addressList = addressMapper.findAddressByNo(addressNo);
		return addressList;
	}

	@Override
	public List<Address> findAddressAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		List<Address> addressList = addressMapper.findAddressAll();
		return addressList;
	}

	@Override
	public int insertAddress(Address address) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		int insertRow = addressMapper.insertAddress(address);
		return insertRow;
	}

	@Override
	public int updateAddressByNo(Address address) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		int updateRow = addressMapper.updateAddressByNo(address);
		return updateRow;
	}

	@Override
	public int deleteAddressByNo(int addressNo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
		int deleteRow = addressMapper.deleteAddressByNo(addressNo);
		return deleteRow;
	}

}
