package Java.Github;

import java.util.Scanner;

public class Displaydate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers for day,month,year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        if((day >=1 && day <= 31) && (month >= 1 && month <= 12)){
            String suff = extension(day);
            String mon = getmonth(month);
            System.out.println(suff + "-" + mon + "-" + year);
        }else{
            System.out.println("Invalid Date or Month");
        } 
    }

    static String extension(int num) {
        String[] suffix = { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        int n = num % 100;
        int suffixIndex = (n > 3 && n < 21) ? 0 : (n % 10);
        return num + suffix[suffixIndex];
    }

    static String getmonth(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return months[month - 1];
    }
}
