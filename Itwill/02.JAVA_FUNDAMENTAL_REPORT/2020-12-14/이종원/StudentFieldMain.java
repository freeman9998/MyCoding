package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(2명)
		 */
		
		// 학생객체의 주소를 저장 할 참조변수선언 
                         Student s1;
                         Student s2;
        
                       // 학생객체 힙메모리에 생성 후에 객체의 주소값이 s1,s2 변수에 대입
                         s1 = new Student();
                         s2 = new Student();
     
		/*
		 * 학생객체에 기본데이터(번호,이름,국영수) 대입(2명)
		 */
        
                      // 학생객체의 번호,이름,국영수 멤버필드 대입
                        s1.n = 1; 
		s1.nam = "LEE";
		s1.kor = 70;
		s1.eng = 60;
		s1.math = 50;
		
		s2.n = 2;
		s2.nam = "KIM";
		s2.kor = 100;
		s2.eng = 90;
		s2.math = 80;
        
        
		/*
		 *  학생 총점,평균,평점 계산 후 대입(2명)
		 */
		
                     // 학생객체의 총점,평균 멤버필드에 대입
		s1.tot = s1.kor + s1.eng + s1.math;
		s1.avg = s1.tot / 3.0;
		s1.ran = 0;
		
		s2.tot = s2.kor + s2.eng + s2.math;
		s2.avg = s2.tot / 3.0;
		s2.ran = 0;
		
		// 학생객체의 평점 멤버필드에 대입
		if ( s1.avg >= 90 ) {
			s1.gra = 'A';
		} else if ( s1.avg >= 80 ) {
			s1.gra = 'B';
		} else if ( s1.avg >= 70 ) {
			s1.gra = 'c';  
		} else if ( s1.avg >= 60 ) {
			s1.gra = 'D'; 
		} else {
			s1.gra = 'F';
		}
		
		
		if ( s2.avg >= 90 ) {
			s2.gra = 'A';
		} else if (s2.avg >= 80 ) {
			s2.gra = 'B';
		} else if ( s2.avg >= 70 ) {
			s2.gra = 'C';
		} else if ( s2.avg > 60) {
			s2.gra = 'D';
		} else {
			s2.gra = 'F';
			
		
		
		/*
		 *  학생 데이터 출력
		 */
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",s1.n,s1.nam,s1.kor,s1.eng,s1.math,s1.tot,s1.avg,s1.gra,s1.ran);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",s2.n,s2.nam,s2.kor,s2.eng,s2.math,s2.tot,s2.avg,s2.gra,s2.ran);
	}

   }
	
	
}

