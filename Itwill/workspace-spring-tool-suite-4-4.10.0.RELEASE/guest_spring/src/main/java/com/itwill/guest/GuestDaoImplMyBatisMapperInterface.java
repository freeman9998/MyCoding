package com.itwill.guest;


import java.util.List;

import com.itwill.guest.mapper.GuestMapper;
public class GuestDaoImplMyBatisMapperInterface  implements GuestDao{
	private GuestMapper guestMapper;
	public GuestDaoImplMyBatisMapperInterface(GuestMapper guestMapper) throws Exception {
		this.guestMapper=guestMapper;
	}
	public GuestDaoImplMyBatisMapperInterface() {
		// TODO Auto-generated constructor stub
	}
	public GuestMapper getGuestMapper() {
		return guestMapper;
	}

	public void setGuestMapper(GuestMapper guestMapper) {
		this.guestMapper = guestMapper;
	}
	/*
	 * READ ALL
	 */
	public List<Guest> selectAll() throws Exception {
		List<Guest> guestList=guestMapper.selectAll();
		return guestList;
	}
	/*
	 * CREATE
	 */
	public int insertGuest(Guest guest) throws Exception {
		int insertRowCount=guestMapper.insertGuest(guest); 
		return insertRowCount;
	}
	/*
	 * READ ONE
	 */
	public Guest selectByNo(int no) throws Exception {
		Guest guest=guestMapper.selectByNo(no);
		return guest;
	}
	
	/*
	 /*
	 * DELETE
	 */
	public int deleteGuest(int guest_no) throws Exception{
		
		int deleteRowCount=guestMapper.deleteGuest(guest_no); 
		return deleteRowCount;
	}
	/*
	 * UPDATE
	 */
	public int updateGuest(Guest updateGuest) throws Exception{
		int updateRowCount=guestMapper.updateGuest(updateGuest);
		return updateRowCount;
	}
}










