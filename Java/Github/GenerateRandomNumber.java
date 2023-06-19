package Java.Github;

import java.util.Scanner;

/*
 * Generate Number using Odd digits of an array
 */

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        if(size > 0){

            int [] arr = new int[size];

            String output = "";
            for(int i = 0;i<arr.length;i++){
                if(arr[i] % 2 != 0){
                    output.concat(String.valueOf(arr[i]));
                }
            }

            if(output.equals("")){

                System.out.println("There are no odd elements in array");

            }else{

                System.out.println(output);

            }


        }else{
            System.out.println("Invalid Array size");
        }
        sc.close();
    }
}
