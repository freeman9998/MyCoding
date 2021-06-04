package com.itwill.shop.domain;

public class Category {
/*
 * 이름            널?       유형            
------------- -------- ------------- 
CATEGORY_NO   NOT NULL NUMBER(10)    
CATEGORY_NAME          VARCHAR2(100) 

 */
	
	private Integer categoryNo;
	private String categoryName;
	public Category() {

	}
	
	public Category(Integer categoryNo) {
		super();
		this.categoryNo = categoryNo;                    
	}

	public Category(Integer categoryNo, String categoryName) {
		super();
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
	}
	public Integer getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryNo=" + categoryNo + ", categoryName=" + categoryName + "]";
	}
		
	
}
