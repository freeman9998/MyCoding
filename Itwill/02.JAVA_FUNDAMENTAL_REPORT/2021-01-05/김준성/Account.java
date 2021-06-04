package com.itwill06.collection.account;

/*
 * 은행에서 계좌객체를 생성하기위한 클래스
 */
public class Account {
	/*
	 * 멤버필드
	 */
	private int no; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고
	private double interest; // 이율
	/*
	 * 생성자
	 */

	public Account() {

	}

	public Account(int no, String owner, int balance, double interest) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.interest = interest;
	}

	/*
	 * 멤버메쏘드
	 */
	// 계좌데이타를set하는 메쏘드
	public void setAccountData(int no, String owner, int balance, double interest) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.interest = interest;
	}

	// 입금메쏘드
	public void deposit(int m) {
		this.balance = this.balance + m;
	}

	// 출금메쏘드
	public void withdraw(int m) {
		this.balance = this.balance - m;
	}

	// 헤더프린트
	public static void headerPrint() {
		System.out.println("----------------------");
		System.out.println("번호  이름  잔고  이율");
		System.out.println("----------------------");
	}

	// 계좌정보출력메쏘드
	/*
	 * 1.첫글자 대문자 2.5자리로출력 3.첫글자이외에는****(4개) 1111 K**** 89000 1.3
	 */
	public void print() {
		char firstChar = owner.charAt(0);
		String tempOwner = firstChar + "****";
		System.out.printf("%d %s %d %4.1f %n", this.no, tempOwner.toUpperCase(), this.balance, this.interest);

	}

	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", interest=" + interest + "]\n";
	}

	// getter 메쏘드
	public int getNo() {
		return this.no;
	}

	public String getOwner() {
		return this.owner;
	}

	public int getBalance() {
		return this.balance;
	}

	public double getInterest() {
		return interest;
	}

	// setter 메쏘드
	public void setNo(int no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

}