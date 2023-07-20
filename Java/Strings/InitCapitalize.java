package Java.Strings;

import java.util.Scanner;

public class InitCapitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        char [] chararray = str.toCharArray();
        int word = 0;
        int upper = 0;
        for(int i = 0;i<chararray.length;i++) {
            if(i==0 || Character.isWhitespace(chararray[i-1])) {
                word++;
                if(Character.isLowerCase(chararray[i])){
                    chararray[i] = Character.toUpperCase(chararray[i]);
                }else{
                    upper++;
                }
            }
        }
        if(word == upper) {
            System.out.println("The starting letter of word is capital");
        }else{
            for(char ch : chararray) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
