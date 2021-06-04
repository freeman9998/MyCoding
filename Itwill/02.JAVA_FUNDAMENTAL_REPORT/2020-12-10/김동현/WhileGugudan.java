package com.itwill00.variable.±èµ¿Çö;

public class WhileGugudan {

		public static void main(String[] args) {
			int i = 0;
			while(i< 9) {
				int j = 0;
					while(j < 8) {
						System.out.printf("%d*%d=%d\t",j+2,i+1,(j+2)*(i+1));
						j++;
					}
					System.out.println();
					i++;
			}
		}
}