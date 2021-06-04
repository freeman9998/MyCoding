public class ForStar {

	public static void main(String[] args) {
		System.out.println("1.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("★[%d,%d]",i,j);
			}
			System.out.print("\n");
		}
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0;j<5; j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		
		
		
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		System.out.println("----------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					System.out.print("☆");
					continue;
				}
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		System.out.println("----------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j =0 ; j <5 ; j++) {
				if(i>j) {
					System.out.print("★");
					continue;
				}
				System.out.print("☆");
			}
			System.out.println();
		}

		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<= i; j++) {
				System.out.print("★");	
			}
			System.out.println();
			
		}

		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		System.out.println("---------------------");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				if(i>j) {
					System.out.print("★");
					continue;
				}
					System.out.print(" ");
				
			}
			System.out.println();
			
		}		
		/*
0		★★★★★
i1 j0	 ★★★★
i2 j0 j1  ★★★
		   ★★
		    ★
		 */
		System.out.println("---------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i>j) {
					System.out.print(" ");
					continue;
				
				}
				System.out.print("★");
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		

	}

}