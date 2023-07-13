package Java.Strings;

import java.util.*;
//import java.util.Map.Entry;
public class occurenceofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        char [] arr = str.toCharArray();
        Map<Character,Integer> hs = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {
            if(hs.containsKey(arr[i])) {
                hs.put(arr[i],hs.get(arr[i]) + 1);
            }else{
                hs.put(arr[i],1);
            }
        }

        Set<Map.Entry<Character,Integer>> entryset = hs.entrySet();
        for(Map.Entry<Character, Integer> e : entryset) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        sc.close();
    }
}
