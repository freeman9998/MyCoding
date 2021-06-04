package com.itwill.shop.domain;
/*
이름     널?       유형         
------ -------- ---------- 
JD_NO  NOT NULL NUMBER(30) 
JD_QTY          NUMBER(30) 
J_NO            NUMBER(30) 
P_NO            NUMBER(30) 
 */
/**
 * @author user
 *
 */
public class Jumun_detail {
	private int jd_no;
	private int jd_qty;
	private int j_no;
	private int p_no;
	private Jumun jumun;
	private Product product;
	
	public Jumun_detail() {
		// TODO Auto-generated constructor stub
	}
	
	public Jumun_detail(int jd_no, int jd_qty, int j_no, int p_no) {
		super();
		this.jd_no = jd_no;
		this.jd_qty = jd_qty;
		this.j_no = j_no;
		this.p_no = p_no;
	}

	public Jumun_detail(int jd_no, int jd_qty, Jumun jumun, Product product) {
		super();
		this.jd_no = jd_no;
		this.jd_qty = jd_qty;
		this.jumun = jumun;
		this.product = product;
	}
	public Jumun_detail(int jd_no, int jd_qty,int j_no, Product product) {
		super();
		this.jd_no = jd_no;
		this.jd_qty = jd_qty;
		this.j_no = j_no;
		this.product = product;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getJd_no() {
		return jd_no;
	}

	public void setJd_no(int jd_no) {
		this.jd_no = jd_no;
	}

	public int getJd_qty() {
		return jd_qty;
	}

	public void setJd_qty(int jd_qty) {
		this.jd_qty = jd_qty;
	}

	public int getJ_no() {
		return j_no;
	}

	public void setJ_no(int j_no) {
		this.j_no = j_no;
	}

	public Jumun getJumun() {
		return jumun;
	}

	public void setJumun(Jumun jumun) {
		this.jumun = jumun;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Jumun_detail [jd_no=" + jd_no + ", jd_qty=" + jd_qty + ", j_no=" + j_no + ", p_no=" + p_no + ", jumun="
				+ jumun + ", product=" + product + "]";
	}


	
}
