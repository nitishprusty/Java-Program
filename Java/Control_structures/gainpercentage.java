package Java.Control_structures;

import java.util.Scanner;

public class gainpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the item");
        double oldprice = sc.nextDouble();
        System.out.println("Enter the Repair price");
        double repair = sc.nextDouble();
        System.out.println("Enter the selling price");
        double soldprice = sc.nextDouble();
        sc.close();

        if(oldprice <= 0){
            System.out.println("Invalid price");
        }else if(repair <= 0){
            System.out.println("Invalid input");
        }else if(soldprice <= 0){
            System.out.println("Invalid input");
            
        }else if(soldprice < (oldprice + repair)){
            System.out.println("Cannot find the gain percentage");
        }else{

            double gain = (soldprice - (oldprice + repair));
            double gainpercentage = (gain/(oldprice + repair))*100;
            System.out.printf("The gaining percentage is %.2f",gainpercentage);   
        }
    }
}
