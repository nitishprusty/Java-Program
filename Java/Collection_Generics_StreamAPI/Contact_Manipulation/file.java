package Java.Collection_Generics_StreamAPI.Contact_Manipulation;

import java.util.Scanner;
import java.util.*;

public class file {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        information obj = new information();

        while (true) {

            System.out.println("Enter - ");
            System.out.println("1.To add contact");
            System.out.println("2.To delete Contact");
            System.out.println("3.To view all contact");
            System.out.println("4.To view a specific contact");
            System.out.println("5.To Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                // add
                System.out.println("Enter Contact Name");
                String Name = sc.next();
                System.out.println("Enter phone Number");
                long phone = sc.nextLong();
                System.out.println("Enter email id");
                String email = sc.next();
                contact con = new contact(Name, phone, email);
                obj.addContact(con);

            } else if (choice == 2) {
                // delete
                System.out.println("Enter the Mobile Number you want to delete");
                long phoneNumber = sc.nextLong();
                Boolean res = obj.removeContact(phoneNumber);
                if (res) {
                    System.out.println("Successfully deleted");
                } else {
                    System.out.println("Oops! Some Error Occured");
                }

            } else if (choice == 3) {

                List<contact> con = obj.getconlist();
                for (contact c : con) {
                    System.out.println("Name - " + c.getName());
                    System.out.println("Number - " + c.getConNumber());
                    System.out.println("Email - " + c.getEmail());
                }

            } else if (choice == 4) {

                System.out.println("Enter the corresponding mobile Number");
                long mob = sc.nextLong();
                contact c = obj.getContactofspecificphoneNo(mob);

                System.out.println("Name - " + c.getName());
                System.out.println("Number - " + c.getConNumber());
                System.out.println("Email - " + c.getEmail());

            } else if (choice == 5) {

                break;

            } else {

                System.out.println("Invalid Input");

            }
        }
        sc.close();
        System.exit(0);
    }

    @Override
    public String toString() {
        return "file []";
    }
}
