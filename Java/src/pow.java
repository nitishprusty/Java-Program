import java.util.Scanner;
public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        sc.close();
        // int result = 1;
        // while(exponent > 0){
        //     result = result * num;
        //     exponent--;
        // }
        // System.out.println(result);
        int result = 1;
        powCount(num, exponent, result);
    }
    static void powCount(int a,int b,int result){   //a^b
         if(b <= 0){
            System.out.println(result);
            return;
         }
         result *= a;
         powCount(a, b - 1,result);
    } 
}
