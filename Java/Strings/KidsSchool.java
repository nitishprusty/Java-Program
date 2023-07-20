package Java.Strings;

import java.util.Scanner;

public class KidsSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        int n = str.length();
        System.out.println("Enter first Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        String ans = (y-x)%n == 0 ? "Same" : "Not Same";
        System.out.println(ans);
        sc.close();
    }
}
