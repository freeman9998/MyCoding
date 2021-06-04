package com.itwill01.field;

public class StudentFielMain {

	public static void main(String[] args) {
		/*
		 * 학생 객체 생성 (2명)
		 */
		
		//학생 객체의 주소를 저장할 참조변수선언
		Student Stu1;
		Student Stu2;
		
		// 학생 객체의 힙 메모리를 생성 후 객체의 주소값을 Sut1. Stu2 변수에 대입
		Stu1 = new Student();
		Stu2 = new Student();
		/*
		 * 학생 객체에 기본 데이터 대입 (2명)
		 * -> 번호, 이름, 국어, 영어, 수학
		 */

		//학생 객체에 멤버 필드(번호, 이름, 국어, 영어, 수학)에 값 대입
		Stu1.num = 1;
		Stu1.name = "김경호";
		Stu1.kor = 42;
		Stu1.eng = 56;
		Stu1.math = 78;
		Stu1.rank = 0;

		Stu2.num = 2;
		Stu2.name = "김경수";
		Stu2.kor = 45;
		Stu2.eng = 53;
		Stu2.math = 76;
		Stu2.rank = 0;
		
				
		/*
		 * 학생 총점, 평균, 평점 계산 후 대입
		 */
		
		// 총점 : 학생 객체의 국어, 영어, 수학의 합을 대입  
		Stu1.tot = (Stu1.kor+Stu1.eng+Stu1.math);
		Stu2.tot = (Stu2.kor+Stu2.eng+Stu2.math);
		// 평균 : 학생 객체의 총점을 3.0으로 나눈 값 대입 
		Stu1.avg = (Stu1.tot/3.0);
		Stu2.avg = (Stu2.tot/3.0);
		
		//평점 : 각 학생 객체의 평균 점수가 해당되는 평점을 대입
		if(Stu1.avg>=90) {Stu1.grade ='A';	
		
		}else if (Stu1.avg>=80) {Stu1.grade ='B';
	
		}else if (Stu1.avg>=70) {Stu1.grade ='C';
	
		}else if (Stu1.avg>=70) {Stu1.grade ='D';
	
		}else Stu1.grade = 'F';

		if(Stu2.avg>=90) {Stu2.grade ='A';	
		
		}else if (Stu2.avg>=80) {Stu2.grade ='B';
	
		}else if (Stu2.avg>=70) {Stu2.grade ='C';
	
		}else if (Stu2.avg>=70) {Stu2.grade ='D';
	
		}else Stu2.grade = 'F';;
		
		/*
		 * 학생 데이터 출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
				"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf(" %1d %4s %2d",Stu1.num,Stu1.name,Stu1.kor);
		System.out.printf(" %4d %4d %4d",Stu1.eng, Stu1.math, Stu1.tot);
		System.out.printf(" %6.2f  %2c %4d%n",Stu1.avg,Stu1.grade, Stu1.rank);
		System.out.printf(" %1d %4s %2d",Stu2.num,Stu2.name,Stu2.kor);
		System.out.printf(" %4d %4d %4d",Stu2.eng, Stu2.math, Stu2.tot);
		System.out.printf(" %6.2f  %2c %4d%n",Stu1.avg,Stu1.grade, Stu1.rank);
		System.out.println("-----------------------------------------------");
	


	}

}
