package Student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		/*
		 * 0.학생객체추가
		 */
		 Student newst = new Student(10,"PARK",99,99,99);
		 studentService.addStudent(newst);
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calculateRank();
		/*
		 * 3. 전체학생반환
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();

		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		studentService.findByNo(3);
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		Student[] gradeStudent = studentService.findByGrade('A');
		/*
		 *
		 * 6. 이름KIM 인 학생들 반환
		 */
		System.out.println("6.  이름KIM 인 학생들 반환");
		Student[] nameStudnet = studentService.findByName("KIM");
		/*
		 * 7. 학생석차로 오름차순정렬
		 */
		System.out.println("7. 학생석차로 오름차순정렬");
		studentService.sortAsc(studentService.FIELD_RANK,studentService.SORT_ASC);
		studentService.print();
	}

}