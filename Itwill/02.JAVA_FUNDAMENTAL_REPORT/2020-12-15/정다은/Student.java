package com.itwill01.field;
/*
 * 성적처리를 위해 필요한 '학생객체'를 만들기위한 클래스
 * 1. 캡슐화
 */
public class Student {
	
	/*
	 * <<속성>>
	 * 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차를 저장할 필드의 선언
	 */
	
	//필드(멤버변수)선언
	 
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	
	//멤버메소드 선언
	
	//기본데이타 셋팅
	public void setStuData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	return;
	}
	
	//총점데이타 셋팅
	public void setTot() {
		this.tot = this.kor + this.eng + this.math;
	return;
	}
	
	//평균데이타 셋팅
	public void setAvg() {
		this.avg = this.tot / 3.0;
	return;
	}
	
	//평점데이타 셋팅
	public void setGrade() {
		if(this.avg >= 90) {
			this.grade = 'A';
		}else if(this.avg >= 80) {
			this.grade = 'B';
		}else if(this.avg >= 70) {
			this.grade = 'C';
		}else if(this.avg >= 60) {
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
	return;
	}
	
	//석차 계산기능
	public void setRank(int rank) {
		this.rank = rank;
	return;
	}
	
	
	//출력 기능
	public void headerPrint() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
	return;
	}
	
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
		System.out.printf("-----------------------------------------------%n");
	return;
	}
	

}
