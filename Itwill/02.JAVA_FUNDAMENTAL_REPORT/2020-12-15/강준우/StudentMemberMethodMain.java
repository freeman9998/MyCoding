package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		//변수선언(참조타입 참조변수) 및 객체 생성 후 참조변수에 객체 대입
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		//각 객체의 멤버필드 값을 멤버메쏘드를 이용해 대입
		stu1.score(1, "강준우", 100, 95, 80);
		stu2.score(2, "홍성민", 88, 75, 86);
		stu3.score(3, "음창도", 87, 92, 90);
		
		//각 객체의 총 점수 값을 멤버메쏘드를 이용해 대입
		stu1.scoretot();
		stu2.scoretot();
		stu3.scoretot();
		
		//각 객체의 평균 값을 멤버메쏘드를 이용해 대입
		stu1.scoreavg();
		stu2.scoreavg();
		stu3.scoreavg();
		
		//각 객체의 평점 값을 멤버메쏘드를 이용해 대입
		stu1.scoregrade();
		stu2.scoregrade();
		stu3.scoregrade();
		
		//각 학생객체의 성적을 멤버메쏘드를 이용해 출력
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();
		
	}

}
