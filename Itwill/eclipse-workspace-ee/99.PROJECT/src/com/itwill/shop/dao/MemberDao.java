package com.itwill.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.vo.Member;
/*
Dao(Data Access Object)
 - 회원들의 데이터를 저장하고있는 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스

 - MemberService객체 의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class MemberDao {

	public int create(Member member) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_INSERT);
		pstmt.setString(1,member.getM_id());
		pstmt.setString(2,member.getM_password());
		pstmt.setString(3,member.getM_name());
		pstmt.setString(4,member.getM_address());
		pstmt.setInt(5,member.getM_age());
		pstmt.setString(6,member.getM_married());
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	public Member selectById(String m_id) throws Exception {
		Member member=null;
		Connection con =ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_ID);
		pstmt.setString(1, m_id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			member=new Member(	rs.getString("m_id"),
								rs.getString("m_password"),
								rs.getString("m_name"),
								rs.getString("m_address"),
								rs.getInt("m_age"),
								rs.getString("m_married"),
								rs.getDate("m_regdate")
								);
			
		}
		return member;
	}

	public List<Member> selectAll() throws Exception {
		ArrayList<Member> memberList=new ArrayList<Member>();
		Connection con =ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_SELECT_ALL);
	
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			memberList.add(new Member(rs.getString("m_id"),
										rs.getString("m_password"),
										rs.getString("m_name"),
										rs.getString("m_address"),
										rs.getInt("m_age"),
										rs.getString("m_married"),
										rs.getDate("m_regdate")));
			
		}
		return memberList;
	}

	public int deleteById(String m_id) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_DELETE);
		pstmt.setString(1, m_id);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int updateById(Member member) throws Exception {
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(MemberSQL.MEMBER_UPDATE);
		pstmt.setString(1, member.getM_password());
		pstmt.setString(2, member.getM_name());
		pstmt.setString(3, member.getM_address());
		pstmt.setInt(4, member.getM_age());
		pstmt.setString(5, member.getM_married());
		pstmt.setString(6, member.getM_id());
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public ArrayList<Member> selectByName(String name) {
		
		return null;
	}
	

}










