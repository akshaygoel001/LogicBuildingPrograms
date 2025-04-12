package PatternsCode;

public class LeftInvertTriangle {

	// Left Inverted Triangle
	// 1 2 3 4 5
	// 6 7 8 9
	// 10 11 12
	// 13 14
	// 15
	public static void main(String[] args) {
		int num = 1;
		for (int row = 1; row <= 5; row++) {// rows
			for (int col = 1; col <= 5-row+1; col++) {// columns
				System.out.print(num+" ");
				num++;
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
