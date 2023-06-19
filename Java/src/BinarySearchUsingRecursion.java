import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {12,13,56,89,115,160};
        int low = 0;
        int high = arr.length-1;
        System.out.println("Enter the element you want to search");
        int element = sc.nextInt();
        sc.close();
        int ans = BinarySearch(low, high, arr, element);
            System.out.println("Val exist at " + ans + " index ");

    }
    static int BinarySearch(int low,int high,int [] arr,int element){

        
        int mid = (low + high)/2;
        if(element == arr[mid]){
            return mid;
        }
        if(element > arr[mid]){
            return BinarySearch(mid+1, high, arr, element);
        }
        else if(element < arr[mid]){
            return BinarySearch(low, mid -1, arr, element);
        }
        

        return mid;
        
    }
}
