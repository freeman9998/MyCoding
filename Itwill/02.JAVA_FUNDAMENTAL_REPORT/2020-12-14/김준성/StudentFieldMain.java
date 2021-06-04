package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		String msg = "잘못된 점수를 입력하였습니다.";
		/*
		 * 학생객체를 2명 생성
		 */
		StudentField std1 = new StudentField();
		StudentField std2 = new StudentField();

		/*
		 * 학생객체에 기본데이터(번호, 이름, 국어, 영어, 수학) 입력(2명)
		 */
		std1.no = 1;
		std1.name = "KIM";
		std1.kor = 91;
		std1.eng = 96;
		std1.math = 100;

		std2.no = 2;
		std2.name = "LEE";
		std2.kor = 84;
		std2.eng = 88;
		std2.math = 74;

		if (std1.kor < 0 || std1.kor > 100) {
			System.out.println(msg);
			return;
		}
		if (std1.eng < 0 || std1.eng > 100) {
			System.out.println(msg);
			return;
		}
		if (std1.math < 0 || std1.math > 100) {
			System.out.println(msg);
			return;
		}
		if (std2.kor < 0 || std2.kor > 100) {
			System.out.println(msg);
			return;
		}
		if (std2.eng < 0 || std2.eng > 100) {
			System.out.println(msg);
			return;
		}
		if (std2.math < 0 || std2.math > 100) {
			System.out.println(msg);
			return;
		}

		/*
		 * 총점, 평균, 평점을 계산 후 대입(2명)
		 */
		std1.total = std1.kor + std1.eng + std1.math;
		std2.total = std2.kor + std2.eng + std2.math;
		std1.avg = std1.total / 3.0;
		std2.avg = std2.total / 3.0;

		std1.avgswitch = (int) (std1.avg / 10) * 10;
		std2.avgswitch = (int) (std2.avg / 10) * 10;

		switch (std1.avgswitch) {
		case 90:
			std1.grade = 'A';
			break;
		case 80:
			std1.grade = 'B';
			break;
		case 70:
			std1.grade = 'C';
			break;
		case 60:
			std1.grade = 'D';
			break;
		default:
			std1.grade = 'F';
			break;

		}
		switch (std2.avgswitch) {
		case 90:
			std2.grade = 'A';
			break;
		case 80:
			std2.grade = 'B';
			break;
		case 70:
			std2.grade = 'C';
			break;
		case 60:
			std2.grade = 'D';
			break;
		default:
			std2.grade = 'F';
			break;
		}

		std1.rank = std2.rank = 0;

		/*
		 * 학생데이터를 출력(IfScorePrint에서)
		 */
		System.out.printf("-----------------학생 성적출력----------------------\n");
		System.out.printf("%s  %s  %s  %s  %s  %s  %s  %s  %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------------\n");
		System.out.printf("%2d %6s %5d %5d %5d %6d %6.1f %3c %5d\n", std1.no, std1.name, std1.kor, std1.eng, std1.math,
				std1.total, std1.avg, std1.grade, std1.rank);
		System.out.printf("%2d %6s %5d %5d %5d %6d %6.1f %3c %5d\n", std2.no, std2.name, std2.kor, std2.eng, std2.math,
				std2.total, std2.avg, std2.grade, std2.rank);

		System.out.println();

	}

}
