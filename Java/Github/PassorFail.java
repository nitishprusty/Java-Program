package Java.Github;

import java.util.Scanner;

/*
 * Java program to print the Number of subject you have passed and the number of subject you have failed
 */

public class PassorFail {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter Your Name");
            String Name = sc.next();
            System.out.println("Enter the Number of subject");
            int sub = sc.nextInt();
            if (sub < 0) {
                System.out.println("Invalid input");
            } else {
                int[] arr = new int[sub];
                int pass = 0;
                int fail = 0;
                for (int i = 0; i < sub; i++) {
                    System.out.println("Enter you marks for sub " + (i+1) + ":" );
                    arr[i] = sc.nextInt();
                    if(arr[i] < 50){
                        fail++;
                    }else{
                        pass++;
                    }
                }
                if(fail == 0){
                    System.out.println(Name + " passed in all subjects");
                }else if(pass == 0){
                    System.out.println(Name + " failed in all subject");
                }else{
                    System.out.println(Name + " passed in " + pass + " subject " + " and  failed in " + fail + " subject" );
                }
            }
        }
    }
}
