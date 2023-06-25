package Java.Collection_Generics_StreamAPI.MemberManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        libraray library = new libraray();
        while (true) {
            System.out.println("Enter");
            System.out.println("1.Add members");
            System.out.println("2.View All members");
            System.out.println("3.View Members of a particular Address");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                // add members
                System.out.println("Enter member id :");
                int mid = sc.nextInt();
                System.out.println("Enter Member Name");
                String mName = sc.next();
                System.out.println("Enter member address");
                String mAdd = sc.next();

                member obj = new member(mid, mName, mAdd);
                library.addMembers(obj);

            } else if (choice == 2) {
                // view all members
                if (library.isempty()) {
                    System.out.println("Please Add some Members Currently there are no Members");
                } else {
                    ArrayList<member> allmem = library.viewallmember();
                    for (member m : allmem) {
                        System.out.println("Member id - " + m.getMemberid());
                        System.out.println("Member Name - " + m.getMemberName());
                        System.out.println("Member address - " + m.getMemberAddress());
                    }
                }

            } else if (choice == 3) {
                // view members of a particular address
                System.out.println("Enter the Address");
                String address = sc.next();
                ArrayList<member> madd = library.viewByAdress(address);
                for (member m : madd) {
                    System.out.println("Member id - " + m.getMemberid());
                    System.out.println("Member Name - " + m.getMemberName());
                    System.out.println("Member address - " + m.getMemberAddress());
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
        sc.close();
    }
}
