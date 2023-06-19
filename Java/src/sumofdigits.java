import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();  //input - 123 out-> 6
        sc.close();

        int sum = 0;

        while(num > 0){
            int remainder = num%10;
            sum += remainder;
            num = num/10;
        }

        System.out.println("The sum of digits is " + sum);
        
    }
}
