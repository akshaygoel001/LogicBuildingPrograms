package PatternsCode;

public class ComplexPatterns {
	public static void main(String[] args) {
		/*
		 * *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 */
		int n=9;

		if (n > (n / 2)) {
			for (int i = 1; i <= 5; i++) {// rows
				for (int j = 5; j >= i; j--) {// columns
					System.out.print("* ");
				}
				System.out.println();
			}
		} else {
			for (int row = 1; row <= 9; row++) {
				for (int col = 1; col <= row; col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	}

}
