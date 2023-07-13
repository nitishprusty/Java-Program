package Java.Control_Structures_iteration;

import java.util.Scanner;

public class convertdectofrac {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a decimal Number");
       double num = sc.nextDouble();
       sc.close();
       fraction(num);
    }
    static int gcd(int n1,int n2) {
        int res = Math.min(n1, n2);
        while(res > 0) {
            if(n1 % res == 0 && n2%res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
    static void fraction(double x) {
        String a = "" + x;
        String [] split = a.split("\\.");
        int afterpoint = (int)split[1].length();
        int denominator = (int)Math.pow(10,afterpoint);
        int numerator = (int)(denominator*x);

        int gcd = gcd(numerator, denominator);
        String res = numerator/gcd + "/" + denominator/gcd;
        System.out.println(res);
    }
}
