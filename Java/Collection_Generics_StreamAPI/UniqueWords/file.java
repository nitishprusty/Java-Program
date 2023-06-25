package Java.Collection_Generics_StreamAPI.UniqueWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        sc.close();

        //This will remove all the non-letters
        str = str.replaceAll("[^a-zA-Z'\\s+]","");

        String [] input = str.split("[\\s+]");

        int wordCount = input.length;
        Set<String> hs = new HashSet<>(Arrays.asList(input));

        int uniquewordcount = hs.size();
        List<String> al = new ArrayList<>(hs);

        System.out.println("Total Words are - " + wordCount);
        System.out.println("Total Unique words are - " + uniquewordcount);
        System.out.println("The words are - ");

        for(int i = 0;i<al.size();i++){
            System.out.println((i + 1) + ". " + al.get(i));
        }
    }
}
