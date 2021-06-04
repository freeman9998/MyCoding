package com.itwill05.service.account;
/*
 * 계좌생성 클래스
 */
public class Account {
	
	private int no; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	private double iyul; //이율
	

	public Account() {}
	

	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	
	
	//입금메소드

	public void deposit(int m) {
		this.balance = this.balance + m;
	}
	
	//출금 메소드

	public void withDraw(int m) {
		this.balance = this.balance-m;
	}
	
	//계좌정보 출력

	public void print() {
		
		String str = this.owner.toUpperCase();
		str = str.substring(0,1) + "****";

		System.out.printf("%d %6s %7d %5.1f %n", this.no, str, this.balance, this.iyul);
	}

	public static void headerPrint() {
		System.out.println("=====================================");
		System.out.println("번호   이름   잔고   이율");
		System.out.println("=====================================");
	}
	
	//getter

	public int getNo() {
		return this.no;
	}
	public String getOwner() {
		return this.owner;
	}
	public int getBalance() {
		return this.balance;
	}
	public double getIyul() {
		return this.iyul;
	}
	//setter 메쏘드
	public void setNo(int no) {
		this.no = no;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	

}