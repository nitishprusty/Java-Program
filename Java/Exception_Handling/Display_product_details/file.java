package Java.Exception_Handling.Display_product_details;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a product Name");
        String name = sc.next();
        System.out.println("Enter product price");
        int price = sc.nextInt();
        sc.close();
        try{
            System.out.println("The product Name is " + name);
            validate(price);
            System.out.println("Product price is " + price);
        }catch(InvalidPriceException e){
            System.out.println(e.getMessage());
        }
    }
    static void validate(int price) throws InvalidPriceException{
        if(price < 100){
            throw new InvalidPriceException("Invalid price");
        }
    }
}
