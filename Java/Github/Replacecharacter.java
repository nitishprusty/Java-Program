package Java.Github;

import java.util.Scanner;

public class Replacecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter the target char");
        char target = sc.next().charAt(0);
        System.out.println("Enter the replacement character");
        char replacechar = sc.next().charAt(0);
        String ans = replace(str, target, replacechar);
        System.out.println(ans);
        sc.close();
    }
    static String replace(String str,char target,char replacewith){
        if(str.length() <= 1){
            return str;
        }
        char [] ch = str.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == target){
                ch[i] = replacewith;
            }
        }
        String finalstr = toString(ch);
        return finalstr;
    }
    public static String toString(char [] chr){
        String str = new String(chr);
        return str;
    }
}
