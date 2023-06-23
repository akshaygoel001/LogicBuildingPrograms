package SeleniumTestersPrograms;

import java.util.HashSet;
import java.util.Set;

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
		
	}
}
