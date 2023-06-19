import java.util.Arrays;
import java.util.Scanner;
public class rotatektime {
    public static void main(String[] args) {
        //leetcode problem
        //input - {78,9,8,64,5,6}
        //k = 2
        //output - {64,5,6,78,9,8}

        //input2 - {-1,-100,3,99}
        //k = 2
        //output - {3,99,-1,-100}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        //user input
        System.out.println("Enter the elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        rotate(arr, k);
        sc.close();

    }
    public static void rotate(int[] nums, int k) {

        int [] newtemp = new int[nums.length];
        int [] revarr = new int[k];

        int [] targetarr = new int[nums.length];

        int firstcount = 0;
        int secondcount = 0;

        for(int i = 0;i<nums.length;i++){
            newtemp[i] = nums[i];
        }
        
        reverse(newtemp); // 6 5 64 8 9 78

        for(int i = 0;i<k;i++){
            revarr[i] = newtemp[i];
        }

        for(int i = 0;i<nums.length;i++){
            if(i <= k-1){
                firstcount++;
            }else{
                secondcount++;
            }

        }
        reverse(revarr);  // 5 6  
        System.arraycopy(revarr, 0, targetarr, 0, firstcount);
        System.arraycopy(nums,0,targetarr,firstcount,secondcount);

        System.out.println(Arrays.toString(targetarr));


        
    }
    static  void reverse(int [] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
