package StringRelatesPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(i,sc.nextInt());
		}
		
		SecondLargestNumber sd=new SecondLargestNumber();
		
		sd.secondLargest(arr);
	}
	public void secondLargest(List<Integer> array) {
		System.out.println(array);
		Collections.sort(array);
		int size=array.size();
		System.out.println(array.get(size-2));
	}

}
