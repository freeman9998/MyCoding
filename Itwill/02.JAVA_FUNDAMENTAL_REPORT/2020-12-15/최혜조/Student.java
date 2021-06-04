package com.itwill01.method;
	
	/* #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 1. 캡슐화
	 */

public class Student {
	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	
	// 멤버메쏘드 선언
	
	// 학생객체기본데이터(번호, 이름, 국어, 영어, 수학) 입력메소드
	void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	}
	
	// 학생총점계산 메소드
	void totCalculate() {
		this.tot = (this.kor + this.eng + this.math);
		return;
	}
	// 학생평균계산 메소드
	void avgCalculate() {
		this.avg = (this.tot/3.0);
	}
	
	// 학생평점계산 메소드
	void gradeCalculate() {
		if (this.avg>=90)
		{
			this.grade = 'A';
		} 
		else if (this.avg>=80)
		{
			this.grade = 'B';
		} 
		else 
		{
			this.grade = 'C';
		}
		return;
	}
	
	void headerPrint() {
		System.out.println("---------------학생 성적출력------------------");
		System.out.println("학번  이름  국어 영어 수학 총점   평균 평점 ");
		System.out.println("----------------------------------------------");
	}
	// 학생데이터 출력메소드
	void print() {
		System.out.printf("%3d %4s %3d %4d %4d %5d %6.1f %3c\n",
					this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade);
		
	}
}
