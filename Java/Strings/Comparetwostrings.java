package Java.Strings;

import java.util.*;
public class Comparetwostrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        System.out.println("Enter Another String");
        String str2 = sc.next();
        if(str1.equals(str2)) {
            System.out.println("Case sensitive");
        }else{
            System.out.println("Not equal");
        }
        sc.close();
    }
}
