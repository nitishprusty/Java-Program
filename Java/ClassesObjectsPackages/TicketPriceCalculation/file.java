package Java.ClassesObjectsPackages.TicketPriceCalculation;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of bookings");
        int no_of_bookings = sc.nextInt();
        System.out.println("Enter Available tickets");
        Ticket obj = new Ticket();
        obj.setAvailabletickets(sc.nextInt());

        while(no_of_bookings > 0){
            System.out.println("Enter Ticket id");
            obj.setTicketid(sc.nextInt());
            System.out.println("Enter the ticket price");
            obj.setPrice(sc.nextInt());
            System.out.println("Enter total Number of tickets");
            int total_tickets = sc.nextInt();
            if(obj.totalfarecost(total_tickets) == -1){
                continue;
            }
                System.out.println("Available tickets " + obj.getAvailabletickets());
                System.out.println("Total cost " + obj.totalfarecost(total_tickets));
                System.out.println("Available tickets after booking " + obj.getAvailabletickets());

                no_of_bookings--;
            
        }
        sc.close();
    }
}
