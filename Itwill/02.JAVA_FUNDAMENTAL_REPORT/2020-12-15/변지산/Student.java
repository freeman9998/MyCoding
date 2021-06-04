package com.itwill01.method;
/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
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
	private int rank = 0; //석차는 0으로 
	
	// 멤버메쏘드 선언
	public void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	}
	/*
	void print() {
		System.out.printf("%d %s %d %d %d%n", this.no, this.name, this.kor, this.eng, this.math);
	}
	*/
	public void calculatetot() {
		this.tot = this.kor + this.eng + this.math;
		return;
	}
	public void calculateavg() {
		this.avg = this.tot / 3.0;
		return;
	}
	public void calculateif() {
		if((int)this.avg >= 90) {
			this.grade = 'A';
		}else if((int)this.avg >= 80) {
			this.grade = 'B';
		}else if ((int)this.avg >= 70) {
			this.grade = 'C'; 
		}else if ((int)this.avg >= 60) {
			this.grade = 'D';
		}
		return;
	}
	/*	
	void print1() {
		System.out.printf("%d %.2f %c%n", this.tot, this.avg, this.grade);
	}
	*/
	public void headprint() {
		System.out.println("----------------학생 성적 출력----------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n", "번호", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("----------------------------------------------");
	}
	
	public void print() {
		System.out.printf("%3d %3s %d %4d %4d  %3d  %5.2f %2c %3d%n", this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade, rank);
		return;
	}
	

}
