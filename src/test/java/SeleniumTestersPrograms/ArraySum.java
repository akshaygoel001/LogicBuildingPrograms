package SeleniumTestersPrograms;

public class ArraySum {
  	public static void main(String[] args) {
    int[][] n={{1,2,3},{1,2,3}};
    int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				sum=sum+n[i][j];
			}
		}
		System.out.println(sum);

    }

}
