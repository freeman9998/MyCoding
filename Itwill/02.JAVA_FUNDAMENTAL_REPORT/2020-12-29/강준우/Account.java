package com.itwill05.service.account;

public class Account {
	/*
	 * 멤버필드
	 */
	private int no; //계좌번호
	private String owner; //계좌주
	private int balance; //잔고
	private double iyul; // 이율
	
	public Account() {
		
	}
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 멤버메쏘드
	 */
	//계좌데이타를 set하는 메쏘드
	public void setData(
			int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//입금메쏘드
	public void deposit(int m){
		this.balance=this.balance+m;
	}
	//출금메쏘드
	public void withDraw(int m) {
		this.balance=this.balance-m;
	}
	
	
	//계좌정보출력 메쏘드
	static void headPrint(){
		System.out.println("--------------------------------");
		System.out.println("번호  이름  잔고  이율");
		System.out.println("--------------------------------");
	}
	void print() {
		System.out.printf("%d %s %d %.2f %n", this.no, this.owner,this.balance, this.iyul);
	}
	//getter 메쏘드 - 메쏘드를 이용해서 객체 안에 있는 멤버필드 값을 반환해준다고 생각하면 됨
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
	
	//setter 메쏘드 - 메쏘드를 이용해서 객체 안에 있는 멤버필드 값을 세팅한다고 생각하면 됨
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
	/*
	 * 유지보수 확장성을 위해서 class를 private로 막고 method를 public으로 열어둔다
	 */


}
