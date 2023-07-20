package Java.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class printUniqueCharac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        char [] arr = str.toCharArray();
        Map<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i],1);
            }
        }
        boolean isUnique = false;
        Set<Map.Entry<Character,Integer>> entryset = hm.entrySet();
        for(Map.Entry<Character,Integer> ent : entryset) {
            if(ent.getValue() == 1) {
                 System.out.print(ent.getKey());
                 isUnique = true;
            }
        }
        if(!isUnique) {
            System.out.println("There are no Unique Characters in the string");
        }
        sc.close();
    }
}
