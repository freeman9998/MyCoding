public class WhileNested {

	public static void main(String[] args) {
		
		 	
	 	/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		int i=0;
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i<=j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
				j++;
			}
			i++;
			System.out.print("\n");			
		}
		System.out.print("\n");
		
	 	/*
		 ★____    
		 ★★___
		 ★★★__
		 ★★★★_
		 ★★★★★
		 */
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i>=j) {
					System.out.print("★");
				}else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}

}
