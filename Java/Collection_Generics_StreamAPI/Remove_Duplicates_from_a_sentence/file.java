package Java.Collection_Generics_StreamAPI.Remove_Duplicates_from_a_sentence;

import java.util.Scanner;
import java.util.TreeSet;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        int size = sc.nextInt();
        sc.nextLine();
        TreeSet<String> ts = new TreeSet<>();
        for(int i = 0;i<size;i++) {
            ts.add(sc.nextLine());
        }

        for(String obj : ts){
            System.out.println(obj);
        }
        
        sc.close();
    }
}
