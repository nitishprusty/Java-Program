package Java.Control_structures;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Num");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Num");
        int num2 = sc.nextInt();
        for(int i = num1;i<=num2;i++) {
            System.out.println(i + " - " + (char)i);
        }
        sc.close();
    }
}
