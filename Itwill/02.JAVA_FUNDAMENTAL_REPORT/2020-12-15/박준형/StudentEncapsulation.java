package com.itwill01.field;
/*
#### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
   1. 캡슐화
   
*/
public class StudentEncapsulation {
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
	
	// 멤버메쏘드 선언	
	//학생 정보 셋터 메쏘드
	public void setStudentData(int num,String name,int kor,int eng,int math) {
		this.num=num;
		this.name=name;
		//유효성 검사체크 각 과목들의 점수가 정상적이지 못할때 해당과목은 0점 처리한다.
		//cheakScore 메쏘드를 이용하여 인자값의 유효성을 체크하고 유효한 값인 경우 true를 반환
		if(cheakScore(kor)) {
			this.kor=kor;			
		}
		if(cheakScore(eng)) {
			this.eng=eng;
		}
		if(cheakScore(math)) {
			this.math=math;
		}
		
	}
	
	//유효성 검사 메쏘드
	//외부에서 사용하지 못하도록 private로 설정
	private boolean cheakScore(int a) {
		boolean check;
		if( a < 0 || a >100 ) {
			check=false;
		}else {
			check=true;
		}
		return check;
	}

	//총점 계산 메쏘드
	public void totalcalc() {
		this.total=this.kor+this.eng+this.math;
	}
	//평균 계산 메쏘드
	public void avgcalc() {
		this.avg=this.total/3.0;
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
