package com.itwill.shop.domain;
/*
이름        널?       유형            
--------- -------- ------------- 
R_NO      NOT NULL NUMBER(30)    
R_CONTENT          VARCHAR2(255) 
R_SCORE            NUMBER(10)    
USER_ID            VARCHAR2(100) 
P_NO               NUMBER(30)    

 */
public class Review {
	private int r_no;
	private String r_content;
	private int r_score;
	private UserInfo userInfo;
	private Product product;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(int r_no, String r_content, int r_score, UserInfo userInfo, Product product) {
		super();
		this.r_no = r_no;
		this.r_content = r_content;
		this.r_score = r_score;
		this.userInfo = userInfo;
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review [r_no=" + r_no + ", r_content=" + r_content + ", r_score=" + r_score + ", userInfo=" + userInfo
				+ ", product=" + product + "]";
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public int getR_score() {
		return r_score;
	}

	public void setR_score(int r_score) {
		this.r_score = r_score;
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
	
}
