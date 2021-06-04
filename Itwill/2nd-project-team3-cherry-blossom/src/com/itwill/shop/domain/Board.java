package com.itwill.shop.domain;
/*
이름         널?       유형            
---------- -------- ------------- 
B_NO       NOT NULL NUMBER(30)    
B_CATEGORY          VARCHAR2(255) 
B_TITLE             VARCHAR2(255) 
B_CONTENT           VARCHAR2(255) 
B_DATE              DATE          
B_COUNT             NUMBER(30)    
USER_ID             VARCHAR2(100) 
P_NO                NUMBER(30)  
 */

import java.sql.Date;

public class Board {
	private int b_no; 
	private String b_category;
	private String b_title;
	private String b_content;
	private Date b_date;
	private int b_count;
	private int b_groupNo;
	private int b_step;
	private int b_depth;
	private UserInfo userInfo;
	private Product product;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(int b_no, String b_category, String b_title, String b_content, Date b_date, int b_count, int b_groupNo,
			int b_step, int b_depth, UserInfo userInfo) {
		super();
		this.b_no = b_no;
		this.b_category = b_category;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.b_count = b_count;
		this.b_groupNo = b_groupNo;
		this.b_step = b_step;
		this.b_depth = b_depth;
		this.userInfo = userInfo;
		product = new Product();
	}

	public Board(int b_no, String b_category, String b_title, String b_content, Date b_date, int b_count, int b_groupNo,
			int b_step, int b_depth, UserInfo userInfo, Product product) {
		super();
		this.b_no = b_no;
		this.b_category = b_category;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.b_count = b_count;
		this.b_groupNo = b_groupNo;
		this.b_step = b_step;
		this.b_depth = b_depth;
		this.userInfo = userInfo;
		this.product = product;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_category() {
		return b_category;
	}

	public void setB_category(String b_category) {
		this.b_category = b_category;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public Date getB_date() {
		return b_date;
	}

	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}

	public int getB_count() {
		return b_count;
	}

	public void setB_count(int b_count) {
		this.b_count = b_count;
	}

	public int getB_groupNo() {
		return b_groupNo;
	}

	public void setB_groupNo(int b_groupNo) {
		this.b_groupNo = b_groupNo;
	}

	public int getB_step() {
		return b_step;
	}

	public void setB_step(int b_step) {
		this.b_step = b_step;
	}

	public int getB_depth() {
		return b_depth;
	}

	public void setB_depth(int b_depth) {
		this.b_depth = b_depth;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Board [b_no=" + b_no + ", b_category=" + b_category + ", b_title=" + b_title + ", b_content="
				+ b_content + ", b_date=" + b_date + ", b_count=" + b_count + ", b_groupNo=" + b_groupNo + ", b_step="
				+ b_step + ", b_depth=" + b_depth + ", userInfo=" + userInfo + ", product=" + product + "]";
	}
}
