package Java.Strings;

import java.util.Scanner;

/*
 * Find and replace character FirstOccurence
 * example-
 * 
 * input - elephant
 * e
 * i
 * Output - ilephant
 * 
 * input - kingfisher
 * z
 * k
 * Output - character Not Found
 * 
 */
public class FindandReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        char [] str = sc.next().toCharArray();
        System.out.println("Enter the character to be replaced");
        char target = sc.next().charAt(0);
        System.out.println("Enter the character to be put");
        char replaced  = sc.next().charAt(0);
        int flag = 0;
        for(int i = 0;i<str.length;i++) {
            char c = str[i];
            if(c == target) {
                str[i] = replaced;
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Character Not Found");
        }else{
            String s = new String(str);
            System.out.println(s);
        }
        sc.close();
    }
}
