package com.itwill01.method;

public class Student {
	/*
	 * 성적처리를 위해 필요한 학생객체를 만들기 위한 클래스
	 * 캡슐화
	 */
	
	//멤버필드 선언 및 멤버필드 private
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	//멤버메쏘드 선언 및 멤버메쏘드 public
	//멤버메쏘드를 이용해 멤버필드 값 대입
	public void score(int no, String name, int kor, int eng, int math){
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//멤버메쏘드를 이용해 멤버필드 tot 값 대입
	public void scoretot() {
		this.tot=this.kor+this.eng+this.math;
	}
	//멤버메쏘드를 이용해 멤버필드 avg 값 대입
	public void scoreavg() {
		this.avg=this.tot/3;
	}
	//멤버메쏘드를 이용해 멤버필드 grade 값 대입
	public void scoregrade(){
		if(this.avg>=90) {
			this.grade='A';
		}else if(this.avg>=75 && this.avg<90) {
			this.grade='B';
		}else if(this.avg>=60 && this.avg<70) {
			this.grade='C';
		}else if (this.avg>=45 && this.avg<60) {
			this.grade='D';
		}else {
			this.grade='E';
		}
	}
	//학생 3명의 성적 출력
	public void headprint() {
		System.out.println("번호 이름 국어 영어 수학 총점 평균 평점");
	}
	public void print() {
		System.out.printf("%d %s %4d %4d %4d %4d %5.1f %3c%n", this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade);
	}
	
}
