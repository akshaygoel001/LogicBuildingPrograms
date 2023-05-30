package StringRelatesPrograms;

import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		//String s="aabbccggaio";
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String new_string=in.nextLine();
		char chars[]=new_string.toCharArray();
		
		
		for(int i=0;i<chars.length;i++) {
			int count=1;
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j] && chars[i]!=' ') {
					count++;
					chars[j]='0';
				}
			}
			if(count>1 && chars[i]!='0') {
				System.out.println(chars[i]+"-->"+count);
			}
		}
		
		
	}
}
