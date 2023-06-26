package Java.Control_structures;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total Number of units");
        double units = sc.nextDouble();
        if(units <= 20){
            System.out.println("No charges applied");
            System.out.println("Your Bill is " + units*1.0);
        }else if(units > 20 && units <= 100){
            double bill = units * 3.5;
            System.out.println("Total Bill is " + bill);
        }else{
            double bill = units*5.0;
            System.out.println("Total Bill is " + bill);
        }
        sc.close();
    }
}
