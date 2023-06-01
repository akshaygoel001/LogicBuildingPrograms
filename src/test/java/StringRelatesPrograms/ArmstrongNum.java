package StringRelatesPrograms;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		ArmstrongNum arm=new ArmstrongNum();
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arm.checkArmstrong(n);
	}
	
	public void checkArmstrong(int num) {
		int rem=0;
		int result=0;
		int n=num;

		while (num !=0) {
			rem = num % 10;
			result = result + ((int)Math.pow(rem, 3));
			num = num / 10;
		}
		if(n==result) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not a ArmStrong Number");
		}
		
	}

}
