package com.itwill00.variable;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체2명 생성
		 */
		
		//학생객체에 번지를 저장할 참조변수선언.
		Student st1; 
		Student st2;
		
		//학생객체를 힙메모리에 생성후,객체의 주소값이 std1,std2변수에 대입.
		st1 = new Student();
		st2 = new Student();

		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		st1.no = 1; //학생객체의 no멤버필드 값대입
		st1.name = "KIM";  //학생객체의 name멤버필드 값대입
		st1.kor = 95; //학생객체의 kor멤버필드 값대입
		st1.eng = 80; //학생객체의 eng멤버필드 값대입
		st1.math = 70; //학생객체의 math멤버필드 값대입
		
		st2.no = 2;
		st2.name = "Park";
		st2.kor = 75;
		st2.eng = 95;
		st2.math = 90;
		

	
		/*
		 *학생총점,평균,평점계산후 대입(2명)
		 */
		//학생객체의 tot멤버필드에 계산후 대입
		st1.tot = (st1.kor + st1.eng + st1.math);
		st2.tot = (st2.kor + st2.eng + st2.math);
		
		//학생객체의 avg멤버필드에 계산후 대입
		st1.avg = st1.tot / 3.0;
		st2.avg = st2.tot / 3.0;
		
		//학생객체의 rank멤버필드에 대입
		st1.rank = 0;
		st2.rank = 0;
		
		//학생객체의 grade멤버필드에 조건실행 후 대입
		if(st1.avg>=90) {
			st1.grade = 'A';
		}else if(st1.avg>=80) {
			st1.grade = 'B';
		}else if(st1.avg>=70) {
			st1.grade = 'C';
		}else if(st1.avg>=60) {
			st1.grade = 'D';
		}else {
			st1.grade = 'F';
		}
		
		if(st2.avg>=90) {
			st2.grade = 'A';
		}else if(st2.avg>=80) {
			st2.grade = 'B';
		}else if(st2.avg>=70) {
			st2.grade = 'C';
		}else if(st2.avg>=60) {
			st2.grade = 'D';
		}else {
			st2.grade = 'F';
		}
		
	
		/*
		 * 학생데이타출력
		 */
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %3d %4d %4d %4d %6.1f %3c %4d %n",
				st1.no, st1.name,st1.kor,st1.eng,st1.math,st1.tot,st1.avg,st1.grade,st1.rank);
		System.out.printf("%3d %5s %3d %4d %4d %4d %6.1f %3c %4d",
				st2.no, st2.name,st2.kor,st2.eng,st2.math,st2.tot,st2.avg,st2.grade,st2.rank);

	}

}
