package Java.Control_structures;

import java.util.Scanner;

public class checkingBudgetmobilee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Mobile");
        int price = sc.nextInt();
        if(price <= 15000){
            System.out.println("Budget Mobile");
        }else{
            System.out.println("Out of Budget Mobile");
        }
        sc.close();
    }
}
