package Java.ClassesObjectsPackages.TravelDetails;

import java.util.Scanner;

public class file {

    static Bus getDetails(){
        Scanner sc = new Scanner(System.in);
        Bus tick = new Bus();
        System.out.println("Enter person Name");
        String name = sc.next();
        System.out.println("Enter person gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter person age");
        int age = sc.nextInt();

        Person p = new Person();
        p.setAge(age);
        p.setGender(gender);
        p.setName(name);

        System.out.println("Enter Ticket Number");
        int ticketNumber = sc.nextInt();
        System.out.println("Enter Ticket price");
        float price = sc.nextFloat();
        tick.setTicketno(ticketNumber);
        tick.setTicketprice(price);
        tick.setPerson(p);

        sc.close();

        return tick;
    }
     public static void main(String[] args) {
         Bus obj = getDetails();
         obj.calculateTotal();
         obj.getPerson();
         System.out.println("Ticket price " + obj.getTicketprice());
         System.out.println("Total Amount is " + obj.getTicketAmount());
     }
}
