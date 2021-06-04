package com.itwill.prm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.prm.vo.Members;


public class MembersDao {
	
	public int create(Members members) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_INSERT);
		pstmt.setInt(1, members.getMember_no());
		pstmt.setString(2, members.getMember_name());
		pstmt.setString(3, members.getJob());
		pstmt.setString(4, members.getLev());
		pstmt.setInt(5, members.getJobtime());
		pstmt.setString(6, members.getMember_id());
		pstmt.setString(7, members.getMember_password());
		pstmt.setInt(8, members.getDept_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
		
	}
	public Members selectByNo(int member_no) throws Exception{
		Members members = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_SELECT_NO);
		pstmt.setInt(1, member_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			members = new Members(rs.getInt("member_no"),
					rs.getString("member_name"),
					rs.getDate("jobdate"),
					rs.getString("job"),
					rs.getString("lev"),
					rs.getInt("jobtime"),
					rs.getString("member_id"),
					rs.getString("member_password"),
					rs.getInt("dept_no"));
			
		}
		return members;
	}
	
	public Members selectByID(String id) throws Exception{
		Members members = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_SELECT_ID);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			members = new Members(rs.getInt("member_no"),
					rs.getString("member_name"),
					rs.getDate("jobdate"),
					rs.getString("job"),
					rs.getString("lev"),
					rs.getInt("jobtime"),
					rs.getString("member_id"),
					rs.getString("member_password"),
					rs.getInt("dept_no"));
			
		}
		return members;
	}

	public List<Members> selectAll() throws Exception {
		ArrayList<Members> membersList = new ArrayList<Members>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			membersList.add(new Members(rs.getInt("member_no"),
					rs.getString("member_name"),
					rs.getDate("jobdate"),
					rs.getString("job"),
					rs.getString("lev"),
					rs.getInt("jobtime"),
					rs.getString("member_id"),
					rs.getString("member_password"),
					rs.getInt("dept_no")));
					
		}
		return membersList;
					
		}
		
	public	int deleteByNo(int dept_no) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_DELETE);
		pstmt.setInt(1, dept_no);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	
	}
	public int updateByNo(String member_id,String member_password,int member_no) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MembersSQL.MEMBERS_UPDATE);
		pstmt.setString(1, member_id);
		pstmt.setString(2, member_password);
		pstmt.setInt(3, member_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
}

