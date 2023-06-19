package Java.Github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class printDuplicates {
    public static void main(String[] args) {
        int [] arr = {4,6,4,8,9,6,12,14};
        System.out.println(printDuplicate(arr));
    }
    static List<Integer> printDuplicate(int [] arr){
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i], 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entryset = hm.entrySet();
        for(Map.Entry<Integer,Integer> ent : entryset){
            if(ent.getValue() > 1){
                res.add(ent.getKey());
            }
        }
        return res;
    }
}
