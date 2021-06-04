package com.itwill.prm.vo;

import java.sql.Date;

public class Paystubs {
	private int page_num;                      		
	private int member_no;                     		
	private Date issuance_date;                 	
	private int income_tax;                    		
	private int residents_tax;                 		
	private int food_exp;                      		
	private int traffic_exp;                   		
	private int welfare;
	
	public int getPage_num() {
		return page_num;
	}
	public void setPage_num(int page_num) {
		this.page_num = page_num;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public Date getIssuance_date() {
		return issuance_date;
	}
	public void setIssuance_date(Date issuance_date) {
		this.issuance_date = issuance_date;
	}
	public int getIncome_tax() {
		return income_tax;
	}
	public void setIncome_tax(int income_tax) {
		this.income_tax = income_tax;
	}
	public int getResidents_tax() {
		return residents_tax;
	}
	public void setResidents_tax(int residents_tax) {
		this.residents_tax = residents_tax;
	}
	public int getFood_exp() {
		return food_exp;
	}
	public void setFood_exp(int food_exp) {
		this.food_exp = food_exp;
	}
	public int getTraffic_exp() {
		return traffic_exp;
	}
	public void setTraffic_exp(int traffic_exp) {
		this.traffic_exp = traffic_exp;
	}
	public int getWelfare() {
		return welfare;
	}
	public void setWelfare(int welfare) {
		this.welfare = welfare;
	}
	
	@Override
	public String toString() {
		return "Paystubs [page_num=" + page_num + ", member_no=" + member_no + ", issuance_date=" + issuance_date
				+ ", income_tax=" + income_tax + ", residents_tax=" + residents_tax + ", food_exp=" + food_exp
				+ ", traffic_exp=" + traffic_exp + ", welfare=" + welfare + "]";
	}
	
}