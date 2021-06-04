package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1;
		int no2;
		String name1;
		String name2;
		int kor1,kor2;
		int eng1,eng2;
		int math1,math2;
		int tot1,tot2;
		double avg1,avg2;
		double davg1, davg2;
		char grade1,grade2;
		int rank;
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1 = 1;
		no2 = 2;
		name1 = "홍길동";
		name2 = "김덕배";
		kor1 = 82;
		kor2 = 78;
		eng1 = 64;
		eng2 = 88;
		math1 = 74;
		math2 = 88;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if (kor1 > 100 || kor1 < 0) {
			System.out.println(name1 + " 학생의 국어 점수는 유효하지 않는 점수입니다.");
			return;
		}else if(eng1 > 100 || eng1 < 0){
			System.out.println(name1 + " 학생의 영어 점수는 유효하지 않는 점수입니다.");
			return;			
		}else if(math1 > 100 || math1 < 0) {
			System.out.println(name1 + " 학생의 수학 점수는 유효하지 않는 점수입니다.");
			return;			
		}
		if (kor2 > 100 || kor2 < 0) {
			System.out.println(name2 + " 학생의 국어 점수는 유효하지 않는 점수입니다.");
			return;
		}else if(eng2 > 100 || eng2 < 0){
			System.out.println(name2 + " 학생의 영어 점수는 유효하지 않는 점수입니다.");
			return;			
		}else if(math2 > 100 || math2 < 0) {
			System.out.println(name2 + " 학생의 수학 점수는 유효하지 않는 점수입니다.");
			return;			
		}
		
			
		

		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		avg1 = (double)tot1/3;
		davg1 = ((int)(avg1*100+5)/10)/10.0;	
		avg2 = (double)tot2/3;
		davg2 = ((int)(avg2*100+5)/10)/10.0;
		grade1 = ' ';
		grade2 = ' ';
		rank = 0;
		// 반올림을 둘째자리에서 반올림을 하려면 먼저 100을 곱하고 5을 더한뒤 10을 나누고 그 값을 정수로 바꾼뒤 다시 10을 나눈다.
		
		if(avg1 >= 90) {
			grade1='A';
		}else if (avg1 >= 80) {
			grade1='B';		
		}else if (avg1 >= 70) {
			grade1='C';
		}
		if(avg2 >= 90) {
			grade2='A';
		}else if (avg2 >= 80) {
			grade2='B';		
		}else if (avg2 >= 70) {
			grade2='C';
		}
		
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
		System.out.println("----------------학생 성적 출력----------------");
		System.out.println("학번  이름  국어 영어 수학 총점 평균 평점 석차");
		System.out.println("----------------------------------------------");
		System.out.printf(" %2d %4s %3d  %3d  %3d  %3d %5.1f %3c %5d%n",no1, name1, kor1, eng1, math1, tot1, davg1, grade1, rank);
		System.out.printf(" %2d %4s %3d  %3d  %3d  %3d %5.1f %3c %5d%n",no2, name2, kor2, eng2, math2, tot2, davg2, grade2, rank);
		System.out.println("----------------------------------------------");
			
		
		
	}

}
