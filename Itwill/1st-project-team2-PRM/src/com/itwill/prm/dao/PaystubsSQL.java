package com.itwill.prm.dao;

public class PaystubsSQL {
	
	public static final String PAYSTUBS_INSERT = 
	"insert into paystubs values (PAYROLL_SEQ.nextval,?,sysdate,?,?,?,?,?)";
	
	public static final String PAYSUBS_SELECT_NO=
			"select * from paystubs where member_no=?";
	
	public static final String PAYSUBS_SELECT_NOMM=
			"select * from paystubs where member_no=? and workmonth=?";
	
	public static final String PAYSUBS_SELECT_ALL=
			"select * from paystubs";
	
	public static final String PAYSUBS_UPDATE_NO=
			"update paystubs set income_tax=?, residents_tax=?, food_exp=?, traffic_exp=?, welfare=? where member_no=?";
	
	public static final String PAYSUBS_DELECT_NO=
			"delete paystubs where member_no=?";
	
	public static final String PAYSUBS_LIKE_MM=
			"select * from paystubs where issuance_date like ?||'%' and member_no=?"; 
}
