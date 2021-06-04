package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
	    
		Student Student1; //사용자 정의타입을 이용해 변수선언
		Student Student2;
		Student1=new Student(); // 객체 생성 후 변수에 대입 - 지번으로 저장
		Student2=new Student();
		
		//메인필드(메인변수)에 번호, 이름, 국어, 영어, 수학 값을 입력
		Student1.no = 1;
		Student1.name = "준서";
		Student1.kor = 80;
		Student1.eng = 90;
		Student1.math = 90;
		
		Student2.no = 2;
		Student2.name = "준수";
		Student2.kor = 90;
		Student2.eng = 85;
		Student2.math = 56;
		
		//학생 tot멤버필드(멤버변수)에 계산 후 대입
		Student1.tot = Student1.kor+Student1.eng+Student1.math;
		Student2.tot = Student2.kor+Student2.eng+Student2.math;
		
		//학생 avg멤버필드(멤버변수)에 계산 후 대입
		Student1.avg = Student1.tot / 3;
		Student2.avg = Student2.tot / 3;
		
		//학생 rank멤버필드(멤버변수)에 값 대입
		Student1.rank = 0;
		Student2.rank = 0;
		
		//학생 grade멤버필드(멤버변수)에 조건 실행 후 대입
		
		if (Student1.tot>80) {
			Student1.grade='A';
		}else if (Student1.tot>=60 && Student1.tot<80) {
			Student1.grade='B';
		}else if (Student1.tot>=40 && Student1.tot<60) {
			Student1.grade='C';
		}else if (Student1.tot>=20 && Student1.tot<40) {
			Student1.grade='D';
		}else {
			Student1.grade='E';
		}
		
		if (Student2.tot>80) {
			Student2.grade='A';
		}else if (Student2.tot>=60 && Student2.tot<80) {
			Student2.grade='B';
		}else if (Student2.tot>=40 && Student2.tot<60) {
			Student2.grade='C';
		}else if (Student2.tot>=20 && Student2.tot<40) {
			Student2.grade='D';
		}else {
			Student2.grade='E';
		}
		//학생 데이터 출력
		System.out.println("--------------------------------");
		System.out.println("번호 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.printf("%2d %4s %3d %4d %4d %4d %5.1f %3c %4d%n", Student1.no, Student1.name, Student1.kor, Student1.eng,
				Student1.math, Student1.tot, Student1.avg, Student1.grade, Student1.rank);
		System.out.printf("%2d %4s %3d %4d %4d %4d %5.1f %3c %4d%n", Student2.no, Student2.name, Student2.kor, Student2.eng,
				Student2.math, Student2.tot, Student2.avg, Student2.grade, Student2.rank);
		
	}

}
