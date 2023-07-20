package Java.Strings;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total of 15 temperatures with spaces");
        String temperature = sc.nextLine();
        sc.close();
        String [] temp = temperature.split("\\s+");
        boolean cold = false;
        boolean warm = false;
        boolean dry = false;
        for(int i = 0;i<temp.length;i++) {
            int t = Integer.parseInt(temp[i]);
            if(t <= 20) {
                cold = true;
            }
            if(t >20 && t <=30){
                warm = true;
            }
            if(t > 30){
                dry = true;
            }
        }
        if(cold) {
            System.out.println("Cold Climate");
            Categorizetemp(temp,"<=20");
        }
        if(warm){
            System.out.println("Warm weather");
            Categorizetemp(temp, ">20 && <=30");
        }
        if(dry){
            System.out.println("Dry weather");
            Categorizetemp(temp, ">30");
        }
    }
    static void Categorizetemp(String [] temp,String range) {
         for(int i = 0;i<temp.length;i++) {
            int temperature = Integer.parseInt(temp[i]);
            if(isInrange(temperature, range)){
                System.out.print((i + 1) + " ");
            }
         }
         System.out.println();
         for(String tem : temp) {
            int t = Integer.parseInt(tem);
            if(isInrange(t, range)){
                System.out.print(tem + " ");
            }
         }
         System.out.println();
    }
    static boolean isInrange(int temperature,String range) {
        switch(range) {
            case "<=20" :
               return temperature <= 20;
            case ">20 && <=30" :
               return temperature>20 && temperature <=30;
            case ">30" :
               return temperature > 30 ;
            default :
               return false;           
        }
    }
}
