
public class WhileNested {
	public static void main(String[] args) {
		/*
		 ¡Ú¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ú
		 ¡Ú¡Ú¡Ú¡Ú¡Ú	 
		 */

		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]","¡Ú",i,j);
				j++;
			}
			System.out.println();
			i++;

		}
		
		/*
		  ¡Ù¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ù¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ù¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ù¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ù
		 */ 
		  
		System.out.println("2.----------------------");
		
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
			System.out.printf("\n");
			i++;
			
			
		}

		  /*	 
		  ¡Ù¡Ù¡Ù¡Ù¡Ù
		  ¡Ú¡Ù¡Ù¡Ù¡Ù 
		  ¡Ú¡Ú¡Ù¡Ù¡Ù
		  ¡Ú¡Ú¡Ú¡Ù¡Ù
		  ¡Ú¡Ú¡Ú¡Ú¡Ù
		  */
		
		System.out.println("---------------------------");
		i=0;
		while(i<5) {
		int j=0;
			while(j<5) {
				if(i<=j) {
					
					System.out.print("¡Ù");
				}else {
					System.out.print("¡Ú");
					
				}
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		/*
		  ¡Ú
		  ¡Ú¡Ú
		  ¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		 */
		
		System.out.println("---------------------------");
		
		i=0;
		while(i<5) {
		int	j=0;
			while(i>=j) {
				System.out.print("¡Ú");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		
		
		
		
		
		

	}

}
