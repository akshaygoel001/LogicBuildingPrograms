package ArrayRelatedPrograms;

import java.util.ArrayList;
import java.util.List;

public class SubtractOperations {

	public static void main(String[] args) {
		int n=3;
		int[] a= {6,3,7};
		int[] b= {2,1,3};
		int count=0;
		solution(a,b,count);
		
	}
	static void solution(int[] a,int[] b,int count) {
		int c=a.length>b.length?a.length:b.length;
		
		List<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < c; i++) {
			if (a[i] >= b[i]) {
				//a[i]=a[i] - b[i];
				arr.add(a[i] - b[i]);
			}
		}
		
		//System.out.println(arr);
	}
}
