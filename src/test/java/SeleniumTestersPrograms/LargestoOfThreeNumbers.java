package SeleniumTestersPrograms;

public class LargestoOfThreeNumbers {
  	public static void main(String[] args) {
    int[] n={99,110,200};
    int max=n[0];
		for(int i=1;i<n.length;i++) {
			if(max<n[i]) {
				max=n[i];
			}
		}
		System.out.println(max);
    }

}
