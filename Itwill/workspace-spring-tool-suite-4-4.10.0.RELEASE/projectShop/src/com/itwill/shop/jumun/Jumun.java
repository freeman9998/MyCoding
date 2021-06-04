package com.itwill.shop.jumun;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

import com.itwill.shop.user.User;

public class Jumun {
	private int j_no;
	private String j_desc;
	private Date j_date;
	private int j_price;
	private User user;
	
	List<JumunDetail> jumunDetailList=new ArrayList<JumunDetail>();
	public Jumun() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Jumun(int j_no, String j_desc, Date j_date, int j_price, User user, List<JumunDetail> jumunDetailList) {
		super();
		this.j_no = j_no;
		this.j_desc = j_desc;
		this.j_date = j_date;
		this.j_price = j_price;
		this.user = user;
		this.jumunDetailList = jumunDetailList;
	}



	public int getJ_price() {
		return j_price;
	}



	public void setJ_price(int j_price) {
		this.j_price = j_price;
	}



	public int getJ_no() {
		return j_no;
	}
	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}
	public String getJ_desc() {
		return j_desc;
	}
	public void setJ_desc(String j_desc) {
		this.j_desc = j_desc;
	}
	public Date getJ_date() {
		return j_date;
	}
	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<JumunDetail> getJumunDetailList() {
		return jumunDetailList;
	}
	public void setJumunDetailList(List<JumunDetail> jumunDetailList) {
		this.jumunDetailList = jumunDetailList;
	}



	@Override
	public String toString() {
		return "Jumun [j_no=" + j_no + ", j_desc=" + j_desc + ", j_date=" + j_date + ", j_price=" + j_price + ", user="
				+ user + ", jumunDetailList=" + jumunDetailList + "]";
	}
	
	
	
	
	
}
