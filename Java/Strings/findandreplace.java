package Java.Strings;

import java.util.*;
public class findandreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println("Enter the character to be replaced");
        String target = sc.next();
        System.out.println("Enter the character to be filled");
        String character = sc.next();
        sc.close();
        if(str.contains(target)){
            str = str.replace(target, character);
            System.out.println(str);
        }else{
            System.out.println(target + " not found in " + str);
        }
    }
}
