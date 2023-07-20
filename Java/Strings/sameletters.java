package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class sameletters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter Another String");
        String str2 = sc.next();
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> {
            sb1.append((char)c);
        });
        StringBuilder sb2 = new StringBuilder();
        str2.chars().distinct().forEach(c-> {
            sb2.append((char)c);
        });
        String s3 = sb1.toString();
        String s4 = sb2.toString();

        char [] c1 = s3.toCharArray();
        char [] c2 = s4.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
        sc.close();
    }
}
