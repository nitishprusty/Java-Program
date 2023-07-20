package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the UserName");
        String username = sc.next();
        sc.close();
        Pattern pattern  = Pattern.compile("^[a-zA-Z0-9@.]+$");
        Matcher matcher = pattern.matcher(username);
        if(matcher.matches()) {
            System.out.println("Successfully registered");
        }else{
            System.out.println("Error");
        }
    }
}
