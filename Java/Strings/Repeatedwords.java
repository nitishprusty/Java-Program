package Java.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Repeatedwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        Map<String,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i],1);
            }
        }
        Set<Map.Entry<String,Integer>> entryset = hm.entrySet();
        for(Map.Entry<String,Integer> e : entryset) {
            if(e.getValue() > 1) 
            {
                System.out.println(e.getKey());
            }
        }
        sc.close();
    }
}
