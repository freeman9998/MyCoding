package com.itwill00.variable.김동현;

/*
 6. 내림차순 정렬
 * 
 * 전체 학생 성적출력
 */
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		// 1. 학생데이타를 저장하기 위한배열객체 생성 초기화
		int[] noArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArr = { "Ga", "Na", "Da", "Ra", "Ma", "Ba", "Sa", "Aa", "Ja", "Ka" };
		int[] korA = { 12, 34, 56, 78, 91, 23, 45, 67, 89, 99 };
		int[] engA = { 99, 98, 76, 54, 32, 19, 87, 65, 45, 32 };
		int[] mathA = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };
		int[] totA = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgA = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeA = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankA = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		// 2. 총점,평균,평점 계산
		for (int i = 0; i < noArr.length; i++) {
			totA[i] = korA[i] + engA[i] + mathA[i];
			avgA[i] = totA[i] / 3;
			if (avgA[i] >= 90) {
				gradeA[i] = 'A';
			} else if (avgA[i] >= 80) {
				gradeA[i] = 'B';
			} else if (avgA[i] >= 70) {
				gradeA[i] = 'C';
			} else if (avgA[i] >= 60) {
				gradeA[i] = 'D';
			} else {
				gradeA[i] = 'F';
			}
		}

		// 3. 석차계산
		for (int i = 0; i < noArr.length; i++) {
			for (int j = 0; j < noArr.length; j++) {
				if (avgA[i] < avgA[j]) {
					rankA[i]++;
				}
			}
		}
		// 4. 1,4번학생 찾아서 2명의 정보출력
		System.out.println("1,4번학생 찾아서 2명의 정보출력");
		for (int i = 0; i < noArr.length; i++) {
			if (noArr[i] == 1 | noArr[i] == 4) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", noArr[i], nameArr[i], korA[i], engA[i],
						mathA[i], totA[i], avgA[i], gradeA[i], rankA[i]);
				continue;
			}
		}
		// 5. C학점 학생 모두 찾아서 여러명 정보출력
		System.out.println("C학점 학생 모두 찾아서 여러명 정보출력");

		for (int i = 0; i < noArr.length; i++) {
			if (gradeA[i] == 'C') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", noArr[i], nameArr[i], korA[i], engA[i],
						mathA[i], totA[i], avgA[i], gradeA[i], rankA[i]);
			}
		}

		// 6. 내림차순 정렬
		for (int j = 1; j < rankA.length; j++) {
			for (int i = 0; i < rankA.length - j; i++) {
				if (totA[i] > totA[i + 1]) {
					// 총점교환
					int tempTot = totA[i];
					totA[i] = totA[i + 1];
					totA[i + 1] = tempTot;
					// 학번교환
					int tempNo = noArr[i];
					noArr[i] = noArr[i + 1];
					noArr[i + 1] = tempNo;
					// 이름교환
					String tempName = nameArr[i];
					nameArr[i] = nameArr[i + 1];
					nameArr[i + 1] = tempName;
					// 국어교환
					int tempKor = korA[i];
					korA[i] = korA[i + 1];
					korA[i + 1] = tempKor;
					// 영어교환
					int tempEng = engA[i];
					engA[i] = engA[i + 1];
					engA[i + 1] = tempEng;
					// 수학교환
					int tempMath = mathA[i];
					mathA[i] = mathA[i + 1];
					mathA[i + 1] = tempMath;
					// 평균교환
					double tempAvg = avgA[i];
					avgA[i] = avgA[i + 1];
					avgA[i + 1] = tempAvg;
					// 평점교환
					char tempGrade = gradeA[i];
					gradeA[i] = gradeA[i + 1];
					gradeA[i + 1] = tempGrade;
					// 석차교환
					int tempRank = rankA[i];
					rankA[i] = rankA[i + 1];
					rankA[i + 1] = tempRank;
				}
			}
		}
		// 7. 학생 정보 전체 출력
		System.out.printf("-----학생 성적출력----\n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-------------------\n");

		for (int i = 0; i < noArr.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", noArr[i], nameArr[i], korA[i], engA[i],
					mathA[i], totA[i], avgA[i], gradeA[i], rankA[i]);
		}

	}

}
