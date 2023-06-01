package StringRelatesPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		System.out.println("Enter list:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> uniquelist=new ArrayList<Integer>();
		int i=0;
		while(i<n) {
			list.add(sc.nextInt());
			i++;
		}
		int count;
		//6 12 1 13 10 35 1
		//6 1 1 1 10 35 1
		System.out.println(list);
		for(int j=0;j<list.size();j++) {
			int a=list.get(j);
			count=1;
			for(int k=j+1;k<list.size();k++) {
				if(a==list.get(k)) {
					count++;
					//list.remove(k);
				}
			}
			if(count==1) {
				uniquelist.add(list.get(j));
			}
			
			/*
			 * if(count>1) { System.out.println(count+" , "+j+" , "+list.get(j));
			 * list.remove(j); }
			 */
			
		}
        //Set<Integer> s = new LinkedHashSet<Integer>(list);  

		System.out.println(uniquelist);
		

	}

}
