package Java.Strings;

import java.util.Scanner;

public class countAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int cnt = 0;
        for(int i = 0;i<str.length();i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                 cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
