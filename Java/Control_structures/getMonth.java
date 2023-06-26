package Java.Control_structures;

import java.util.Scanner;

public class getMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int input = sc.nextInt();
        String Month = month(input);
        System.out.println(Month);
        sc.close();
    }
    static String month(int input){
        String [] mon = {"Jan","Feb","March","April","May","June","July","August","September","October","November","December"};
        if(input < 1 || input > 12){
            System.out.println("Invalid Input");
            return "Enter input between 1 to 12";
        }else{
            return mon[input-1];
        }
    }
}
