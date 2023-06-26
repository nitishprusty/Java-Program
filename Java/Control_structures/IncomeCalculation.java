package Java.Control_structures;

import java.util.Scanner;

public class IncomeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Number of hours worked in a day");
        int hrs = sc.nextInt();
        if(hrs >= 0 && hrs <= 24){
            int income = (hrs*100*365);
            System.out.println("Total Income is " + income);
        }else{
            System.out.println("Invalid Income");
        }
        sc.close();
    }
}
