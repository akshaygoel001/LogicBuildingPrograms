package NestedLoopLogic;

public class MultipleTables {
    public static void main(String[] args) {
        int n = 10;
        for(int num = 1; num<=n; num++){
            for (int i = 1 ; i<= 10 ; i++){
                System.out.println(num+" * "+ i+" = " + (i * num) );
            }
            System.out.println("---------------------------------");
        }

    }
}
