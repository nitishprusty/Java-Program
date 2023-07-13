package Java.Control_Structures_iteration;

import java.util.Scanner;

public class TerraceGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area");
        int area = sc.nextInt();
        if(area <= 0) {
            System.out.println("Invalid input");
        }else{
            System.out.println("Enter the diameter of pot");
            int dia = sc.nextInt();
            if(dia <= 0) {
                System.out.println("Invalid input");
            }else{
                double d = Math.sqrt(area);
                double total = (d/dia) * 12;
                System.out.println(total);
            }
        }
        sc.close();
    }
}
