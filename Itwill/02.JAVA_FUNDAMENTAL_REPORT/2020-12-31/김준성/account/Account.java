package com.itwill05.service.account;

/*
 * 은행의계좌를 추상화한 클래스
 */
public class Account {
	/*
	 * 속성(attribute) 멤버변수
	 */
	private int no;// 계좌번호
	private String owner;// 계좌주
	private int balance;// 잔고
	private double interest;// 이율
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
	 * 행위(operation) 멤버메쏘드
	 */

	/*
	 * 계좌객체에 데이타 set 메쏘드
	 */
	public void setAccountData(int no, String owner, int balance, double interest) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.interest = interest;
	}

	/*
	 * 입금
	 */
	public void deposit(int m) {
		this.balance += m;
	}

	/*
	 * 출금
	 */
	public void withdraw(int m) {

		if (this.balance - m < 0) {
			System.out.println(this.owner + " 님 잔고가 부족합니다.");
			return;
		}

		this.balance = this.balance - m;
		return;
	}

	/*
	 * 계좌정보출력
	 */
	public static void headerPrint() {
		System.out.println("---------------------");
		System.out.println("번호 계좌주 잔고 이율");
		System.out.println("---------------------");
	}

	public void print() {
		/*
		 * 1. 첫 글자 대문자 2. 5자리로 출력 3. 첫 글자 이외에는 ****(4개)
		 */
		char firstChar = owner.charAt(0);
		String tempOwner = firstChar + "****";
		System.out.printf("%d %s %d %4.1f %n", this.no, tempOwner.toUpperCase(), this.balance, this.interest);
	}

	// setter,getter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getinterest() {
		return interest;
	}

	public void setinterest(double interest) {
		this.interest = interest;
	}

}