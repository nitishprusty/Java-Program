import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class printDuplicate {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 4, 23, 5, 6, 25, 36 };
        /*
         * There are total three approaches
         * 1.Brute Force
         * 2.Using Hash Map data structure
         * 3.Using Hash set Data structure
         */

         //1.Using Brute Force
        //  for(int i = 0;i<arr.length;i++){
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[i]);
        //         }
        //     }
        //  }
        //Time complexity - O(n^2)

        //.Using Hash Map
        HashMap<Integer,Integer> arrMap = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(arrMap.containsKey(arr[i])){
                arrMap.put(arr[i],arrMap.get(arr[i]) + 1);
            }else{
                arrMap.put(arr[i],1);
            }
        }

        Set<Map.Entry<Integer,Integer>> entry = arrMap.entrySet();

        for(Map.Entry<Integer,Integer> ent: entry){
            if(ent.getValue() > 1){
                System.out.println(ent.getKey());
            }
        }
        //Time Complexity - O(n)

        //Using Hashset
        Set<Integer> hs = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                hs.add(arr[i]);
            }
        }
        //Time Complexity - O(n)


    }
}
