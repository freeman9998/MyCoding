package com.itwill.prm.dao;

public class PaysSQL {
	public static final String PAYS_INSERT =
			"INSERT INTO PAYS (REGI_NUM, MEMBER_NO, OVERTIMEWORK,HLIDAYWORK,NOMALPAY,LEVPAY,PAY_BOUNS,WORKMONTH) VALUSE (?,?,?,?,?,?,?,?)";
	
	public static final String PAYS_SELECT_NO =
			"SELECT REGI_NUM, MEMBER_NO, OVERTIMEWORK,HLIDAYWORK,NOMALPAY,LEVPAY,PAY_BOUNS,WORKMONTH FROM PAYS WHERE MEMBER_NO = ? ";
	public static final String PAYS_SELECT_ALL =
			"SELECT REGI_NUM, MEMBER_NO, OVERTIMEWORK,HLIDAYWORK,NOMALPAY,LEVPAY,PAY_BOUNS,WORKMONTH FROM PAYS";
    
	public static final String PAYS_UPDATE =
			"UPDATE PAYS SET OVERTIMEWORK = ? , HLIDAYWORK = ? , NOMALPAY = ? , LEVPAY = ? ,PAY_BOUNS =? , WORKMONTH = ? WHERE MEMBER_NO = ?";
	
	public static final String PAYS_DELETE = "DELETE FROM PAYS    WHERE MEMBER_NO = ?" ;
    
}