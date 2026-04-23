package WhileLoop;

public class TotalDigts {
    public static void main(String[] args) {
        int num = 1112;
        int count = 0;
        while (num > 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
