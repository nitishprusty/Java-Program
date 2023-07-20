package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringconcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in Name");
        String in_name = sc.nextLine();
        System.out.println("Enter Fathers Name");
        String f_name = sc.nextLine();
        Pattern p = Pattern.compile("[^a-z ]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(in_name);
        Matcher m1 = p.matcher(f_name);
        if(!m.find() && !m1.find()) {
            System.out.println(in_name.concat(" ").concat(f_name).toUpperCase());
        }else{
            System.out.println("Invalid Name");
        }
        sc.close();
    }
}
