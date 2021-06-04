package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 *학생객체 2명 생성
		 */
		Student student1;// 학생객체의 주소를 저장할 참조변수(student1) 선언
		Student student2;
		student1 = new Student();// 학생객체 힙 메모리에 생성된 주소값을 참조변수(student1)에 저장
		student2 = new Student();
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		/*
		 * 학생객체의 각 멤버필드에 맞는값 대입
		 */
		student1.no = 1;
		student1.name = "KIM";
		student1.kor = 34;
		student1.eng = 56;
		student1.math = 67;
		
		student2.no = 2;
		student2.name = "LEE";
		student2.kor = 34;
		student2.eng = 56;
		student2.math = 67;
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		/*
		 * 학생객체  멤버필드(국엉 영어 수학)값을 합하여 학생객체 멤버필드(tot)에 대입
		 */
		student1.tot = student1.kor + student1.eng + student1.math;
		student2.tot = student2.kor + student2.eng + student2.math;
		
		/*
		* 학생객체  멤버필드(tot)값을 사용 3.0 나눈값을  학생객체 멤버필드(avg)에 대입
		*/
		student1.avg = student1.tot / 3.0;
		student2.avg = student2.tot / 3.0;
		
		/*
		 *  if문을 이용하여 학생객체의 멤버필드(avg)값을 비교연산후 학생객체의 멤버필드(grade)값에 대입 
		 */
		if (student1.avg >= 90) {
			student1.grade = 'A';
		}else if (student1.avg >= 80){
			student1.grade = 'B';
		}else {
			student1.grade = 'c';
		}
		
		if (student2.avg >= 90) {
			student2.grade = 'A';
		}else if (student2.avg >= 80){
			student2.grade = 'B';
		}else {
			student2.grade = 'c';
		}
		
		/*
		 * 학생데이타출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n","학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",student1.no,student1.name
							,student1.kor,student1.eng,student1.math,student1.tot,student1.avg,student1.grade,student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",student2.no,student2.name
				,student2.kor,student2.eng,student2.math,student2.tot,student2.avg,student2.grade,student2.rank);
		
	}

}