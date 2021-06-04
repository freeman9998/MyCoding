package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		
		
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
	
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
	
		

		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		
		
		
		
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
	
	
	
		int num1, kor1, eng1, math1, tot1, ran1, num2, kor2, eng2, math2, tot2, ran2;
		String name1, name2;
		char sco1, sco2;
		double avg1, avg2;
	
	
		num1 = 1; name1 = "김경호"; kor1 = 42; eng1 = 156; math1 = 78;		
		num2 = 2; name2 = "김경수"; kor2 = 45; eng2 = 53; math2 = 76;
		ran1 = 0; ran2 = 0;
	
	
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		avg1 = tot1/3.00;
		avg2 = tot2/3.00;
		ran1 = 0;
	    ran2 = 0;
	    
	    
	    if(kor1 <= 0 || kor1 >= 100) {
	    	System.out.println(name1+" 학생의 국어 점수가 잘못된 점수입니다.");
	    }else if(eng1 <= 0 || eng1 >= 100) {
	    	System.out.println(name1+" 학생의 영어 점수가 잘못된 점수입니다.");
	    }else if(math1 <= 0 || math1 >= 100) {
	    	System.out.println(name1+" 학생의 수학 점수가 잘못된 점수입니다.");
	    }
	  
	    
	    if(kor2 <= 0 || kor2 >= 100) {
	    	System.out.println(name2+" 학생의 국어 점수가 잘못된 점수입니다.");
	    }else if(eng2 <= 0 || eng2 >= 100) {
	    	System.out.println(name2+" 학생의 영어 점수가 잘못된 점수입니다.");
	    }else if(math2 <= 0 || math2 >= 100) {
	    	System.out.println(name2+" 학생의 수학 점수가 잘못된 점수입니다.");
	    }
	    System.out.println();
	    
	    if(avg1 >= 90) {
	    	sco1 = 'A';
	    }else if(avg1 >= 80) {
	    	sco1 = 'B';
	    }else if(avg1 >= 70) {
	    	sco1 = 'C';
	    }else if(avg1 >= 60) {
	    	sco1 = 'D';
	    }else {
	    	sco1 ='F';
	    }
	    
	    
	    if(avg2 >= 90) {
	    	sco2 = 'A';
	    }else if(avg2 >= 80) {
	    	sco2 = 'B';
	    }else if(avg2 >= 70) {
	    	sco2 = 'C';
	    }else if(avg2 >= 60) {
	    	sco2 = 'D';
	    }else {
	    	sco2 ='F';
	    }
	    
	    
	
		System.out.println("-------------------------학생 성적출력--------------------------");
		System.out.printf(" %s, %s, %s, %s, %s, %s, %s, %s, %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%3d %5s %3d %5d %5d %6d %6.1f %4c %4d\n",num1, name1, kor1, eng1, math1, tot1, avg1, sco1, ran1);
		System.out.printf("%3d %5s %3d %5d %5d %6d %6.1f %4c %4d\n",num2, name2, kor2, eng2, math2, tot2, avg2, sco2, ran2);
		
	
	
	
	
	}

}
