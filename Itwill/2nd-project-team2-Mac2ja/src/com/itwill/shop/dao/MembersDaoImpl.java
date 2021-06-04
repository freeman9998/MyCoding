package com.itwill.shop.dao;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill.shop.dao.mapper.MembersMapper;
import com.itwill.shop.domain.Members;

/*
 * 이름               널?       유형            
---------------- -------- ------------- 
MEMBERS_NO       NOT NULL NUMBER(10)    
MEMBERS_NAME              VARCHAR2(100) 
MEMBERS_EMAIL             VARCHAR2(100) 
MEMBERS_PASSWORD          VARCHAR2(100) 
MEMBERS_PHONE             NUMBER(10)
 */
public class MembersDaoImpl implements MembersDao {
	private SqlSessionFactory sqlSessionFactory;
	public static final String NAMESPACE = "com.itwill.shop.dao.mapper.MembersMapper.";
	public MembersDaoImpl() throws Exception{
		try {
			InputStream mybatisConfigInputStream=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
			this.sqlSessionFactory=sqlSessionFactoryBuilder.build(mybatisConfigInputStream);			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Members> selectAll() throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		ArrayList<Members> membersList=(ArrayList<Members>)membersMapper.selectAll();
		sqlSession.commit();
		sqlSession.close();
		return membersList;
	}

	@Override
	public Members findMembersByNo(int members_no) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		Members members = membersMapper.findMembersByNo(members_no);
		sqlSession.commit();
		sqlSession.close();
		return members;
	}
	
	@Override
	public Members findMembersById(String members_email) throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		Members members = membersMapper.findMembersById(members_email);
		sqlSession.commit();
		sqlSession.close();
		return members;
	}
	
	@Override
	public Members findMembersByPassWord(String members_password) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		Members members = membersMapper.findMembersByPassWord(members_password);
		sqlSession.commit();
		sqlSession.close();
		return members;
	}
	
	@Override
	public Members findMembersByPhone(String members_phone) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		Members members = membersMapper.findMembersByPhone(members_phone);
		sqlSession.commit();
		sqlSession.close();
		return members;
	}
	
	@Override
	public Members findMembersLogin(HashMap<String, Object> map) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		Members members = membersMapper.findMembersLogin(map);
		sqlSession.commit();
		sqlSession.close();
		return members;
	}
	
	@Override
	public int createMembers(Members members) throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		try {
			int rowCount = membersMapper.createMembers(members);
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return -1;
	}
	
	@Override
	public int deleteMembers(int members_no) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		try {
			int rowCount = membersMapper.deleteMembers(members_no);
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return -1;
	}
	
	@Override
	public int updateMembers(Members members) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		MembersMapper membersMapper=sqlSession.getMapper(MembersMapper.class);
		try {
			int rowCount = membersMapper.updateMembers(members);
			return rowCount;
		} catch (Exception e) {
			sqlSession.rollback();
			sqlSession.close();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		return -1;
	}
	
}