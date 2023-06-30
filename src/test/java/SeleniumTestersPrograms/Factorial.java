package SeleniumTestersPrograms;

public class Factorial {
	
	//5! = 1x2x3x4x5
	public static void main(String[] args) {
		
		int n=5;
		//withLoop(n);
		
		withOutLoop(n);
		
	}
	static void withLoop(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n=n-1;
		}
		System.out.println(fact);
	}
	static void withOutLoop(int n) {
		int fact=1;
		if(n>0) {
			n=n-1;
			System.out.println(fact);
			withOutLoop(fact*n);
			
		}
		
	}

}
