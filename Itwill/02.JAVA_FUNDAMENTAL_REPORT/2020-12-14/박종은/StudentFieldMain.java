package itwill01;

public class StudentFieldMain {

	public static void main(String[] args) {
	
		/*
		 *학생객체 2명 생성
		 */
		Student std1 = new Student();
		Student std2 = new Student();
		
		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		std1.no = 1;
		std1.name = "KIM";
		std1.kor = 34;
		std1.eng = 56;
		std1.math = 67;
		
		std2.no = 2;
		std2.name = "KIM";
		std2.kor = 34;
		std2.eng = 56;
		std2.math = 67;
		
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		std1.tot = std1.kor + std1.eng + std1.math;
		std2.tot = std2.kor + std2.eng + std2.math;
		
		std1.avg = std1.tot/3.0;
		std2.avg = std2.tot/3.0;
		
		if(std1.avg >= 90) {
			std1.sco = 'A';
		}else if(std1.avg >= 80) {
			std1.sco = 'B';
		}else if(std1.avg >= 70) {
			std1.sco = 'C';
		}else if(std1.avg >= 60) {
			std1.sco = 'D';
		}else{
			std1.sco = 'F';
		}
		
		if(std2.avg >= 90) {
			std2.sco = 'A';
		}else if(std2.avg >= 80) {
			std2.sco = 'B';
		}else if(std2.avg >= 70) {
			std2.sco = 'C';
		}else if(std2.avg >= 60) {
			std2.sco = 'D';
		}else{
			std2.sco = 'F';
		}
			
		
		/*
		 * 학생데이타출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", std1.no, std1.name, std1.kor, std1.eng, std1.math, std1.tot, std1.avg, std1.sco, std1.ran);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", std2.no, std2.name, std2.kor, std2.eng, std2.math, std2.tot, std2.avg, std2.sco, std2.ran);

	}

}
