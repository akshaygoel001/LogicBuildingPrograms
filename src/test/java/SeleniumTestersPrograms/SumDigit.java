package SeleniumTestersPrograms;

public class SumDigit {
  	public static void main(String[] args) {
    int sum=0;
	int n=10;
	  while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);

    }

}
