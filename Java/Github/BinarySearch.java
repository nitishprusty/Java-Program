package Java.Github;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {10,12,58,63,78};
        int k = 63;
        int low = 0;
        int high = arr.length - 1;
        int ans = search(arr,k,low,high);
        System.out.println("Val exist at " + ans);  
    }
    static int search(int [] arr,int k,int low,int high){
        if(arr.length >= 1){
            int mid = (low + high)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(k > arr[mid]){
                return search(arr, k, mid + 1, high);
            }
            return search(arr, k, low, mid - 1);
        }
        return -1;
    }
}
