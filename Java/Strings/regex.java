package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        String eid = sc.next();
        int l = eid.length();
        if(l == 12) {
            // if(eid.matches("[G]{1}[B]{1}[L]{1}/[0-9]{3}/[0-9]{4}")){
            //     System.out.println("Login successful");
            // }else{
            //     System.out.println("Incorrect eid");
            // }
            String regex = "[G]{1}[B]{1}[L]{1}/[0-9]{3}/[0-9]{4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(eid);
            if(m.matches()) {
                System.out.println("Login successful");
            }else{
                System.out.println("Error");
            }
        }else{

            System.out.println("Incorrect length");
        }
        sc.close();
    }
}
