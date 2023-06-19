package Java.Github;

import java.util.Scanner;

/*
 * Java Program to find the next greater permutation in a string
 * input - "abcd"
 * output - "abdc"
 */

public class NextGreaterPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char [] charArray = str.toCharArray();    //a,b,c,d
        if(isPermutation(charArray)){
            System.out.println(charArray);
        }else{
            System.out.println("No greater permutation exist");
        }
        sc.close();
    }
    static boolean isPermutation(char [] arr){
        int i = arr.length-2;
        //This is check until arr[i] < arr[i+1]
        //considering the input statement  a,b,c,d
        //i pointer is at c 
        //as c that is arr[i] is less than arr[i+1];
        //so the i remains at 2 
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }

        //if no smaller elements found then the i pointer will go to -1
        if(i < 0){
            return false;
        }

        int j = arr.length-1;
        while(arr[j] <= arr[i]){
            j--;
        }

        swap(arr,i,j);
        reverse(arr,i+1,arr.length-1);
        return true;
    }
    static void swap(char [] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(char [] arr,int start,int end){
        while(start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}



//nitish
//i pointer = s
//arr[i] = s
//arr[i+1] = h
/*
 * s > h
 * while(i >= 0 && arr[i] > arr[i + 1]){
 *    condition true
 *    i-- 
 *    i will be at i
 *    now arr[i] = i is not greater than arr[i+1] that is s
 *    condition break
 *    i  will be at 3
 * }
 * 
 *  j = arr.length - 1 that is 5
 *  while(arr[j] <= arr[i]){
 *      condition truee
 *      j-- now j will be at s
 *      condition false
 *      j will be at 4 
 *  }
 *  swap(arr,i,j)
 *  nitish will become  nitsih
 *  reverse(arr,i+1,arr.length)
 *  final output = nitshi
 */

