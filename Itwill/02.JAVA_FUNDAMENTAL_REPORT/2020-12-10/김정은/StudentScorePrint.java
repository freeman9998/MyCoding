
/*
 * 성적관리에서 학생2명 데이타를 담을 변수선언
 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
 */

/*
 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
 */

/*
 * 학생2명의 국어, 영어, 수학점수의 유효성체크
 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
 */

/*
 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
 */

/*
		- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
 */

public class StudentScorePrint {

	public static void main(String[] args) {
		int no, no1;
		String name, name1;
		int kor, kor1, eng, eng1, math, math1;
		int tot, tot1;
		double avg, avg1;
		char grade, grade1;
		int rank, rank1;
		// 학생2명의 기본데이타
		no = 1;
		no1 = 2;
		name = "김경호";
		name1 = "김경수";
		kor = 42;
		kor1 = 45;
		eng = 56;
		eng1 = 53;
		math = 78;
		math1 = 76;

		// 학생2명의 국어, 영어, 수학점수의 유효성체크
		if (kor > 100 || kor < 0) {
			System.out.println("국어점수를 다시 입력해주세요.");
			return;
		} else if (eng > 100 || eng < 0) {
			System.out.println("영어점수를 다시 입력해주세요.");
			return;
		} else if (math > 100 || math < 0) {
			System.out.println("수학점수를 다시 입력해주세요.");
			return;
		}

		if (kor1 > 100 || kor1 < 0) {
			System.out.println("국어점수를 다시 입력해주세요.");
			return;
		} else if (eng1 > 100 || eng1 < 0) {
			System.out.println("영어점수를 다시 입력해주세요.");
			return;
		} else if (math1 > 100 || math1 < 0) {
			System.out.println("수학점수를 다시 입력해주세요.");
			return;
		}
		// 학생2명의 총점,평균,석차
		tot = kor + eng + math;
		tot1 = kor1 + eng1 + math1;
		avg = tot / 3.0;
		avg1 = tot1 / 3.0;
		rank = 0;
		rank1 = 0;
		// 김경호의 평점
		if (avg > 80) {
			grade = 'A';
		} else if (avg > 70) {
			grade = 'B';
		} else if (avg > 60) {
			grade = 'C';
		} else if (avg > 40) {
			grade = 'D';
		} else
			grade = 'F';
		// 김경수의 평점
		if (avg1 > 80) {
			grade1 = 'A';
		} else if (avg1 > 70) {
			grade1 = 'B';
		} else if (avg1 > 60) {
			grade1 = 'C';
		} else if (avg1 > 40) {
			grade1 = 'D';
		} else
			grade1 = 'F';

		System.out.printf("----------------학생 성적출력------------------%n");
		System.out.printf("%s %s %s %s %s %s %s %s %s %n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %4d %n", no, name, kor, eng, math, tot, avg, grade, rank);
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %4d %n", no1, name1, kor1, eng1, math1, tot1, avg1, grade1,
				rank1);
		System.out.print("-----------------------------------------------");

	}
}
