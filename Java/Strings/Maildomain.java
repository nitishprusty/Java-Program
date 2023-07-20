package Java.Strings;

import java.util.Scanner;

public class Maildomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Number of emails");
        int totalEmails = sc.nextInt();
        String suffix = "gmail.com";
        boolean hasPersonalemail = false;
        for(int i = 0;i<totalEmails;i++) {
            String email = sc.next();
            if(email.endsWith("@" + suffix)) {
                hasPersonalemail = true;
            }else{
                System.out.println(email);
            }
        }
        if(!hasPersonalemail) {
            System.out.println("No personal email address");
        }
        sc.close();
    }
}
