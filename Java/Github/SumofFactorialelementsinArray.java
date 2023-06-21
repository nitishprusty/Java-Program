package Java.Github;

import java.util.Scanner;

/*
 * Java prog calculates the factorial of positive single-digit numbers in an array and then calculates the sum of those factorials
 */

public class SumofFactorialelementsinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        if(size > 0){
            int [] arr = new int[size];
            System.out.println("Enter the elements into array");
            boolean isSingleDigit = false;
            int sum = 0;
            for(int i = 0;i <size;i++){
                arr[i] = sc.nextInt();
                if(arr[i] > 0 && arr[i] < 10){
                    isSingleDigit = true;
                    sum += factorial(arr[i]);
                }
            }
            if(isSingleDigit){
                System.out.println(sum);
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid size");
        }
        sc.close();
    }

    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    
}
