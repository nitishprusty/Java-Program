package Java.Collection_Generics_StreamAPI.HashMapSimpleHandsOn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,String> hm = new HashMap<>();
        System.out.println("Enter the Number of elements to add");
        int n = sc.nextInt();
        int [] code = new int[n];
        String [] country = new String[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter " + (i + 1) + " country code");
            code[i] = sc.nextInt();
            System.out.println("Enter the country for " + (i + 1) + " code");
            country[i] = sc.next();
            hm.put(code[i], country[i]);
        }
        System.out.println(hm);
        sc.close();
    }
}
