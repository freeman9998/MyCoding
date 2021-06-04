package com.itwill.cart.model;

public class Cart {

	private int m_no;
	private int p_no;
	private int c_quantity;
	private int c_price;
	private int p_price;
	private String p_name;
	
	public Cart() {
		//기본 생성
	}
	
	public Cart(int m_no, int p_no, int p_price, String p_name, int c_quantity, int c_price) {
		super();
		this.m_no = m_no;
		this.p_no = p_no;
		this.p_name = p_name;
		this.c_quantity = c_quantity;
		this.c_price = c_price;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getC_quantity() {
		return c_quantity;
	}

	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}

	public int getC_price() {
		return c_price;
	}

	public void setC_price(int c_price) {
		this.c_price = c_price;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	
	
	
}
