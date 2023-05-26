package PatternsCode;

public class SquareStar {
	public static void main(String[] args) {
		for (int row = 1; row < 6; row++) {// rows
			for (int col = 1; col < 6; col++) {// columns
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
