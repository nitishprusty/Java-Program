package Java.Control_Structures_iteration;

import java.util.*;

public class Numerology {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();
        int temp = num;
        int res = 0;
        int k = 0;
        int even = 0;
        int odd = 0;
        while(temp > 0) {
            int x = temp%10;
            if(x % 2 == 0) {
                even++;
            }else{
                odd++;
            }
            sb.append(x);
            res += x;
            k = res;
            while(k > 9) {
               k = numer(res);
            }
            temp /= 10;
        }
        System.out.println(sb.reverse().toString());
        System.out.println(res);
        System.out.println(k);
        System.out.println(even);
        System.out.println(odd);
    }
    static int numer(int n) {
        int sum = 0;
        while(n > 0) {
            int remainder = n%10;
            sum += remainder;
            n /= 10;
        }
        return sum;
    }
}
