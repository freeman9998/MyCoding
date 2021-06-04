
public class StudentScorePrintSwitch {

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
		 * 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
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
		
		int student1_num,student2_num;
		String student1_name,student2_name;
		int student1_kor,student2_kor;
		int student1_eng,student2_eng;
		int student1_math,student2_math;
		int student1_total,student2_total;
		float student1_avg,student2_avg;
		char student1_grade,student2_grade;
		int student1_rank,student2_rank;
		
		student1_num=1;
		student1_name="홍길동";
		student1_kor=100;
		student1_eng=44;
		student1_math=77;
		
		student2_num=2;
		student2_name="고길동";
		student2_kor=71;
		student2_eng=61;
		student2_math=52;
		
		
		if( student1_kor < 0 || student1_kor >100 ) {
			System.out.println("올바른 학생1의 국어 점수가 입력되지 않았습니다.");
			return;
		}else if(student2_kor < 0 || student2_kor > 100){
			System.out.println("올바른 학생2의 국어 점수가 입력되지 않았습니다.");
			return;
		}else if(student1_eng < 0 || student1_eng > 100){
			System.out.println("올바른 학생1의 영어 점수가 입력되지 않았습니다.");
			return;
		}else if(student2_eng < 0 || student2_eng > 100){
			System.out.println("올바른 학생2의 영어 점수가 입력되지 않았습니다.");
			return;
		}else if(student1_math < 0 || student1_math > 100){
			System.out.println("올바른 학생1의 수학 점수가 입력되지 않았습니다.");
			return;
		}else if(student2_math < 0 || student2_math > 100){
			System.out.println("올바른 학생2의 수학 점수가 입력되지 않았습니다.");
			return;
		}
		
		student1_total=student1_kor+student1_eng+student1_math;
		student1_avg=student1_total/3.0f;
		student1_grade=' ';
		student1_rank = 0;
		
		student2_total=student2_kor+student2_eng+student2_math;
		student2_avg=student2_total/3.0f;
		student2_grade=' ';
		student2_rank = 0;
		
		switch ((int)student1_avg/10) {
		case 10:
			student1_grade='A';
			break;
		case 9:
			student1_grade='A';
			break;
		case 8:
			student1_grade='B';
			break;
		case 7:
			student1_grade='C';
			break;
		case 6:
			student1_grade='D';
			break;
		default:
			student1_grade='F';
			break;
		}
		
		switch ((int)student2_avg/10) {
		case 10:
			student2_grade='A';
			break;
		case 9:
			student2_grade='A';
			break;
		case 8:
			student2_grade='B';
			break;
		case 7:
			student2_grade='C';
			break;
		case 6:
			student2_grade='D';
			break;
		default:
			student2_grade='F';
			break;
		}
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.printf(" %d  %s  %d  %d  %d  %d  %.2f  %c  %d\n",student1_num,student1_name,student1_kor,student1_eng,student1_math,student1_total,student1_avg,student1_grade,student1_rank);
		System.out.printf(" %d  %s  %d  %d  %d  %d  %.2f  %c  %d\n",student2_num,student2_name,student2_kor,student2_eng,student2_math,student2_total,student2_avg,student2_grade,student2_rank);
		System.out.println("-----------------------------------------------");
	}

}
