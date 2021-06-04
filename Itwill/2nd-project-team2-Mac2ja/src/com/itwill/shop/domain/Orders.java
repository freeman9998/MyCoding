package com.itwill.shop.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Random
 *
 */
public class Orders {
/*
 * 이름           널?       유형            
------------ -------- ------------- 
ORDERS_NO    NOT NULL NUMBER(10)    
ORDERS_DESC           VARCHAR2(100) 
ORDERS_DATE           DATE          
ORDERS_PRICE          NUMBER(10)    
MEMBERS_NO            NUMBER(10) 
 */	
	private int orders_no;
	private String orders_desc;
	private Date orders_date;
	private int orders_price;
	private String address_name;
	private int members_no;
	private ArrayList<OrdersDetail> ordersdetailList;
	
	public Orders() {
		
	}

	
	
	public Orders(int orders_no, String orders_desc, Date orders_date, int orders_price, String address_name,
			int members_no, ArrayList<OrdersDetail> ordersdetailList) {
		this.orders_no = orders_no;
		this.orders_desc = orders_desc;
		this.orders_date = orders_date;
		this.orders_price = orders_price;
		this.address_name = address_name;
		this.members_no = members_no;
		this.ordersdetailList = ordersdetailList;
	}



	@Override
	public String toString() {
		return "Orders [orders_no=" + orders_no + ", orders_desc=" + orders_desc + ", orders_date=" + orders_date
				+ ", orders_price=" + orders_price + ", address_name=" + address_name + ", members_no=" + members_no
				+ ", ordersdetailList=" + ordersdetailList + "]";
	}



	public int getOrders_no() {
		return orders_no;
	}

	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}

	public String getOrders_desc() {
		return orders_desc;
	}

	public void setOrders_desc(String orders_desc) {
		this.orders_desc = orders_desc;
	}

	public Date getOrders_date() {
		return orders_date;
	}

	public void setOrders_date(Date orders_date) {
		this.orders_date = orders_date;
	}

	public int getOrders_price() {
		return orders_price;
	}

	public void setOrders_price(int orders_price) {
		this.orders_price = orders_price;
	}

	public String getAddress_name() {
		return address_name;
	}

	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}

	public int getMembers_no() {
		return members_no;
	}

	public void setMembers_no(int members_no) {
		this.members_no = members_no;
	}

	public ArrayList<OrdersDetail> getOrdersdetailList() {
		return ordersdetailList;
	}

	public void setOrdersdetailList(ArrayList<OrdersDetail> ordersdetailList) {
		this.ordersdetailList = ordersdetailList;
	}
	
	
	
}
