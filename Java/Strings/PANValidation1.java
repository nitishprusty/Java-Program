package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PANValidation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN Number");
        String PANno = sc.next();
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        Matcher matcher = pattern.matcher(PANno);
        if(matcher.matches()) {
            System.out.println("Valid Pan Number");
        }else{
            System.out.println("PAN Number Valid");
        }
        sc.close();
    }
}
