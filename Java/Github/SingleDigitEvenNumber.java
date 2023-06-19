package Java.Github;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * This program will help to generate single digit even Number
 */

public class SingleDigitEvenNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            if (size > 0) {
                int[] a = new int[size];
                // create a arraylist that will store the single digit even Number
                ArrayList<Integer> al = new ArrayList<Integer>();
                int flag = 0;
                System.out.println("Enter the elements into array");
                for(int i = 0;i<size;i++){
                    a[i] = sc.nextInt();

                    if(a[i] % 2 == 0 && a[i] >=2 && a[i] <= 8){
                        al.add(a[i]);
                        flag++;
                    }
                }
                if(flag != 0){
                    for(int i = 0;i<al.size();i++){
                        System.out.print(al.get(i) + " ");
                    }
                    System.out.println();
                }else{
                    System.out.println("There are no single digit even Integer added by User");
                }
            }else{
                System.out.println("Invalid Array  Size");
            }
            sc.close();
        }

    }
}
