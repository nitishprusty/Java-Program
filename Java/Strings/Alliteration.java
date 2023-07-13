package Java.Strings;

import java.util.Scanner;

public class Alliteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to search");
        char target  = sc.next().toUpperCase().charAt(0);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        sc.close();
        String [] s = str.split(" ");
        int sum = 2;
        boolean isInvalid = false;
        if(s.length < 3) isInvalid = true;
        else {
            for(int i = 0;i<s.length;i++) {
                char current = s[i].toUpperCase().charAt(0);
                if(target != current){
                     isInvalid = true; 
                     break;
                }
                else {
                    if(current == target) {
                        sum+= 2;
                    }
                    else{
                        isInvalid = true;
                        break;
                    }
                }
            }
        }
        if(isInvalid) {
            System.out.println("No words");
        }else{
            System.out.println("Your Score is " + sum);
        }
    }
}
