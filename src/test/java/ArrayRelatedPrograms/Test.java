package ArrayRelatedPrograms;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static int count = 0;
	public static int countm = 0;

	public static void main(String[] args) {
		int A[] = {7,12,100,6,200};
		int B[] =  {1,1,1,1,1};
		int countr = cal1(A, B);
		System.out.print(countr);
	}
	public static int cal1(int A[], int B[]) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			arr.add(A[i]);
		}
		for(int i=0;i<B.length;i++) {
			arr2.add(B[i]);
		}
		System.out.println(arr+ ", "+ arr2);
		for (int i = 0; i <= B.length - 1; i++) {
			if (A[i] >= B[i]) {
				count++;
				A[i] = A[i] - B[i];
			}
		}
		if (count == A.length) {
			countm++;
			count = 0;
			cal1(A, B);
		}
		return countm;
	}
}
