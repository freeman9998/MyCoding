package com.itwill.shop.domain;

import java.util.List;

public class Cart {
	
/*
 * 이름         널?       유형         
---------- -------- ---------- 
CART_NO    NOT NULL NUMBER(10) 
CART_QTY            NUMBER(10) 
MEMBERS_NO          NUMBER(10) 
MENU_NO             NUMBER(10) 
 */
	private Integer cartNo;
	private Integer cartQty;
	private Integer membersNo;
	private Integer foodNo;
	public Cart() {
	}
	public Cart(Integer cartNo, Integer cartQty, Integer membersNo, Integer foodNo) {
		super();
		this.cartNo = cartNo;
		this.cartQty = cartQty;
		this.membersNo = membersNo;
		this.foodNo = foodNo;
	}
	@Override
	public String toString() {
		return "Cart [cartNo=" + cartNo + ", cartQty=" + cartQty + ", membersNo=" + membersNo + ", foodNo=" + foodNo
				+ "]";
	}
	public Integer getCartNo() {
		return cartNo;
	}
	public void setCartNo(Integer cartNo) {
		this.cartNo = cartNo;
	}
	public Integer getCartQty() {
		return cartQty;
	}
	public void setCartQty(Integer cartQty) {
		this.cartQty = cartQty;
	}
	public Integer getMembersNo() {
		return membersNo;
	}
	public void setMembersNo(Integer membersNo) {
		this.membersNo = membersNo;
	}
	public Integer getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(Integer foodNo) {
		this.foodNo = foodNo;
	}
	
	
	

}
