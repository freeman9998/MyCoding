package com.itwill00.variable;
import javax.swing.event.SwingPropertyChangeSupport;

public class StudentScorePrintSwitch {

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
		int tot1, tot2; //총점
		double avg1, avg2; //평균
		char grade1, grade2; //평점
		int rank1, rank2; //석차
		
		
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
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		String msg = "님의 점수를 다시 확인하세요.";
		
		if((kor1>100 || kor1<0) || (eng1>100 || eng1<0) || (math1>100 || math1<0)) {
			System.out.println(name1+msg);
			return;
		}
		
		if((kor2>100 || kor2<0) || (eng2>100 || eng2<0) || (math2>100 || math2<0)) {
			System.out.println(name2+msg);
			return;
		}
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 * 평점(A,B,C,D,F)계산시 switch문을 사용해보세요
		 */
		//총점 계산
		tot1 = kor1 + eng1 + math1;
		tot2 = kor2 + eng2 + math2;
		
		//평균 계산
		avg1 = tot1 / 3.0;
		avg2 = tot2 / 3.0;
		
		
		//평점 계산
		switch ((int)avg1/10) {
			case(10):
			case(9):
				grade1='A';
				break;
			case(8):
				grade1='B';
				break;
			case(7):
				grade1='C';
				break;
			case(6):
				grade1='D';
				break;
			default:
				grade1='F';
				break;
		}
		
		switch ((int)avg2/10) {
		case(10):
		case(9):
			grade2 ='A';
			break;
		case(8):
			grade2 ='B';
			break;
		case(7):
			grade2 ='C';
			break;
		case(6):
			grade2 ='D';
			break;
		default:
			grade2 ='F';
			break;
	}
		
		//석차 계산
		rank1 = 3;
		rank2 = 2;
		
		
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
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s \n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %3d\n",
				no1, name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
		System.out.printf("%2d %4s %d %4d %4d %4d %5.1f %3c %3d\n",
				no2, name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
		System.out.println("----------------------------------------------");

	}

}
