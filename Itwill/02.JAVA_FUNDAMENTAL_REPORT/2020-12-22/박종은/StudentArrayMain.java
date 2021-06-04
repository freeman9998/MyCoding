package study04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] std = {
				new Student(1,"AAA",64,34,34),
				new Student(2,"BBB",61,44,64),
				new Student(3,"CCC",74,24,94),
				new Student(4,"DDD",84,74,94),
				new Student(5,"EEE",94,94,84),
				new Student(6,"FFF",54,36,74),
				new Student(7,"GGG",44,84,36),
				new Student(8,"HHH",45,25,98),
				new Student(9,"III",65,37,65),
				new Student(10,"JJJ",73,75,14),
				new Student(11,"KKK",42,25,64),
				new Student(12,"LLL",35,74,63),
				new Student(13,"MMM",75,52,75),
				new Student(14,"NNN",15,64,78),
				new Student(15,"OOO",35,46,97),
		};
	

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (int i = 0; i < std.length; i++) {
			std[i].calculateTot();
			std[i].calculateAvg();
			std[i].calculateGrade();
		}
		

		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		int rank[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if (std[i].getTot() < std[j].getTot()) {
					rank[i]++;
				}
			}
			std[i].setRank(rank[i]);
		}
	
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headerprint();
		for (int i = 0; i < std.length; i++) {
			std[i].print();
		}
		
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		for (int i = 0; i < std.length; i++) {
			if (std[i].getNo() == 3) {
				std[i].print();
				break;
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		for (int i = 0; i < std.length; i++) {
			if (std[i].getGrade() == 'A') {
				std[i].print();
				
			}
		}
		

		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");
		for (int i = 0; i < std.length-1; i++) {
			for (int j = 0; j < std.length-1; j++) {
				if (std[j].getTot() > std[j+1].getTot()) {
					Student tempStd = new Student();
					
					tempStd = std[j];
					std[j] = std[j+1];
					std[j+1] = tempStd;
				}
			}
		}
		Student.headerprint();
		for (int i = 0; i < std.length; i++) {
			std[i].print();
		}
	
		/* 
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("7. 학생학점순으로 오름차순정렬");
		for (int i = 0; i < std.length-1; i++) {
			for (int j = 0; j < std.length-1; j++) {
				if (std[j].getGrade() > std[j+1].getGrade()) {
					Student tempStd = new Student();
					
					tempStd = std[j];
					std[j] = std[j+1];
					std[j+1] = tempStd;
				}
			}
		}
		Student.headerprint();
		for (int i = 0; i < std.length; i++) {
			std[i].print();
		}
		
	}
}