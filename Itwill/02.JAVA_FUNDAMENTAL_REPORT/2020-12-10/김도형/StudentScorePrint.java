public class StudentScorePrint{
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1,no2;
		String nam1,nam2;
		int kor1,kor2,eng1,eng2,math1,math2;
		int tot1,tot2;
		double avg1,avg2;
		char grade1,grade2;
		int rank;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1=1; no2=2;
		nam1="김경호"; nam2="김경수";
		kor1=42; kor2=45;
		eng1=56; eng2=53;
		math1=78; math2=76;
				
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		tot1=kor1+eng1+math1;
		tot2=kor2+eng2+math2;
		avg1=tot1/3.0;
		avg2=tot2/3.0;
		rank=0;
			
		
		if(kor1<0||kor1>100) {
			System.out.println( kor1 + "은 유효하지 않은 점수입니다.");
			return;
		} else if(eng1<0|| eng1>100) {
			System.out.println( eng1 + "은 유효하지 않은 점수입니다.");
			return;
		} else if(math1<0||math1>100) {
			System.out.println(math1 + "은 유효하지 않은 점수입니다.");
		}

		
		if(kor2<0||kor2>100) {
			System.out.println( kor2 + "은 유효하지 않은 점수입니다.");
			return;
		} else if(eng2<0|| eng2>100) {
			System.out.println( eng2 + "은 유효하지 않은 점수입니다.");
			return;
		} else if(math2<0||math2>100) {
			System.out.println(math2 + "은 유효하지 않은 점수입니다.");
		}
				
		
		grade1 = ' ';		
		if(avg1>=90 || avg2>=90) {
			grade1='A';
		}else if(avg1>=80 || avg2>=80) {
			grade1='B';
		}else if(avg1>=70 || avg2>=70) {
			grade1='C';
		}else if(avg1>=60 || avg2>=60) {
			grade1='D';
		}else {
			grade1='F';
		}		
		grade2 = ' ';
		if(avg1>=90 || avg2>=90) {
			grade2='A';
		}else if(avg1>=80 || avg2>=80) {
			grade2='B';
		}else if(avg1>=70 || avg2>=70) {
			grade2='C';
		}else if(avg1>=60 || avg2>=60) {
			grade2='D';
		}else {
			grade2='F';
		}		
		
						
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
			
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
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n"
					,no1,nam1,kor1,eng1,math1,tot1,avg1,grade1,rank);	
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n"
					,no2,nam2,kor2,eng2,math2,tot2,avg2,grade2,rank);	
			System.out.printf("-----------------------------------------------%n");
	}
}