package Java.Exception_Handling.Calculator;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1  = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation");
        char operation = sc.next().charAt(0);

        calculator obj = new calculator();
        obj.setNumber1(num1);
        obj.setNumber2(num2);
        obj.setOperation(operation);
        int res = obj.calculation();
        System.out.println(res);
        sc.close();
    }
   
}
