package SeleniumTestersPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void checkPrime(int n) {
		int counter=0;
		for(int j=n;j>=1;j--) {
			if(n%j==0) {
				counter+=1;
			}
		}
		if(counter==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime");
		}
	}
	public void primeNumberCheck(){
		int num = 10,flag=0;
		boolean isPrime = true;
		for (int i=2;i<=num;i++){
			for (int j = 2; j <i; j++) {
				if (i % j == 0) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if (flag ==1){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		String primenum="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter end number :");
		int n=in.nextInt();
		checkPrime(n);
//		for(int i=1;i<n;i++) {
//			int counter=0;
//			for(int j=i;j>=1;j--) {
//				if(i%j==0) {
//					counter+=1;
//				}
//			}
//			if(counter==2) {
//				primenum=primenum+i+" ";
//			}
//		}
		System.out.println(primenum);
	}
}
