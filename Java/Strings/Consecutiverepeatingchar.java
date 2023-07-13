package Java.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consecutiverepeatingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next().toLowerCase();
        sc.close();
        List<String> ar = getOccurunces(input);
        for(String str : ar) {
            System.out.println(str);
        }
    }
    static List<String> getOccurunces(String str) {
        List<String> al = new ArrayList<>();
        char current = str.charAt(0);
        int count = 1;
        for(int i = 1;i<str.length();i++) {
            char c = str.charAt(i);
            if(current == c) {
                count++;
            }else{
                al.add(current + ":" + count);
                count = 1;
                current = c;
            }
        }
        al.add(str.charAt(str.length()-1) + ":" + count);
        return al;
    }
}
