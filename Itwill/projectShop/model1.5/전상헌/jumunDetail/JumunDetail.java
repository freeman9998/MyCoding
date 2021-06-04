package com.itwill.shop.jumunDetail;

import com.itwill.shop.jumun.Jumun;
import com.itwill.shop.product.Product;
/*
------ -------- ---------- 
JD_NO  NOT NULL NUMBER(10) 
JD_QTY          NUMBER(10) 
P_NO            NUMBER(10) 
J_NO            NUMBER(10) 
 */
public class JumunDetail {
	private int jd_no;
	private int jd_qty;
	private Product product;
	private Jumun jumun;
	
	public JumunDetail() {
		// TODO Auto-generated constructor stub
	}

	public JumunDetail(int jd_no, int jd_qty, Product product, Jumun jumun) {
		super();
		this.jd_no = jd_no;
		this.jd_qty = jd_qty;
		this.product = product;
		this.jumun = jumun;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Jumun getJumun() {
		return jumun;
	}

	public void setJumun(Jumun jumun) {
		this.jumun = jumun;
	}

	@Override
	public String toString() {
		return "JumunDetail [jd_no=" + jd_no + ", jd_qty=" + jd_qty + ", product=" + product + ", jumun=" + jumun + "]";
	}
	

}
