package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingandDescending {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String str = sc.next();
      char[] charArray = str.toCharArray(); // h e l l o 

      char[] firsthalf, secondhalf;
      if (charArray.length % 2 == 0) {
         int half = charArray.length / 2;
         firsthalf = new char[half];
         secondhalf = new char[half];
         for (int i = 0; i < half; i++) {
            firsthalf[i] = charArray[i];
            secondhalf[i] = charArray[i + half];
         }
      }else{
         int half = charArray.length/2;
         firsthalf = new char[half + 1];
         secondhalf = new char[half];
         for(int i = 0;i<= half; i++) {
            firsthalf[i] = charArray[i];
            if(i != half){
               secondhalf[i] = charArray[i + half + 1];
            }
         }
      }
      Arrays.sort(firsthalf);
      reverse(firsthalf);
      Arrays.sort(secondhalf);

      for(Character ch : firsthalf) {
         System.out.print(ch);
      }
      for(Character ch : secondhalf) {
         System.out.print(ch);
      }
      System.out.println();
      sc.close();
   }
   static void reverse(char [] arr) {
      int low = 0;
      int high = arr.length-1;
      while(low <= high) {
         char temp = arr[low];
         arr[low] = arr[high];
         arr[high] = temp;
         low++;
         high--;
      }
   }
}
