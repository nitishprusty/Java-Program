package Java.ClassesObjectsPackages.Date_Validation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date");
        String input = sc.next();

        try{

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date date = sdf.parse(input);
            System.out.println(date);
            System.out.println(input + " is a valid date");

        }catch (Exception e){
            System.out.println(input + " is a invalid date");
        }
        
        sc.close();

    }
}
