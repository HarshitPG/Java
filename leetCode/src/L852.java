public class L852 {
    public static void main(String[] args) {
        int[] num = new int[]{5,1,3};
        System.out.println( peakIndexInMountainArray(num));

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
}
