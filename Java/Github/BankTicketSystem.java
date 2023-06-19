package Java.Github;

import java.util.Scanner;

/*
 * Accenture TFA Github
 * Algorithm design and Analysis
 */

public class BankTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of customer takes the tickets");
        int n = sc.nextInt();
        if(n > 0){

            //create a array of tickets of size n
            int [] tickets = new int[n];
            for(int i = 0;i<n;i++){
                tickets[i] = i+1;
                System.out.print(tickets[i] + " ");
            }
            System.out.println();
            System.out.println("Enter the number of tickets served");
            int served = sc.nextInt();
            for(int i = 0;i<served;i++){
                System.out.print(tickets[i] + " ");
            }
            System.out.println();
            if(served != n){
                 for(int i = served;i<n;i++){
                    System.out.print(tickets[i] + " ");
                 }
                 System.out.println();
            }else{
                System.out.println("No more tickets left");
            }

        }else{
            System.out.println("Inavlid Number");
        }
        sc.close();
    }
}
