public class L1095 {
    public static void main(String[] args) {
        int[] num = new int[]{4,5,6,7,0,1,2};
        int target = 1;
        int lastElement = peakIndexInMountainArray(num);
        System.out.println( peakIndexInMountainArray(num));
        System.out.println(BinarySearch(num,lastElement,target));
        int ans = BinarySearch(num,lastElement,target);
        if(ans==-1){
            System.out.println("ans"+ BinarySearch2(num,lastElement,target));
        }else{
            System.out.println(ans);
        }
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start!= end) {
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                end= mid;
            }else{
                return arr[start];
            }
        }
        return start;
    }
    public static int BinarySearch(int[] arr, int last, int target){
        int start = 0;
//        int end = last;
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

    public static int BinarySearch2(int[] arr, int last, int target){
        int start = last;
        int end = arr.length-1;
//        int end = last;

        while (start<=end){
            int mid = start +(end-start)/2;
            if(target>arr[mid]){
                end = mid-1;
            } else if (target<arr[mid]) {
                start= mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
