import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Occurencesofchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        //user input of str

        String str = sc.next();
        sc.close();
        //convert the string to char array
        char [] chrarray = str.toCharArray();

        HashMap<Character,Integer> hs = new HashMap<>();

        for(int i = 0;i<chrarray.length;i++){
            if(hs.containsKey(chrarray[i])){
                hs.put(chrarray[i], hs.get(chrarray[i]) + 1);
            }else{
                hs.put(chrarray[i], 1);
            }
        }

        Set<Map.Entry<Character,Integer>> entry = hs.entrySet();
        for(Map.Entry<Character,Integer> e : entry){
            System.out.print(e.getKey() + ":" + e.getValue() + " ");
        }


    }
}
