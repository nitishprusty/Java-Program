package Java.Control_structures;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateformatter {
    public static void main(String[] args) {
        String str = "09-01-2019";
        System.out.println(getDays(str));
        
    }
    public static int getDays(String date){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate dt = LocalDate.parse(date, formatter);

            int day = dt.getDayOfYear();
            return day;
            

        }catch (Exception e){
             System.out.println(e);
             return -1;
        }
    }
}
