
public class StudentScorePrint{
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no1,no2;
		String name1,name2;
		int kor1,kor2;
		int eng1,eng2;
		int math1,math2;
		int tot1,tot2;
		double avg1,avg2;
		char grade1,grade2;
		int rank1,rank2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1=1; no2=2;
		name1="김두한"; name2="김두둘";
		kor1=10; kor2=100;
		math1=24; math2=20;
		eng1=95; eng2=60;
		tot1=kor1+math1+eng1;
		tot2=kor2+math2+eng2;
		avg1=tot1/3.0;
		avg2=tot2/3.0;
		grade1=' ';grade2=' ';
		rank1=3;  rank2=2;
		
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if((0<=kor1 && kor1<=100)&&(0<=math1 && math1<=100) &&(0<=eng1 && eng1<=100)) {
			//System.out.println("올바른 점수입니당");
		}else {
			System.out.println("점수를 올바르게 입력해주세요");
			return;
		}
		if((0<=kor2 && kor2<=100)&&(0<=math2 && math2<=100) &&(0<=eng2 && eng2<=100)) {
			//System.out.println("올바른 점수입니당");
		}else {
			System.out.println("점수를 올바르게 입력해주세요");
			return;
		}
		/*
		 * 
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		if(tot1>=290) {
			grade1='A';
		}else if(tot1>=270){
			grade1='B';
		}else if(tot1>=250){
			grade1='C';
		}else if(tot1>=250){
			grade1='D';
		}else {
			grade1='E';
		}
		if(tot2>=290) {
			grade2='A';
		}else if(tot2>=270){
			grade2='B';
		}else if(tot2>=250){
			grade2='C';
		}else if(tot2>=250){
			grade2='D';
		}else {
			grade2='E';
		}
		
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n","학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%1d %4s %3d %4d %4d %4d %5.1f %2C %5d%n",no1,name1,kor1,eng1,math1,tot1,avg1,grade1,rank1 );
		System.out.printf("%1d %4s %3d %4d %4d %4d %5.1f %2C %5d%n",no2,name2,kor2,eng2,math2,tot2,avg2,grade2,rank2 );
		System.out.println("----------------------------------------------");
		
		
		
		
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