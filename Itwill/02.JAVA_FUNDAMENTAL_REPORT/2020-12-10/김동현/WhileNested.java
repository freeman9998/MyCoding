package com.itwill00.variable.±èµ¿Çö;

public class WhileNested {

	public static void main(String[] args) {
		/*
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		
		¡Ú[0,0]¡Ú[0,1]¡Ú[0,2]¡Ú[0,3]¡Ú[0,4]
		¡Ú[1,0]¡Ú[1,1]¡Ú[1,2]¡Ú[1,3]¡Ú[1,4]
		¡Ú[2,0]¡Ú[2,1]¡Ú[2,2]¡Ú[2,3]¡Ú[2,4]
		¡Ú[3,0]¡Ú[3,1]¡Ú[3,2]¡Ú[3,3]¡Ú[3,4]
		¡Ú[4,0]¡Ú[4,1]¡Ú[4,2]¡Ú[4,3]¡Ú[4,4]
		*/
	 	int i=0;
	 	while(i<5) {
	 		int j=0;
	 		while(j< 5) {
	 			System.out.printf("%s[%d,%d]","¡Ú",i,j);
		 		j++;
	 		}
	 		System.out.println();
	 		i++;
	 	}
	 	System.out.println("-----------------------------");
	 	/*
		 ¡Ù¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ù¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ù¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ù¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ù
		 */
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("¡Ù");
				}else {
					System.out.print("¡Ú");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
	 	
		System.out.println("-----------------------------");
	 	/*
		 ¡Ù¡Ù¡Ù¡Ù¡Ù
		 ¡Ú¡Ù¡Ù¡Ù¡Ù
		 ¡Ú¡Ú¡Ù¡Ù¡Ù
		 ¡Ú¡Ú¡Ú¡Ù¡Ù
		 ¡Ú¡Ú¡Ú¡Ú¡Ù
		 */
		i = 0;
		while(i<5) {
			int j = 0;
			while( j < 5) {
			if(j >= i) {
				System.out.print("¡Ù");
			}else {
				System.out.print("¡Ú");
			 }
			 j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("-----------------------------");
		
	 	/*
		 ¡Ú
		 ¡Ú¡Ú
		 ¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ú
		 */
		i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				if(j > i) {
					System.out.print("");
				}else {
					System.out.print("¡Ú");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}