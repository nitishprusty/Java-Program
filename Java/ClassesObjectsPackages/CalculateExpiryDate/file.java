package Java.ClassesObjectsPackages.CalculateExpiryDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date ");
        String d = sc.next();
        System.out.println("Enter Months");
        int mon = sc.nextInt();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date date = sdf.parse(d);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, mon);
            Date expiryDate = c.getTime();
            String str = sdf.format(expiryDate);
            System.out.println(str);

        }catch (ParseException e){
            System.out.println("Invalid Date Format");
        }
        sc.close();
    }
}
