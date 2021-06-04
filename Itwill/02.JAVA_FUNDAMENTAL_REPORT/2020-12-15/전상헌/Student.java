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
	
	public void information(int no,String name,int kor,int eng,int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;	
	}
	public void total() {
		this.tot=this.eng+this.kor+this.math;
	}
	
	public void average() {
		this.avg=this.tot/3.0;
	}
	
	public void rank() {
		if(this.avg>=90) {
			this.grade='A';
		}else if(this.avg>=80){
			this.grade='B';
		}else if(this.avg>=70){
			this.grade='C';
		}else if(this.avg>=60){
			this.grade='D';
		}else {
			this.grade='F';
		}
		
		
	}
	
	public void totalInformation() {
		System.out.printf("%3d %5s %5d %5d %4d %5d %6.1f %4s %3d%n",this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
	}
	
	
	public void printHeader() {
		System.out.println("--------------학생 성적출력---------------------");
		System.out.println("학번  이름   국어 영어 수학  총점  평균 평점 석차");
		System.out.println("-------------------------------------------------");
		
	}
	
	
	
	
}