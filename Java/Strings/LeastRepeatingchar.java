package Java.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LeastRepeatingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        sc.close();
        int minRepeating = Integer.MAX_VALUE;
        char [] charray = str.toCharArray();
        Map<Character,Integer> hs = new HashMap<>();
        for(int i = 0;i<charray.length;i++) {
            if(hs.containsKey(charray[i])) {
                hs.put(charray[i], hs.get(charray[i]) + 1);
            }else{
                hs.put(charray[i],1);
            }
        }
        Set<Map.Entry<Character,Integer>> entryset = hs.entrySet();
        List<Character> output = new ArrayList<>();
        for(Map.Entry<Character,Integer> ent : entryset) {
            if(ent.getValue() < minRepeating) {
                minRepeating = ent.getValue();
                output.add(ent.getKey());
            }else if(ent.getValue() == minRepeating) {
                output.add(ent.getKey());
            }
        }
        System.out.println("Least Repeating char are - ");
        for(char ch : output) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
