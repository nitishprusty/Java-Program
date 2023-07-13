package Java.Control_Structures_iteration;

import java.util.Scanner;
public class multiplyingadjacentnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        if(a <= 0) {
            System.out.println("Invalid input");
        }else{
            System.out.println("Enter Second Number");
            int b = sc.nextInt();
            if(b <= 0) {
                System.out.println("Invalid input");
            }else{
                System.out.println("Enter the number of terms ");
                int terms = sc.nextInt();
                int temp = 0;
                System.out.print(a + " , " + b);
                for(int i = 0;i<terms-2;i++) {
                    temp = a*b;
                    a = b;
                    b = temp;
                    System.out.print(" , "+ temp);
                }
            }
        }
        sc.close();
    }
}
