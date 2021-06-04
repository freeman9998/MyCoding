package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		//매개변수가 없는 기본 생성자메소드를 이용해 학생 객체 1명 생성
		Student stu1=new Student();
		//매개변수가 없는 기본 생성자메소드를 이용해 학생 객체 2명 생성 및 멤버필드 값 초기화
		Student stu2=new Student(2, "음창도", 45, 33, 24);
		Student stu3=new Student(3, "홍성민", 67, 56, 64);
		
		//멤버메쏘드를 이용해 stu1에 번호, 이름, 국어, 영어, 수학 점수 대입
		stu1.setData(1, "강준우", 82, 84, 87);
		
		//멤버메쏘드를 이용해 멤버필드 tot값 대입
		stu1.setTot();
		stu2.setTot();
		stu3.setTot();
		
		//멤버메쏘드를 이용해 멤버필드 avg값 대입
		stu1.setAvg();
		stu2.setAvg();
		stu3.setAvg();
		
		//멤버메쏘드를 이용해 멤버필드 grade값 대입
		stu1.setGrade();
		stu2.setGrade();
		stu3.setGrade();
		
		//멤버메쏘드를 이용해 멤버필드 rank값 대입
		stu1.setRank();
		stu2.setRank();
		stu3.setRank();
		
		//멤버메쏘드를 이용해 출력
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		//학생 stu1의 이름변경 후 출력
		stu1.setName("김준우");
		stu1.print();
		//학생 stu1 의 총점데이터 반환 받은 후 메인에서 출력
		stu1.getTot();
		int stu1Tot=stu1.getTot();
		System.out.println(stu1Tot);
		//학생 student2 의 학점데이타 반환받은후 메인에서출력
		stu2.getGrade();
		char stu2Grade=stu2.getGrade();
		System.out.println(stu2Grade);
		
		
		

	}

}
