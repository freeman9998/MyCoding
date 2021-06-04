
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("-----학생데이터를 저장하기 위한 배열객체생성 초기화-----");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "GOO", "PIM", "MIN", "AIM", "LIM" };
		int[] kora = { 34, 56, 78, 90, 39, 10, 47, 83, 77, 30 };
		int[] enga = { 34, 56, 78, 90, 39, 10, 47, 83, 77, 30 };
		int[] matha = { 34, 56, 78, 90, 39, 10, 47, 83, 77, 30 };
		int[] tota = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avga = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradea = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] ranka = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점, 평균, 평점, 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			tota[i] = kora[i] + enga[i] + matha[i];
			avga[i] = tota[i] / 3.0;
			if (avga[i] >= 90) {
				gradea[i] = 'A';
			} else if (avga[i] >= 80) {
				gradea[i] = 'B';
			} else if (avga[i] >= 70) {
				gradea[i] = 'C';
			} else if (avga[i] >= 60) {
				gradea[i] = 'D';
			} else {
				gradea[i] = 'F';
			}
		}

		/*
		 * Quiz: 석차계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < noArray.length; j++) {
				if (avga[i] < avga[j]) {
					ranka[i]++;
				}
			}
		}

		/*
		 * 3번학생 찾아서 1명 정보출력
		 */
		System.out.println(">>3번학생 찾아서 1명 정보출력(학생번호는 중복되지 않는다.)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", noArray[i], nameArray[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
				break;
			}
		}

		/*
		 * F학점 학생 모두 찾아서 여러명 정보출력
		 */
		System.out.println(">>F학점 학생 모두 찾아서 여러명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (gradea[i] == 'F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", noArray[i], nameArray[i], kora[i], enga[i],
						matha[i], tota[i], avga[i], gradea[i], ranka[i]);
			}
		}

		/*
		 * Quiz: 오름차순(내림차순) 정렬
		 */
		for (int j = 1; j < ranka.length; j++) {
			for (int i = 0; i < ranka.length - j; i++) {
				if (tota[i] > tota[i + 1]) {
					// 총점교환
					int tempTot = tota[i];
					tota[i] = tota[i + 1];
					tota[i + 1] = tempTot;

					// 학번교환
					int tempNo = noArray[i];
					noArray[i] = noArray[i + 1];
					noArray[i + 1] = tempNo;

					// 이름교환
					String tempName = nameArray[i];
					nameArray[i] = nameArray[i + 1];
					nameArray[i + 1] = tempName;

					// 국어교환
					int tempKor = kora[i];
					kora[i] = kora[i + 1];
					kora[i + 1] = tempKor;

					// 영어교환
					int tempEng = enga[i];
					enga[i] = enga[i + 1];
					enga[i + 1] = tempEng;

					// 수학교환
					int tempMath = matha[i];
					matha[i] = matha[i + 1];
					matha[i + 1] = tempMath;

					// 평균교환
					double tempAvg = avga[i];
					avga[i] = avga[i + 1];
					avga[i + 1] = tempAvg;

					// 평점교환
					char tempGrade = gradea[i];
					gradea[i] = gradea[i + 1];
					gradea[i + 1] = tempGrade;

					// 석차교환
					int tempRank = ranka[i];
					ranka[i] = ranka[i + 1];
					ranka[i + 1] = tempRank;
				}
			}
		}

		/*
		 * 전체 학생 성적출력
		 */
		System.out.printf("-----학생 성적출력-----\n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------\n");

		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", noArray[i], nameArray[i], kora[i], enga[i],
					matha[i], tota[i], avga[i], gradea[i], ranka[i]);
		}

	}

}
