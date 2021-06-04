
public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1, kor1, eng1, math1, tot1, rank, no2, kor2, eng2, math2, tot2 ;
		double avg1, avg2;
		String name1, name2;
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		no2 = 2;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		rank = 0;
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if ((0<=kor1&&kor1<=100)&&((0<=eng1&&eng1<=100))&&(0<=math1&&math1<=100)) {
			}else
				{
					System.out.printf("%s님 점수는 0~100사이의 정수여야 합니다.\n",name1);
					return;	
				}
		
		if ((0<=kor2&&kor2<=100)&&((0<=eng2&&eng2<=100))&&(0<=math2&&math2<=100)) {
		}else
			{
				System.out.printf("%s님 점수는 0~100사이의 정수여야 합니다.\n",name2);
				return;	
			}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		avg1 = tot1/3.0;
		avg2 = tot2/3.0;
		
		char grade = ' ';
		if(avg1>=90||avg2>=90)
		{
			grade = 'A';
		}else if(avg1>=80||avg2>=80) {
			grade = 'B';
		}else if(avg1>=70||avg2>=70) {
			grade = 'C';
		}else if(avg1>=60||avg2>=60) {
			grade = 'D';
		}else if(avg1>=50||avg2>=50) {
			grade = 'E';
		}else {
			grade = 'F';
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
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%3d %4s %4d %4d %4d %4d %5.1f %3c %4d\n",no1,name1,kor1,eng1,math1,tot1,avg1,grade,rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %5.1f %3c %4d\n",no2,name2,kor2,eng2,math2,tot2,avg2,grade,rank);
		System.out.println("-----------------------------------------------");

	}

}
