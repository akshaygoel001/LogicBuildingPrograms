package PatternsCode;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="Akshay";
		char[] chars=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		StringBuffer a = new StringBuffer("Software Testing Material");
		System.out.println(a.reverse());
		
	}
	

}
