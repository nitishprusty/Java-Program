package Java.Control_structures;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a year");
         int year = sc.nextInt();
         if(checkleap(year)){
            System.out.println(year + " is a leap year");
         }else{
            System.out.println(year + " is not a leap year");
         }
         sc.close();
    }
    static boolean checkleap(int year){
        boolean flag = false;
        if(year % 400 == 0){
            flag = true;
        }else{
            if(year%4 == 0 && year%100 != 0){
                flag = true;
            }
        }
        return flag;
    }
}
