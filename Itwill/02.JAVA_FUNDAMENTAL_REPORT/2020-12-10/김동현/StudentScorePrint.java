package com.itwill00.variable.김동현3;

public class StudentScorePrint {

	public static void main(String[] args) {
		
		int student1no,student2no;
		String student1name,student2name;
		int student1kor,student2kor;
		int student1eng,student2eng;
		int student1math,student2math;
		int student1tot,student2tot;
		double student1avg,student2avg;
		char student1grade,student2grade;
		int student1rank,student2rank;
		
		student1no=1; student2no=2;
		student1name="김경호"; student2name="김경수";
		student1kor=42; student2kor=45;
		student1eng=56;student2eng=53;
		student1math=78; student2math=76;
		
		if( student1kor <= 0 || student1kor >=100 || student2kor <= 0 || student2kor >=100 
			|| student1eng <= 0 || student1eng >= 100 ||	student2eng <= 0 || student2eng >= 100
			|| student1math <= 0 || student1math >= 100 || student2math <= 0 || student2math >= 100)
		{
			System.out.println("메시지.");
			return;
		}
		
		student1tot=student1kor+student1eng+student1math;
		student2tot=student2kor+student2eng+student2math;
		
		student1avg=student1tot/3;
		student2avg=student2tot/3;
		
		student1grade=' ';
		student2grade=' ';
		
		student1rank = 0;
		student2rank = 0;
		
		if((int)student1avg>=50){
			student1grade='A';
		}
		
		if(student2avg>=50){
			student2grade='A';
		}
			
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
		System.out.printf("%d %s %d %d %d %d %.2f %c %d\n",student1no,student1name,student1kor,student1eng,student1math,student1tot,student1avg,student1grade,student1rank);
		System.out.printf("%d %s %d %d %d %d %.2f %c %d\n",student2no,student2name,student2kor,student2eng,student2math,student2tot,student2avg,student2grade,student2rank);
		System.out.println("------------------------------------------");

	}

}
