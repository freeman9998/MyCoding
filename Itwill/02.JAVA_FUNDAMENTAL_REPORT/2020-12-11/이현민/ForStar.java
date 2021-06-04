
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
		System.out.println("2.------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<5; j++) {
				if (i==j) {
					System.out.print("☆");
				} else {
				System.out.print("★");
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
				if (i<=j) {
					System.out.print("☆");
				} else {
				System.out.print("★");
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
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i>=j) {
					System.out.print("★");
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
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j >0; j--) {
				if(i >= j) {
				System.out.print("★");
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
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
			System.out.print("\n");
		}
	}
}
