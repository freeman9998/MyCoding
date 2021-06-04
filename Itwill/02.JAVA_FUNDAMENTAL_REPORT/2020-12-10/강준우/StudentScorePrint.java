package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		
		int no1, no2;
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		int tot1, tot2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;
		
	
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		no1=1; no2=2;
		name1="강준우"; name2="음창도";
		kor1=90; kor2=80;
		eng1=80; eng2=50;
		math1=95; math2=94;
				
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
        if ((kor1 >=0 && kor1 <=100) && (kor2 >=0 && kor2 <=100)) {
			System.out.printf("국어점수는 유효합니다.%n");
		} else {
			System.out.printf("국어점수는 유효하지않습니다.%n");			
          return;       
		}
        if ((eng1 >=0 && eng2 <=100) && (eng2 >=0 && eng2 <=100)) {
        	System.out.printf("영어점수는 유효합니다.%n");
        } else {
        	System.out.printf("영어점수는 유효하지않습니다.%n");        	
        	return;       
        }
        if ((math1 >=0 && math1 <=100) && (math2 >=0 && math2 <=100)) {
        	System.out.printf("수학점수는 유효합니다.%n");
        } else {
        	System.out.printf("수학점수는 유효하지않습니다.%n");
        	return;       
        }
    	/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
        
        tot1=265; tot2=224;
        avg1=88.33; avg2=74.66;
        grade1='A'; grade2='B';
        rank1=0; rank2=0;
       
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
        
        System.out.printf("--------------학생 성적출력-------------------%n");
        System.out.printf("학번  이름  국어 영어 수학 총점 평균 평점 석차%n");
        System.out.printf("%2d %5s %3d %4d %4d %4d %5.1f %3c %3d%n", no1, name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
        System.out.printf("%2d %5s %3d %4d %4d %4d %5.1f %3c %3d%n", no2, name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
        System.out.println("-----------------------------------------------");
       
        
        
        
        }
}

