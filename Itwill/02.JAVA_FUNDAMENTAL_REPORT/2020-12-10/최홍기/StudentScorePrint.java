public class StudentScorePrint{
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1, kor1, eng1, math1, tot1, rank1;
		int no2, kor2, eng2, math2, tot2, rank2;
		String name1, name2;
		char grade1, grade2;
		double avg1, avg2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1 = 1;
		no2 = 2;
		name1 = "Kim";
		name2 = "Choi";
		kor1 = 85;
		kor2 = 90;
		eng1 = 70;
		eng2 = 55;
		math1 = 68;
		math2 = 97;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if ((kor1 >= 0 && kor1 <= 100) && (eng1 >= 0 && eng1 <= 100) && (math1 >= 0 && math1 <= 100))  {
			
			if ((kor2 >= 0 && kor2 <= 100) && (eng2 >= 0 && eng2 <= 100) && (math2 >= 0 && math2 <= 100))  {
				
			} else {
				System.out.printf("%s 과목점수는 0~100 사이의 정수입니다!!!",name2);
				return;	
			}
		} else {
			System.out.printf("%s 과목점수는 0~100 사이의 정수입니다!!!",name1);
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		
		avg1 = tot1 / 3.0;
		avg2 = tot2 / 3.0;
		System.out.println(avg1);
		System.out.println(avg2);
		
		grade1 =' ';
		grade2 =' ';
		if (avg1 >= 90) {
			grade1 = 'A';
		}else if (avg1 >= 80) {
			grade1 = 'B';
		}else if(avg1 >= 70) {
			grade1 = 'C';
		}else if(avg1 >= 60) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		System.out.println(grade1);
		if (avg2 >= 90) {
			grade2 = 'A';
		}else if (avg2 >= 80) {
			grade2 = 'B';
		}else if(avg2 >= 70) {
			grade2 = 'C';
		}else if(avg2 >= 60) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		System.out.println(grade2);
		
		rank1 = 0;
		rank2 = 0;
		
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
		System.out.println("---------------학생성적출력----------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-------------------------------------------");
		System.out.printf("%4d %4s %4d %4d %4d %4d %4.1f %3c %3d%n", no1, name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
		System.out.printf("%4d %4s %4d %4d %4d %4d %4.1f %3c %3d%n", no2, name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
		System.out.println("-------------------------------------------");
		
	}
}