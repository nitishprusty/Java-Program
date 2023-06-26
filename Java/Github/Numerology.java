package Java.Github;

import java.util.Scanner;

public class Numerology {
    static char[][] num_val={{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'},
                    {1, 2, 3, 4, 5, 8, 3, 5, 1, 1, 2, 3, 4, 5, 7, 8, 1, 2, 3, 4, 6, 6, 6, 5, 1, 7}};

    static char findNumerology(char temp){
        for(int i = 0;i<26;i++){
            if(num_val[0][i] == temp){
                return num_val[1][i];
            }
        }
        return 0;
    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
         System.out.println("Enter your Name");
         String name = sc.next();
         char [] charrArray = name.toCharArray();
         int sum = 0;
         for(int i = 0;i<charrArray.length;i++){
            int temp = (int)findNumerology(charrArray[i]);
            sum += temp;
         }
         System.out.println("The Numerlogy val is " + sum);
         sc.close();
     }
}