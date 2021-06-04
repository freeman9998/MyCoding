package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 *학생객체 2명 생성
		 */
		//학생객체를 주소에 저장하기 위한 참조변수선언
		Student student1;
		Student student2;
		//객체를 힙메모리에 생성 후, 객체의 주소값이 student1,student2에 대입
		student1 = new Student();
		student2 = new Student();
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		//학생 객체의 (학번,이름,국어,수학,평균,석차)멤버필드에 값 대입
		student1.no1 = 1;
		student1.name1 = " 김경호";
		student1.kor1 = 59;
		student1.eng1 = 88;
		student1.math1 = 22;
		student1.grade1 = ' ';
		student1.rank1 = 2;
		
		student2.no2 = 2;
		student2.name2 = "김경수";
	    student2.kor2 = 18;
	    student2.eng2 = 66;
	    student2.math2 = 97;
	    student2.grade2 = ' ';
     	student2.rank2 = 1 ;
	    	
	    
	    
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
     	
     	//학생 객체의 tot,avg 멤버필드에 계산 후 값대입
		student1.tot1 = student1.kor1 +  student1.eng1 +  student1.math1;
	    student2.tot2 =  student2.kor2 +  student2.eng2 +  student2.math2;
	    student1.avg1 = student1.tot1/3.0;	
	    student2.avg2 = student2.tot2/3.0;	
	    
	  //학생 객체의 grade 멤버필드에 계산 후 값대입
	    if (student1.avg1>=90) {
			student1.grade1 = 'A';
		}else if(student1.avg1>=80) {
			student1.grade1 = 'B';
		}else if(student1.avg1>=70) {
			student1.grade1 = 'C';
		}else if(student1.avg1>=60) {
			student1.grade1 = 'D';
		}else {
			student1.grade1 = 'F';
		}
	    
	    if (student2.avg2>=90) {
			student2.grade2 = 'A';
		}else if(student2.avg2>=80) {
			student2.grade2 = 'B';
		}else if(student1.avg2>=70) {
			student2.grade2 = 'C';
		}else if(student2.avg2>=60) {
			student2.grade2 = 'D';
		}else {
			student2.grade2 = 'F';
		}
		/*
		 * 학생데이타출력
		 */
				
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				student1.no1, student1.name1, student1.kor1, student1.eng1, student1.math1, student1.tot1, student1.avg1, student1.grade1, student1.rank1);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				student2.no2, student2.name2, student2.kor2, student2.eng2, student2.math2, student2.tot2, student2.avg2, student2.grade2, student2.rank2);
	
	}

}
