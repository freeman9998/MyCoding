package com.itwill.shop.domain;
/*
이름        널?       유형            
--------- -------- -------------
J_NO      NOT NULL NUMBER(30) 
J_DATE             DATE      
J_PRICE            NUMBER(30)
J_STATUS           VARCHAR2(100)
J_PAYMENT          VARCHAR2(100)
USER_ID            VARCHAR2(100)
 */

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Jumun {
	private int j_no;
	private Date j_date;
	private int j_price;
	private String j_status;
	private String j_payment;
	private String user_id;
	private UserInfo userInfo;
	private Address address;
	private Product product;
	private List<Jumun_detail> jumun_detailList;

	public Jumun() {
		// TODO Auto-generated constructor stub
	}


	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, String user_id,
			List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.user_id = user_id;
		this.jumun_detailList = jumun_detailList;
	}


	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, UserInfo userInfo,
			Address address, List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.userInfo = userInfo;
		this.address = address;
		this.jumun_detailList = jumun_detailList;
	}


	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, String user_id, Product product,
			List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.user_id = user_id;
		this.product = product;
		this.jumun_detailList = jumun_detailList;
	}


	public Jumun(int j_no, Date j_date, int j_price, String user_id, List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.user_id = user_id;
		this.jumun_detailList = jumun_detailList;
	}


	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, String user_id, Address address,
			List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.user_id = user_id;
		this.address = address;
		this.jumun_detailList = jumun_detailList;
	}


	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, UserInfo userInfo,
			Address address, Product product, List<Jumun_detail> jumun_detailList) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.userInfo = userInfo;
		this.address = address;
		this.product = product;
		this.jumun_detailList = jumun_detailList;
	}

	

	public Jumun(int j_no, Date j_date, int j_price, String j_status, String j_payment, UserInfo userInfo,
			Address address, Product product) {
		super();
		this.j_no = j_no;
		this.j_date = j_date;
		this.j_price = j_price;
		this.j_status = j_status;
		this.j_payment = j_payment;
		this.userInfo = userInfo;
		this.address = address;
		this.product = product;
		jumun_detailList= new ArrayList<Jumun_detail>();
	}

	
	

	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public int getJ_no() {
		return j_no;
	}

	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}

	public Date getJ_date() {
		return j_date;
	}

	public void setJ_date(Date j_date) {
		this.j_date = j_date;
	}

	public int getJ_price() {
		return j_price;
	}

	public void setJ_price(int j_price) {
		this.j_price = j_price;
	}

	public String getJ_status() {
		return j_status;
	}

	public void setJ_status(String j_status) {
		this.j_status = j_status;
	}

	public String getJ_payment() {
		return j_payment;
	}

	public void setJ_payment(String j_payment) {
		this.j_payment = j_payment;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Jumun_detail> getJumun_detailList() {
		return jumun_detailList;
	}

	public void setJumun_detailList(List<Jumun_detail> jumun_detailList) {
		this.jumun_detailList = jumun_detailList;
	}

	@Override
	public String toString() {
		return "Jumun [j_no=" + j_no + ", j_date=" + j_date + ", j_price=" + j_price + ", j_status=" + j_status
				+ ", j_payment=" + j_payment + ", user_id=" + user_id + ", userInfo=" + userInfo + ", address=" + address
				+ ", product=" + product + ", jumun_detailList=" + jumun_detailList + "]";
	}

	
	
}