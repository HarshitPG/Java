//import java.util.Arrays;
//
//public class L1283 {
//    public static void main(String[] args) {
//        int[] nums = {44,22,33,11,1};
//        int threshold =5;
//        Arrays.sort(nums);
//        int ans = smallestDivisor(nums,threshold);
//        System.out.println(ans);
//    }
//
//    public static int smallestDivisor(int[] nums, int threshold) {
//        int len = nums.length;
//        int i = 1;
//        while (i < nums[len-1]+1) {
//            int sum = 0;
//            for (int j = 0; j < len; j++) {
//                int quotient = nums[j] / i;
//                int remainder = nums[j] % i;
//                if (remainder > 0) {
//                    sum = quotient + 1 + sum;
//                } else {
//                    sum = quotient + sum;
//                }
//            }
//            if(sum<= threshold){
//                return i;
//            }else{
//                i++;
//            }
//        }
////        return -1;
////        Arrays.sort(divisors);
////
////        return floor(divisors,threshold,nums);
//
//    }
//    static  int floor(int[] arr,int target,int[] nums){
////        if(target<= arr[0]){
////            return -1;
////        }
//        int start = 0;
//        int end = arr.length -1;
//        while(start <= end){
//            int mid = start +(end-start)/2;
//            if(target < arr[mid]){
//                end = mid-1;
//            } else if (target> arr[mid]) {
//                start = mid+1;
//            }else {
//                return nums[arr.length-1-mid];
//            }
//        }
//        return nums[arr.length-1-end];
//    }
//}
