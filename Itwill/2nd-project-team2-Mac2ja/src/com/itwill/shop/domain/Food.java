package com.itwill.shop.domain;

public class Food {
/*
 * 이름          널?       유형            
----------- -------- ------------- 
FOOD_NO     NOT NULL NUMBER(10)    
FOOD_NAME            VARCHAR2(100) 
FOOD_PRICE           NUMBER(10)    
FOOD_IMAGE           VARCHAR2(100) 
FOOD_DESC            VARCHAR2(200) 
FOOD_STAR            NUMBER(10)    
FOOD_KCAL            NUMBER(10)    
CATEGORY_NO          NUMBER(10)
 */
	
	private Integer foodNo;
	private String foodName;
	private Integer foodPrice;
	private String foodImage;
	private String foodDesc;
	private Integer foodStar;
	private Integer foodKcal;
	private Category category;
	
	public Food() {

	}
	
	public Food(Integer foodNo) {
		super();
		this.foodNo = foodNo;
	}

	public Food(Integer foodNo, String foodName, Integer foodPrice, String foodImage, String foodDesc, Integer foodStar,
			Integer foodKcal, Category category) {
		super();
		this.foodNo = foodNo;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodImage = foodImage;
		this.foodDesc = foodDesc;
		this.foodStar = foodStar;
		this.foodKcal = foodKcal;
		this.category = category;
	}
	

	public Integer getFoodNo() {
		return foodNo;
	}

	public void setFoodNo(Integer foodNo) {
		this.foodNo = foodNo;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Integer getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}

	public String getFoodImage() {
		return foodImage;
	}

	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}

	public String getFoodDesc() {
		return foodDesc;
	}

	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}

	public Integer getFoodStar() {
		return foodStar;
	}

	public void setFoodStar(Integer foodStar) {
		this.foodStar = foodStar;
	}

	public Integer getFoodKcal() {
		return foodKcal;
	}

	public void setFoodKcal(Integer foodKcal) {
		this.foodKcal = foodKcal;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Food [foodNo=" + foodNo + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodImage="
				+ foodImage + ", foodDesc=" + foodDesc + ", foodStar=" + foodStar + ", foodKcal=" + foodKcal
				+ ", category=" + category + "]";
	}
	
	
}
