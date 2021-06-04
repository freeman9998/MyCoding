package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		// 학생성적관리
		
		/*
		 *학생객체 2명 생성
		 */
		Student std1 = new Student(); //학생1의 값을 입력할 참조변수 선언
		Student std2 = new Student();//학생2의 값을 입력할 참조변수 선언
		
		/*
		 * 학생객체에 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		//학생1 객체에 대입
		std1.no = 1;//no멤버 필드에 대입
		std1.name = "김영희";//name멤버 필드에 대입
		std1.kor = 80;//kor멤버 필드에 대입
		std1.eng = 72;//eng멤버 필드에 대입
		std1.math = 90;//math멤버 필드에 대입
				
		//학생2 객체에 대입
		std2.no = 2;
		std2.name = "김철수";
		std2.kor = 90;
		std2.eng = 48;
		std2.math = 67;
		
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		
		std1.tot = std1.kor+std1.eng+std1.math; //tot멤버 필드에 계산 후 대입
		std2.tot = std2.kor+std2.eng+std2.math;
		
		std1.avg = std1.tot/3.0;//avg멤버 필드에 계산 후 대입
		std2.avg = std2.tot/3.0;
		
		
		
		//학생 평균의 평점 구해서 grade 멤버 필드에 대입
		if(std1.avg >= 90){
			std1.grade = 'A';
		} else if (std1.avg >= 80) {
			std1.grade = 'B';
		} else if (std1.avg >= 70) {
			std1.grade = 'C';
		} else if (std1.avg >= 60) {
			std1.grade = 'D';
		} else {
			std1.grade = 'F';
		}
		
		
		
		if(std2.avg >= 90){
			std2.grade = 'A';
		} else if (std2.avg >= 80) {
			std2.grade = 'B';
		} else if (std2.avg >= 70) {
			std2.grade = 'C';
		} else if (std2.avg >= 60) {
			std2.grade = 'D';
		} else {
			std2.grade = 'F';
		}
		
		/*
		 * 학생데이타출력
		 */
		
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf(" %s  %s  %s %s %s %s %s %s %s %n",
				"학번", "이름", "국어", "영어", "수학","총점", "평균","평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %3d%n", 
				std1.no, std1.name, std1.kor, std1.eng, std1.math, std1.tot, std1.avg, std1.grade, std1.rank);
		System.out.printf("%3d %5s %3d %4d %4d %4d %5.1f %3c %3d%n", 
				std2.no, std2.name, std2.kor, std2.eng, std2.math, std2.tot, std2.avg, std2.grade, std2.rank);
		
		
	}

}
