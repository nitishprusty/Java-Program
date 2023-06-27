package Java.Control_structures;

import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side of a triangle");
        int s1 = sc.nextInt();
        System.out.println("Enter 2nd side of a triangle");
        int s2 = sc.nextInt();
        System.out.println("Enter 3rd side of a triangle");
        int s3 = sc.nextInt();

        sc.close();

        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Invalid input");
        } else {
            int d = s1 + s2;
            int e = s2 + s3;
            int f = s3 + s1;
            if (d > s3 && e > s1 && f > s2) {
                System.out.println("These are valid sides");
            } else {
                System.out.println("These sides are not valid sides");
            }
        }
    }
}
