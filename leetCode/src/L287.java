import java.util.Arrays;

public class L287 {
    public static void main(String[] args) {
        int[] arr= {3,5,2,2,4};
        int result = sort(arr);
        System.out.println(result);
    }

    static int sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }else{
                i++;
            }
        }
        int ans=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1) {
                ans=arr[j];
            }
        }
        return ans;

    }
     static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
