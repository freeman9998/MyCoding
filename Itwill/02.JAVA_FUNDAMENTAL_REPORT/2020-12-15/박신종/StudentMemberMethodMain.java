package report1215;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.defaultInfo(1, "홍길동", 95, 90, 85);
		student2.defaultInfo(2, "이순신", 90, 85, 80);
		student3.defaultInfo(3, "강감찬", 85, 80, 75);
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.total();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		
	}

}