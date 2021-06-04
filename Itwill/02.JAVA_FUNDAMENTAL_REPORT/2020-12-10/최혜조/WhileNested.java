
public class WhileNested {

	public static void main(String[] args) {
		
		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		
	int i=0;
	while(i < 5) {
		int j = 0;
		while(j<5)
			{
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
		System.out.println("");
		i++;
		}
			System.out.println("2.----------------");
	/*
	 ☆★★★★
	 ★☆★★★
	 ★★☆★★
	 ★★★☆★
	 ★★★★☆
	 */
	
	i = 0;
	while(i<5) {
	  int j = 0;
	  while(j<5) {
		  if (i==j) {
			  System.out.print("☆");
		  }else {
			  System.out.print("★");
		  }
		  j++;
	  }
		System.out.println("");
		i++;
	}
		System.out.println("-----------------------------------------");
	/*
	 ☆☆☆☆☆
	 ★☆☆☆☆
	 ★★☆☆☆
	 ★★★☆☆
	 ★★★★☆
	 */
	
	i = 0;
	while (i<5) {
		int j = 0;
		while(j<5) {
			if (j<i) {
				System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
	System.out.println("-----------------------------------------");
	
	/*
	 ★
	 ★★
	 ★★★
	 ★★★★
	 ★★★★★
	 */	
	
	i = 0;
	while (i<5) {
		int j = 0;
		while (j<5) 
			{		
				if(j<=i) {
				System.out.print("★");
				} 
				j++;		
			}
			System.out.println();
			i++;
		}
	
	}

}

