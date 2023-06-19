import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElementappearOnce {
    public static void main(String[] args) {
        int [] arr = {4,2,2,1,1};
        ElementappearOnce obj = new ElementappearOnce();
        int res = obj.printele(arr);
        System.out.println(res);
    }
    public int printele(int [] nums){
        int res = -1;
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.put(nums[i],hs.get(nums[i]) + 1);
            }else{
                hs.put(nums[i], 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entryset= hs.entrySet();
        for(Map.Entry<Integer,Integer> ent : entryset){
            if(ent.getValue() == 1){
                res = ent.getKey();
            }
        }
        return res;
    }
}
