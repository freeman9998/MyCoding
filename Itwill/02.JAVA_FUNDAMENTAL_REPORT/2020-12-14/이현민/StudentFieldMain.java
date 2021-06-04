package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명 생성
		 */
		Student stu1;//Student객체의 주소를 저장할 참조변수선언
		stu1 = new Student();//Student객체를 힙메모리에 생성 후에 객체의 주소값을 stu1변수에 대입
		
		Student stu2;//Student객체의 주소를 저장할 참조변수선언
		stu2 = new Student();//Student객체를 힙메모리에 생성 후에 객체의 주소값을 stu2변수에 대입
		
		/*
		 * 학생객체에 기본데이타 (번호,이름,국어,영어,수학) 대입(2명)
		 */
		stu1.no=1;//Student객체의 no 멤버필드에 값을 대입
		stu1.name="KIM";//Student객체의 name 멤버필드에 값을 대입
		stu1.kor=83;//Student객체의 kor 멤버필드에 값을 대입
		stu1.eng=76;//Student객체의 eng 멤버필드에 값을 대입
		stu1.math=91;//Student객체의 math 멤버필드에 값을 대입
		
		stu2.no=2;//Student객체의 no 멤버필드에 값을 대입
		stu2.name="LEE";//Student객체의 name 멤버필드에 값을 대입
		stu2.kor=94;//Student객체의 kor 멤버필드에 값을 대입
		stu2.eng=90;//Student객체의 eng 멤버필드에 값을 대입
		stu2.math=100;//Student객체의 math 멤버필드에 값을 대입
		/*
		 * 학생의 총점,평균,평점 계산 후 대입(2명)
		 */
		stu1.tot=stu1.kor+stu1.eng+stu1.math;//Student객체의 tot 멤버필드에 계산 후 대입
		stu1.avg=stu1.tot/3.0;//Student객체의 avg 멤버필드에 계산 후 대입
		//Student객체의 grade 멤버필드에 조건실행 후 대입
		switch ((int)stu1.avg/10) {
		case 10:
		case 9:
			stu1.grade='A';
			break;
		case 8:
			stu1.grade='B';
			break;
		case 7:
			stu1.grade='C';
			break;
		case 6:
			stu1.grade='D';
			break;
		default:
			stu1.grade='F';
			break;
		}
		stu1.rank=0;//Student객체의 rank 멤버필드에 값을 대입
			
		stu2.tot = stu2.kor + stu2.eng + stu2.math;//Student객체의 tot 멤버필드에 계산 후 대입
		stu2.avg = stu2.tot / 3.0;//Student객체의 avg 멤버필드에 계산 후 대입
		//Student객체의 grade 멤버필드에 조건실행 후 대입
		switch ((int) stu2.avg / 10) {
		case 10:
		case 9:
			stu2.grade = 'A';
			break;
		case 8:
			stu2.grade = 'B';
			break;
		case 7:
			stu2.grade = 'C';
			break;
		case 6:
			stu2.grade = 'D';
			break;
		default:
			stu2.grade = 'F';
			break;
		}
		stu2.rank=0;//Student객체의 rank 멤버필드에 값을 대입
		
		/*
		 * 학생데이타 출력
		 */
		System.out.printf("---------------학생 성적출력-----------------%n");
		System.out.printf("%s %s %s %s %s %s %s %s %s %n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("---------------------------------------------%n");
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d%n",
				stu1.no,stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.tot,stu1.avg,stu1.grade,stu1.rank);
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %4d%n",
				stu2.no,stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.tot,stu2.avg,stu2.grade,stu2.rank);
	}

}
