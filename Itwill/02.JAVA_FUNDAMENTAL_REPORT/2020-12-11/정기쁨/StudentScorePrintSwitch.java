package com.itwill00.variable;

public class StudentScorePrintSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int num1, num2, kor1, kor2, eng1, eng2, math1, math2, tot1, tot2;
		String name1, name2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;
		
		
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
		math2= 76;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if(kor1>100 || kor1<0 || eng1>100 || eng1<0 || math1>100 || math1<0) {
			
			System.out.println(name1+"의 점수를 다시 확인해주세요");
			return;
		}
		
		if(kor2>100 || kor2<0 || eng2>100 || eng2<0 || math2>100 || math2<0) {
				
				System.out.println(name2+"의 점수를 다시 확인해주세요");
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 * 평균으로 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
		 */
		 
		tot1 = kor1+eng1+math1;
		avg1 = tot1/3.0;
		rank1 = 0;
		
		tot2 = kor2+eng2+math2;
		avg2 = tot2/3.0;
		rank2 = 0;
		
		switch ((int)avg1/10) {
		
		case 10:
		case 9:
			grade1= 'A';
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
		}

		switch ((int)avg2/10) {
		case 10:
		case 9:
			grade2 ='A';
			break;
		case 8:
			grade2 ='B';
			break;
		case 7:
			grade2 ='C';
			break;
		case 6:
			grade2 ='D';
			break;
		default:
			grade2 ='F';
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
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
				"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf(" %1d %4s %2d",num1,name1,kor1);
		System.out.printf(" %4d %4d %4d",eng1, math1, tot1);
		System.out.printf(" %6.2f  %2c %4d%n",avg1,grade1, rank1);
		System.out.printf(" %1d %4s %2d",num2,name2,kor2);
		System.out.printf(" %4d %4d %4d",eng2, math2, tot2);
		System.out.printf(" %6.2f  %2c %4d%n",avg2,grade2, rank2);
		System.out.println("-----------------------------------------------");
	}

}
