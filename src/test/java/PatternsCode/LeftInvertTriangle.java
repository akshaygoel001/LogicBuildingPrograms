package PatternsCode;

public class LeftInvertTriangle {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {// rows
			for (int col = 1; col <= 5-row+1; col++) {// columns
				System.out.print("* ");
			}
			System.out.println();
		}
		//alternate way
		for (int row = 1; row <= 5; row++) {// rows
			for (int col = 5; col >= row; col--) {// columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
