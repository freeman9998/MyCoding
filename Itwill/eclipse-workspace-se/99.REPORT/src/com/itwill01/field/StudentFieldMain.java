package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 *학생객체 2명 생성
		 */
		Student student1 = new Student();
		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		student1.no=1;
		student1.name="김경수";
		student1.kor=78;
		student1.eng=34;
		student1.math=30;
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		student1.tot = student1.kor+student1.eng+student1.math;
		student1.avg = student1.tot/3.0;
		if(student1.avg>=90) {
			student1.grade='A';
		}else if(student1.avg>=80) {
			student1.grade='B';
		}else if(student1.avg>=80) {
			student1.grade='C';
		}else if(student1.avg>=80) {
			student1.grade='D';
		}else {
			student1.grade='F';
		}
		/*
		 * 학생데이타출력2명
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				student1.no,student1.name,
				student1.kor,student1.eng,
				student1.math,student1.tot,
				student1.avg,student1.grade,
				student1.rank);
		
	}

}
