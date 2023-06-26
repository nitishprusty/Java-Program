package Java.Control_structures;

import java.util.Scanner;

public class increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the performance rating ");
        float rating = sc.nextFloat();
        if(salary > 0 &&  rating>=1.0  && rating <=5.0) {
            if(rating>=1.0  && rating <=3.0) {
                salary += ((salary*10)/100);
            }else if(rating >= 3.1 && rating <= 5.0){
                salary += ((salary*20)/100);
            }else{
                salary += ((salary*30)/100);
            }
            System.out.println(salary);
        }else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
