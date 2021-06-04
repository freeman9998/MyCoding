package com.itwill04.array;
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("----학생데이타를 저장하기위한 배열객체생성 초기화---");
		int[] noArr={1,2,3,4,5,6,7,8,9,10};
		String[] nameArr= {"KIM","LEE","PARK","CHOI","SIM","GOO","PIM","MIN","AIM","LIM"};
		int[] kora= {34,56,12,89,91,67,88,93,67,99};
		int[] enga= {44,57,21,83,93,76,81,67,12,39};
		int[] matha= {90,56,34,67,23,88,99,78,55,80};
		int[] tota= {0,0,0,0,0,0,0,0,0,0};
		double[] avga= {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradea= {'F','F','F','F','F','F','F','F','F','F'};
		int[] ranka= {1,1,1,1,1,1,1,1,1,1};
		

		
		
		for (int i = 0; i < noArr.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArr[i],nameArr[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
		}
		
		/*
		 * 총점,평균,평점 계산
		 */
		for(int i = 0 ; i < noArr.length; i++) {
			
			tota[i] = kora[i]+enga[i]+matha[i];
			avga[i] = tota[i]/3.0;
			
			if(avga[i] >= 90) {
				gradea[i] = 'A';
				}
			else if(avga[i] >= 80) {
				gradea[i] = 'B';
			}
			else if(avga[i] >= 70) {
				gradea[i] = 'C';
			}
			else if(avga[i] >= 60) {
				gradea[i] = 'D';
			}
			else {
				gradea[i] = 'F';
			}
		}
		
		
		/*
		 * 석차계산
		 */
		
		for(int i = 0 ; i < noArr.length; i++) {			
			for(int j = 0 ; j < noArr.length; j++) {
				if(avga[i] < avga[j]) { 
					//기준값과 비교값 중에 비교값이 더 크면 기준값의 순위가 낮은 것(높은 숫자).
					//기준값에 1 더해줌.
					ranka[i]++; //기준값은 i이기 때문에 rank의 i인덱스에 연산해준다.
				}
			}
		}
		
		
		/*
		 * 3번학생 찾아서 1명 정보출력
		 */
		System.out.println("3번 학생 1명 찾아서 출력");
		for(int i= 0 ; i < noArr.length; i++) {
			if(noArr[i] == 3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArr[i],nameArr[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
				break;
			}
		}
		
		/*
		 * F학점 학생 모두찾아서 여러명 정보출력
		 */
		System.out.println("F학점 학생 모두 찾아서 여러명 정보출력");
		
		for(int i= 0 ; i < noArr.length; i++) {
			if(gradea[i] == 'F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArr[i],nameArr[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
			}
		}
		
		
		/*
		 * 오름차순(내림차순)정렬 버블정렬
		 */
		
		for(int i = 0 ; i < noArr.length-1; i++) {//인덱스 두개를 비교해서
			int intt = 0;
			String stringt = "";
			char cat = 0;
			double avgt = 0; //교환에 사용할 빈 변수
			
			for(int j = i+1 ; j < noArr.length ; j++) {
			
				if(ranka[i] > ranka[j]){ //i인덱스와 j인덱스를 비교해서 j가 크면 i로 옮긴다
					
					intt = noArr[j];
					noArr[j] = noArr[i];
					noArr[i]= intt; //학생 번호 교환
					
					intt = kora[j];
					kora[j] = kora[i];
					kora[i]= intt; //학생 국어성적 교환
					
					intt = enga[j];
					enga[j] = enga[i];
					enga[i]= intt; //학생 영어성적 교환
					
					intt = matha[j];
					matha[j] = matha[i];
					matha[i]= intt; //학생 수학성적 교환
					
					intt = tota[j];
					tota[j] = tota[i];
					tota[i]= intt; //학생 총점 교환
					
					avgt = avga[j];
					avga[j] = avga[i];
					avga[i]= avgt; //학생 평균 교환
					
					cat = gradea[j];
					gradea[j] = gradea[i];
					gradea[i]= cat; //학생 평점 교환
					
					stringt = nameArr[j];
					nameArr[j] = nameArr[i];
					nameArr[i]= stringt; //학생 이름 교환
					
					
					intt = ranka[j];
					ranka[j] = ranka[i];
					ranka[i]= intt; //학생 등수 교환
				}
			}
		
		}
		
		
		System.out.printf("------------오름차순 학생 성적출력-------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArr.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArr[i],nameArr[i],kora[i],enga[i],matha[i],tota[i],avga[i],gradea[i],ranka[i]);
		}
		
	}

}