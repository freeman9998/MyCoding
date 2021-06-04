package com.itwill.guest;

import java.util.ArrayList;

public class GuestService {
	private static GuestService _instance=null;
	private GuestDao guestDao;
	public GuestService() throws Exception {
		System.out.println("## GuestService()생성자:"+this);
		guestDao=new GuestDao();
	}
	public static  GuestService getInstance() throws Exception{
		if(_instance==null) {
			_instance=new GuestService();
		}
		return _instance;
	}
	
	/*
	 * Create
	 */
	public int insertGuest(Guest guest) throws Exception{
		return guestDao.insertGuest(guest);
	}
	/*
	 * Read
	 */
	public Guest selectByNo(int no) throws Exception{
		return guestDao.selectByNo(no);
	}
	public ArrayList<Guest> selectAll() throws Exception{
		return guestDao.selectAll();
	}
	/*
	 * Update
	 */
	public int updateGuest(Guest guest) throws Exception{
		return guestDao.updateGuest(guest);
	}
	/*
	 * Delete
	 */
	public int deleteGuest(int no) throws Exception{
		return guestDao.deleteGuest(no);
	}
}
