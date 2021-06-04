package com.itwill.shop.domain;

public class OrdersDetail {
/*
 * 이름                널?       유형         
----------------- -------- ---------- 
ORDERS_DETAIL_NO  NOT NULL NUMBER(10) 
ORDERS_DETAIL_QTY          NUMBER(10) 
ORDERS_NO                  NUMBER(10) 
FOOD_NO                    NUMBER(10) 
 */
	private int orders_detail_no;
	private int orders_detail_qty;
	private int orders_no;
	private int food_no;
	
	public OrdersDetail() {
		
	}

	public OrdersDetail(int orders_detail_no, int orders_detail_qty, int orders_no, int food_no) {
		this.orders_detail_no = orders_detail_no;
		this.orders_detail_qty = orders_detail_qty;
		this.orders_no = orders_no;
		this.food_no = food_no;
	}
		
	@Override
	public String toString() {
		return "OrdersDetail [orders_detail_no=" + orders_detail_no + ", orders_detail_qty=" + orders_detail_qty
				+ ", orders_no=" + orders_no + ", food_no=" + food_no + "]";
	}

	public int getOrders_detail_no() {
		return orders_detail_no;
	}

	public void setOrders_detail_no(int orders_detail_no) {
		this.orders_detail_no = orders_detail_no;
	}

	public int getOrders_detail_qty() {
		return orders_detail_qty;
	}

	public void setOrders_detail_qty(int orders_detail_qty) {
		this.orders_detail_qty = orders_detail_qty;
	}

	public int getOrders_no() {
		return orders_no;
	}

	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}

	public int getFood_no() {
		return food_no;
	}

	public void setFood_no(int food_no) {
		this.food_no = food_no;
	}
	
}
