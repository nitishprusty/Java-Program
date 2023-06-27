package Java.Exception_Handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateparsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DATE");
        String str = sc.next();
        sc.close();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dt = sdf.parse(str);
            System.out.println(dt + " is a valid date");
        }catch (ParseException e){
            System.out.println();
        }
    }
}
