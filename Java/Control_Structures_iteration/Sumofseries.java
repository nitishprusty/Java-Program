package Java.Control_Structures_iteration;

import java.util.Scanner;
public class Sumofseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();

        if(n1 < 0 || n2 < 0) {
            System.out.println("Invalid Input");
        }else{
            int i = n1;
            int sum = 0;
            while(i < n1+n2) {
               sum = sum -i;
               System.out.printf("-%d",i);
               if(i + 1 < n1 + n2) {
                  sum += i+1;
                  System.out.printf("%d",i+1);
               }
               i++;
            }
            if(sum > 0) {
                System.out.println("Positive Number");
            }else{
                System.out.println("Negative Number");
            }
        }
        sc.close();
    }
}
