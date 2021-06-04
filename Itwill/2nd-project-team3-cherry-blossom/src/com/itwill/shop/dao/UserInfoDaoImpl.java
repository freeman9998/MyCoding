package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.UserInfoMapper;
import com.itwill.shop.domain.UserInfo;

public class UserInfoDaoImpl implements UserInfoDao{
	private SqlSessionFactory sqlSessionFactory;
	public UserInfoDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(mybatisConfigInputStream);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int create(UserInfo userInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
		int rowCount = userInfoMapper.create(userInfo);
		return rowCount;
	}
	
	@Override
	public UserInfo findUserInfoById(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
		UserInfo userInfo = userInfoMapper.findUserInfoById(user_id);
		return userInfo;
	}

	@Override
	public int updateUserInfoById(UserInfo userInfo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
		int rowCount = userInfoMapper.updateUserInfoById(userInfo);
		return rowCount;
	}

	@Override
	public int deleteUserInfoById(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
		int rowCount = userInfoMapper.deleteUserInfoById(user_id);
		return rowCount;
	}
	@Override
	public int existedUser(String user_id) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
		int count = userInfoMapper.existedUser(user_id);
		return count;
	}
	
}
