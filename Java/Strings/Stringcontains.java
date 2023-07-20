package Java.Strings;

import java.util.Scanner;

public class Stringcontains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter a substring");
        String substr = sc.next();
        if(str.contains(substr)){
            System.out.println(substr + "is a part of " + str);
        }else{
            System.out.println(substr + " is not a part of " + str);
        }
        sc.close();
    }
}
