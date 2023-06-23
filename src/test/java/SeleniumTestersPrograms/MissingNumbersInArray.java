package SeleniumTestersPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<size;i++) {
			int n=sc.nextInt();
			list.add(n);
		}
		Collections.sort(list);
		int max=list.get(list.size()-1);
		for(int i=0;i<max;i++) {
			for(int j=0;j<list.size();j++) {
				if(!list.contains(i)) {
					set.add(i);
				}
			}
		}
		System.out.println(set);
	}
}
