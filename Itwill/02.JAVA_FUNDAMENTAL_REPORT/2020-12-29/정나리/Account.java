package com.itwill05.service.account;
/*
 * 계좌생성 클래스
 */
public class Account {
	
	private int no; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	private double inter; //이율
	

	public Account() {}
	

	public Account(int no, String owner, int balance, double inter) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.inter = inter;
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

		System.out.printf("%d %6s %7d %5.1f %n", this.no, str, this.balance, this.inter);
	}

	public static void headerPrint() {
		System.out.println("=====================================");
		System.out.println("번호   이름   잔고   이율");
		System.out.println("=====================================");
	}
	
	//getter

	public int getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public double getInter() {
		return inter;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setInter(double inter) {
		this.inter = inter;
	}
	
	

}
