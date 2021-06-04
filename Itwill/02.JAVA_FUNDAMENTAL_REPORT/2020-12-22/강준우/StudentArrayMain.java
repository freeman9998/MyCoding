package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		Student[] students= {
				new Student(1111, "Kang", 100, 100, 100),
				new Student(2222, "Sang", 34, 42, 56),
				new Student(3333, "Wang", 64, 56, 65),
				new Student(4444, "Aang", 24, 45, 32),
				new Student(5555, "Yang", 74, 64, 17),
				new Student(6666, "Wang", 44, 42, 93),
				new Student(7777, "Zang", 34, 12, 86),
				new Student(8888, "Nang", 54, 62, 32),
				new Student(9999, "Vang", 94, 42, 32),
		};

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		for (int i = 0;  i < students.length; i++) {
			students[i].setTot();
			students[i].setAvg();
			students[i].setGrade();
		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		int rank=1;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[i].getTot()<students[j+1].getTot()) {
					rank++;
					students[i].setRank(rank);
				}
			}
		}
		
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println("4.번호3번 학생한명 출력  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3333) {
				students[i].print();
				break;
			}
		}
		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println("5. 학점A인 학생들 출력");
		for (int  i= 0;  i< students.length; i++) {
			if(students[i].getGrade()=='A') {
				students[i].print();
			}
		}


		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println("6. 학생총점으로 오름차순정렬");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getTot()>students[j+1].getTot()) {
					Student trans=students[j];
					students[j]=students[j+1];
					students[j+1]=trans;
				}	 
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println("7. 학생학점순으로 오름차순정렬");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getAvg()>students[j+1].getAvg()) {
					Student trans = students[j];
					students[j] = students[j+1];
					students[j+1]= trans;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}

	}
}
