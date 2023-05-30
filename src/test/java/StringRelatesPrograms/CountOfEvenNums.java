package StringRelatesPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountOfEvenNums {
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list size:");
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String input = bufferedReader.readLine();
        //System.out.println(input);
		
		int n = sc.nextInt();
		
		System.out.println("n:" + n);
		int arr[] = new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
