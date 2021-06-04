package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 생성 (2명)
		 */
		
		// 학생 객체의 주소를 저장할 참조변수(stu1,stu2)를 선언하고 학생객체 메모리에 생성후 객체의 주소값을 stu1,stu2 변수에 대입
		// new Student()를 통해 힙메모리에 객체 생성
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		/*
		 * 학생객체에 기본데이터 입력 (번호,이름,국어,영어,수학) 대입 (2명)
		 */
		
		// 객체의 멤버필드에 값대입
		stu1.no = 1;
		stu1.name = "KIM";
		stu1.kor = 45;
		stu1.eng = 60;
		stu1.math = 57;

		stu2.no = 2;
		stu2.name = "lee";
		stu2.kor = 60;
		stu2.eng = 43;
		stu2.math = 23;
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		// 학생 객체의 멤버필드값 유효성 검사
		if (!(0<=stu1.kor||stu1.kor<=100)) {
			System.out.printf("%s님 국어점수는 0~100사이의 정수여야 합니다.\n",stu1.name);
			return;}
		if (!(0<=stu1.eng||stu1.eng<=100)) {
			System.out.printf("%s님 영어점수는 0~100사이의 정수여야 합니다.\n",stu1.name);
			return;}
		if (!(0<=stu1.math||stu1.math<=100)) {
			System.out.printf("%s님 수학점수는 0~100사이의 정수여야 합니다.\n",stu1.name);
			return;}
		
		if (!(0<=stu2.kor||stu2.kor<=100)) {
			System.out.printf("%s님 국어점수는 0~100사이의 정수여야 합니다.\n",stu2.name);
			return;}
		if (!(0<=stu2.eng||stu2.eng<=100)) {
			System.out.printf("%s님 영어점수는 0~100사이의 정수여야 합니다.\n",stu2.name);
			return;}
		if (!(0<=stu2.math||stu2.math<=100)) {
			System.out.printf("%s님 수학점수는 0~100사이의 정수여야 합니다.\n",stu2.name);
			return;}
		
		//학생 객체의 총점, 평균, 석차 값대입
		stu1.tot = (stu1.kor + stu1.eng + stu1.math);
		stu2.tot = (stu2.kor + stu2.eng + stu2.math);
		stu1.avg = (stu1.tot / 3.0);
		stu2.avg = (stu2.tot / 3.0);
		stu1.rank = 0;
		stu2.rank = 0;
		
		// 학생 객체의 평점 계산
		if (stu1.avg >= 90)
			{
				stu1.grade = 'A';
			}
		else if (stu1.avg >= 80)
			{
				stu1.grade = 'B';
			}
		else
			{
				stu1.grade = 'C';
			}
		
		if (stu2.avg >= 90)
			{
			stu2.grade = 'A';
			}
		else if (stu2.avg >= 80)
			{
			stu2.grade = 'B';
			}
		else
			{
			stu2.grade = 'C';
			}
		
		/*
		 * 학생데이터출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						stu1.no,stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.tot,stu1.avg,stu1.grade,stu1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						stu2.no,stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.tot,stu2.avg,stu2.grade,stu2.rank);
	}

}
