package com.itwill00.variable;

public class StudentScorePrint {
	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int student1Num;
		String student1Name;
		int student1Kor;
		int student1Eng;
		int student1Math;
		int student1Total;
		float student1Avg;
		char student1Grade;
		int student1Rank;

		int student2Num;
		String student2Name;
		int student2Kor;
		int student2Eng;
		int student2Math;
		int student2Total;
		float student2Avg;
		char student2Grade;
		int student2Rank;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		student1Num = 10;
		student1Name = "김유신";
		student1Kor = 90;
		student1Eng = 85;
		student1Math = 80;
		student1Grade = ' ';
		student1Rank = 0;

		student2Num = 15;
		student2Name = "홍길동";
		student2Kor = 75;
		student2Eng = 70;
		student2Math = 60;
		student2Grade = ' ';
		student2Rank = 0;
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (student1Kor > 100 || student1Kor < 0 || student1Eng > 100 || student1Eng < 0 || student1Math > 100
				|| student1Math < 0 || student2Kor > 100 || student2Kor < 0 || student2Eng > 100 || student2Eng < 0
				|| student2Math > 100 || student2Math < 0) {
			System.out.println("100점이 넘는 수나 음수가 입력되어 종료합니다.");
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		student1Total = student1Kor + student1Eng + student1Math;
		student1Avg = student1Total / 3f;
		
		student2Total = student2Kor + student2Eng + student2Math;
		student2Avg = student2Total / 3f;
		
		if (student1Avg >= 90) {
			student1Grade = 'A';
		} else if (student1Avg >= 80) {
			student1Grade = 'B';
		} else if (student1Avg >= 70) {
			student1Grade = 'C';
		} else if (student1Avg >= 60) {
			student1Grade = 'D';
		} else {
			student1Grade = 'F';
		}
		if (student2Avg >= 90) {
			student2Grade = 'A';
		} else if (student2Avg >= 80) {
			student2Grade = 'B';
		} else if (student2Avg >= 70) {
			student2Grade = 'C';
		} else if (student2Avg >= 60) {
			student2Grade = 'D';
		} else {
			student2Grade = 'F';
		}
		
		/*
		 * - 출력포맷 - 평균은 소수점이하 2째자리수에서 반올림하세요(%f) - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */
		
		System.out.println("----------학생 성적출력------------");
		System.out.println(" 학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.printf("%d %s %d %d %d %d %.2f %c %d \n", student1Num, student1Name, student1Kor, student1Eng,
				student1Math, student1Total, student1Avg, student1Grade, student1Rank);
		System.out.printf("%d %s %d %d %d %d %.2f %c %d \n", student2Num, student2Name, student2Kor, student2Eng,
				student2Math, student2Total, student2Avg, student2Grade, student2Rank);
		System.out.println("-----------------------------");
	}
}