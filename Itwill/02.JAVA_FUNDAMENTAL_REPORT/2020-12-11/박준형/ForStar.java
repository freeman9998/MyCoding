
public class ForStar {

	public static void main(String[] args) {
		System.out.println("------------------------");
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
		System.out.println("-----------1.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("★");
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
		System.out.println("-----------2.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i!=j) {
					System.out.print("★");					
				}else {
					System.out.print("☆");
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
		System.out.println("-----------3.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>j) {
					System.out.print("★");					
				}else {
					System.out.print("☆");
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
		System.out.println("-----------4.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print("★");
				}else {
					System.out.print(" ");
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
		System.out.println("-----------5.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("★");
				}
			}
			System.out.print(" \n");
		}
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */
		System.out.println("-----------6.Star----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("★");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}

}
