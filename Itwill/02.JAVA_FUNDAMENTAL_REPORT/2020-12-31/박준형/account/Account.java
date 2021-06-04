package com.itwill05.service.account;

/*
 * 은행의계좌를 추상화한 클래스
 */
public class Account extends Object{
	/*
	 * 속성(attribute)
	 * 멤버변수
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	/*
	 * 생성자
	 */
	
	public Account() {
		
	}
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}


	/*
	 * 행위(operation)
	 * 멤버메쏘드
	 */
	/*
	 * 계좌객체에 데이타 set 메쏘드
	 */
	public void setAccountData(
			int no,String owner,
			int balance,double iyul ) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	} 
	/*
	 * 입금
	 */
	public void deposit(int m) {
		this.balance+=m;
	}
	/*
	 * 출금
	 */
	public void withdraw(int m) {
		
		if(this.balance-m < 0) {
			System.out.println(this.owner+" 님 잔고가 부족합니다.");
			return;
		}
		
		this.balance=this.balance-m;
		return;
	}
	/*
	 * 계좌정보출력
	 */
	public static void headerPrint() {
		System.out.println("-----------------------------");
		System.out.println("번호\t계좌주\t잔고\t이율");
		System.out.println("-----------------------------");
	}
	
	/*
	 1.첫글자 대문자
	 2.5자리로출력
	 3.첫글자이외에는****(4개)
	---------------------------------------
	번호	이름	 잔고	 이율
	---------------------------------------
	1111	K****	 89000	 1.3
	2222	A****	 45000	 2.7
	3333	F****	 23000	 4.7
	4444	X****	 34000	 6.7
	5555	H****	 78000	 3.7
	6666	K****	 99000	 5.7
	7777	K****	 89000	 4.7
	8888	Q****    91000	 1.7
	9999	M****    12000	 0.7
	*/
	
	public void print() {
		String tempOwner=this.owner.toUpperCase().substring(0,1);
		tempOwner=tempOwner+"****";
		System.out.println(this.no+"\t"+tempOwner+"\t"+this.balance+"\t"+this.iyul);
	}
	
	
	//setter,getter
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
	
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
	
}










