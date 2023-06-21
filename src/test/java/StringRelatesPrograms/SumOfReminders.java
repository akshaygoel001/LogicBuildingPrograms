package StringRelatesPrograms;

import java.util.Scanner;

public class SumOfReminders {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int n=sc.nextInt();
		solution(s1,n);//abaaccddab
	}
	public static void solution(String s1,int n) {
		  int[] counter = new int[256];
		    //String s = "aaabbbcccc";
		    for(int i = 0; i < s1.length(); i++){
		       // System.out.println("Before :"+counter[s1.charAt(i)]+" ,s1.charAt(i) : "+s1.charAt(i));
		        counter[s1.charAt(i)]=counter[s1.charAt(i)]+1;
		       // System.out.println("After :"+counter[s1.charAt(i)]);
		        
		    }
		    int sum=0;
		    int rem=0;
			for (int i = 0; i < counter.length; i++) {
				if (counter[i] > 0) {
					System.out.println(((char) i) + " occurs " + counter[i] + " times");
					rem=counter[i]%n;
					sum=sum+rem;
					System.out.println("rem: "+rem);

				}
				
			}
			System.out.println(sum);
		        
		//return 0;
	}

}
