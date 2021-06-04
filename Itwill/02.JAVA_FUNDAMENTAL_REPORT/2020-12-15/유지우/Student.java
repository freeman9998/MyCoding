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
	
	public void setStudentData(
			int no,String name,int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	
	public void total() {
		this.tot = (this.kor + this.eng + this.math);
	}
	
	public void average() {
		this.avg = ((double)(this.tot))/3;
	}
	
	public void calculategrade() {
		if (this.avg >= 90 && this.avg  < 100) {
			this.grade = 'A';
		} else if (this.avg  >= 80 && this.avg  < 90) {
			this.grade = 'B';
		} else {
			this.grade = 'C';
		}
	}
	
	
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the kor
	 */
	public int getKor() {
		return kor;
	}

	/**
	 * @param kor the kor to set
	 */
	public void setKor(int kor) {
		this.kor = kor;
	}

	/**
	 * @return the eng
	 */
	public int getEng() {
		return eng;
	}

	/**
	 * @param eng the eng to set
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}

	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}

	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}

	/**
	 * @return the tot
	 */
	public int getTot() {
		return tot;
	}

	/**
	 * @param tot the tot to set
	 */
	public void setTot(int tot) {
		this.tot = tot;
	}

	/**
	 * @return the avg
	 */
	public double getAvg() {
		return avg;
	}

	/**
	 * @param avg the avg to set
	 */
	public void setAvg(double avg) {
		this.avg = avg;
	}

	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public void print() {
	System.out.printf("%2d %5s %4d %4d %4d %4d %6.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade,
			this.rank);
	}
	
}




