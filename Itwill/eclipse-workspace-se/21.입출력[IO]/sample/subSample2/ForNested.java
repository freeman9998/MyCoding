
public class ForNested {

	public static void main(String[] args) {
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		System.out.println("----------nested while---------");
		int k=0;
		while(k<5) {
			int l=0;
			while(l<5) {
				System.out.printf("★[%d,%d]",k,l);
				l++;
			}
			System.out.print("\n");
			k++;
		}
		System.out.println("1.----------nested for---------");
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
		System.out.println("2.--------- for---------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					System.out.print("☆");
				}else {
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
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		/*
		★★★★★
		 ★★★★
		  ★★★
		   ★★
		    ★
		 */

	}

}
