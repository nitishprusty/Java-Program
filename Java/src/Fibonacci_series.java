import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String [] args){
        //input - 8
        //output - 0 1 1 2 3 5 8 13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        sc.close();
        int temp;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 0; i < range - 2; i++) {
            temp = n1 + n2;
            System.out.println(temp);
            n1 = n2;
            n2 = temp;
        }

    }
}
