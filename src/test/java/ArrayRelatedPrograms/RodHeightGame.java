package ArrayRelatedPrograms;

public class RodHeightGame {

	public static void main(String[] args) {
		int[] arr= {2,5,4,1,1,3};
		int w=6;
		int alex=0;
		int bob=0;
		
		for(int i=0;i<arr.length;i=i+2) {
			alex=alex+arr[i];//1, 1+
			bob=bob+arr[i+1];//2
			System.out.println(alex+" , "+bob);
			if(alex>w) {
				System.out.println("Alex wins");
				break;
			}
			else if(bob>w) {
				System.out.println("Bob wins");
				break;
			}
			else if(alex==bob){
				System.out.println(alex+" , "+bob);
				System.out.println("-1");
				break;
			}
			
		}
	}
}
