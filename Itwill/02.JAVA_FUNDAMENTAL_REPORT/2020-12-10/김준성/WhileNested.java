
public class WhileNested {

	public static void main(String[] args) {
		/*
		 * ★☆
		 */
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]", "★", i, j);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("------------------------------");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i == j) {
					System.out.printf("☆");
				} else {
					System.out.printf("★");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("------------------------------");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i <= j) {
					System.out.printf("☆");
				} else {
					System.out.printf("★");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("------------------------------");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i < j) {
					System.out.printf(" ");
				} else {
					System.out.printf("★");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
