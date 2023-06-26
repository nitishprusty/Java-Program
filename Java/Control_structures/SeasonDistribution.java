package Java.Control_structures;

import java.util.Scanner;

public class SeasonDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = sc.nextInt();
        
        String season = "";
        if(month >= 1 && month <= 3){
            season = "Winter";
        }else if(month >= 4 && month <= 6){
            season = "Spring";
        }else if(month >= 7 && month <= 9){
            season = "Summer";
        }else if(month >= 10 && month <=12){
            season = "Autumn";
        }else{
            season = "Invalid Season";
        }
        System.out.println("The season of entered input is " + season);
        sc.close();
    }
}
