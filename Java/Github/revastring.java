package Java.Github;

import java.util.Scanner;

/*
 * Write a program to rev a string
 */
public class revastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String rev = reverse(str);
        System.out.println(rev);
    }
    public static String reverse(String str){  //hello
        if(str.length() == 0 || str.length() == 1){
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1)); //o + l + l + e + h = olleh
    }
}
