package Java.Collection_Generics_StreamAPI.TreeMap_Simple_Handson;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Number of elements  you want to input");
        int n = sc.nextInt();
        int [] code = new int[n];
        String [] country = new String[n];

        Map<Integer,String> tm = new TreeMap<>();

        for(int i = 0;i<n;i++){
            System.out.println("Enter country code");
            code[i] = sc.nextInt();
            System.out.println("Enter Country name");
            country[i] = sc.next();
            tm.put(code[i], country[i]);
        }

        Set<Map.Entry<Integer,String>> entrySet = tm.entrySet();

        for(Map.Entry<Integer,String> ent: entrySet){
            System.out.println(ent.getKey() + " " + ent.getValue());
        }

        sc.close();
    }
}
