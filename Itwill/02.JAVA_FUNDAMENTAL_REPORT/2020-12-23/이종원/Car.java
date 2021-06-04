package com.itwill04.array;

public class Car {
	/*
  	클래스의 구성요소
  		1. 멤버필드(변수)	[속성] ('차'객체의 속성데이터를 저장할 변수)
  		2. 멤버메소드		[행위] ('차'객체가 가지고 있는 기능)
	 */
	
	//필드
	private String no; //번호
	private int inTime; //입차시간
	private int outTime; //출차시간
	private int fee;	//주차요금
	
	/*
	 * 생성자 오버로딩
	 */
	public Car() {						//매개변수가 있는 생성자 만들기 위해 디폴트생성자 만듬
		
	}
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		super();
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	
	/*
	 * <<메소드(기능)>>
	 */
	// 입차데이타(차량번호,입차시간)셋팅
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	
	
	// - 요금 계산기능
	public void calculateFee() {
		this.fee =(this.outTime - this.inTime)*1000;
	}
	
	// - 타이틀 출력기능
	public static void headerPrint() {
		System.out.println("---------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("---------------------------------");
	}
	
	// 	-차량정보 출력기능
	public void print() {
		System.out.printf("%6s %5d %7d %10d%n",this.no,this.inTime,this.outTime,this.fee);	
		/*
		 * this (생략가능)
		 * 	- self 참조변수
		 * 	- print메소드를 갖고있는 객체의 주소값
		 */
	}
	
	// 출차데이타(출차시간)셋팅
			public void setOutTime(int outTime) {
				this.outTime = outTime;
			}


			public String getNo() {
				return no;
			}


			public void setNo(String no) {
				this.no = no;
			}


			public int getInTime() {
				return inTime;
			}


			public void setInTime(int inTime) {
				this.inTime = inTime;
			}


			public int getFee() {
				return fee;
			}


			public void setFee(int fee) {
				this.fee = fee;
			}


			public int getOutTime() {
				return outTime;
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}