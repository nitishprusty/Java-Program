package Java.Exception_Handling.Marathon_registration;

import java.util.InputMismatchException;
import java.util.Scanner;

public class file {
    static String name;
    static int age;
    static char gender;
    static long contactno;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        marathon obj = new marathon();
        while (true) {
            System.out.println("Enter Name :- ");
            try {
                name = sc.next();
                if (!(name.matches("[a-zA-z]*$"))) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                break;
            }
            System.out.println("Enter age");
            try {
                age = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid Input");
                break;
            }
            System.out.println("Enter Gender - ");
            try {
                gender = sc.next().charAt(0);
                if(!(gender == 'm' || gender == 'M' || gender == 'F' || gender == 'f')){
                    throw new InputMismatchException();    
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input");
                break;
            }
            System.out.println("Enter contactNo - ");
            try{
                contactno = sc.nextLong();
            }catch (InputMismatchException e){
                System.out.println("Invalid input");
                break;
            }
            
            obj.setName(name);
            obj.setAge(age);
            obj.setGender(gender);
            obj.setContactNo(contactno);
            
            System.out.println("Successfully Registered");
        }
        sc.close();
    }
}
