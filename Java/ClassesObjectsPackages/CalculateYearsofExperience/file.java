package Java.ClassesObjectsPackages.CalculateYearsofExperience;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of Joining");
        String joining = sc.next();
        sc.close();
        try{
           
            SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date d1 = sdf.parse(joining);  //Date of joining
            Date d2 = new Date();          //Current Date

            long diff = d2.getTime() - d1.getTime();

            long l1 = (24*60*60*1000);
            long l = l1*365;

            long year = diff/l;
            System.out.println(Math.abs(year));


        }catch (ParseException e){
            System.out.println(e);
        }
    }
}
