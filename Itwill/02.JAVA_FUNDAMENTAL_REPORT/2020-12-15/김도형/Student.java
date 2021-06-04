package com.itwill01.method;

	/*	 
	 * #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
     * 1. 캡슐화
	 */
	public class Student {	
		/*
		 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
		 */

		// 멤버변수 선언
		private int no;
		private String name;
		private int kor, eng, math;
		private int total;
		private double avg;
		private char grade;
		private int rank = 0;
						
		// 멤버메쏘드 선언
		public void setData(int no, String name, int kor, int eng, int math) {
			this.no = no;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;			
		}
		
		public void total() {
			total = (this.kor+this.eng+this.math);			
		}
		
		public void avg() {
			avg = (double)this.total/3;			
		}
		
		public void grade() {
			switch((int)this.avg/10) {
			case 10:
			case 9:
				this.grade='A';
				break;
			case 8:
				this.grade='B';
				break;
			case 7:
				this.grade='C';
				break;
			case 6:
				this.grade='D';
				break;
			default:
				this.grade='F';
				break;			
			}	
			return;
		}	
		
		public void headerPrint() {
			System.out.printf("--------------학생 성적 출력-----------------%n");
			System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
					"번호","이름","국어","영어","수학","총점","평균","평점","석차");
			System.out.printf("---------------------------------------------%n");			
		}
		public void print() {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", 
					no, name, kor, eng, math, total, avg, grade, rank);				
		}
		//setter,getter

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
