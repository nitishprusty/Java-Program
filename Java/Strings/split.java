package Java.Strings;

import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String c1 = sc.nextLine();
        String [] arr = str.split(c1,-1);
        for(String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}
