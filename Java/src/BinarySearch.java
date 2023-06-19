import java.util.Scanner;
public class BinarySearch {
    public static void main(String [] args){

        //Binary serach works with sorted array
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,12,15,65,89};
        int low  = 0;
        int high = arr.length - 1;
        int mid  = 0;

        System.out.println("Enter the Number you want to search");
        int tar = sc.nextInt();
        sc.close();

        while(low <= high){

            mid = (low + high)/2;  //2

            if(arr[mid] == tar){
                System.out.println("The element lies at " + mid);
                break;
            }else if(arr[mid] > tar){
                high = mid-1;
            }else if(arr[mid] < tar){
                low = mid+1;
            }

        }
        if(low > high){
            System.out.println("Val not found in array");
        }

    }
    
}
