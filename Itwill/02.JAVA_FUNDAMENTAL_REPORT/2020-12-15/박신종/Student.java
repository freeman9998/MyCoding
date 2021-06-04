package report1215;

/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 *  - 캡슐화
 */
public class Student {

	/*
	 * << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능 >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	public int no;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int tot;
	public double avg;
	public char grade;
	public int rank;
	
	// 멤버메쏘드 선언
	public void defaultInfo(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void total() {
		this.tot = this.kor + this.eng + this.math;
	}

	public void avg() {
		this.avg = this.tot / 3;
	}
	
	public void grade() {
		if (this.avg >= 90) {
			this.grade = 'A';
		} else if (this.avg >= 80) {
			this.grade = 'B';
		} else if (this.avg >= 70) {
			this.grade = 'C';
		} else if (this.avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}
	
	public void printStudentData() {
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}
	
	
	
	
	
}