package Java.Control_Structures_iteration;

import java.util.Scanner;

public class PairofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first two digit");
        int a = sc.nextInt();
        System.out.println("Enter the second two digit Number");
        int b = sc.nextInt();
        int a1 = rev(a);
        int b1 = rev(b);
        if(a*b == a1*b1) {
            System.out.println("Yes");
        }else{
           System.out.println("No");
        }
        sc.close();
    }
    static int rev(int x) {
        int rev = 0;
        while(x > 0) {
            int remainder = x%10;
            rev = rev*10+remainder;
            x /= 10;
        }
        return rev;
    }
}
