package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명 생성(2명)
		 */
		
		//변수 선언
		Student student1;
		Student student2;
		
		//Stduent 객체를 메모리에 생성 후 객체의 주소값을 student1,2 변수에 대입
		student1 = new Student();
		student2 = new Student();
		
		/*
		 * 학생객체에 기본데이타(번호,이름,국어,영어,수학) 대입(2명)
		 */
		
		//student1 변수에 대입된 객체주소의 멤버필드에 값(번호,이름,국어,영어,수학)을 대입
		student1.num=1;
		student1.name="홍길동";
		student1.kor=94;
		student1.eng=87;
		student1.math=93;

		//student2 변수에 대입된 객체주소의 멤버필드에 값(번호,이름,국어,영어,수학)을 대입
		student2.num=2;
		student2.name="김개똥";
		student2.kor=70;
		student2.eng=65;
		student2.math=85;
		
		//student1,2 변수에 대입된 값이 유효한 값인지 검사
		//각각의 점수들이 0미만 이거나 100을 초과하는 경우 조건문이 실행되어 프로그램을 종류한다.
		if( student1.kor < 0 || student1.kor >100 ) {
			System.out.println("학생1의 올바른 국어 점수가 입력되지 않았습니다.");
			return;
		}else if(student1.eng < 0 || student1.eng > 100){
			System.out.println("학생1의 올바른 영어 점수가 입력되지 않았습니다.");
			return;
		}else if(student1.math < 0 || student1.math > 100){
			System.out.println("학생1의 올바른 수학 점수가 입력되지 않았습니다.");
			return;
		}
		
		if( student2.kor < 0 || student2.kor >100 ) {
			System.out.println("학생2의 올바른 국어 점수가 입력되지 않았습니다.");
			return;
		}else if(student2.eng < 0 || student2.eng > 100){
			System.out.println("학생2의 올바른 영어 점수가 입력되지 않았습니다.");
			return;
		}else if(student2.math < 0 || student2.math > 100){
			System.out.println("학생2의 올바른 수학 점수가 입력되지 않았습니다.");
			return;
		}
		
		/*
		 * 학생 2명의 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		//student1 변수에 대입된 객체주소의 멤버필드에 값(총점,평균,석차)를 대입
		student1.total=student1.kor+student1.eng+student1.math;
		student1.avg=student1.total/3.0f;
		student1.rank=0;
		
		//student2 변수에 대입된 객체주소의 멤버필드에 값(총점,평균,석차)를 대입
		student2.total=student2.kor+student2.eng+student2.math;
		student2.avg=student2.total/3.0f;
		student2.rank=0;
		
		//학생들의 평균 점수에 따라 조건에 해당되는 평점을 대입
		//평균이 90~100=A 80~89=B 70~79=C 60~69=D 59점 이하는 전부 F가 대입된다.
		if(student1.avg >=90) {
			student1.score='A';
		}else if(student1.avg >=80) {
			student1.score='B';
		}else if(student1.avg >=70) {
			student1.score='C';
		}else if(student1.avg >=60) {
			student1.score='D';
		}else {
			student1.score='F';
		}
		
		if(student2.avg >=90) {
			student2.score='A';
		}else if(student2.avg >=80) {
			student2.score='B';
		}else if(student2.avg >=70) {
			student2.score='C';
		}else if(student2.avg >=60) {
			student2.score='D';
		}else {
			student2.score='F';
		}
		
		/*
		 * 학생 데이타 출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",student1.num,student1.name,student1.kor,student1.eng,student1.math
				,student1.total,student1.avg,student1.score,student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",student2.num,student2.name,student2.kor,student2.eng,student2.math
				,student2.total,student2.avg,student2.score,student2.rank);
	
	}

}
