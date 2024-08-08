public class L162 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,5,4,3,2,1};
        if(num.length==2){
            if(num[0]>num[1]){
                System.out.println(0);
            }else {
             System.out.println(1);
            }
        }
        int ans1=midCheck(num);
        int ans2 = 0;
        int ans3 = 0;


        if(ans1 ==-1){
        ans2=binarySearchLeft(num);
        }
        if (ans1 ==-1 && ans2 == -1){
            ans3=binarySearchRight(num);
        }
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
    public static int midCheck(int[] arr){
        int start =0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        if(arr[mid]>arr[mid+1] &&arr[mid]>arr[mid-1]){
            return mid;
        }else{
            return -1;
        }
    }
    public static int binarySearchLeft(int[] arr) {
        int start =0;
        int len = arr.length-1;
        int center = start+(len-start)/2+1;
        int end = center;

        while(start<end && arr.length>=3){
            int mid = start+(end-start)/2;
            if(mid>0){
            if(arr[mid]>arr[mid+1] &&arr[mid]>arr[mid-1]){
                return mid;
            }else{
                end--;
            }
            }else{
            end--;}
        }
        return -1;
    }
    public static int binarySearchRight(int[] arr) {
        int zero =0;
        int len = arr.length-1;
        int center = zero+(len-zero)/2-1;
        int end = len;
        int start = center;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] &&arr[mid]>arr[mid-1] && mid+1 <len){
                return mid;
            }else if(mid+1 ==len && arr[mid+1]> arr[mid-1]){
                return mid+1;
            }
            else{
                start++;
            }

        }
        return -1;
    }
}
