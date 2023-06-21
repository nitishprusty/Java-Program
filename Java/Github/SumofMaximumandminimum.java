package Java.Github;

import java.util.Scanner;

public class SumofMaximumandminimum {
    /*
     * This program will display the th sum of maximum and minumum element in an array=
     * input = {10,5,6,89,5,1}
     * Output = 90
     */
    static int maximum(int [] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    static int minimum(int [] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        if(size > 0){
            int [] a = new int[size];
            System.out.println("Enter elements into array");
            for(int i = 0;i<size;i++)
            {
                a[i] = sc.nextInt();
            }
            int max = maximum(a);
            int min = minimum(a);
            int sum = max + min;
            System.out.println(sum);
        }else{
            System.out.println("Invalid size");
        }
        sc.close();
    }
}
