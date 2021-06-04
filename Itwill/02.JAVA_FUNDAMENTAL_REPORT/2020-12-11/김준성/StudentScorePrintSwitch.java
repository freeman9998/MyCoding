package com.itwill00.variable;

public class StudentScorePrintSwitch {

	public static void main(String[] args) {
		int no1, no2;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2, total1, total2;
		double avg1, avg2;
		int avg3, avg4;
		char grade1, grade2;
		int rank1, rank2;
		String msg = "잘못된 점수를 입력하였습니다.";

		no1 = 1;
		name1 = "KIM";
		kor1 = 25;
		eng1 = 94;
		math1 = 81;

		no2 = 2;
		name2 = "LEE";
		kor2 = 39;
		eng2 = 97;
		math2 = 66;

		if (kor1 < 0 || kor1 > 100) {
			System.out.println(msg);
			return;
		}
		if (eng1 < 0 || eng1 > 100) {
			System.out.println(msg);
			return;
		}
		if (math1 < 0 || math1 > 100) {
			System.out.println(msg);
			return;
		}
		if (kor2 < 0 || kor2 > 100) {
			System.out.println(msg);
			return;
		}
		if (eng2 < 0 || eng2 > 100) {
			System.out.println(msg);
			return;
		}
		if (math2 < 0 || math2 > 100) {
			System.out.println(msg);
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 * 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
		 */
		total1 = kor1 + eng1 + math1;
		avg1 = total1 / 3.0;
		total2 = kor2 + eng2 + math2;
		avg2 = total2 / 3.0;

		avg3 = (int) (avg1 / 10) * 10;
		avg4 = (int) (avg2 / 10) * 10;

		switch (avg3) {
		case 90:
			grade1 = 'A';
			break;
		case 80:
			grade1 = 'B';
			break;
		case 70:
			grade1 = 'C';
			break;
		case 60:
			grade1 = 'D';
			break;
		default:
			grade1 = 'F';
			break;

		}
		switch (avg4) {
		case 90:
			grade2 = 'A';
			break;
		case 80:
			grade2 = 'B';
			break;
		case 70:
			grade2 = 'C';
			break;
		case 60:
			grade2 = 'D';
			break;
		default:
			grade2 = 'F';
			break;
		}

		rank1 = rank2 = 0;

		System.out.printf("-----------------학생 성적출력----------------------\n");
		System.out.printf("%s  %s  %s  %s  %s  %s  %s  %s  %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("%2d %6s %5d %5d %5d %6d %6.1f %3c %5d\n", no1, name1, kor1, eng1, math1, total1, avg1,
				grade1, rank1);
		System.out.printf("%2d %6s %5d %5d %5d %6d %6.1f %3c %5d\n", no2, name2, kor2, eng2, math2, total2, avg2,
				grade2, rank2);

		System.out.println();
		System.out.println("casting을 이용한 평균 반올림");
		avg1 = (int) ((avg1 + 0.05) * 10) / 10.0;
		avg2 = (int) ((avg2 + 0.05) * 10) / 10.0;
		System.out.println("학생1의 평균: " + avg1);
		System.out.println("학생2의 평균: " + avg2);

	}

}
