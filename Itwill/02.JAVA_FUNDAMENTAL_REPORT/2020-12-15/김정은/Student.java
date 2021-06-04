package com.itwill01.method;
/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 *  - 캡슐화
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
	// 나를 호출한 놈(클래스, 객체)이 데이타를 입력할 곳 
	 public void basicData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return; //리턴문을 만나면 실행흐름을 호출한 곳으로 반환 (Void문은 생략가능하다)
	}
    //메소드를이용한 총점계산
	public void totData() {
		this.tot = this.kor + this.eng + this.math;
		return;
	}

	// 메소드를 이용한 평균계산
	public void avgData() {
		this.avg = this.tot/3.0;
		return;
	}
	//평점 계산
	public void gradeData() {
		if (this.avg >= 80) {
			this.grade = 'A';
		} else if (this.avg >= 70) {
			this.grade = 'B';
		} else if (this.avg >= 50) {
			this.grade = 'C';
		} else if (this.avg >= 40) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		return;	
	}
	//석차 대입
	public void rankData(int rank) {
		this.rank = rank;

		return;
	}
	//출력
	public void headprint() {
		System.out.println("-------------------------------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("-------------------------------------------");
		return;
	}

	public void print() {
		System.out.printf("%2d %4s %3d %4d %4d %4d %5.1f %3c %3d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
		System.out.println();
		return;
	}
	
	
}
