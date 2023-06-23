package SeleniumTestersPrograms;

import java.util.Scanner;


//same for reverse integer
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		solution(start,end);
	}
	static void solution(int start,int end) {
		//int num=32123;
		for(int i=start;i<end;i++) {
			String sum="";
			int number=i;
			int num=i;
			while(num>0) {
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			if(sum.equalsIgnoreCase(String.valueOf(number))) {
				System.out.println(number+" is Palindrome");
			}
			//else {
				//System.out.println("Not Palindrome");
			//}
		}
		
	}
}
