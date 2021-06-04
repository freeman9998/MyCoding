/*
 * 은행에서 계좌객체를 생성하기위한 클래스
 */
public class Account {
	/*
	 * 멤버필드
	 */
	private int no;			//계좌번호
	private String owner;   //계좌주
	private int balance;    //잔고
	private double iyul;	//이율
	/*
	 * 생성자
	 */
	/**
	 *  기본생성자
	 */
	public Account() {
		
	}
	/**
	 * 인자4개로초기화된객체생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 멤버메쏘드
	 */
	//계좌데이타를set하는 메쏘드
	public void setAccountData(
			int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//입금메쏘드
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	//출금메쏘드
	public void withDraw(int m) {
		this.balance = this.balance-m;
	}
	//헤더프린트
	public void headerPrint() {
		System.out.println("----------------------");
		System.out.println("번호  이름  잔고  이율");
		System.out.println("----------------------");
	}
	
	//계좌정보출력메쏘드
	public void print() {
		System.out.printf("%d  %s  %d  %4.1f %n",this.no,this.owner,this.balance,this.iyul);
	}
	
	//getter 메쏘드
	public int getNo() {
		return this.no;
	}
	public String getOwner() {
		return this.owner;
	}
	/**
	 * 잔고조회메쏘드
	 * @return 잔고
	 */
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
