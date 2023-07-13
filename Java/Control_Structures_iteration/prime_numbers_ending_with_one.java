package Java.Control_Structures_iteration;

import java.util.*;

public class prime_numbers_ending_with_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting num");
        int num1 = sc.nextInt();
        if(num1 < 2) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("Enter ending num");
        int num2 = sc.nextInt();

        boolean [] composite = new boolean[num2];
        int limit = (int)Math.sqrt(num2);
        for(int i = 2;i<=limit;i++) {
            if(composite[i] == false) {
                for(int j = i*i;j<num2;j+=i) {
                    composite[j] = true;
                }
            }
        }
        for(int i = num1;i<num2;i++) {
            if(composite[i] == false && checkone(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    static boolean checkone(int num) {
        boolean flag = false;
        while(num > 0) {
            int rem = num%10;
            if(rem == 1){
                flag = true;
                break;
            }
            break;
        }
        return flag;
    }
}
