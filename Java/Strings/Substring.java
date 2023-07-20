package Java.Strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(str.substring(start, end));
        sc.close();
    }
}
