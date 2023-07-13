package Java.Control_Structures_iteration;

import java.util.*;
public class quadrilaterals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        int n1 = sc.nextInt();
        System.out.println("Enter the second side");
        int n2 = sc.nextInt();
        System.out.println("Enter the Third side");
        int n3 = sc.nextInt();
        System.out.println("Enter the Forth side");
        int n4 = sc.nextInt();

        System.out.println("Enter the angle");
        int angle = sc.nextInt();
        int p = (n1*n1 + n2*n2);
        int q = (n2*n2 + n3*n3);
        int r = (n3*n3 + n4*n4);
        int s = (n4*n4 + n1*n1);

        if(n1 == n2 && n1 == n3 && n1 == n4) {
             if(angle == 90) {
                System.out.println("Square");
             }else if(angle != 90) {
                System.out.println("rhombus");
             }else{
                System.out.println("Irregular quadrilateral");
             }
        }else if(n1 == n2 && n3 == n4 || n1 == n3 && n2 == n4) {
            if(angle == 90) {
                System.out.println("Rectangle");
            }else if(angle != 90 && p != q || q != r || r != s || s!= p) {
                System.out.println("Parallelogram");
            }else{
                System.out.println("Irregular quadrilateral");
            }
        }else{
            System.out.println("Irregular quadrilateral");
        }
        sc.close();
    }
}
