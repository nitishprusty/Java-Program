import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
/*
 * Write a Program to print the first non - repeating character
 * input - "java" {j:1 , a:2, v:1}
 * output - 'j'
 * j is the first non-repeating character
 */
import java.util.Set;

public class firstnonrepeating {
    public static void main(String[] args) throws IOException{
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String");
            String str = br.readLine();
            char [] ch = str.toCharArray();
            char res = printchar(ch);
            System.out.println("The first non-repeating char is " + res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static char printchar(char [] ch){
        Map<Character,Integer> hs = new LinkedHashMap<>();
        for(int i = 0;i<ch.length;i++){
            if(hs.containsKey(ch[i])){
                hs.put(ch[i], hs.get(ch[i]) + 1);
            }else{
                hs.put(ch[i],1);
            }
        }
        Set<Map.Entry<Character,Integer>> entry = hs.entrySet();
        char letter = '?';
        for(Map.Entry<Character,Integer> ent: entry){
            if(ent.getValue() == 1){
                letter = ent.getKey();
                break;
            }
        }
        return letter;
    }
}
