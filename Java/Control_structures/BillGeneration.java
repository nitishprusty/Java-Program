package Java.Control_structures;

import java.util.Scanner;

public class BillGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of popcorn");
        int pop = sc.nextInt();
        System.out.println("Enter Total Number of patties");
        int patties = sc.nextInt();
        System.out.println("Enter total Number of colddrinks");
        int colddrinks = sc.nextInt();

        System.out.println("Total No of popcorn - " + pop);
        System.out.println("Total No of patties - " + patties);
        System.out.println("Total No of colddrinks - " + colddrinks);
        System.out.println("Total Price is " + pop*100 + patties*40 + colddrinks*10);
        System.out.println("--Thank you for shopping-- ");
        sc.close();
    }
}
