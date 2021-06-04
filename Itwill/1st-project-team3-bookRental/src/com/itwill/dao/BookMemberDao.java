package com.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.vo.BookMember;


public class BookMemberDao {
	
	public int create(BookMember bookMember) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_INSERT);

		pstmt.setString(1,bookMember.getMember_id());
		pstmt.setString(2,bookMember.getMember_password());
		pstmt.setString(3,bookMember.getMember_name());
		pstmt.setString(4,bookMember.getMember_birthday());
		pstmt.setString(5,bookMember.getMember_phone_1());
		pstmt.setString(6,bookMember.getMember_phone_2());
		pstmt.setString(7,bookMember.getMember_phone_3());
		pstmt.setString(8,bookMember.getMember_email_1());
		pstmt.setString(9,bookMember.getMember_email_2());
		pstmt.setInt(10,bookMember.getMember_count());
		pstmt.setInt(11,bookMember.getMember_penalty());
		
		
		int rowCount=pstmt.executeUpdate();		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	public BookMember selectById(String member_id) throws Exception{
		BookMember bookMember = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_SELECT_ID);
		pstmt.setString(1, member_id);
		ResultSet rs= pstmt.executeQuery();
		if(rs.next()) {
			
			bookMember = new BookMember(
					rs.getString("member_id"),
					rs.getString("member_password"),
					rs.getString("member_name"),
					rs.getString("member_birthday"),
					rs.getString("member_phone_1"),
					rs.getString("member_phone_2"),
					rs.getString("member_phone_3"),
					rs.getString("member_email_1"),
					rs.getString("member_email_2"),
					rs.getDate("member_regdate"),
					rs.getInt("member_count"),
					rs.getInt("member_penalty")		
					);
		}
		ConnectionFactory.releaseConnection(con);
		
		return bookMember;
	}
	public List<BookMember> selectAll() throws Exception{
		ArrayList<BookMember> bookMember=new ArrayList<BookMember>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_SELECT_ALL);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			bookMember.add(new BookMember(
					rs.getString("member_id"),
					rs.getString("member_password"),
					rs.getString("member_name"),
					rs.getString("member_birthday"),
					rs.getString("member_phone_1"),
					rs.getString("member_phone_2"),
					rs.getString("member_phone_3"),
					rs.getString("member_email_1"),
					rs.getString("member_email_2"),
					rs.getDate("member_regdate"),
					rs.getInt("member_count"),
					rs.getInt("member_penalty")
					));
		}
		ConnectionFactory.releaseConnection(con);
		return bookMember;
	}
	public int deleteById(String member_id) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_DELETE);
		pstmt.setString(1, member_id);
		int rowCount = pstmt.executeUpdate();
		
		ConnectionFactory.releaseConnection(con);
		
		return rowCount;
	}
	public int updateById(String id, String password, String phone_1, String phone_2, String phone_3
			, String email_1, String email_2) throws Exception{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_UPDATE);
		
		pstmt.setString(1,password);
		pstmt.setString(2,phone_1);
		pstmt.setString(3,phone_2);
		pstmt.setString(4,phone_3);
		pstmt.setString(5,email_1);
		pstmt.setString(6,email_2);
		pstmt.setString(7,id);
		
		int rowCount=pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	//아이디를 받아 카운터를 바꾸는 DAO
	
		public int updateByCount(int count,BookMember bookMember) throws Exception{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(BookMemberSQL.MEMBER_UPDATE_COUNT);
		pstmt.setInt(1,count);
		pstmt.setString(2, bookMember.getMember_id());
		int rowCount=pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	


}
