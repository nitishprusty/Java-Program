package Java.Control_Structures_iteration;

import java.util.*;

public class Sumandproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int a1 = rev(a);
        int b1 = rev(b);
        if (a1 * b1 == a + b) {
            System.out.println("You got a lucky Number");
        } else {
            System.out.println("Oops better luck next time");
        }
        sc.close();
    }

    static int rev(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
