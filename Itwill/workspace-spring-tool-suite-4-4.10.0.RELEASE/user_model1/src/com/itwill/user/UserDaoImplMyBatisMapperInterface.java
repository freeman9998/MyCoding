package com.itwill.user;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.user.mapper.UserMapper;

/*
 사용자관리에서 데이타베이스와의 작업을 전담하는 클래스
 USERINFO 테이블에 사용자를 추가,삭제,검색,수정등의 작업을한다.
 */
public class UserDaoImplMyBatisMapperInterface implements UserDao {
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImplMyBatisMapperInterface() throws Exception {
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("mybatis-config-mapper-interface.xml");
			this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int create(User user) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		int insertRowCount=0;
		insertRowCount=userMapper.create(user);
		return insertRowCount;
	}

	@Override
	public int update(User user) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		int rowCount=userMapper.update(user);
		return rowCount;
	}

	@Override
	public int remove(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		int rowCount=userMapper.remove(userId);
		return rowCount;
	}

	@Override
	public User findUser(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		return userMapper.findUser(userId);
	}

	@Override
	public List<User> findUserList() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> userList =userMapper.findUserList();
		return userList;
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		int count=userMapper.findUserCount(userId);
		if(count>=1) {
			return true;
		}else {
			return false;
		}
		 
	}

}
