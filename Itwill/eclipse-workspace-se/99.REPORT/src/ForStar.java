
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
		
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("4.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("★",i,j);
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
			for (int j = 0; j < 5-i; j++) {
				System.out.printf("★",i,j);
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
		

	}

}
