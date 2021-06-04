package com.itwill04.array;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {	
		Student [] stArray = new Student[10];
		for(int i=0; i<stArray.length; i++) {
			stArray[i] = new Student();
		}
		stArray[0].setStudent(1, "KIM", 34, 46, 40, 0, 0.0, 'F', 1);
		stArray[1].setStudent(2, "LEE", 56, 55, 70, 0, 0.0, 'F', 1);
		stArray[2].setStudent(3, "PARK", 12, 21, 34, 0, 0.0, 'F', 1);
		stArray[3].setStudent(4, "CHOI", 78, 88, 97, 0, 0.0, 'F', 1);
		stArray[4].setStudent(5, "SIM", 62, 64, 44, 0, 0.0, 'F', 1);
		stArray[5].setStudent(6, "GOO", 34, 43, 34, 0, 0.0, 'F', 1);
		stArray[6].setStudent(7, "PIM", 65, 75, 66, 0, 0.0, 'F', 1);
		stArray[7].setStudent(8, "MIN", 72, 82, 76, 0, 0.0, 'F', 1);
		stArray[8].setStudent(9, "AIM", 45, 85, 95, 0, 0.0, 'F', 1);
		stArray[9].setStudent(10, "LIM", 100, 100, 100, 0, 0.0, 'F', 1);
		
		/*
		 * 총점,평균,평점,계산
		 */
		for(int i =0; i<stArray.length; i++) {
			stArray[i].total=stArray[i].kor+stArray[i].eng+stArray[i].math;
			stArray[i].avg=stArray[i].total/3.0;
			if(stArray[i].avg>=90) {
				stArray[i].score='A';
			}else if(stArray[i].avg>=80) {
				stArray[i].score='B';
			}else if(stArray[i].avg>=70) {
				stArray[i].score='C';
			}else if(stArray[i].avg>=60) {
				stArray[i].score='D';
			}else {
				stArray[i].score='F';
			}
		}
		/*
		 * Quiz석차계산
		 */
		for(int i=0; i<stArray.length; i++) {
			for(int j=0; j<stArray.length; j++) {
				if(stArray[i].total < stArray[j].total) {
					stArray[i].rank++;
				}
			}
		}
		/*
		 * 3번학생 찾아서 1명 정보출력(학생번호는 중복되지 않는다.)
		 */
		System.out.println(">>3번학생 찾아서 1명 정보출력(학생번호는 중복되지않는다.)");
		for(int i=0; i<stArray.length; i++) {
			if(stArray[i].num==3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",stArray[i].num,stArray[i].name,
						stArray[i].kor,stArray[i].eng,stArray[i].math,stArray[i].total,stArray[i].avg,stArray[i].score,stArray[i].rank);	
				break;
			}
		}
		/*
		 * F학점 이하인 학생 모두 찾아서 여러명 정보출력
		 */
		System.out.println(">>F학점을 찾아서 여러명 정보출력");	
		for(int i=0; i<stArray.length; i++) {
			if(stArray[i].score=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",stArray[i].num,stArray[i].name,
						stArray[i].kor,stArray[i].eng,stArray[i].math,stArray[i].total,stArray[i].avg,stArray[i].score,stArray[i].rank);	
			}
		}
		/*
		 * [Quiz]오름차순(내림차순)정렬
		 */
		System.out.println("----------------------------오름 차순----------------------------");
		//오름차순
		for(int i=0; i<stArray.length; i++) {
			for(int j=i+1; j<stArray.length; j++) {
				if(stArray[i].rank > stArray[j].rank) {
					Student stTemp = new Student();
					stTemp.setTempData(stArray[i]);
					stArray[i].setTempData(stArray[j]);
					stArray[j].setTempData(stTemp);
					
				}
			}
		}
		
		/*
		 * 전체 학생 성적출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
				"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for(int i=0; i<stArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",stArray[i].num,stArray[i].name,
					stArray[i].kor,stArray[i].eng,stArray[i].math,stArray[i].total,stArray[i].avg,stArray[i].score,stArray[i].rank);			
		}
		System.out.println("----------------------------내림 차순----------------------------");
		//내림차순
		for(int i=0; i<stArray.length; i++) {
			for(int j=i+1; j<stArray.length; j++) {
				if(stArray[i].rank < stArray[j].rank) {
					Student stTemp = new Student();
					stTemp.setTempData(stArray[i]);
					stArray[i].setTempData(stArray[j]);
					stArray[j].setTempData(stTemp);
					
				}
			}
		}
		
		/*
		 * 전체 학생 성적출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
				"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for(int i=0; i<stArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %2c %1d%n",stArray[i].num,stArray[i].name,
					stArray[i].kor,stArray[i].eng,stArray[i].math,stArray[i].total,stArray[i].avg,stArray[i].score,stArray[i].rank);			
		}
	}

}
