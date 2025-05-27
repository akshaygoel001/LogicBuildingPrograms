package SeleniumTestersPrograms;

import java.util.*;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		int[] n= {0,0,2,5,7,1,1,3};
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					set.add(n[i]);
				}
			}
		}
		System.out.println(set);
		//alterntive approach
		int[] n1= {0,0,2,5,7,1,1,3,3};
		Set<Integer> set1=new HashSet<Integer>();
		for (int i = 0 ;i<n1.length ; i++){
			if (!set1.add(n1[i])){
				System.out.print(n1[i]+" ");
			}
		}
		System.out.println();
		List<Integer> list = new ArrayList<>(Arrays.asList(0,0,2,5,7,1,1,3,3));
		System.out.println(new ArrayList<>(new HashSet<>(list)));
	}
}
