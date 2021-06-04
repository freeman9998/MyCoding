package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1,kor1,eng1,math1,tot1,rank1,no2,kor2,eng2,math2,tot2,rank2;
		String name1,name2;
		double aver1,aver2;
		char grade1,grade2;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1=1;
		no2=2;
		name1="김경호";
		name2="김경수";
 		kor1=101;
		kor2=45;
		eng1=56;
		eng2=53;
		math1=78;
		math2=76;
		grade1=' ';
		grade2=' ';
		rank1=0;
		rank2=0;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if((kor1 <100 && kor1 >= 0) && (eng1 <100 && eng1 >= 0) && (math1 <100 && math1 >= 0) ) {
			
		}else{
			System.out.printf("%s님의 점수는유효하지 못한 점수입니다",name1);
			return;
		}
		
       if((kor2 <100 && kor2 >= 0) && (eng2 <100 && eng2 >= 0) && (math2 <100 && math2 >= 0) ) {
			
		}else{
			System.out.printf("%s님의 점수는유효하지 못한 점수입니다",name2);
			return;
		}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
       tot1=kor1 + eng1 + math1;
		tot2=kor2 + eng2 + math2;
		aver1=tot1/3.0;
	    aver2=tot2/3.0;
		
		if (aver1 >= 90) {
			grade1 = 'A';
			} else if (aver1 >= 80) {
			grade1 = 'B';
			} else if(aver1 >=70){
			grade1 = 'C';
		} else if(aver1 >= 60 ) {
           grade1 = 'D';		
		} else if(aver1 >= 50 ) {
			grade1 = 'F';
		}
	
		if (aver2 >= 90) {
			grade2 = 'A';
			} else if (aver2 >= 80) {
			grade2 = 'B';
			} else if(aver2 >=70){
			grade2 = 'C';
		} else if(aver2 >= 60 ) {
           grade2 = 'D';		
		} else if(aver2 >= 50 ) {
			grade2 = 'F';
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
		
				
		
		System.out.println("-------------------학생 성적출력-------------------");
		System.out.println("학번\t" + "이름\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" +"평점\t" + "석차");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%3d %2s\t %d\t %d\t %d\t %d %2.1f %c %d\n", no1, name1, kor1, eng1, math1, tot1, aver1, grade1,rank1 );
		System.out.printf("%3d %2s\t %d\t %d\t %d\t %d %2.1f %c %d\n", no2, name2, kor2, eng2, math2, tot2, aver2, grade2,rank2 );
		System.out.println("-----------------------------------------------------");
		
		
		

	}

}
