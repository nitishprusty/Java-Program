package Java.Collection_Generics_StreamAPI.Treeset_simplehandson2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class file {
    public static void main(String[] args) {
        /*
         * printing value using iterator
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = sc.nextInt();

        String [] arr = new String[n];

        Set<String> ts = new TreeSet<>();

        for(int i = 0;i<n;i++) {
            arr[i] = sc.next();

            ts.add(arr[i]);
        }

        Iterator<String> it = ts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}
