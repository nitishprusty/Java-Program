import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatechar {
    public static void main(String[] args) throws IOException{
        //java prog to print duplicate char in string
        //String  = "Nitish"
        //Duplicate char = i;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str = br.readLine();
            char [] ch = str.toCharArray();
            printduplicateCharacter(ch);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void printduplicateCharacter(char [] ch){
        Map<Character,Integer> hs = new HashMap<>();
        for(int i = 0;i<ch.length;i++){
            if(hs.containsKey(ch[i])){
                hs.put(ch[i], hs.get(ch[i]) + 1);
            }else{
                hs.put(ch[i],1);
            }
        }
        Set<Map.Entry<Character,Integer>> entryset = hs.entrySet();

        for(Map.Entry<Character,Integer> ent : entryset){
            if(ent.getValue() > 1){
                System.out.println("The duplicate character is " + ent.getKey());
            }
        }
    }
}
