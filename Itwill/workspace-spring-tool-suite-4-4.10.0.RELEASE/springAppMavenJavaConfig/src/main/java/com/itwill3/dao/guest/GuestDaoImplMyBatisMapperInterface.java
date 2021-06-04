package com.itwill3.dao.guest;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.itwill3.dao.guest.mapper.GuestMapper;




public class GuestDaoImplMyBatisMapperInterface  implements GuestDao{

	private SqlSessionFactory sqlSessionFactory;
	
	
	public GuestDaoImplMyBatisMapperInterface() throws Exception {
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream("com/itwill3/dao/guest/mybatis-config-mapper-interface.xml");
			this.sqlSessionFactory = 
					new SqlSessionFactoryBuilder()
					.build(in);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * READ ALL
	 */
	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> guestList1 = new ArrayList<Guest>();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		GuestMapper guestMapper=sqlSession.getMapper(GuestMapper.class);
		List<Guest> guestList2 = guestMapper.selectAll();
		guestList1=(ArrayList<Guest>)guestList2;
		return guestList1;
	}
	/*
	 * CREATE
	 */
	public int insertGuest(Guest guest) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		GuestMapper guestMapper=sqlSession.getMapper(GuestMapper.class);
		int insertRowCount=0;
		insertRowCount=guestMapper.insertGuest(guest);
		return insertRowCount;
	};

	/*
	 * READ ONE
	 */
	public Guest selectByNo(int no) throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		GuestMapper guestMapper=sqlSession.getMapper(GuestMapper.class);
		Guest guest=guestMapper.selectByNo(no);
		return guest;
	}
	
	
	
	/*
	 * DELETE
	 */
	public int deleteGuest(int guest_no) throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		GuestMapper guestMapper=sqlSession.getMapper(GuestMapper.class);
		int deleteRowCount=guestMapper.deleteGuest(guest_no);
		return deleteRowCount;
	}
	/*
	 * UPDATE
	 */
	public int updateGuest(Guest updateGuest) throws Exception{
		SqlSession sqlSession=sqlSessionFactory.openSession(true);
		int updateRowCount=0;
		GuestMapper guestMapper=sqlSession.getMapper(GuestMapper.class);
		updateRowCount=guestMapper.updateGuest(updateGuest);
		return updateRowCount;
	}
	

}










