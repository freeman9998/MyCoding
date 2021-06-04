
public class IfScorePrint {

	public static void main(String[] args) {
		/*
		 * 학생1명 성적데이타를 담을변수선언
		 */
		int no;
		String name;
		int kor,eng,math;
		int tot;//총점
		double avg;//평균
		char grade;//평점
		int rank;//석차
		/*
		 * 학생1명 기본데이타대입
		 * << 번호,이름,국어,영어,수학 >>
		 */
		no=1;
		name="KIM";
		kor=45;
		eng=67;
		math=90;
		
		/*
		 * 학생1명 기본데이타를사용해서연산에의해
		 * << 총점,평균,평점 대입>> 
		 */
		
		tot=789;
		avg=23.56;
		/*
		 * Quiz:
		 *  평균으로 학점산출후 대입
		 */
		grade='C';
		rank=1;
		
		/*
		 * 학생1명출력
		 */
		
		/*
		---------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1    KIM   45   56   78   334  23.6  A   0  
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d",no,name,kor,eng,math,tot,avg,grade,rank);
		
	}

}










