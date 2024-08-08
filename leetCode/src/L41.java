public class L41 {
    public static void main(String[] args) {
        firstMissingPositive(new int[]{1, 2, 0});
    }
    public static int firstMissingPositive(int[] nums) {
        int result = sort(nums);
        return result;
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int current = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]!=arr[current]){
                swap(arr,i,current);
            }else{
                i++;
            }
        }
        int ans=0;
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j+1){
                return ans= j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int i,int current){
        int temp= arr[i];
        arr[i]=arr[current];
        arr[current]=temp;
    }
}
