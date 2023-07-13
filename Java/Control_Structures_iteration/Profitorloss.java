package Java.Control_Structures_iteration;

import java.util.Scanner;

public class Profitorloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //investment amount = 100000
        int investment_amount = 100000;
        int amount  = 0;
        System.out.println("Enter the profit percentage");
        int profit_percentage = sc.nextInt();
        System.out.println("Enter the amount lost in rupees");
        int lost_amount = sc.nextInt();

        int profitamount1styear = profit_percentage*investment_amount/100;
        amount = (investment_amount + profitamount1styear) - lost_amount;

        if(amount > investment_amount) {
            int profit = ((amount - investment_amount)*100)/investment_amount;
            System.out.println("Profit percentage " + profit + " %");
        }else if(amount == investment_amount) {
            System.out.println("Neither profit nor loss");
        }else if(amount < investment_amount) {
            int loss = ((investment_amount - amount) * 100)/investment_amount;
            System.out.println("Loss percentage = " + loss + " %");
        }
        sc.close();
    }
}
