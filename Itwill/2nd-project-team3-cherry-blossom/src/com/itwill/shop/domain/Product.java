package com.itwill.shop.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/*
이름            널?       유형            
------------- -------- ------------- 
P_NO          NOT NULL NUMBER(30)    
P_CATEGORY             VARCHAR2(255) 
P_SUBCATEGORY          VARCHAR2(255) 
P_NAME                 VARCHAR2(255) 
P_PRICE                NUMBER(30)    
P_COLOR                VARCHAR2(100) 
P_SIZE                 VARCHAR2(30)    
P_DESC                 VARCHAR2(255) 
P_DATE                 DATE          
P_REVIEWS              NUMBER(30)
 */
public class Product {
	private int p_no;
	private String p_category;
	private String p_subcategory;
	private String p_name;
	private int p_price;
	private String p_color;
	private String p_size;
	private String p_desc;
	private Date p_date;
	private List<Review> reviewList;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int p_no) {
		super();
		this.p_no = p_no;
	}


	public Product(int p_no, String p_category, String p_subcategory, String p_name, int p_price, String p_color,
			String p_size, String p_desc, Date p_date) {
		super();
		this.p_no = p_no;
		this.p_category = p_category;
		this.p_subcategory = p_subcategory;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_color = p_color;
		this.p_size = p_size;
		this.p_desc = p_desc;
		this.p_date = p_date;
		this.reviewList = new ArrayList<Review>();
	}


	public Product(int p_no, String p_category, String p_subcategory, String p_name, int p_price, String p_color,
			String p_size, String p_desc, Date p_date, List<Review> reviewList) {
		super();
		this.p_no = p_no;
		this.p_category = p_category;
		this.p_subcategory = p_subcategory;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_color = p_color;
		this.p_size = p_size;
		this.p_desc = p_desc;
		this.p_date = p_date;
		this.reviewList = reviewList;
	}


	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_category=" + p_category + ", p_subcategory=" + p_subcategory + ", p_name="
				+ p_name + ", p_price=" + p_price + ", p_color=" + p_color + ", p_size=" + p_size + ", p_desc=" + p_desc
				+ ", p_date=" + p_date + ", reviewList=" + reviewList + "]";
	}
	
	public int getP_no() {
		return p_no;
	}


	public void setP_no(int p_no) {
		this.p_no = p_no;
	}


	public String getP_category() {
		return p_category;
	}


	public void setP_category(String p_category) {
		this.p_category = p_category;
	}


	public String getP_subcategory() {
		return p_subcategory;
	}


	public void setP_subcategory(String p_subcategory) {
		this.p_subcategory = p_subcategory;
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


	public String getP_color() {
		return p_color;
	}


	public void setP_color(String p_color) {
		this.p_color = p_color;
	}


	public String getP_size() {
		return p_size;
	}


	public void setP_size(String p_size) {
		this.p_size = p_size;
	}


	public String getP_desc() {
		return p_desc;
	}


	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}


	public Date getP_date() {
		return p_date;
	}


	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}


	public List<Review> getReviewList() {
		return reviewList;
	}


	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}
	
	
}
