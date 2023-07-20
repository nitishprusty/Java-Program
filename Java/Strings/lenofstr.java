package Java.Strings;

import java.util.Scanner;

public class lenofstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        if(str.matches("^[a-zA-Z]*$")) {
            System.out.println("Len of str is " + str.length());
        }else{
            System.out.println("Invalid string");
        }
        sc.close();
    }
}
