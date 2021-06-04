package com.itwill01.field;
/*
 * 성적처리를 위해 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {
	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */
	
	// 멤버변수 선언
	int num; //학생 번호
	String name; //학생 이름
	int kor; //학생의 국어점수
	int eng; //학생의 영어점수
	int math; //학생의 수학점수
	int total; //학생의 총점
	float avg; //학생의 평균점수
	char score; //학생의 평점
	int rank; //학생의 석차
	
	// 멤버메쏘드 선언
	//학생데이터 입력기능
	void setStudentData(int num,String name,int kor,int eng,int math) {
		//인자 값을 받아 필드변수에 대입
		this.num=num;
		this.name=name;
		//유효성 검사체크 각 과목들의 점수가 정상적이지 못할때 해당과목은 0점 처리한다.
		this.kor=kor;
		this.eng=eng;
		this.math=math;		
		if( kor < 0 || kor >100 ) {
			this.kor=0;
		}else if(eng < 0 || eng > 100){
			this.eng=0;
		}else if(math < 0 || math > 100){
			this.math=0;
		}
		//석차는 0으로 대입한다. 
		rank=0;
	}
	//총점,평균,평점 계산기능
	void claculate() {
		//setStudentData메쏘드로 인해 셋팅된 값으로 총점,평균,평점 계산
		total=kor+eng+math;
		avg=total/3.0f;
		//평균이 90~100=A 80~89=B 70~79=C 60~69=D 59점 이하는 전부 F가 대입된다.
		if(avg >=90) {
			score='A';
		}else if(avg >=80) {
			score='B';
		}else if(avg >=70) {
			score='C';
		}else if(avg >=60) {
			score='D';
		}else {
			score='F';
		}
	}
	
	//학생 정보출력 기능
	void print() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",num,name,kor,eng,math
				,total,avg,score,rank);
	}
}
