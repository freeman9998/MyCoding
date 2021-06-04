package com.itwill00.variable;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수 선언
		 * - 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		
		/*
		 * 학생 2명의 기본데이터 (번호, 이름, 국어, 영어, 수학) 입력
		 */
		
		/*
		 * 학생 2명의 국어, 영어, 수학점수의 유효성체크
		 * - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입(석차는 0을 대입)
		 */
		
		/*
		 * 출력포맷
		 * 평균은 소수점이하 2째자리수에서 반올림하세요. (%f)
		 * 석차는구하지마세요
		 * -----------------학생 성적출력----------------
		 * 번호  이름  국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------
		 *  1   김경호  42   56	  78  334  34.8   A   3
		 *  2   김경수  45   53   76  334  34.8   A   2
		 */

		int num1,num2, kor1, kor2, eng1,eng2, math1, math2,tot,tot2,rank;
		double avg, avg2;
		char grade, grade2;
		String name1,name2;
		
		name1 = "김경호";
		name2 = "김경수";
		
		num1 = 1; num2 =2;
		kor1=42; eng1=56; math1=78;
		kor2=45; eng2=53; math2=76;
		tot = 0; tot2 =0;
		avg = 0; avg2 =0;
		grade = ' ';
		grade2 = ' ';
		rank = 0;
		
		
		if(kor1>100 || kor1<0 || eng1>100 || eng1<0 || math1>100 || math1<0) {
			
			System.out.println(name1+"의 정보를 다시 입력해주세요");
			return;
		
		}else {
			tot = (kor1+eng1+math1);
			avg = (tot/3);
			if(avg>=90) {grade ='A';	
			
			}else if (avg>=80) {grade ='B';
			
			}else if (avg>=70) {grade ='C';
			
			}else if (avg>=70) {grade ='d';
			
			}else grade = 'F';
		}if(kor2>100 || kor2<0 || eng2>100 || eng2<0 || math2>100 || math2<0) {
				
				System.out.println(name2+"의 정보를 다시 입력해주세요");
				return;

				
			}else {
				tot2 = (kor2+eng2+math2);
				avg2 = (tot/3);
				if(avg>=90) {grade2 ='A';	
				
				}else if (avg>=80) {grade2 ='B';
				
				}else if (avg>=70) {grade2 ='C';
				
				}else if (avg>=70) {grade2 ='d';
				
				}else grade2 = 'F';
			
		} System.out.printf("---------------학생 성적출력-------------------%n");
		  System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
				"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		  System.out.printf("-----------------------------------------------%n");
		  System.out.printf(" %2d %2s %2d",num1,name1,kor1);
		  System.out.printf(" %4d %4d %4d",eng1, math1, tot);
		  System.out.printf(" %6.1f  %2c %4d%n",avg,grade, rank);
		  System.out.printf(" %2d %2s %2d",num2,name2,kor2);
		  System.out.printf(" %4d %4d %4d",eng2, math2, tot2);
		  System.out.printf(" %6.1f  %2c %4d",avg2,grade2, rank);
	}

}
