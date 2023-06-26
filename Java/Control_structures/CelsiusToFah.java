package Java.Control_structures;

import java.util.Scanner;

public class CelsiusToFah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double celsius = sc.nextDouble();
        System.out.println(getFahrenheit(celsius));
        sc.close();
    }
    static double getFahrenheit(double cel){
        double res = (cel * 9/5) + 32;
        return res;
    }
}
