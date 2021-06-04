package com.itwill.prm.vo;


public class Pays {
	private int regi_num;                      		
	private int member_no;                     		
	private int overtimework;                  		
	private int holidaywork;                   		
	private int nomalpay;                      		
	private int levpay;                        		
	private int pay_bouns;                     		
	private String workMonth;
	
	public Pays() {
		
	}
	
	public Pays(int regi_num, int member_no, int overtimework, int holidaywork, int nomalpay, int levpay, int pay_bouns, String workMonth) {
		this.regi_num = regi_num;
		this.member_no = member_no;
		this.overtimework = overtimework;
		this.holidaywork = holidaywork;
		this.nomalpay = nomalpay;
		this.levpay = levpay;
		this.pay_bouns = pay_bouns;
		this.workMonth = workMonth;
	}
	
	public int getRegi_num() {
		return regi_num;
	}
	public void setRegi_num(int regi_num) {
		this.regi_num = regi_num;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
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
	
	@Override
	public String toString() {
		return "Pays [regi_num=" + regi_num + ", member_no=" + member_no + ", overtimework=" + overtimework
				+ ", holidaywork=" + holidaywork + ", nomalpay=" + nomalpay + ", levpay=" + levpay + ", pay_bouns="
				+ pay_bouns + ", workMonth=" + workMonth + "]";
	}    
	
}