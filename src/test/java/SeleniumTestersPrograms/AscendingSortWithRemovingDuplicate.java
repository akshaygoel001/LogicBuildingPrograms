package SeleniumTestersPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingSortWithRemovingDuplicate {

	public static void main(String[] args) {
		//99 11 21 5 11 20 20 3
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		//first step - remove duplicate
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i)==list.get(j)) {
					list.remove(i);
					//second step - sorting
					Collections.sort(list);
				}
			}
		}
		System.out.println(list);
	}
}
