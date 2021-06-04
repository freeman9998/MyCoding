
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("----학생데이타를 저장하기위한 배열객체생성 초기화---");
		int[] noArray={1,2,3,4,5,6,7,8,9,10};
		String[] nameArray= {"KIM","LEE","PARK","CHOI","SIM","GOO","PIM","MIN","AIM","LIM"};
		int[] kora= {34,56,12,89,91,67,88,93,67,99};
		int[] enga= {44,57,21,83,93,76,81,67,12,39};
		int[] matha= {90,56,34,67,23,88,99,78,55,80};
		int[] tota= {0,0,0,0,0,0,0,0,0,0};
		double[] avga= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradea= {'F','F','F','F','F','F','F','F','F','F'};
		int[] ranka= {1,1,1,1,1,1,1,1,1,1};
		
		/*
		 * 총점,평균,평점,계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			tota[i] = kora[i]+enga[i]+matha[i];
			avga[i] = tota[i]/3.0;
			if (avga[i] >= 90) {
				gradea[i] = 'A';
			}else if (avga[i] >=80) {
				gradea[i] = 'B';
			}else if (avga[i] >=70) {
				gradea[i] = 'C';
			}else if (avga[i] >=60) {
				gradea[i] = 'D';
			}else {
				gradea[i] = 'F';
			}
		}
		
		/*
		 * 석차계산
		 */
		System.out.println("석차계산");
		for (int i = 0; i < tota.length; i++) {
			for (int j = 0; j < tota.length; j++) {
				if (tota[i] < tota[j]) {
					ranka[i]++;
				}
			}
		}
		/*
		 * C학점 이하인 학생 모두 찾아서 여러명 정보출력
		 */
		System.out.println(">>F 학점 학생 모두 찾아서 여러명 정보출력");
		for (int i = 0; i < noArray.length; i++) {
			if (gradea[i]=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
				continue;
			}
		}
		
		/*
		 * 오름차순(내림차순) 정렬
		 */
		System.out.println(">>정렬");
		
		for (int i = 1; i < noArray.length; i++) {
		for (int j = 0; j < noArray.length-i; j++) {
			
			
			if (tota[j] > tota[j+1]) {
				//총점교환
				int temTot = tota[j];
				tota[j]=tota[j+1];
				tota[j+1]=temTot;
				//학번
				int tempNo = noArray[j];
				noArray[j]=noArray[j+1];
				noArray[j+1]=tempNo;
				//이름교환
				String tempName = nameArray[j];
				nameArray[j]=nameArray[j+1];
				nameArray[j+1]=tempName;
				//국어교환
				int tempKor = kora[j];
				kora[j] = kora[j+1];
				kora[j+1] = tempKor;
				//영어교환
				int tempEng = enga[j];
				enga[j] = enga[j+1];
				enga[j+1] = tempEng;
				//수학교환
				int tempMath = matha[j];
				matha[j] = matha[j+1];
				matha[j+1] = tempMath;
				//평균
				double tempAvg = avga[j];
				avga[j] = avga[j+1];
				avga[j+1] = tempAvg;
				//평점
				char tempGrade = gradea[j];
				gradea[j] = gradea[j+1];
				gradea[j+1] = tempGrade;
				//석차
				int tempRank = ranka[j];
				ranka[j] = ranka[j+1];
				ranka[j+1] = tempRank;
			}
		}
		}
		/*
		 * 전체학생 성적 출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
		}
	}

}
