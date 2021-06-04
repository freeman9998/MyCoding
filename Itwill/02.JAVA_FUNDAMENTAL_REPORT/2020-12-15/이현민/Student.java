package com.itwill01.method;
/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
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
	// 학생기본데이타 메쏘드
	public void basicInput(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	}
	// 총점계산 메쏘드
	public void totCalculate() {
		this.tot = kor + eng + math;
		return;
	}
	// 평균계산 메쏘드
	public void avgCalculate() {
		this.avg = tot/3.0;
		return;
	}
	// 평점계산 메쏘드
	public void gradeCalculate() {
		if (avg >= 90) {
			this.grade = 'A';
		} else if (avg >= 80) {
			this.grade = 'B';
		} else if (avg >= 70) {
			this.grade = 'C';
		} else if (avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		return;
	}
	// 출력 메쏘드
	public void headerPrint() {
		System.out.printf("---------------학생 성적출력-----------------%n");
		System.out.printf("%s %s %s %s %s %s %s %s %s %n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("---------------------------------------------%n");
		return;
	}
	public void print() {
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d%n",
				no,name,kor,eng,math,tot,avg,grade,rank);
		return;
	}
}