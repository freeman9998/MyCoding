package com.itwill02.constructor;
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
	
	/*
	 * 생성자메소드 선언[오버로딩]
	 * -인자 0개짜리 디폴트 생성자
	 * -인자 5개짜리 생성자
	 */
	
	public Student() {
	}
	
	public Student(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

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
	
	//이름 변경 setter
		public void setName(String name) {
			this.name = name;
		}
	
	//총점데이타 셋팅
	public void setTot() {
		this.tot = this.kor + this.eng + this.math;
	return;
	}
	
	//총점 반환 메소드 getter
	public int getTot() {
		return tot;
	}
	
	//평균데이타 셋팅
	public void setAvg() {
		this.avg = this.tot / 3.0;
	return;
	}
	
	//학점데이타 셋팅
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
	
	//학점 반환 메소드 getter
	public char getGrade() {
		return grade;
	}
	
	

	//출력 기능
	public void headerPrint() {
		System.out.printf("-------------학생 성적출력----------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점");
		System.out.printf("------------------------------------------%n");
	return;
	}
	
	public void renameHeaderPrint() {
		System.out.printf("-----------개명된 학생 성적출력-----------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점");
		System.out.printf("------------------------------------------%n");
	return;
	}
	
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c%n",
				this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade);
		System.out.printf("------------------------------------------%n");
	return;
	}
	

}
