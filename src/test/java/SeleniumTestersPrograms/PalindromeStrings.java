package SeleniumTestersPrograms;

public class PalindromeStrings {

	public static void main(String[] args) {
		String s="level";
		String reverseString="";
		for(int i=s.length()-1;i>=0;i--) {
			reverseString=reverseString+s.charAt(i);
		}
		if(s.equalsIgnoreCase(reverseString)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not Palindrome String");
		}
	}
}
