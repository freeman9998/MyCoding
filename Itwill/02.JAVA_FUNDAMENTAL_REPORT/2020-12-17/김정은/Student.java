package com.itwill02.constructor;
/*
 *  성적처리를 위해 필요한 학생객체를 만들기 위한 클래스 
 */
public class Student {
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
		//생성자 선언
		public Student() {
			
		}
		public Student(int no, String name, int kor, int eng, int math) {
			
			this.no = no;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

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
		//get,set 메소드
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
	
	
	
	
	
	
	
	
	

