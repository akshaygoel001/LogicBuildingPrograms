package SeleniumTestersPrograms;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		
		int[] n= {99,-1,20,5,7,10,4,3};
		int max=n[0];
		int min=n[1];
		for(int i=0;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
			}
			if(n[i]<min) {
				min=n[i];
			}
		}
		System.out.println(max+" , "+min);
	}
}
