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
	public int no;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int tot;
	public double avg;
	public char grade;
	public int rank;
	
	// 멤버메쏘드 선언
	void setStudentData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	}
	void calculateTot() {
		this.tot = kor + eng + math;
		System.out.println(tot);
		return;
	}
	void calculateAvg() {
		this.avg = tot / 3.0;
		System.out.println(avg);
		return;
	}
	void gradeMethod() {
		if (this.avg >= 90) {
			this.grade = 'A';
			System.out.println(grade);
		} else if (this.avg >= 80){
			this.grade = 'B';
			System.out.println(grade);
		} else {
			this.grade = 'C';
			System.out.println(grade);
		}
		return;
	}
	void print() {
		System.out.println("---------------학생성적관리---------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n", "번호", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("%4d %4s %4d %4d %4d %4d %3.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade, this.rank);
		System.out.println("------------------------------------------");
		return;	

	}
	
	
		
}