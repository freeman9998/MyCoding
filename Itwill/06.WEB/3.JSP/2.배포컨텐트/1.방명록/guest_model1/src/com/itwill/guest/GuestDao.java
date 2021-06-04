package com.itwill.guest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class GuestDao  {
	/*
	 * READ ALL
	 */
	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> guestList = new ArrayList<Guest>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try{
			con=ConnectionFactory.getConnection();
			pstmt=con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				guestList.add(new Guest(
										rs.getInt("guest_no"),
										rs.getString("guest_name"),
										rs.getString("guest_date"),
										rs.getString("guest_email"),
										rs.getString("guest_homepage"),
										rs.getString("guest_title"),
										rs.getString("guest_content")
										)
						     );
			}
			
			
		}finally{
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(con!=null)
				ConnectionFactory.releaseConnection(con);
		}
		return guestList;
	}
	/*
	 * CREATE
	 */
	public boolean insertGuest(Guest guest) throws Exception{
		boolean isSuccess = false;
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try{
			con=ConnectionFactory.getConnection();
			pstmt=con.prepareStatement(GuestSQL.GUEST_INSERT);
			pstmt.setString(1, guest.guest_name);
			pstmt.setString(2, guest.guest_email);
			pstmt.setString(3, guest.guest_homepage);
			pstmt.setString(4, guest.guest_title);
			pstmt.setString(5, guest.guest_content);
			int insertRowCount=pstmt.executeUpdate();
			if(insertRowCount==1){
				isSuccess=true;
			}
			
		}catch(Exception e){
			isSuccess=false;
		}finally {
			if(con!=null)
				ConnectionFactory.releaseConnection(con);
		}
		
		return isSuccess;
	}
	/*
	 * READ ONE
	 */
	public Guest selectByNo(int no) throws Exception{
		Guest guest=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con = ConnectionFactory.getConnection();
			pstmt=con.prepareStatement(GuestSQL.GUEST_SELECT_BY_NO);
			pstmt.setInt(1, no);
			rs=pstmt.executeQuery();
			if(rs.next()){
				guest=new Guest(
						rs.getInt("guest_no"),
						rs.getString("guest_name"),
						rs.getString("guest_date"),
						rs.getString("guest_email"),
						rs.getString("guest_homepage"),
						rs.getString("guest_title"),
						rs.getString("guest_content")
						);
			}
		}finally{
			if(con!=null)
				ConnectionFactory.releaseConnection(con);
		}
		return guest;
	}
	/*
	 * DELETE
	 */
	public boolean deleteGuest(int no){
		boolean deleteOK=false;
		
		return deleteOK;
	}
	/*
	 * UPDATE
	 */
	public boolean updateGuest(Guest updateGuest){
		boolean updateOK=true;
		
		return updateOK;
	}

}










