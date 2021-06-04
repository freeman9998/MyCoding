package com.itwill01.field;

public class StudentFieldMain {
	public static void main(String[] args) {
		/*
		 * 학생객체를 2개 생성
		 */
		/*
		//new 연산자로 클래스 객체(object) 생성 힙에저장)
		
		new Student();
		
		//변수선언을 통해 객체 사용가능 변수에는 new 연산자로 생성한 번지의코드가 저장되어있음
		Student stu1;
		*/
		//2줄을 한줄요약 한것 ㄱ
		Student stu1=new Student();
		Student stu2=new Student();
		
		
		
		/*
		 *  학생객체에 기본 데이타(번호,이름,국어,수학,영어) 2개 대입
		 *  
		 */
		//stu1 객체의 필드에 값대입
		stu1.no=1;
		stu1.name="KIM";
		stu1.kor=50;
		stu1.math=60;
		stu1.eng=30;
		
		
		
		
		
		//stu2 객체의 필드에 값대입
		stu2.no=2;
		stu2.name="LIE";
		stu2.kor=60;
		stu2.math=70;
		stu2.eng=80;
		
		
		
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 * 영어 수학 국어의 값의합을 stu1객체의 필드에 저장 
		 */
		stu1.tot=stu1.eng+stu1.kor+stu1.math;
		stu2.tot=stu2.eng+stu2.kor+stu2.math;
		
		
		//학생의 평균 계산 총점에서 과목의 숫자 3을나눈값을 객체의 필드에 저장 
		//3.0으로 해야지 더블값이 온전히 저장된다 .
		stu1.avg=stu1.tot/3.0;
		stu2.avg=stu2.tot/3.0;
		
		
		//석차 계산 
		//if 문을 이용하여 석차값을 계산해서 stu1객체 필드에입력 
		if(stu1.avg>=90) {
			stu1.rank='A';
		}else if(stu1.avg>=80){
			stu1.rank='B';
		}else if(stu1.avg>=70){
			stu1.rank='C';
		}else if(stu1.avg>=60){
			stu1.rank='D';
		}else {
			stu1.rank='F';
		}
		
		//if 문을 이용하여 석차값을 계산해서 stu2객체 필드에입력 
		if (stu2.avg >= 90) {
			stu2.rank = 'A';
		} else if (stu2.avg >= 80) {
			stu2.rank = 'B';
		} else if (stu2.avg >= 70) {
			stu2.rank = 'C';
		} else if (stu2.avg >= 60) {
			stu2.rank = 'D';
		} else {
			stu2.rank = 'F';
		}
		
		
		/*
		 * 학생데이타출력
		 * printf를 이용해 성적 출력 석차는 0으로 고정 아무것도 안건들면 초기화가 0으로 되서 그대로 사용
		 * 
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",stu1.no,stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.tot,stu1.avg,stu1.rank,stu1.level);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",stu2.no,stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.tot,stu2.avg,stu2.rank,stu2.level);
		
	}

}
