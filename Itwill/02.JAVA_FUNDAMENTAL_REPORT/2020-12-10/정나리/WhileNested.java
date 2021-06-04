package com.itwill00.variable;
public class WhileNested {

	public static void main(String[] args) {

		
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		*/
		
		int i = 0;
		
		while (i<5) {
			int j = 0;
			while(j<5) {
				System.out.print("★");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		System.out.println("==================");
		
		
		/*
		★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
		★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
		★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
		★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
		★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
		
		*/
		
	 	i = 0;
	 	
	 	while (i<5) {
			int j = 0;
			while(j<5) {
				System.out.printf("%s[%d,%d]", "★", i, j);
				j++;
			}
			System.out.println();
			i++;
		}
	 	
	 	System.out.println("==================");
	 	
	 	/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		 */
	 	
	 	
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
	 	
		System.out.println("==================");
		
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
				
				if(i > j) {
					System.out.print("★");	
				} else {					
					System.out.print("☆");	
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("==================");
		
		
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
			while(j<=5) {
				
				if(i >= j) {
					System.out.print("★");	
				} else {					
					System.out.print(" ");	
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}



