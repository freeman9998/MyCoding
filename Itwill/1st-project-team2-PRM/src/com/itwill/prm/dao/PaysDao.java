package com.itwill.prm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.itwill.prm.vo.Pays;



public class PaysDao {
	
	//생성 - insert(입력)
	public int create(Pays pays) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSTUBS_INSERT);
		pstmt.setInt(1, pays.getRegi_num());
		pstmt.setInt(2, pays.getMember_no());
		pstmt.setInt(3, pays.getOvertimework());
		pstmt.setInt(4, pays.getHolidaywork());
		pstmt.setInt(5, pays.getNomalpay());
		pstmt.setInt(6, pays.getLevpay());
		pstmt.setInt(7, pays.getPay_bouns());
		pstmt.setString(8, pays.getWorkMonth());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	//사원번호 조회(개인)
	public Pays selectByNo(int member_no) throws Exception {
		Pays pays = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaysSQL.PAYS_SELECT_NO);
		pstmt.setInt(1, member_no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			pays = new Pays(   rs.getInt("regi_num")  
						      ,rs.getInt("member_no")   
						      ,rs.getInt("overtimework")
						      ,rs.getInt("holidaywork") 
						      ,rs.getInt("nomalpay")
						      ,rs.getInt("levpay")      
						      ,rs.getInt("pay_bouns")   
						      ,rs.getString("workMonth")
					 	   );
		}
		return pays;
	}
	//전체 조회
	public List<Pays> selectAll() throws Exception{
		ArrayList<Pays> paysList = new ArrayList<Pays>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaysSQL.PAYS_SELECT_ALL);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			paysList.add(new Pays(	 rs.getInt("regi_num")
									,rs.getInt("member_no")
									,rs.getInt("overtimework")
									,rs.getInt("holidaywork")
									,rs.getInt("nomalpay")
									,rs.getInt("levpay")
									,rs.getInt("pay_bouns")
									,rs.getString("workMonth")
								 )
						);
		}
		
		return paysList;
	}

	//수정
	public int updateByNo(Pays pays) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaysSQL.PAYS_UPDATE);
		
		pstmt.setInt(1, pays.getOvertimework());
		pstmt.setInt(2, pays.getHolidaywork());
		pstmt.setInt(3, pays.getNomalpay());
		pstmt.setInt(4, pays.getLevpay());
		pstmt.setInt(5, pays.getPay_bouns());
		pstmt.setString(6, pays.getWorkMonth());
		pstmt.setInt(7, pays.getMember_no());
		
		int rowCount =pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);	
		
		return rowCount; //결과를 반환
	}
	//삭제
	public int deleteByNo(int member_no) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaysSQL.PAYS_DELETE);
		pstmt.setInt(1, member_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	

	
}