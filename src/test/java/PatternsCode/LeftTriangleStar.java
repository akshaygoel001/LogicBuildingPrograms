package PatternsCode;

public class LeftTriangleStar {
	public static void main(String[] args) {
		for (int row = 1; row < 6; row++) {// rows
			for (int col = 1; col <= row; col++) {// columns
				System.out.print("* ");
			}
			System.out.println();
		}
		//alternate way
		int num = 1;
		for (int row = 1; row < 6; row++) {// rows
			for (int col = 1; col < row; col++) {// columns
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
