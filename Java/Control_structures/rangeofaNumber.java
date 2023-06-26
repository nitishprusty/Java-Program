package Java.Control_structures;

import java.util.Scanner;

public class rangeofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        sc.close();
        if(n>=0 && n<=100){

            System.out.println("Range is 0 to 100");

        }else if(n > 101 && n <=200){

            System.out.println("Range is 100 to 200");

        }else if(n > 200 && n<=300){

            System.out.println("Range is 200 to 300");

        }else{

            System.out.println("Not in expected Range");  

        }
    }
}
