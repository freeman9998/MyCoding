package com.itwill04.array;

/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 *  - 캡슐화
 */
public class Student {
	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	/*
	멤버변수 선언
	*/
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	/*
	 * <<생성자메쏘드 선언[오버로딩]>>
	 *  - 인자 0개짜리 생성자(기본생성자선언) 
	 *  - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	 */
	public Student() {
		//인자 0개 짜리 기본생성자
	}
	
	public Student(int no, String name, int kor, int eng, int math) {
		//인자 5개 짜리 생성자
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/*
	멤버메쏘드 선언
	학생정보 입력 메쏘드
	*/
	public void setStudentData(int no, String name, int kor, int eng, int math) {
		//입력된 값을 되돌려줌
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//총점 계산 메쏘드
	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}
	
	//평균 계산 메쏘드
	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}



	//평점 계산 메쏘드
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//avg에 입력된 값으로 평점 확인
	public char calculateGrade() {

		if (this.avg >= 90)
			this.grade = 'A';
		else if (this.avg < 90 && this.avg >= 80)
			this.grade = 'B';
		else if (this.avg < 80 && this.avg >= 70)
			this.grade = 'C';
		else if (this.avg < 70 && this.avg >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';

		return grade;
	}
	
	
	//1번만 출력하는 헤드 출력 메쏘드
	public static void headerPrint() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");

	}
	//객체 출력 메쏘드
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}
	
	
	
	
	//입출력을 위한 getter setter 만들어주기
	
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public int getTot() {
		return tot;
	}



	public void setTot(int tot) {
		this.tot = tot;
	}



	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	public int getRank() {
		return rank;
	}

}
