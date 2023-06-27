package Java.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class productcost {
    public static void main(String[] args) {
        System.out.println("Cost of per item is " + getcost());
    }
    static int getcost(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cost of product");
        int totcost = sc.nextInt();
        System.out.println("Enter the total Number of items");
        int totitem = sc.nextInt();

        sc.close();

        int costofperitem = totcost/totitem;
        try{
            return costofperitem;
        }catch (InputMismatchException e){
            return -1;
        }catch (ArithmeticException e){
            return -2;
        }
    }
}
