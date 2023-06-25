package Java.Collection_Generics_StreamAPI.TreeSet_handson;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int n = sc.nextInt();
        String [] arr = new String[n];
        Set<String> ts = new TreeSet<>();

        for(int i = 0;i<n;i++){
            arr[i] = sc.next();
            ts.add(arr[i]);
        }

        sc.close();

        System.out.println(ts);
    }
}
