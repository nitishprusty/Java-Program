import java.util.Scanner;
public class revNum {
    public static void main(String[] args) {
        //num - 1234   //1234%10 = 4  3 2 1  0*10 = 0 + 4 = 4*10 =40+3 = 43*10=430+2=432*10=4320+1=4321 so formula = rev = remainder*10 + remainder
        //rev - 4321
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        sc.close();

        int rev = 0;
        while(num > 0){
            int remainder = num%10;
            rev = rev*10+remainder;
            num = num/10;
        }
        System.out.println(rev);


    }
}
