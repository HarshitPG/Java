import java.util.Arrays;

public class L34 {
    public static void main(String[] args) {
        int[] num = new int[]{5,1,3};
        int tar= 5;
        searchRange(num, tar);

    }
    public static int[] searchRange(int[] nums, int target){
//        int[] num = new int[]{5,7,7,8,8,10};
//        int tar= -5;
        int[] arrs = new int[]{-1,-1};
        arrs[0]=binarySearchStart(nums,target);
        arrs[1]= binarySearchEnd(nums,target);
        System.out.println(Arrays.toString(arrs));
        return arrs;
    }
    static int binarySearchStart(int[] arr, int target){
        int ans =-1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+1;
            }else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    static int binarySearchEnd(int[] arr, int target) {
        int ans =-1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    }


//import java.util.Arrays;
//
//public class L34 {
//    public static void main(String[] args) {
//        int[] num = new int[]{5,7,7,8,8,10};
//        int tar= 8;
//        searchRange(num, tar);
//
//    }
//    public static int[] searchRange(int[] arr, int target){
////        int[] num = new int[]{5,7,7,8,8,10};
////        int tar= -5;
//        int[] arrs = new int[]{-1,-1};
////        arrs[1]=binarySearchStart(arr,target);
//        System.out.println(Arrays.toString(arrs));
//
//
//        int start = 0;
//        int end = arr.length -1;
//        while(start <= end){
//            int mid = start +(end-start)/2;
//            if(target < arr[mid]){
//                end = mid-1;
//            } else if (target> arr[mid]) {
//                start = mid+1;
//            }else {
//                return mid;
//            }
//        }
//        return arrs;
//    }
//}
//
