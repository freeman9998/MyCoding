public class ForStar {

	public static void main(String[] args) {
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		System.out.println("1.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("★[%d,%d]",i,j);
			}
			System.out.print("\n");
		}
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		System.out.println("2.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j==i) {
					System.out.printf("☆");					
				} else {
					System.out.printf("★");
				}
			}
			System.out.print("\n");
		}
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		System.out.println("3.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j>=i) {
					System.out.printf("☆");					
				} else {
					System.out.printf("★");
				}
			}
			System.out.print("\n");
		}
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("4.------------------------");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (j>=i) {
					System.out.printf(" ");					
				} else {
					System.out.printf("★");
				}
			}
			System.out.print("\n");
		}
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		System.out.println("5.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (j>=i) {
					System.out.printf("★");					
				} else {
					System.out.printf(" ");
				}
			}
			System.out.print("\n");
		}
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */
		System.out.println("6.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j>=i) {
					System.out.printf("★");					
				} else {
					System.out.printf(" ");
				}
			}
			System.out.print("\n");
		}

	}

}
