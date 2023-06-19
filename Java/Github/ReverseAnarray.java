package Java.Github;

import java.util.*;

public class ReverseAnarray {
    static void display(int [] arr){
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void reverse(int [] arr){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Original array is");
        display(arr);
        System.out.println("Reversed array is ");
        reverse(arr);   
        display(arr);
    }
}
