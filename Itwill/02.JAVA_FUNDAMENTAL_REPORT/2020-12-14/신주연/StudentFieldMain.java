package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체2명 생성
		 */
		
		//학생객체에 번지를 저장할 참조변수선언.
		Student std1; 
		Student std2;
		
		//학생객체를 힙메모리에 생성후,객체의 주소값이 std1,std2변수에 대입.
		std1 = new Student();
		std2 = new Student();

		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		std1.no = 10; //학생객체의 no멤버필드 값대입
		std1.name = "KIM";  //학생객체의 name멤버필드 값대입
		std1.kor = 95; //학생객체의 kor멤버필드 값대입
		std1.eng = 80; //학생객체의 eng멤버필드 값대입
		std1.math = 70; //학생객체의 math멤버필드 값대입
		
		std2.no = 13;
		std2.name = "LEE";
		std2.kor = 75;
		std2.eng = 61;
		std2.math = 90;
		

	
		/*
		 *학생총점,평균,평점계산후 대입(2명)
		 */
		//학생객체의 tot멤버필드에 계산후 대입
		std1.tot = (std1.kor + std1.eng + std1.math);
		std2.tot = (std2.kor + std2.eng + std2.math);
		
		//학생객체의 avg멤버필드에 계산후 대입
		std1.avg = std1.tot / 3.0;
		std2.avg = std2.tot / 3.0;
		
		//학생객체의 rank멤버필드에 대입
		std1.rank = 0;
		std2.rank = 0;
		
		//학생객체의 grade멤버필드에 조건실행 후 대입
		if(std1.avg>=90) {
			std1.grade = 'A';
		}else if(std1.avg>=80) {
			std1.grade = 'B';
		}else if(std1.avg>=70) {
			std1.grade = 'C';
		}else if(std1.avg>=60) {
			std1.grade = 'D';
		}else {
			std1.grade = 'F';
		}
		
		if(std2.avg>=90) {
			std2.grade = 'A';
		}else if(std2.avg>=80) {
			std2.grade = 'B';
		}else if(std2.avg>=70) {
			std2.grade = 'C';
		}else if(std2.avg>=60) {
			std2.grade = 'D';
		}else {
			std2.grade = 'F';
		}
		
	
		/*
		 * 학생데이타출력
		 */
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d %n",
				std1.no, std1.name,std1.kor,std1.eng,std1.math,std1.tot,std1.avg,std1.grade,std1.rank);
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d",
				std2.no, std2.name,std2.kor,std2.eng,std2.math,std2.tot,std2.avg,std2.grade,std2.rank);
		

	}

}
