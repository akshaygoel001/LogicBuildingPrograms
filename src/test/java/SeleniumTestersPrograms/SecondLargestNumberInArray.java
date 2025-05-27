package SeleniumTestersPrograms;

public class SecondLargestNumberInArray {


    public static void main(String[] args) {
        int arr[] = {1,3,2,7,5,9,10,8,6,11};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
//        for(int i = 2 ;i<arr.length;i++){
//            if (arr[i] > max){// 7>2 ,
//                secMax = max;// secmax = 1,2
//                max = arr[i];// max = 2,7
//            } else if ( secMax < arr[i]  ) {// 2<5
//                secMax = arr[i];// secmax = 5
//            }
//        }
        for (int num : arr){
            if (num > max){
                secMax = max;
                max = num;
            } else if (num>secMax && num !=max) {
                secMax = num;
            }

        }
        System.out.println("Second largest :"+secMax +" , Maximum :"+max);
    }

}
