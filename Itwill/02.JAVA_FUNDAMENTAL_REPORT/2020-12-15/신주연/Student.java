package com.itwill01.method;

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
	
	/* 
	 *  학생 기본데이터 셋팅기능을 가진 기본데이터메소드
	 * 	호출을 받은 setDate메소드 순차적으로 실행후 반환
	 */

	void setDate(int no,String name,int kor,int eng,int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		return;
	}
	
	// 총점계산 기능을 가진 총점계산메소드
	void calculateTot() {
		this.tot =this.kor+this.eng+this.math;
		return;
	}
	
	// 평균계산 기능을 가진 평균계산메소드
	void calculateAvg() {
		this.avg = (this.tot)/3.0;
		return;
	}
	
	// 평점계산 기능을 가진 평점계산메소드
	void calculateGrade() {
		//멤버필드 avg에 대입된 데이터를 가지고 
		//평점을 구하기 위해 if조건문사용
		if(this.avg>=90) {
			this.grade = 'A';
		}else if(this.avg>=80) {
			this.grade = 'B';
		}else if(this.avg>=70) {
			this.grade = 'C';
		}else if(this.avg>=60) {
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
		
		return;
	}
	
	//출력기능을 가진 출력메소드
	void setPrint() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점");
		System.out.printf("-----------------------------------------------%n");
	}
	
	//학생정보출력기능을 가진 출력메소드
	void print() {
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %n",this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade);
	}

}
