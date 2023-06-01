package StringRelatesPrograms;

public class WithoutLoop {
	public static void main(String[] args) {
		
		WithoutLoop wl=new WithoutLoop();
		wl.printWithoutLoop(10);		
		
	}
	public void printWithoutLoop(int n) {
		if(n>1) {
			
			printWithoutLoop(n-1);
		}
		System.out.println(n);
	}

}
