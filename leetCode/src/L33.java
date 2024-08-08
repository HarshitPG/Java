public class L33 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,5,1};
        int target = 1;
        int lastElement= peakIndexInMountainArray(nums);
        int ans = BinarySearchLeft(nums,lastElement,target);
        System.out.println("lastElement"+lastElement);
        if(ans==-1){
            int total = BinarySearchRight(nums,lastElement,target);
            System.out.println("total"+total);
            if(total != -1){
                ans = total;
                System.out.println("a1"+ans);
            }else{
                System.out.println("a2"+ans);
            }
        }else{
            System.out.println("a3"+ans);
        }
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start< end ) {
            int mid = start+(end-start)/2;
            if(arr[mid]<= arr[start]){
                end=mid-1;
            }else if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }else{
                start= mid +1;
            }
        }
        return start;
    }
    public static int BinarySearchLeft(int[] arr, int last, int target){
        int start = 0;
        while (start<=last){
            int mid = start +(last-start)/2;
            if(target<arr[mid]){
                last = mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int BinarySearchRight(int[] arr, int last, int target){
        int start = last;
        int end = arr.length-1;


        while (start<end){

            int mid = start +(end-start)/2;

            if(target>arr[mid]){
                start= mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        if(arr[start]== target){
            return start;
        }else{
            return -1;
        }

    }
}
