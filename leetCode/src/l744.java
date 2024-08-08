public class l744 {
    public static void main(String[] args) {
        char[] arr ={'c','f','j'};
        char target = 'c';
        char ans = L744(arr,target);
        System.out.println(ans);

    }
    static  char L744(char[] arr,char target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
