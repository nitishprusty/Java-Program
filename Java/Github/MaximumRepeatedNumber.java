package  Java.Github;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * This Java program displays the maximum repeated Number in an array
 * int [] arr = {7,8,9,8,8,8,9,7,6,5};
 * Output - 8
 * We will solve this using hashmap datastructure
 */

public class MaximumRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        if(size > 0){
            int [] arr = new int[size];
            //user input
            for(int i = 0;i<arr.length;i++){
                System.out.println("Enter element for " + i + " index");
                arr[i] = sc.nextInt();
            }
            int maxRepeat = Integer.MIN_VALUE;
            int maxRepeatedKey = -1;
            //declare a hashmap to store element as key and their occurences as value
            Map<Integer,Integer> hs = new HashMap<>();
            for(int i = 0;i<size;i++){
                if(hs.containsKey(arr[i])){
                    hs.put(arr[i], hs.get(arr[i]) + 1);
                }else{
                    hs.put(arr[i],1);
                }  
            }

            Set<Map.Entry<Integer,Integer>> entryset = hs.entrySet();
            for(Map.Entry<Integer,Integer> ent : entryset){
                if(ent.getValue() > 1 && ent.getValue() > maxRepeat){
                    maxRepeat = ent.getValue();
                    maxRepeatedKey = ent.getKey();
                }
            }
            if(maxRepeatedKey == -1){
                System.out.println("No repeated elements are found");
            }else{
                System.out.println("The Maximum Repeated element in Array is " + maxRepeatedKey);
            }
            sc.close();

        }else{
            System.out.println("Invalid size");
        }
    }
}