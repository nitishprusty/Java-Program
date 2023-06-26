package Java.Control_structures;

import java.util.Scanner;

public class MovieTicketCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Tickets");
        int tickets = sc.nextInt();
        System.out.println("Please Enter y if you have any discount coupon else enter n");
        String coupon = sc.next();
        System.out.println("Please Enter y if you want any refreshment else enter n");
        String refreshment = sc.next();
        System.out.println("Enter the circle");
        String circle = sc.next();
        if(tickets >= 5 && tickets <= 40){
            
            switch(circle){
                case "k":
                    int priceperticket = 75;
                    int cost = tickets*priceperticket;
                    if(tickets > 20){
                        cost -= (0.20*cost);
                    }
                    if(coupon.equals("y")){
                        cost-= (0.02*cost);
                    }
                    if(refreshment.equals("y")){
                        cost += (50*tickets);
                    }
                    System.out.println("Total cost - " + cost);
                    break;
                case "q":
                    int perticket = 150;
                    int tot = tickets*perticket;
                    if(tickets > 20){
                        tot -= (0.20*tot);
                    }
                    if(coupon.equals("y")){
                        tot -= (0.02*cost);
                    }
                    if(refreshment.equals("y")){
                        tot += (50 * tickets);
                    }

            }

        }else{
            System.out.println("Minimum Number of tickets should be 5 and max is 40");
        }
    }
}
