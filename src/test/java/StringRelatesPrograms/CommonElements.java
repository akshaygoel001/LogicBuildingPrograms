package StringRelatesPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n1=sc.nextInt();
		int i=0;
		List<Integer> arr1=new ArrayList<Integer>();
		while(i<n1) {
			arr1.add(sc.nextInt());
			i++;
		}
		int n2=sc.nextInt(); int j=0;
		List<Integer> arr2=new ArrayList<Integer>();
		while(j<n2) {
			arr2.add(sc.nextInt());
			j++;
		}
		//6 12 1 13 10 35 1
		//7 4 6 1 10 35 12
		System.out.println(arr1);
		System.out.println(arr2);
		Set<Integer> set=new HashSet<Integer>();
		for(int k=0;k<arr1.size();k++) {
			for(int l=0;l<arr2.size();l++) {
				if(arr1.get(k)==arr2.get(l)) {
					set.add(arr1.get(k));
				}
			}
			
		}
		System.out.println(set);
	}

}
