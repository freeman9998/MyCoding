package com.itwill02.constructor;
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
	private int num; //학생 번호
	private String name; //학생 이름
	private int kor; //학생의 국어점수
	private int eng; //학생의 영어점수
	private int math; //학생의 수학점수
	private int total; //학생의 총점
	private double avg; //학생의 평균점수
	private char score; //학생의 평점
	private int rank; //학생의 석차
	
	/*
	 * <<생성자메쏘드 선언[오버로딩]>>
	 *  - 인자 0개짜리 생성자(기본생성자선언) 
	 *  - 인자 5개짜리(번호 이름 국어 영어 수학) 생성자선언
	 */
	public Student(){
		
	}
	
	public Student(int num, String name, int kor, int eng, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//setter,getter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getScore() {
		return score;
	}

	public void setScore(char score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//총점 계산 메쏘드
		public void totalcalc() {
			total=this.kor+this.eng+this.math;
		}

	//평균 계산 메쏘드
	public void avgcalc() {
		avg=this.total/3.0;
	}
	//평점 계산 메쏘드
	public void scorecalc() {
		if(this.avg >=90) {
			this.score='A';
		}else if(this.avg >=80) {
			this.score='B';
		}else if(this.avg >=70) {
			this.score='C';
		}else if(this.avg >=60) {
			this.score='D';
		}else {
			this.score='F';
		}
	}
	
	//기본 출력표 메쏘드
	public void startline() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
	}
	
	//학생 정보 출력 메쏘드
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",num,name,kor,eng,math
				,total,avg,score,rank);
	}
	
}
