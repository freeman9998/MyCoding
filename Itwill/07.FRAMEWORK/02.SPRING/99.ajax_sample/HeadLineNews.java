package com.itwill.ajax;

public class HeadLineNews {
	private String title;
	private String date;
	private String company;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public HeadLineNews() {
		// TODO Auto-generated constructor stub
	}
	public HeadLineNews(String title, String date, String company) {
		super();
		this.title = title;
		this.date = date;
		this.company = company;
	}
	
}
