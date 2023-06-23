package SeleniumTestersPrograms;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		System.out.println(a+ " , "+b);
		a=a+b;//7
		b=a-b;//5
		a=a-b;//2
		System.out.println(a+ " , "+b);
		
		String s1="abcd";
		int n1=s1.length();
		String s2="try";
		int n2=s2.length();
		System.out.println("Before Swap: s1:"+s1+", s2:"+s2);
		s1=s1+s2;
		s2=s1.substring(0,n1);
		s1=s1.substring(n2+1);

		System.out.println("After Swap: s1:"+s1+", s2:"+s2);
		
	}
}
