package com.itwill.guest;
import java.util.ArrayList;
public class GuestDao {
	/*
	이름             널?       유형             
	-------------- -------- -------------- 
	GUEST_NO       NOT NULL NUMBER(10)     
	GUEST_NAME     NOT NULL VARCHAR2(100)  
	GUEST_DATE     NOT NULL DATE           
	GUEST_EMAIL             VARCHAR2(100)  
	GUEST_HOMEPAGE          VARCHAR2(100)  
	GUEST_TITLE    NOT NULL VARCHAR2(255)  
	GUEST_CONTENT  NOT NULL VARCHAR2(4000) 
	 */
	public GuestDao() throws Exception{
	
	}
	
	public int insertGuest(Guest guest) throws Exception {
		int insertRowCount=0;
		
		return insertRowCount;
	}
	
	public Guest selectByNo(int no) throws Exception {
		Guest guest=null;
		
		return guest ;
	}

	
	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> guestList=new ArrayList<Guest>();
		
		
		return guestList;
	}
	
	public int updateGuest(Guest guest) throws Exception {
		int updateRowCount=0;
		
		return updateRowCount;
	}

	public int deleteGuest(int no) throws Exception {
		int deleteRowCount=0;
		
		return deleteRowCount;
	}
}















