package com.itwill04.array;

public class Student {
	/*학생3명 성적(번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차)
	멤버필드(속성) 선언 및 캡슐화
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
	 * 생성자 메쏘드 선언
	 * 학생 3명(번호, 이름, 국어, 영어, 수학) 멤버필드를 생성자메쏘드를 이용해 초기화
	 */
	//매개변수가 없는 기본생성자메소드 선언
	public Student() {
	}
	//매개변수가 있는 생성자메소드를 이용해 객체 생성과 동시에 멤버필드 값 초기화
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//setter메소드를 이용해 멤버필드 no, name, kor, eng, math에 값 대입
	public void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//setter메소드를 이용해 멤버필드 tot에 값 대입
	public void setTot() {
		this.tot = this.kor+this.eng+this.math;
	}
	//setter메소드를 이용해 멤버필드 avg에 값 대입
	public void setAvg() {
		this.avg = this.tot/3;
	}
	//setter메소드를 이용해 멤버필드 grade에 값 대입
	public void setGrade() {
		if(this.avg>=80) {
			this.grade='A';
		}
		else if(this.avg>=65 && this.avg<80) {
			this.grade='B';
		}
		else if(this.avg>=50 && this.avg<65) {
			this.grade='C';
		}
		else if(this.avg>=35 && this.avg<50) {
			this.grade='D';
		}
		else {
			this.grade='E';
		}
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public char getGrade() {
		return grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void headprint() {
		System.out.println("--------------------------------------------");
		System.out.println("번호 이름   국어 영어 수학 총점  평균 평점 석차");
	}
	public void print() {
		System.out.printf("%2d %4s %4d %4d %4d %5d %5.1f %2c %5d%n", no, name, kor, eng, math, tot, avg, grade, rank);
	}

	
	
}
