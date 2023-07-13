package Java.Control_Structures_iteration.Product_details;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of products");
        int no = sc.nextInt();
        String [] productName = new String[no];
        float [] productprice = new float[no];
        int [] productquantity = new int[no];

        System.out.println("Enter the productName");
        for(int i = 0;i<no;i++) productName[i] = sc.next();

        System.out.println("Enter the productprice");
        for(int i = 0;i<no;i++) productprice[i] = sc.nextFloat();

        System.out.println("Enter the productquantity");
        for(int i = 0;i<no;i++) productquantity[i] = sc.nextInt();

        shop obj = new shop(productName, productprice, productquantity);

        System.out.println("Enter the price to be searched");
        float price = sc.nextFloat();

        System.out.println("Enter the quantity to be searched");
        int quantity = sc.nextInt();

        sc.close();

        String [] serachedquantity = obj.search(quantity);

        String [] searchedprice = obj.search(price);

        String [] searchedlevelorder = obj.search();
        
        System.out.println("Search based on quantity");
        for(int i = 0;i<serachedquantity.length;i++) {
            System.out.println(serachedquantity[i]);
        }

        System.out.println("Search based on price");
        for(int i = 0;i<searchedprice.length;i++) {
            System.out.println(searchedprice[i]);
        }

        System.out.println("Search based on level");
        for(int i = 0;i<searchedlevelorder.length;i++) {
            System.out.println(searchedlevelorder[i]);
        }


    }
}
