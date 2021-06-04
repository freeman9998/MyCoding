package com.itwill.user;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 사용자관리에서 데이타베이스와의 작업을 전담하는 클래스
 USERINFO 테이블에 사용자를 추가,삭제,검색,수정등의 작업을한다.
 */
public class UserDaoImplMyBatis implements UserDao {
	private SqlSessionFactory sqlSessionFactory;
	public final static String NAMESPACE=
			"com.itwill.user.mapper.UserMapper.";
	
	public UserDaoImplMyBatis() throws Exception {
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("mybatis-config.xml");
			this.sqlSessionFactory = 
					new SqlSessionFactoryBuilder()
					.build(in);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public int create(User user) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		return sqlSession.insert(NAMESPACE+"create");
	}

	@Override
	public int update(User user) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		return sqlSession.update(NAMESPACE+"update");
	}

	@Override
	public int remove(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		return sqlSession.delete(NAMESPACE+"delete");
	}

	@Override
	public User findUser(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		return sqlSession.selectOne(NAMESPACE+"findUser");
	}

	@Override
	public ArrayList<User> findUserList() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		List<User> userList=sqlSession.selectList(NAMESPACE+"findUserList");
		return (ArrayList<User>)userList;
	}

	@Override
	public boolean existedUser(String userId) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		int count=sqlSession.selectOne(NAMESPACE+"findUserCount");
		if(count>=1) {
			return true;
		}else {
			return false;
		}
		 
		 
	}
	
}
