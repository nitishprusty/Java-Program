package Java.Strings;

import java.util.Scanner;

public class PANValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN Number");
        String s1 = sc.next();
        if(s1.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
            System.out.println("Valid PAN Number");
        }else{
            System.out.println("Invalid Pan Number");
        }
        sc.close();
    }
}
