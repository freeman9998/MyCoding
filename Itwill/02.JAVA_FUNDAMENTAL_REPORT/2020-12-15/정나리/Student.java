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
	
	//학생정보 입력 메소드. 입력 받고 리턴은 없음.
	void setStudentData(int no, String name, int kor, int eng, int math) {
		
		this.no = no; //호출될 때 입력 받았던 값을 멤버필드에 대입한다.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		return;
	}
	
	//총점 계산 메소드. 입력 받을 일 없고 리턴 해줄 일 없음.
	void calculateTot() {
		
		this.tot = this.kor+this.eng+ this.math; 
		//과목 멤버필드의 값을 더하여 총점 멤버필드에 대입
		return;
	}
	
	//평균계산 메소드. 입력 받을 일 없고 리턴 해줄 일 없음.
	void calculateAvg() {
		
		this.avg = this.tot/3.0;
		//평균 멤버필드에 평균값 계산 후 대입
		return;
	}
	
	//평점 계산 메소드. 입력 받을 일 없고 리턴 해줄 일 없음.
	void calculateGrade() {
		
		//멤버필드 avg에 저장된 값으로 평점 구하기
		if(this.avg >= 90){
			this.grade = 'A';
		} else if (this.avg >= 80) {
			this.grade = 'B';
		} else if (this.avg >= 70) {
			this.grade = 'C';
		} else if (this.avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		
		return;
	}
	
	
	//출력 메소드. 입력 받을 일 없고 리턴 해줄 일 없음.
	void headPrint() {

		//맨 위에 메뉴가 여러번 나오지 않게 멤버필드 no가 1일 경우에만 함께 출력 되도록 함.

			System.out.printf("---------------학생 성적출력-------------------%n");
			System.out.printf(" %s  %s  %s %s %s %s %s %s %s %n",
					"학번", "이름", "국어", "영어", "수학","총점", "평균","평점", "석차");
			System.out.printf("-----------------------------------------------%n");
	
		return;
	}
	
	void print() {
		

			System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %3d%n", 
					this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade, this.rank);
		
		return;
	}
	
	
}
