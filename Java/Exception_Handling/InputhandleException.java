package Java.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputhandleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a string");
            String str = sc.next();
            System.out.println("The string entered by user is " + str);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
