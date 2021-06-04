package com.itwill02.method;
/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
   1. 캡슐화
*/
public class Student {

	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 *	RETURN : 쓰레드(실행) 흐름을 되돌려줌
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

	/*
	 * 멤버메쏘드 선언
	 */

	// 기본데이타입력
	public void studentData(int no, String name, int kor, int eng, int math, int rank) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = rank;
		return;
	}

	// 총점계산
	public void studentTot() {
		//국어,영어,수학 멤버 필드의 값을 더하고 총점 멤버 필드에 대입
		this.tot = (kor + eng + math);
		return;
	}

	// 평균계산
	public void studentAvg() {
		//평균값 계산 후 평균 멤버필드에 대입
		this.avg = (this.tot/3.0);
		return;
	}

	// 평점계산
	public void studentGrade() {
		//평균 멤버필드에 저장된 값을 평점 구하기
		if (this.kor >90) {
			this.grade='A';
		}else if (this.eng > 80) {
			this.grade='B';
		}else  if(this.math > 50) {
			this.grade='C';
		}else {
			this.grade='F';
		}
		return;
	}
	//헤드프린트
	public void headPrint() {
		System.out.printf("---------------학생 성적출력-------------------------%n");
		System.out.printf("%s %2s %4s %3s %3s %3s %3s %2s %3s%n", 
				"학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		return;
	}
	// 프린트
	public void print() {
			System.out.printf("%3d %4s %4d %4d %5d %6d %6.1f %3c %3s\n",
					this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
			return;
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

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
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

	public void setRank(int rank) {
		this.rank = rank;
	}

	
}
