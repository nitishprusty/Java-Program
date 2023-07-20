package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.next();
        Pattern pattern = Pattern.compile("^(?=.*[#@*])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9#@*]{8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Sucessfully generated the password");
        }else{
            System.out.println("Error in generating password");
        }
        sc.close();
    }
}
