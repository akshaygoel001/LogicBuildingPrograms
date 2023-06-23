package ArrayRelatedPrograms;

public class RodHeightGame {

	public static void main(String[] args) {
		int[] arr= {1,2,4,3};
		int w=3;
		int alex=0;
		int bob=0;
		
		for(int i=0;i<arr.length;i++) {
			alex=alex+arr[i];
			bob=bob+arr[i+1];
			if(alex>3) {
				System.out.println("Alex wins");
				break;
			}
			else if(bob>3) {
				System.out.println("Bob wins");
				break;
			}
			else {
				System.out.println("-1");
				break;
			}
			
		}
	}
}
