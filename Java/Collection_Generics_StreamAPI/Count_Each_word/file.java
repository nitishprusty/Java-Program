package Java.Collection_Generics_StreamAPI.Count_Each_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a senetence");
        String sen = sc.nextLine().toLowerCase();

        sc.close();

        //store the sentence in stringbuilder
        StringBuilder sb = new StringBuilder(sen);

        //iterarte over the sb and remove the unwanted value
        for(int i = 0;i<sb.length();i++){
            char c = sb.charAt(i);
            if(!Character.isLetter(c) && c != ' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        String [] words = sb.toString().split("[.\\s,;:+?|]");
        List<String> wordlist = new ArrayList<>(Arrays.asList(words));
        Set<String> wordset = new HashSet<>(wordlist);

        wordlist.clear();
        wordlist.addAll(wordset);
        Collections.sort(wordlist);
        
        System.out.println(wordlist);
        System.out.println("Number of words is "  + words.length);
        System.out.println("Occurence is");

        for(String temp  :wordlist){
            int count  = 0;
            for(String s : words){
                if(temp.equals(s)){
                    count++;
                }
            }
            System.out.println(temp + " : " + count);
        }
        
    }
}
