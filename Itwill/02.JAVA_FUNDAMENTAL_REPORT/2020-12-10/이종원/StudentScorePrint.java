package com.itwill00.variable;

public class StudentScorePrint{
	
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int n1, n2;
		String name1, name2;
		int kor1, kor2;
		int eng1, eng2;
		int math1, math2;
		int tot1, tot2;
		double ave1, ave2;
		char gra1,gra2;
		int ran1, ran2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		n1 = 1;
		name1 = "LEE";
		kor1 = 70;
		eng1 = 60;
		math1 = 50;
		
		n2 = 2;
		name2 = "KIM";
		kor2 = 100;
		eng2 = 90;
		math2 = 80;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
        if ( kor1 < 0 || kor1 > 100 ) {
        	System.out.println( kor1 + "유효하지 않습니다.");
        	return; 
        } else if ( eng1 < 0 || eng1 > 100 ) {
            System.out.println( eng1 + "유효하지 않습니다.");
            return;
        } else if ( math1 < 0 || math1 > 100 ) {
        	System.out.println( math1 + "유효하지 않습니다.");
            return;
            
        }
        
        
        if ( kor2 < 0 || kor2 > 100 ) {
        	System.out.println( kor2 + "유효하지 않습니다.");
        	return; 
        } else if ( eng2 < 0 || eng2 > 100 ) {
            System.out.println( eng2 + "유효하지 않습니다.");
            return;
        } else if ( math2 < 0 || math2 > 100 ) {
        	System.out.println( math2 + "유효하지 않습니다.");
            return;
            
        	
        }

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		ave1 = tot1 / 3.0;
		ran1 = 0;
		tot2 = kor2 + eng2 + math2;
		ave2 = tot2 / 3.0;
		ran2 = 0;
		
		if ( ave1 > 80 ) {
			gra1 = 'A';
		} else if ( ave1 > 70 ) {
			gra1 = 'B';
		} else if ( ave1 > 60 ) {
			gra1 = 'C';
		} else if ( ave1 > 50 ) {
		    gra1 = 'D';
		} else {
			gra1 = 'F';
			
		}
		if ( ave2 > 100 ) {
			gra2 = 'A';
		} else if ( ave2 > 90 ) {
			gra2 = 'B';
		} else if ( ave2 > 80 ) {
			gra2 = 'C';
		} else if ( ave2 > 70 ) {
			gra2 = 'D';
		} else {
			gra2 = 'F';
			
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
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.printf(" %3d %4s %4d %3d %4d %4d %5.1f %2c %4d %n",n1,name1,kor1,eng1,math1,tot1,ave1,gra1,ran1);
		System.out.printf(" %3d %4s %4d %3d %4d %4d %5.1f %2c %4d %n",n2,name2,kor2,eng2,math2,tot2,ave2,gra2,ran2);
		System.out.println("-----------------------------------------------");
		
	}

}
