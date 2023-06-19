package Java.Github;

import java.util.Scanner;

/*
 * Java program to check the compatibility of two array
 * conditions to check compatibility
 * the size of both arrays should be same and the ith element of first array should be greater than equal to the ith element of
 * second array
 */

public class CompatibleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size1 = sc.nextInt();
        int flag = 0;
        if(size1 > 0){
             int [] arr1 = new int[size1];
             //enter elements
             System.out.println("Enter the elements into first array");
             for(int i = 0;i<size1;i++){
                arr1[i] = sc.nextInt();
             }
             System.out.println("Enter the size of second array");
             int size2 = sc.nextInt();
             int [] arr2 = new int[size2];
             //elements of second array
             System.out.println("Enter the elements into second array");
             for(int i = 0;i<size2;i++){
                arr2[i] = sc.nextInt();
             }
             if(size1 == size2){
                for(int i = 0;i<size1;i++){
                    if(arr1[i] >= arr2[i]){
                        flag++;
                    }
                }
                if(flag == size1){
                    System.out.println("Array is compatible");
                }else{
                    System.out.println("Array is not Compatible");
                }
             }else{
                System.out.println("Array is not compatible");
             }
        }else{
            System.out.println("Invalid array size");
        }
        sc.close();
    }
}
