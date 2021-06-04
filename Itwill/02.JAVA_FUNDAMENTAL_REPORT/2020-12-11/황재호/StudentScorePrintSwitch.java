package com.itwill00.variavle;

public class StudentScorePrintSwitch {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */

		int no1,no2;
		String name1,name2;
		int kor1;
		int kor2;
		int eng1,eng2;
		int math1,math2;
		int total1,total2;
		double avg1,avg2,avg3,avg4;
		char level,level2;
		int rank;
		

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */

		no1 = 1;
		no2 = 2;
		name1 ="황재호";
		name2 ="아무개";
		kor1 = 74;
		kor2 = 98;
		eng1 = 54;
		eng2 = 95;
		math1 = 62;
		math2 = 86;
		

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if (kor1<0 || kor1>100) {
			System.out.println("정수는 0~100 사이여야 합니다.");
			return;
			} else if(eng1<0 || eng1>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(math1<0 || math1>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			}
		
		if (kor2<0 || kor2>100) {
			System.out.println("정수는 0~100 사이여야 합니다.");
			return;
			} else if(eng2<0 || eng2>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(math2<0 || math2>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			}
		

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 * 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
		 */
		

		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		avg1=total1/3.0;
		avg2=total2/3.0;
		rank=0;
		
		String grade;
		switch((int)avg1 /10) {
			case 10:
			case 9:
				grade="A";
				break;
			case 8:
				grade="B";
				break;
			case 7:
				grade="C";
				break;
			case 6:
				grade="D";
				break;
			default:
				grade="F";
				break;
		}
		
		String grade2;
		switch((int)avg2/10) {
			case 10:
			case 9:
				grade2="A";
				break;
			case 8:
				grade2="B";
				break;
			case 7:
				grade2="C";
				break;
			case 6:
				grade2="D";
				break;
			default:
				grade2="F";
				break;
		}
			
		


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
		
		System.out.println("--------------학생 성적출력--------------------");
		System.out.printf(" %s %s %3s %s %s %s %s %s %s%n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %2s %4d\r\n"
				,no1,name1,kor1,eng1,math1,total1,avg1,grade,rank);
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %2s %4d\r\n"
				,no2,name2,kor2,eng2,math2,total2,avg2,grade2,rank);
		System.out.println("-----------------------------------------------");
		
		
		
		
	}

}
