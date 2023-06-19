package Java.Github;

import java.util.Scanner;

public class Stringsorting{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string");
         String str = sc.next();
         sc.close();
         char [] charry = str.toCharArray();
         int low = 0;
         int high = charry.length-1;
         Quicksort(charry, low, high);
         String sortedstr = toString(charry);
         System.out.println(sortedstr);
         
    }
    //quicksort  
    static void Quicksort(char [] arr,int low,int high){
         if(low < high){
            int pidx = partition(arr,low,high);
            Quicksort(arr, low, pidx - 1);
            Quicksort(arr, pidx + 1, high);
         }
    }
    static int partition(char [] arr,int low,int high){
        int i = low - 1;
        char pivot = arr[high];
        for(int j = low;j<=high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }
    static void swap(char [] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static String toString(char [] arr){
        String str = new String(arr);
        return str;
    }
    static void print(char [] arr){
       for(Character ch : arr){
          System.out.print(ch + " ");
       }
       System.out.println();
    }
}