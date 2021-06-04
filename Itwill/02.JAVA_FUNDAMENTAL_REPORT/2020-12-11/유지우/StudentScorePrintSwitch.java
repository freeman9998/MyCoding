package com.itwill00.variable;

public class StudentScorePrintSwitch{
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		
		int num1, num2;
		String name1, name2;
		int kor1, eng1, math1, kor2, eng2, math2;
		int tot1, tot2;// 총점
		double avg1, avg2;// 평균
		char grade1, grade2;// 평점
		int rank;// 석차
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		num1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		num2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
		if (kor1 > 100 || kor1 < 0){
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		}
		 else if (eng1 > 100 || eng1 < 0) {
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		} else if (math1 > 100 || math1 < 0) {
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		}
		
		if (kor2 > 100 || kor2 < 0){
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		}
		 else if (eng2 > 100 || eng2 < 0) {
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		} else if (math2 > 100 || math2 < 0) {
			System.out.println("0~100까지의 숫자를 입력해주세요.");
			return;
		}
		

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 * 평균으로 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
		 */
		
		tot1 = kor1 + eng1 + math1;
		avg1 = (double)tot1 / 3;
		
		tot2 = kor2 + eng2 + math2;
		avg2 = (double)tot2 / 3;
		
		rank = 0;
		 
         avg1 = ((avg1 * 100) + 5) / 100;
		 avg2 = ((avg2 * 100) + 5) / 100;
		
		 switch((int)avg1/10) {
		 
		 case 10:
			 grade1 = 'A';
			 break;
		 case 9:
			 grade1 = 'A';
			 break;
		 case 8:
			 grade1 = 'B';
			 break;
		 case 7:
			 grade1 = 'C';
			 break;
		 case 6:
			 grade1 = 'D';
			 break;
		 default:
			 grade1 = 'F';
			 break;
		 }
		 
		 switch((int)avg2/10) {
		 
		 case 10:
			 grade2 = 'A';
			 break;
		 case 9:
			 grade2 = 'A';
			 break;
		 case 8:
			 grade2 = 'B';
			 break;
		 case 7:
			 grade2 = 'C';
			 break;
		 case 6:
			 grade2 = 'D';
			 break;
		 default:
			 grade2 = 'F';
			 break;
		 }
		
		 
			System.out.printf("---------------학생 성적출력-------------------%n");
			System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
			System.out.printf("-----------------------------------------------%n");
			System.out.printf("%2d %4s %2d %4d %4d %4d %6.1f %3c %4d", num1, name1, kor1, eng1, math1, tot1, avg1, grade1,
					rank);
			System.out.println(" ");
			System.out.printf("%2d %4s %2d %4d %4d %4d %6.1f %3c %4d", num2, name2, kor2, eng2, math2, tot2, avg2, grade2,
					rank);
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요(%f)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
	}
}