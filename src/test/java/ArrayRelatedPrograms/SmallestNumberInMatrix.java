package ArrayRelatedPrograms;

public class SmallestNumberInMatrix {

    public static void main(String[] args) {

        int arr[][]= {
            {2, 4, 51},
            {3, 4, 7},
            {0, 2, 9}
        };
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Smallest number in the matrix is: " + min);
        System.out.println("Largest number in the matrix is: " + max);


    }
}
