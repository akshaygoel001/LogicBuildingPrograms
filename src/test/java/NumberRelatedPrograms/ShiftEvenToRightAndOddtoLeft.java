package NumberRelatedPrograms;

public class ShiftEvenToRightAndOddtoLeft {

    public static void main(String[] args) {

        int[] arr ={1, 2, 4, 3, 5, 6, 7, 8} ;//{2,8,10,15,5,7,1};

//        for (int i=1;i<nums.length-1;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[i]%2 ==0){//even
//                    int temp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = temp;
//                }
//            }
//
//        }
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Move left pointer until an even number is found
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }

            // Move right pointer until an odd number is found
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }

            // Swap odd and even numbers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+"  ");

        }
    }
}
