package Java.ClassesObjectsPackages.TokenAutomationinBank;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your service for first customer");
        String service;
        service = sc.next();
        Token obj = new Token(service);

        System.out.println("Your token Number is " + obj.getTokenNumber() + " and your counter Number is "
                + obj.getCounterNumber());
        System.out.println("Enter the service type of next Customer");
        System.out.println("Enter service for another customer");
        service = sc.next();

        Token t1 = new Token(service);
        System.out.println(
                "Your token Number is " + t1.getTokenNumber() + " and your counter Number is " + t1.getCounterNumber());
        sc.close();
    }
}
