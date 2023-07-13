package Java.Control_Structures_iteration;

import java.util.Scanner;

public class LockersNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        sc.close();
        if(num1== 8888 || num1 <= 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }else{
            int temp = num1;
            StringBuilder reversednum = new StringBuilder();
            while(temp > 0) {
                int digit = temp%10;
                if(digit == 8){
                    digit = 0;
                }else if(digit == 9){
                    digit = 1;
                }else{
                    digit += 2;
                }
                reversednum.append(digit);
                temp /= 10;
            }
            System.out.println("The Second Number is");
            System.out.println(reversednum.reverse().toString());
        }
    }
}
