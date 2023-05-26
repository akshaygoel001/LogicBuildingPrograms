package PatternsCode;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13...
		int first_num=1;
		int n=1;
		int prev_num=0;
		int next_num;
		System.out.print(prev_num+" , "+first_num);
		while (n<10) {
			
			next_num=prev_num+first_num;
			System.out.print(" , "+next_num);
			prev_num=first_num;
			first_num=next_num;
			
			n++;
		}
		
		
	}
}
