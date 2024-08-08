import java.util.ArrayList;
import java.util.Arrays;

public class L4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double ans= findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i< nums1.length;i++){
            arr1.add(nums1[i]);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i< nums2.length;i++){
            arr2.add(nums2[i]);
        }
        arr1.addAll(arr2);
        int[] result = arr1.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        if(result.length%2==1){
            int ans1=(result.length+1)/2;
            return result[ans1-1];
        }else{
            int ans1=(result.length)/2-1;
            int ans2=(result.length)/2;
            System.out.println(ans2);
            System.out.println(ans1);

            return (double) (result[ans1] + result[ans2]) /2;
        }
    }
}
