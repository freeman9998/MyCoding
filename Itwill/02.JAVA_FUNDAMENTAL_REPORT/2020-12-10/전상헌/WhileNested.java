
public class WhileNested {
	public static void main(String[] args) {
		/*
		 �ڡڡڡڡ�
		 �ڡڡڡڡ�
		 �ڡڡڡڡ�
		 �ڡڡڡڡ�
		 �ڡڡڡڡ�	 
		 */

		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]","��",i,j);
				j++;
			}
			System.out.println();
			i++;

		}
		
		/*
		  �١ڡڡڡ�
		  �ڡ١ڡڡ�
		  �ڡڡ١ڡ�
		  �ڡڡڡ١�
		  �ڡڡڡڡ�
		 */ 
		  
		System.out.println("2.----------------------");
		
		i=0;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("��");
				}else {
					System.out.print("��");
				}
				j++;
			}
			System.out.printf("\n");
			i++;
			
			
		}

		  /*	 
		  �١١١١�
		  �ڡ١١١� 
		  �ڡڡ١١�
		  �ڡڡڡ١�
		  �ڡڡڡڡ�
		  */
		
		System.out.println("---------------------------");
		i=0;
		while(i<5) {
		int j=0;
			while(j<5) {
				if(i<=j) {
					
					System.out.print("��");
				}else {
					System.out.print("��");
					
				}
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		/*
		  ��
		  �ڡ�
		  �ڡڡ�
		  �ڡڡڡ�
		  �ڡڡڡڡ�
		 */
		
		System.out.println("---------------------------");
		
		i=0;
		while(i<5) {
		int	j=0;
			while(i>=j) {
				System.out.print("��");
				j++;
			}
			System.out.println();
			i++;
			
		}
		
		
		
		
		
		
		

	}

}
