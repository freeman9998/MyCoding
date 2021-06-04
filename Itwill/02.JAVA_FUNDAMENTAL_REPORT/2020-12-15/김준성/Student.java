package com.itwill01.method;

public class Student {
	/*
	 * 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차를 입력하기 위한 필드를 선언
	 */
	private int no;
	private String name;
	private int kor, eng, math, total;
	private double avg;
	private char grade;
	private int rank = 0;

	/*
	 * 점수유효성 판별을 위한 필드를 선언
	 */
	private boolean score;

	/*
	 * 학생 기본데이터(번호, 이름, 국어, 영어, 수학)입력과 메소드
	 */
	public void setData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		if (this.kor < 0 || this.kor > 100 || this.eng < 0 || this.eng > 100 || this.math < 0 || this.math > 100) {
			score = false;
		} else {
			score = true;
		}

		if (kor < 0 || kor > 100) {
			System.out.println(name + "의" + " 국어점수를 잘못 입력하였습니다.");
		}
		if (eng < 0 || eng > 100) {
			System.out.println(name + "의" + " 영어점수를 잘못 입력하였습니다.");
		}
		if (math < 0 || math > 100) {
			System.out.println(name + "의" + " 수학점수를 잘못 입력하였습니다.");
		}

	}

	/*
	 * 학생 총점계산 메소드
	 */
	public void total() {
		if (score) {
			total = kor + eng + math;
		}
	}

	/*
	 * 학생 평균계산 메소드
	 */
	public void avg() {
		if (score) {
			avg = total / 3.0;
		}
	}

	/*
	 * 학생 평점계산 메소드
	 */
	public void grade() {
		if (score) {
			switch ((int) (avg / 10) * 10) {
			case 90:
				grade = 'A';
				break;
			case 80:
				grade = 'B';
				break;
			case 70:
				grade = 'C';
				break;
			case 60:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
		}

	}

	/*
	 * 학생 성적 출력 메소드
	 */
	public void headerPrint() {
		System.out.println();
		System.out.printf("-----------------학생 성적출력----------------------\n");
		System.out.printf("%s  %s  %s  %s  %s  %s  %s  %s  %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("----------------------------------------------------\n");
	}

	public void print() {
		if (score) {
			System.out.printf("%2d %6s %5d %5d %5d %6d %5.1f %4c %5d\n", no, name, kor, eng, math, total, avg, grade,
					rank);

			System.out.println();
		}

	}
	
	/*
	 * getter, setter 메소드
	 */
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
