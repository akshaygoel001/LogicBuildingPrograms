package PatternsCode;

public class LeftTriangleNumber {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {// rows
			for (int col = 1; col <= row; col++) {// columns
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
