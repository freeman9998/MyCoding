package com.itwill01.field;

public class StudentFeldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명 생성
		 */
		
		Student sd1;
		sd1=new Student();
		
		Student sd2=new Student();
		
		/*
		 * 학생객체 기본데이터 입력(2명)
		 */
		
		/*
		 * 학생객체 기본 데이터(번호,이름,국어,영어,수학) 대입(2명)
		 */
		sd1.no = 1;
		sd2.no = 2;
		sd1.name ="황재호";
		sd2.name ="아무개";
		sd1.kor = 94;
		sd2.kor = 98;
		sd1.eng = 74;
		sd2.eng = 95;
		sd1.math = 72;
		sd2.math = 86;
		
		/*
		 * 학생 총점,평균,평점 계산후 대입(2명)
		 */
		
		if (sd1.kor<0) {
			System.out.println("정수는 0~100 사이여야 합니다.");
			return;
			} else if(sd1.kor>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(sd1.eng<0) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(sd1.eng>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(sd1.math<0) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(sd1.math>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			}
		
		if (sd2.kor<0 || sd2.kor>100) {
			System.out.println("정수는 0~100 사이여야 합니다.");
			return;
			} else if(sd2.eng<0 || sd2.eng>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			} else if(sd2.math<0 || sd2.math>100) {
				System.out.println("정수는 0~100 사이여야 합니다.");
				return;
			}
		
		
		
		sd1.tot=sd1.kor+sd1.eng+sd1.math;
		sd2.tot=sd2.kor+sd2.eng+sd2.math;
		sd1.avg=sd1.tot/3.0;
		sd2.avg=sd2.tot/3.0;
		sd1.rank=0;
		sd2.rank=0;
		
		
		sd1.lv=' ';
		if (sd1.avg>=90 ) {
			sd1.lv ='A';
		} else if (sd1.avg>=80 ) {
			sd1.lv ='B';
		} else if (sd1.avg>=70 ) {
			sd1.lv ='C';
		} else if (sd1.avg>=60 ) {
			sd1.lv ='D';
		} else {
			sd1.lv ='F';
		}
		
		
		sd2.lv=' ';
		switch((int)sd2.avg/10) {
			case 10:
			case 9:
				sd2.lv='A';
				break;
			case 8:
				sd2.lv='B';
				break;
			case 7:
				sd2.lv='C';
				break;
			case 6:
				sd2.lv='D';
				break;
			default:
				sd2.lv='F';
				break;
		}
			
		
		
		/*
		 * 학생 데이터 출력
		 */
		
		
		
		System.out.println("--------------학생 성적출력--------------------");
		System.out.printf(" %s %s %3s %s %s %s %s %s %s%n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("-----------------------------------------------");
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %2s %4d\r\n"
				,sd1.no,sd1.name,sd1.kor,sd1.eng,sd1.math,sd1.tot,sd1.avg,sd1.lv,sd1.rank);
		System.out.printf("%3d %4s %3d %4d %4d %4d %5.1f %2s %4d\r\n"
				,sd2.no,sd2.name,sd2.kor,sd2.eng,sd2.math,sd2.tot,sd2.avg,sd2.lv,sd2.rank);
		System.out.println("-----------------------------------------------");
		
		
		
		
		
		
		

	}

}
