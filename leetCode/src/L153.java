public class L153 {
    public static void main(String[] args) {
        int[] nums = new int[]{11,13,15,17};
       System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int lastElement= peakIndexInMountainArray(nums);
        return nums[lastElement];
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start= 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]){
                if(mid+1<arr.length){
                    return mid+1;
                }else{
                    return 0;
                }
            }if(mid<end && arr[mid]>arr[mid+1]){
                if(mid+1<arr.length){
                    return mid+1;
                }else{
                    return 0;
                }
            }if(arr[mid]<= arr[start]){
                end=mid-1;
            }else{
                start= mid +1;
            }
        }
        if(start+1<arr.length){
            return start+1;
        }else{
            return 0;
        }
    }
}
