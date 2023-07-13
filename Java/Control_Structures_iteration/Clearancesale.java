package Java.Control_Structures_iteration;

import java.util.Scanner;

public class Clearancesale {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Name of the product");
       String productName = sc.next();
       System.out.println("Enter the price per " + productName);
       double price = sc.nextDouble();
       System.out.println("Enter the total units");
       int totalUnits = sc.nextInt();
       int totalprice = 0;
       int temp = totalUnits;
       int [] saleperday = new int[totalUnits];

       for(int i = 1;temp > 0;i++) {
        System.out.println("Enter the items sold in day " + i);
        saleperday[i] = sc.nextInt();
        temp = temp - saleperday[i];
       }

       System.out.println(productName);
       System.out.println("day | Available products | price");
       int k = totalUnits;
       int j = 1;
       while(k > 0) {
          System.out.println(j + " " + k + " " + price);
          if(k <= 1) {
            break;
          }
          totalprice += price * saleperday[j];
          k = k - saleperday[j];
          j++;
          price -= (int)(0.07 * price);
       }
       System.out.println("Total Sales - " + totalprice);
       sc.close();
    }
}