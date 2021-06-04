package com.itwill.prm.vo;

import java.sql.Date;

public class PaystubsResultValue {
	private int page_num;                      	
	private int member_no;                     		
	private String issuance_date;                 		
	private int income_tax;                    		
	private int residents_tax;                 		
	private int food_exp;                      		
	private int traffic_exp;                   		
	private int welfare;                       		
	private int overtimework;                  		
	private int holidaywork;                   		
	private int nomalpay;                      		
	private int levpay;                        		
	private int pay_bouns;                     		
	private String workMonth;                     	
	
	public PaystubsResultValue() {
		
	}
	
	public PaystubsResultValue(int page_num, int member_no, String issuance_date, int income_tax, int residents_tax,
		int food_exp, int traffic_exp, int welfare, int overtimework, int holidaywork, int nomalpay, int levpay,
		int pay_bouns, String workMonth) {
		super();
		this.page_num = page_num;
		this.member_no = member_no;
		this.issuance_date = issuance_date;
		this.income_tax = income_tax;
		this.residents_tax = residents_tax;
		this.food_exp = food_exp;
		this.traffic_exp = traffic_exp;
		this.welfare = welfare;
		this.overtimework = overtimework;
		this.holidaywork = holidaywork;
		this.nomalpay = nomalpay;
		this.levpay = levpay;
		this.pay_bouns = pay_bouns;
		this.workMonth = workMonth;
	}



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

	public String getIssuance_date() {
		return issuance_date;
	}

	public void setIssuance_date(String issuance_date) {
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

	public int getOvertimework() {
		return overtimework;
	}

	public void setOvertimework(int overtimework) {
		this.overtimework = overtimework;
	}

	public int getHolidaywork() {
		return holidaywork;
	}

	public void setHolidaywork(int holidaywork) {
		this.holidaywork = holidaywork;
	}

	public int getNomalpay() {
		return nomalpay;
	}

	public void setNomalpay(int nomalpay) {
		this.nomalpay = nomalpay;
	}

	public int getLevpay() {
		return levpay;
	}

	public void setLevpay(int levpay) {
		this.levpay = levpay;
	}

	public int getPay_bouns() {
		return pay_bouns;
	}

	public void setPay_bouns(int pay_bouns) {
		this.pay_bouns = pay_bouns;
	}

	public String getWorkMonth() {
		return workMonth;
	}

	public void setWorkMonth(String workMonth) {
		this.workMonth = workMonth;
	}
	
	
	public int getTot() {
		int tot = nomalpay+levpay+overtimework+holidaywork+pay_bouns+food_exp+traffic_exp+welfare;
		return tot;
	}
	
	@Override
	public String toString() {
		return "PaystubsResultValue [page_num=" + page_num + ", member_no=" + member_no + ", issuance_date="
				+ issuance_date + ", income_tax=" + income_tax + ", residents_tax=" + residents_tax + ", food_exp="
				+ food_exp + ", traffic_exp=" + traffic_exp + ", welfare=" + welfare + ", overtimework=" + overtimework
				+ ", holidaywork=" + holidaywork + ", nomalpay=" + nomalpay + ", levpay=" + levpay + ", pay_bouns="
				+ pay_bouns + ", workMonth=" + workMonth + "]";
	}
}
