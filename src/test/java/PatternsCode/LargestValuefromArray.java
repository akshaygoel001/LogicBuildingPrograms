package PatternsCode;

public class LargestValuefromArray {

	public static void main(String[] args) {
		
		int[] arr={2,3,150,9,17,40,23,2};
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(max<arr[i+1]) {
				max=arr[i+1];
			}
		}
		System.out.println(max);
	}
}
