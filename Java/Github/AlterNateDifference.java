package Java.Github;

import java.util.Scanner;

/*
 *  find the index of the smallest element in an array that has the largest difference between adjacent elements.
 */

public class AlterNateDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //To have adjacent elements in an array it should have a minimum of 4 elements
        int size = sc.nextInt();
        int bigdiff = 0;
        int smallindex = 0;
        if(size <= 3){
            System.out.println("Invalid array size");
            System.exit(0);
        }else{
            int [] arr = new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            for(int j = 0;j<size-2;j++){
                if(Math.abs(arr[j] - arr[j+2]) > bigdiff){
                    bigdiff = Math.abs(arr[j] - arr[j+2]);
                    if(arr[j] <= arr[j+2]){
                        smallindex = j;
                    }else{
                        smallindex = j + 2;
                    }
                }
            }
        }
        sc.close();
        System.out.println(smallindex); 
    }
}
