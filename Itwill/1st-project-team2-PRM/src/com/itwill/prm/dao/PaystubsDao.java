package com.itwill.prm.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.itwill.prm.vo.Paystubs;
import com.itwill.prm.vo.PaystubsResultValue;



public class PaystubsDao {

	public int create(Paystubs paystubs) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSTUBS_INSERT);
		pstmt.setInt(1, paystubs.getMember_no());
		pstmt.setInt(2, paystubs.getIncome_tax());
		pstmt.setInt(3, paystubs.getResidents_tax());
		pstmt.setInt(4, paystubs.getFood_exp());
		pstmt.setInt(5, paystubs.getTraffic_exp());
		pstmt.setInt(6, paystubs.getWelfare());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	public List<PaystubsResultValue> selectByNo(int member_no) throws Exception {
		ArrayList<PaystubsResultValue> paystubsResultList = new ArrayList<PaystubsResultValue>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_SELECT_NO);
		pstmt.setInt(1, member_no);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			paystubsResultList.add(new PaystubsResultValue(
					  rs.getInt("page_num"),
					  rs.getInt("member_no"),
					  rs.getString("issuance_date"),
					  rs.getInt("income_tax"),
					  rs.getInt("residents_tax"),
					  rs.getInt("food_exp"),
					  rs.getInt("traffic_exp"),
					  rs.getInt("welfare"),
					  rs.getInt("overtimework"),
					  rs.getInt("holidaywork"),
					  rs.getInt("nomalpay"),
					  rs.getInt("levpay"),
					  rs.getInt("pay_bouns"),
					  rs.getString("workMonth")									
					  ));	
		}
		return paystubsResultList;
	}

	
	public PaystubsResultValue selectByNoMM(int member_no,int workmonth) throws Exception {
		PaystubsResultValue paystubsResultValue = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_SELECT_NOMM);
		pstmt.setInt(1, member_no);
		pstmt.setInt(2, workmonth);

		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			paystubsResultValue = new PaystubsResultValue(
					rs.getInt("page_num"),
					rs.getInt("member_no"),
					rs.getString("issuance_date"),
					rs.getInt("income_tax"),
					rs.getInt("residents_tax"),
					rs.getInt("food_exp"),
					rs.getInt("traffic_exp"),
					rs.getInt("welfare"),
					rs.getInt("overtimework"),
					rs.getInt("holidaywork"),
					rs.getInt("nomalpay"),
					rs.getInt("levpay"),
					rs.getInt("pay_bouns"),
					rs.getString("workMonth")									
					);
		}
		return paystubsResultValue;
	}
	
	public PaystubsResultValue selectLikeMM(String workmonth,int member_no) throws Exception {		
		PaystubsResultValue paystubsResultValue = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_LIKE_MM);
		
		pstmt.setString(1,workmonth);
		pstmt.setInt(2, member_no);

		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			paystubsResultValue = new PaystubsResultValue(
					rs.getInt("page_num"),
					rs.getInt("member_no"),
					rs.getString("issuance_date"),
					rs.getInt("income_tax"),
					rs.getInt("residents_tax"),
					rs.getInt("food_exp"),
					rs.getInt("traffic_exp"),
					rs.getInt("welfare"),
					rs.getInt("overtimework"),
					rs.getInt("holidaywork"),
					rs.getInt("nomalpay"),
					rs.getInt("levpay"),
					rs.getInt("pay_bouns"),
					rs.getString("workMonth")									
					);
		}
		return paystubsResultValue;
	}
	
	public List<PaystubsResultValue> selectAll() throws Exception{
		ArrayList<PaystubsResultValue> paystubsResultList = new ArrayList<PaystubsResultValue>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_SELECT_ALL);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			paystubsResultList.add(new PaystubsResultValue(
					  rs.getInt("page_num"),
					  rs.getInt("member_no"),
					  rs.getString("issuance_date"),
					  rs.getInt("income_tax"),
					  rs.getInt("residents_tax"),
					  rs.getInt("food_exp"),
					  rs.getInt("traffic_exp"),
					  rs.getInt("welfare"),
					  rs.getInt("overtimework"),
					  rs.getInt("holidaywork"),
					  rs.getInt("nomalpay"),
					  rs.getInt("levpay"),
					  rs.getInt("pay_bouns"),
					  rs.getString("workMonth")									
					  ));		
		}
		
		return paystubsResultList;
	}
	
	public int deleteByNo(int member_no) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_DELECT_NO);
		pstmt.setInt(1, member_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	public int updateByNo(PaystubsResultValue paystubsResultValue) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(PaystubsSQL.PAYSUBS_UPDATE_NO);
		pstmt.setInt(1, paystubsResultValue.getIncome_tax());
		pstmt.setInt(2, paystubsResultValue.getResidents_tax());
		pstmt.setInt(3, paystubsResultValue.getFood_exp());
		pstmt.setInt(4, paystubsResultValue.getTraffic_exp());
		pstmt.setInt(5, paystubsResultValue.getWelfare());
		pstmt.setInt(6, paystubsResultValue.getMember_no());
		int rowCount =pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);	
		
		return rowCount;
	}
	
	
}