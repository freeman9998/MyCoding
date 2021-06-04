package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		
		/*
		 * 학생객체 2명 생성
		 */
		Student stu1, stu2;
		stu1 = new Student();
		stu2 = new Student();
		/*
		 * 학생객체에 기본데이터 입력(2명)
		 * 번호, 이름, 국어, 영어, 수학
		 */
		// 1번 학생 기본데이터
		stu1.no1 = 1;
		stu1.name1 = "홍길동";
		stu1.kor1 = 78;
		stu1.eng1 = 64;
		stu1.math1 = 74;
		// 2번 학생 기본데이터
		stu2.no2 = 2;
		stu2.name2 = "김덕배";
		stu2.kor2 = 72;
		stu2.eng2 = 68;
		stu2.math2 = 82;
		
		/*
		 * 학생총점, 평균, 평점 계산 후 대입(2명)
		 */
		stu1.tot1 = stu1.kor1 + stu1.eng1 + stu1.math1;
		stu1.avg1 = stu1.tot1/3.0;
		if(stu1.avg1>= 90) {
			stu1.grade1 = 'A';			
		}else if(stu1.avg1 >= 80) {
			stu1.grade1 = 'B';
		}else if (stu1.avg1 >= 70) {
			stu1.grade1 = 'C';
		}else if (stu1.avg1 >= 60) {
			stu1.grade1 = 'D';
		}
		
		stu2.tot2 = stu2.kor2 + stu2.eng2 + stu2.math2;
		stu2.avg2 = stu2.tot2/3.0;
		if(stu2.avg2 >= 90) {
			stu2.grade2 = 'A';
		}else if ( stu2.avg2 >= 80) {
			stu2.grade2 = 'B';
		}else if (stu2.avg2 >= 70) {
			stu2.grade2 = 'C';
		}else if (stu2.avg2 >= 60) {
			stu2.grade2 = 'D';
		}
		
		stu1.rank = 2;
		stu2.rank = 1;
		/*
		 * 학생 데이터 출력
		 */
		System.out.println("----------------학생 성적 출력----------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n","학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%2d %4s %2d %4d %4d %5d %5.1f %2c %4d%n", stu1.no1, stu1.name1, stu1.kor1, stu1.eng1, stu1.math1, stu1.tot1, stu1.avg1, stu1.grade1, stu1.rank);
		System.out.printf("%2d %4s %2d %4d %4d %5d %5.1f %2c %4d%n", stu2.no2, stu2.name2, stu2.kor2, stu2.eng2, stu2.math2, stu2.tot2, stu2.avg2, stu2.grade2, stu2.rank);
		
	}

}
