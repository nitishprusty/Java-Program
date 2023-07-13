package Java.Control_Structures_iteration.TokenAutomation;

import java.util.*;
public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the service type");
        String service = sc.next();
        token obj = new token(service);
        obj.Counter();
        System.out.println("Your token Number is " + obj.getTokenNumber() + " your counter Number is " + obj.getCounterNumber());
        sc.close();
        
    }
}
