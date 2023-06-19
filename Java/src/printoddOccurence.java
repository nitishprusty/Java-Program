import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class printoddOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        //use input of array
        System.out.println("Enter Elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }else{
                hm.put(arr[i],1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entry = hm.entrySet();
        for(Map.Entry<Integer,Integer> ent : entry){
            if(ent.getValue() %2 != 0){
                System.out.print(ent.getKey() + ":" + ent.getValue() + " ");  //This will print the element those have odd occurences.
            }
        }
    }
}
