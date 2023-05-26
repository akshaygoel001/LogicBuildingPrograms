package PatternsCode;

public class PyramidStarPattern {
	public static void main(String[] args) {
/*	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * *   */
		for (int row = 0; row < 5; row++) {// rows
			for (int col = (5-row); col >1; col--) {// columns
				System.out.print(" ");
			}
			for(int col=0;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
