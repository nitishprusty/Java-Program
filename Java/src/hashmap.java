import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String [] args){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Nitish",30000);
        hm.put("Mahesh",15000);
        hm.put("Abhisek",25000);
        hm.put("Sidhhart",20000);

        Set<Map.Entry<String,Integer>> Mapentry = hm.entrySet();

        for(Map.Entry<String,Integer> ent: Mapentry){
            System.out.println("The salary of " + ent.getKey() + " is " + ent.getValue());
        }
    }
}
